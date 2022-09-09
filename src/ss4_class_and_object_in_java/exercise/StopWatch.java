package ss4_class_and_object_in_java.exercise;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long start() {
        return startTime = System.currentTimeMillis();
    }

    public long stop() {
        return endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        System.out.println("Thời gian bắt đầu " + stopWatch.start());
        Arrays.sort(numbers);
        System.out.println("Thời gian kết thúc " + stopWatch.stop());
        System.out.println("Thời gian thực hiện " + stopWatch.getElapsedTime() + " mili Giây");
    }
}
