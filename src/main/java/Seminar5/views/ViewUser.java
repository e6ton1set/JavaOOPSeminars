package Seminar5.views;

import Seminar5.controllers.UserController;
import Seminar5.model.Fields;
import Seminar5.model.User;
import Seminar5.model.PhoneException;
import Seminar5.model.Validate;


import java.util.Scanner;

public class ViewUser {

    private final UserController userController;
    private final Validate validate;

    public ViewUser(UserController userController, Validate validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run(){
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Введите команду: \n");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case DELETE:
                        caseDelete();
                        break;
                }
            }
            catch(Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }
    private void caseRead() throws Exception {
        String id = prompt("Идентификатор пользователя: \n");
        User user_ = userController.readUser(id);
        System.out.println(user_);
    }
    private void caseUpdate() throws Exception {
        String userid = prompt("Идентификатор пользователя: \n");
        String field_name = prompt("Какое поле (NAME, SIRNAME, TELEPHONE): \n").toUpperCase();
        String param = null;
        if (Fields.valueOf(field_name) == Fields.TELEPHONE) {
            param = catchTelephone(param);
            if(param == null) {
                return;
            }
        }
        else {
            param = prompt("Введите данные, на которые будет произведена замена: \n");
        }
        User _user = userController.readUser(userid);
        userController.updateUser(_user, Fields.valueOf(field_name.toUpperCase()), param);
    }
    public String catchTelephone(String telephone) throws Exception {
        while(true) {
            try {
                telephone = prompt("Введите номер телефона: \n");
                if(telephone.equals("0")) {
                    System.out.println("Вы отказались от ввода для изменения пользователя.");
                    return null;
                }
                validate.checkNumber(telephone);
                return telephone;
            } catch(PhoneException ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }
    private void caseList() throws Exception {
        for (User user : userController.getUsers()) {
            System.out.println(user);
        }
    }
    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: \n");
        String lastName = prompt("Фамилия: \n");
        String phone = null;
        phone = catchTelephone(phone);
        if(phone == null) {
            return;
        }

        userController.saveUser(new User(firstName, lastName, phone));
    }
    private void caseDelete() throws Exception {
        String userid = prompt("Введите ID пользователя, которого нужно удалить: ");
        User _user = userController.readUser(userid);
        userController.deleteUser(_user);
    }

    private void showHelp() {
        System.out.println("Список команд: \n");
        for(Commands c : Commands.values()) {
            System.out.println(c + "\n");
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}