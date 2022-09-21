package ss12_java_collection_framework_.practice.sort_by_comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<ComparableStudent> {
    @Override
    public int compare(ComparableStudent o1, ComparableStudent o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}

