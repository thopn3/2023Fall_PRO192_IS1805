import java.util.Scanner;

public class String_Ex {
    public static void main(String[] args) {
        String[] names = {"dung","hoang", "Dung", "du", "Hong"};
        boolean status = false;
        
        String strSearch = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        strSearch = sc.nextLine();
        
        for(String n : names){
            if(n.toLowerCase().startsWith(strSearch.toLowerCase())){
                System.out.println(n);
                status = true;
            }
        }
        
        if(!status)
            System.out.println("Student name not found.");
    }
}
