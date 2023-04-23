package Seminar7.controllers;

import java.util.List;

import Seminar7.model.Repository;
import Seminar7.utils.Validate;
import Seminar7.model.Fields;
import Seminar7.model.User;

public class UserController {
    private final Repository repository;
    private final Validate validate;

    public UserController(Repository repository, Validate validate) {
        this.repository = repository;
        this.validate = validate;
    }

    public UserController(Object repository, Validate validate, Repository repository1, Validate validate1) {
        this.repository = repository1;

        this.validate = validate1;
    }

    public void saveUser(User user) throws Exception {
        validate.checkNumber(user.getPhone());
        repository.CreateUser(user);
    }
    public void updateUser(User user,Fields field, String param) throws Exception {
        if(field == Fields.TELEPHONE) {
            validate.checkNumber(param);
        }
        repository.UpdateUser(user, field, param);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }
    public List <User> getUsers() throws Exception {
        return repository.getAllUsers();
    }
    public void deleteUser(User user) throws Exception {
        repository.delUser(user);}
}