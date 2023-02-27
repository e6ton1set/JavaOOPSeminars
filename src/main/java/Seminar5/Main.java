package Seminar5;

import Seminar5.controllers.UserController;
import Seminar5.model.FileOperation;
import Seminar5.model.FileOperationImpl;
import Seminar5.model.Repository;
import Seminar5.model.RepositoryFile;
import Seminar5.model.Validate;
import Seminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}