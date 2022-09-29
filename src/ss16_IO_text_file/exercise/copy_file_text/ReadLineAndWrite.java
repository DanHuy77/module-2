package ss16_IO_text_file.exercise.copy_file_text;

import java.io.*;

public class ReadLineAndWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_IO_text_file/exercise/copy_file_text/data/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;


        File file1 = new File("src//ss16_IO_text_file//exercise//copy_file_text//data//output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

        int count = 0;

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            count += line.length();
        }


        System.out.println("Số ký tự trong chuỗi: " + count);


        bufferedReader.close();
        bufferedWriter.close();
    }

}
