package ss10_DSA_list.practice.my_list;

public class MyListPracticeTest {
    public static void main(String[] args) {
        MyListPractice<Integer> listInteger = new MyListPractice<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

    }
}
