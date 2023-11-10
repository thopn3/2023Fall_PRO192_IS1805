
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public Student(int _id, String _name){
        id = _id;
        name = _name; 
    }
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}

public class CollectionDemo {
    public static void main(String[] args) {
        // Tạo 1 danh sách chứa các đối tượng
        /*
        ArrayList list1 = new ArrayList();
        
        // Thêm các đối tượng vào list1
        list1.add(10);
        list1.add("Hello");
        list1.add(true);
        list1.add(1, new Student(1, "ThoPN"));
        
        // In các phần tử trong danh sách
        for(int i=0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        */
        
        // Tạo 1 danh sách chứa đối tượng có kiểu Student
        List<Student> list2 = new ArrayList<Student>();
        
        // Thêm các phần tử vào danh sách list2
        list2.add(new Student(1, "Hoang"));
        list2.add(new Student(3, "Binh"));
        list2.add(new Student(2, "Trang"));
        list2.add(new Student(4, "Hoa"));
        list2.add(new Student(5, "Hao"));
        
        // Loại bỏ 1 phần tử tại vị trí theo chỉ định
        // list2.remove(1);
        
        Iterator ite = list2.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        
        String search = "H";
        for (Student student : list2) {
            if(student.getName().toLowerCase().contains(search.toLowerCase()))
                System.out.println(student);
        }
        
    }
}












