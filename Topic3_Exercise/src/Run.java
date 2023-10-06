
import Ex.Student;
import Ex.StudentDAO;
import java.util.Date;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int n, choice = 0;
        StudentDAO sDao = new StudentDAO();
        
        do {
            // Menu chuong trinh
            Run.MenuCT();
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());

            // Kiểm tra giá trị để lựa chọn chức năng phù hợp
            switch(choice){
                case 1:
                    System.out.print("Nhập số lượng sv cần thêm mới: ");
                    n = Integer.parseInt(sc.nextLine());
                    sDao.addStudents(n);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    
            }
        } while (choice != 0);
    }

    private static void MenuCT() {
        System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ---");
        System.out.println("Mời bạn thực hiện các tính năng sau:");
        System.out.println("1. Thêm mới một sinh viên");
        System.out.println("2. In danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo Tên");
        System.out.println("4. Sửa đổi thông tin sinh viên");
        System.out.println("0. Kết thúc chương trình");
        System.out.print("Mời chọn: ");
    }
}
