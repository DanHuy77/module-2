package algorithm_week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AlgorithmWeek3 {
    public static void main(String[] args) {
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String str = "CodegymDaNang";
        String[] arrStr = str.split("");
        List<String> listStr = new LinkedList<>(Arrays.asList(arrStr));
        for (int i = 0; i <listStr.size() ; i++) {
        if (upperCase.contains(listStr.get(i))){
            listStr.set(i, " "+ listStr.get(i));
            }
        }
        System.out.println(String.join("", listStr).toLowerCase().trim());
    }
}

