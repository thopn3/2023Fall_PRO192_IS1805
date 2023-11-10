
import java.util.Date;


public class Professor extends Person{
    private String department;

    public Professor() {
        super();
    }

    public Professor(int id, String name, String address, Date birthDate, String department) {
        super(id, name, address, birthDate);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +this.department;
    }
}
