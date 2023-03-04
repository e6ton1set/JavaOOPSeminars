package Seminar6;

public class Main {
    public static void main(String[] args) {
        User user = new User("Nick");
        Persister persone = new Persister(user);
        Report report = new Report();
        report.report(user);
        persone.save();
    }
}
