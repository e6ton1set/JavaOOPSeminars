package Seminar3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", "Ivanov", 33);
        User user2 = new User("Anna", "Ribakova", 20);
        User user3 = new User("Sergey", "Nikonorov", 41);
        User user4 = new User("Irina", "Petrova", 28);
        User user5 = new User("Irina", "Petrova", 50);
        Personal personal = new Personal(List.of(user1, user2, user3, user4, user5));
        for (User user : personal) {
            System.out.println(user);
        }
        System.out.println("\nSorting by ABC and age: \n");
        List<User> users = personal.toList();
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("__________________________________________________________________________________\nSearch in WIDE");
        User bigBoss = new User("Richard", "Four", 70);
        User smallBoss = new User("Will", "Smith", 45);
        User boss = new User("Linara", "Black", 39);
        User manager1 = new User("Olga", "Rose", 29);
        User manager2 = new User("Ivan", "Volkov", 28);
        User manager3 = new User("Rita", "Costilio", 38);
        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(smallBoss, boss));
        bigBoss.setPersonal(chiefs);
        smallBoss.setPersonal(managers1);
        boss.setPersonal(managers2);

        Company company = new Company(bigBoss);

        for (User user : company) {
            System.out.println(user);
        }

    }
}
