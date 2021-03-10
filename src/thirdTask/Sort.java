package thirdTask;

public interface Sort {
    void sort(Person[] people);

    static void print(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
