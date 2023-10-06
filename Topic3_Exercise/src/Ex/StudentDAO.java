
package Ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentDAO {
    Student[] students;
    int count = 0;
    
    public StudentDAO(){
        students = new Student[30];
    }
    
    public void addStudents(int n) throws ParseException{
        String id, fName, lName;
        Date dob;
        boolean gender;
        int i=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student: #"+count);
            System.out.print("Id:");
            id = sc.nextLine();
            System.out.print("First name: ");
            fName = sc.nextLine();
            System.out.print("Last name: ");
            lName = sc.nextLine();
            System.out.print("Date of birth (dd/MM/yyyy): ");
            dob = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            System.out.print("Gender");
            gender = Boolean.parseBoolean(sc.nextLine());
            Student stu = new Student(id, fName, lName, dob, gender);
            students[count] = stu;
            count++;
            i++;
        }while(i<n);
    }
    
    public void printStudents(){
        if(count==0){
            System.out.println("List of Student is empty.");
            return;
        }
            
        System.out.println("ID\tFullname\tAge\tGender");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
    
    public void searchStudents(String fName){
        
    }
    
    public void updateStudent(String studentId){
        
    }
}
