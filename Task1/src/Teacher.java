public class Teacher extends Person{
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher() {
        super();
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void giveRaise(int percent) {
        salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ". I teach " + subject + ".";
    }
}
