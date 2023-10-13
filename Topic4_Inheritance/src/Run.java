
import java.util.Date;


public class Run {
    public static void main(String[] args) {
        // Khởi tạo 2 đối tượng kiểu Student
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Dung");
        s1.setAddress("190 Nguyen Tuan");
        s1.setBirthDate(new Date(2003, 10, 12));
        s1.setStudentId("SE001");
        s1.setMajorField("SE");
        s1.setDegreeSought("Professional");
        System.out.println(s1);
        
        Student s2 = new Student(2, "Tu", "99 Cầu Giấy", new Date(2000,10,10), "BA001", "BA", "Master");
        System.out.println(s2);
        
        // Khởi tạo đối tượng kiểu Professor
        Professor p1 = new Professor(4, "Binh", "Nam Tu Liem", new Date(2001,02,04), "Computing Fundamental");
        
        // Khởi tạo đối tượng s3 có kiểu Person
        Person s3 = new Student(3, "Tuan", "236 Nguyen Huu Hung", new Date(2001, 05, 07), "SE003", "SE", "PhD Candidate");
        System.out.println(s3);
        
        
        // Yêu cầu:
        /**
         * Tạo một danh sách kiểu ArrayList. 
         * Thêm 4 đối tượng: s1, s2, p1, s3 vào ArrayList để lưu trữ. 
         * Duyệt từng đối tượng trong ArrayList để in thành 2 danh sách
         * riêng biệt
         */
    }
}
