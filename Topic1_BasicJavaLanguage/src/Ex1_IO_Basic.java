
import java.util.Scanner;

public class Ex1_IO_Basic {
    public static void main(String[] args) {
        // Viết 1 đoạn CT Nhập các phần tử số nguyên từ bàn phím
        // In ra các phần tử trên cùng 1 dòng ra màn hình
        int[] a; // a = null
        int n; // Số phần tử thực tế của mảng
        Scanner sc = new Scanner(System.in);
        
        // Hoạt động nhập
        System.out.print("Enter n: ");
        n = Integer.parseInt(sc.nextLine());
        // Cấp phát số phần tử cho mảng 'a'
        a = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        
        // In các phần tử của mảng 'a' ra màn hình
        System.out.print("List of numbers in array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.format("%5d", a[i]);
//        }
        for (int item : a) {
            System.out.format("%5d", item);
        }
        System.out.println();
    }
}





