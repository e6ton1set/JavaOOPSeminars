package Seminar7;

import Seminar7.logger.Decorator;
// import Seminar7.logger.LoggerAble;
import Seminar7.logger.LoggerTerminal;
import Seminar7.controllers.UserController;
import Seminar7.model.FileOperation;
import Seminar7.model.FileOperationImpl;
import Seminar7.model.Repository;
import Seminar7.model.RepositoryFile;
import Seminar7.utils.Validate;
import Seminar7.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("C:\\Users\\User\\IdeaProjects\\JavaOOPSeminars\\src\\main\\java\\Seminar7\\users.txt");
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate, repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}