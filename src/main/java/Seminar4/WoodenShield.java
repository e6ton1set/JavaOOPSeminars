package Seminar4;

//На основе работы на уроке. Создать класс щита,
// разработать разные типы щитов, добавить в семейство классов BaseHero обобщения в виде щитов.
// Реструктуризировать код в конечных классах семейства Warriors.
// Добавить метод определения минимального щита в команде.

public class WoodenShield implements Shield{
    private int defendPoint;

    public WoodenShield(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    @Override
    public int defend() {
        return defendPoint;
    }

    @Override
    public String toString() {
        return "WoodenShield{" +
                "defendPoint=" + defendPoint +
                '}';
    }
}
