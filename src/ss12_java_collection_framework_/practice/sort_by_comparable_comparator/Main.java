package ss12_java_collection_framework_.practice.sort_by_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComparableStudent student = new ComparableStudent("Kien", 30, "HT");
        ComparableStudent student1 = new ComparableStudent("Nam", 26, "HN");
        ComparableStudent student2 = new ComparableStudent("Anh", 38, "HT" );
        ComparableStudent student3 = new ComparableStudent("Tung", 38, "HT" );

        List<ComparableStudent> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
//        Collections.sort( lists);
        for(ComparableStudent st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(ComparableStudent st : lists){
            System.out.println(st.toString());
        }
    }
}
