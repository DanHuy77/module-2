package ss12_java_collection_framework_.practice.discriminate_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashStudentTest {
    public static void main(String[] args) {
        HashStudent student1 = new HashStudent("Nam",20, "HN");
        HashStudent student2 = new HashStudent("Hung",21, "HN");
        HashStudent student3 = new HashStudent("Ha",22, "HN");
        // write your code here
        Map<Integer, HashStudent> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, HashStudent> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<HashStudent> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(HashStudent student : students){
            System.out.println(student.toString());
        }
    }
}
