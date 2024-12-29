import java.util.ArrayList;

public class Student extends Person {
    private static int studentID = 1;
    private int id_gen;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super();
        this.studentID = studentID;
        this.grades = grades;
    }

    public Student(){
        this.id_gen = studentID++;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int calculateGPA(){
        int gpa = 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        gpa = sum / grades.size();
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "I am a student with ID " + studentID + ".";
    }
}