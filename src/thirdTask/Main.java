package thirdTask;

public class Main {

    public static Person[] generateArray(int size) {
        Person[] person = new Person[size];
        person[0] = new Person(33, Sex.MAN, "Nikolai");
        person[1] = new Person(17, Sex.MAN, "Andrey");
        person[2] = new Person(53, Sex.WOMAN, "Tatiana");
        person[3] = new Person(13, Sex.MAN, "Ilia");
        person[4] = new Person(4, Sex.MAN, "Ivan");
        person[5] = new Person(24, Sex.WOMAN, "Victoria");
        person[6] = new Person(31, Sex.WOMAN, "Daria");
        person[7] = new Person(77, Sex.MAN, "Sergei");
        person[8] = new Person(70, Sex.WOMAN, "Ludmila");
        person[9] = new Person(12, Sex.MAN, "Dmitriy");
        return person;
    }

    public static void main(String[] args) {

    }
}
