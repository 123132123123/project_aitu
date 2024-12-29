import java.util.ArrayList;

public class School{
    private ArrayList<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        members.add(person);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }

    public ArrayList<Person> getMembers() {
        return members;
    }
}
