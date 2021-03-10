package thirdTask;

import java.util.Arrays;
import java.util.Comparator;

public class SortByName implements Sort{

    @Override
    public void sort(Person[] people) {
        Arrays.sort(people, Comparator.comparing(Person::getName));
    }
}
