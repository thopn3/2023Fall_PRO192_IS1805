
public class clsString {
    public static void main(String[] args) {
        // Khai báo 1 string theo các phương pháp khác nhau
        String str1 = "Hello";
        String str2 = new String("hello");
        // In dữ liệu trong 2 đối tượng trên
        System.out.println(str1.toString()); // Do có hàm toString()
        System.out.println(str2);
        
        // So sánh 2 chuỗi
        if(str1.compareTo(str2)==0)
            System.out.println("str1 giống str2");
        else
            System.out.println("str1 không giống str2");
        
        if(str1.equals(str2))
            System.out.println("str1 giống str2");
        else
            System.out.println("str1 khác str2");
        
        // Nối str1 với str2
        String str3 = str1.concat(str2);
        System.out.println("str3 = " + str3);
        
        // Kiểm tra chuỗi đã cho có chứa chuỗi cần tìm không
        String str4 = "Hello World";
        String strSearch = "Hello";
        if(str4.contains(strSearch))
            System.out.println("Tìm thấy trong chuỗi str4");
        else
            System.out.println("Không tồn tại chuỗi cần tìm");
        
        // Tìm kiếm trong 1 chuỗi có chứa chuỗi cần tìm tại vị trí
        String str5 = "pham tien dung";
        String strSearch1 = "Ph";
        if(str5.startsWith(strSearch1)){
            System.out.println("Tìm thấy");
        }else{
            System.out.println("Không tìm thấy");
        }
        
        // Tìm kiếm và thay thế
        String str6 = "Welcome to OOP in Java";
        String str7 = str6.replaceAll("OOP", "Object Oriented Programming");
        System.out.println(str7);
        
        String[] str8 = str6.split(" ");
        
        for (int i = 0; i < str8.length; i++) {
            if(str8[i].equals("OOP"))
                str8[i] = "Object Oriented Programming";
        }
        
        for (String s : str8) {
            System.out.println(s);
        }
    }
}
