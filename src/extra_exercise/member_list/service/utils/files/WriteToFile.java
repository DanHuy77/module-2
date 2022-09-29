package extra_exercise.member_list.service.utils.files;

import extra_exercise.member_list.model.Student;
import extra_exercise.member_list.model.Teacher;
import extra_exercise.member_list.service.IMemberService;
import extra_exercise.member_list.service.impl.StudentService;
import extra_exercise.member_list.service.impl.TeacherService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static extra_exercise.member_list.service.impl.StudentService.studentList;
import static extra_exercise.member_list.service.impl.TeacherService.teacherList;

public class WriteToFile {

//    static {
//        Student student1 = new Student("st5", "Nguyễn Văn A", LocalDate.parse("12/12/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", "C07", 10);
//        Student student2 = new Student("st3", "Nguyễn Văn B", LocalDate.parse("20/12/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", "C07", 10);
//        Student student3 = new Student("st12", "Nguyễn Văn C", LocalDate.parse("20/12/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", "C07", 10);
//        Student student4 = new Student("st10", "Nguyễn Văn C", LocalDate.parse("22/12/2222", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", "C07", 10);
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//    }

    private void writeStudent(List<Student> studentList) throws IOException {
        File file = new File("src\\extra_exercise\\member_list\\read_and_write\\data\\output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student student : studentList) {
            bufferedWriter.write(student.toString());
            System.out.println(student.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public void addFileStudent() throws IOException {
        writeStudent(studentList);
    }

    private void writeTeacher(List<Teacher> teacherList) throws IOException {
        File file1 = new File("src\\extra_exercise\\member_list\\read_and_write\\data\\teacher_output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

        for (Teacher teacher : teacherList){
            bufferedWriter.write(teacher.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public void addFileTeacher() throws IOException {
        writeTeacher(teacherList);
    }
}