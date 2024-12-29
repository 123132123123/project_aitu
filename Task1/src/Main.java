import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();

        File file = new File("C:\\Users\\marat\\Documents\\GitHub\\project_aitu\\Task1\\src\\students.txt");
        Scanner scanner1 = new Scanner(file);

        File file2 = new File("C:\\Users\\marat\\Documents\\GitHub\\project_aitu\\Task1\\src\\teachers.txt");
        Scanner scanner2 = new Scanner(file2);

        while (scanner1.hasNextLine()) {
            Student student = new Student();
            student.setName(scanner1.next());
            student.setSurname(scanner1.next());
            student.setAge(Integer.parseInt(scanner1.next()));
            student.setGender(Boolean.parseBoolean(scanner1.next()));
            student.addGrade(Integer.parseInt(scanner1.next()));
            school.addMember(student);
        }

        while (scanner2.hasNextLine()) {
            Teacher teacher = new Teacher();
            teacher.setName(scanner2.next());
            teacher.setSurname(scanner2.next());
            teacher.setAge(Integer.parseInt(scanner2.next()));
            teacher.setGender(Boolean.parseBoolean(scanner2.next()));
            school.addMember(teacher);
        }

        for (Person member : school.getMembers()){
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println(student.getName() + "'s GPA: " + student.calculateGPA());
            } else if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                if (teacher.getYearsOfExperience() >= 10){
                    teacher.giveRaise(10);
                }
            }
            member.toString();
        }
    }
}