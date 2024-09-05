package lotterie;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPoints() < o2.getPoints()) {
            return -1;
        }
        if (o1.getPoints() > o2.getPoints()) {
            return 1;
        }
        return 0;
    }
}
