import java.text.MessageFormat;
import java.util.ArrayList;

public class School{
    private ArrayList<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }
}
