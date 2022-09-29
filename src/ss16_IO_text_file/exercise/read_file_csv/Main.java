package ss16_IO_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputSource = new File("src//ss16_IO_text_file//exercise//read_file_csv//data//input.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputSource));

        String line;
        String[] nationArray;
        List<String> nationList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            nationArray = line.split(",");
            nationList.add(nationArray[2]);
        }
        bufferedReader.close();
        File outputTarget = new File("src//ss16_IO_text_file//exercise//read_file_csv//data//output.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputTarget));
        for (int i = 0; i < nationList.size(); i++) {
            bufferedWriter.write(nationList.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
