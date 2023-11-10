
import java.util.Date;


public class Student extends Person{
    private String studentId;
    private String majorField;
    private String degreeSought;

    public Student() {
        super();
    }

    public Student(int id, String name, String address, Date birthDate, String studentId, String majorField, String degreeSought) {
        super(id, name, address, birthDate);
        this.studentId = studentId;
        this.majorField = majorField;
        this.degreeSought = degreeSought;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public String getDegreeSought() {
        return degreeSought;
    }

    public void setDegreeSought(String degreeSought) {
        this.degreeSought = degreeSought;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + studentId + ", " + majorField + ", " + degreeSought;
    }
}
