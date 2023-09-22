
public class ClsCharater {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';
        // Sử dụng hàm - function (phương thức - method)
//        if(Character.compare(ch1, ch2)==0)
//            System.out.println("ch1 giống ch2");
//        else if(Character.compare(ch1, ch2) < 0)
//            System.out.println("ch1 đứng trước ch2 trong bảng chữ cái");
//        else
//            System.out.println("ch1 đứng sau ch2");

        // Gói 2 biến ch1 và ch2 vào 2 đối tượng kiểu Character
        Character objC1 = new Character(ch1);
        Character objC2 = new Character(ch2);
        if(objC1.compareTo(objC2)==0)
            System.out.println("Hai đối tượng có dữ liệu giống nhau");
        
        // Chuyển đổi cơ số của kí tự 'A' sang hệ nhị phân
//        System.out.println(Character.digit('10', 2));
    }
}
