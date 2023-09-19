public class Numbers {
    public static void main(String[] args) {
        int n = 7;
        Integer objInt = new Integer(5);
        // Unboxing (mở đối tượng objInt)
        System.out.println(objInt);
        System.out.println(objInt.toString());
        // Boxing (gói 1 giá trị mới trong objInt)
        objInt = n;
        System.out.println(objInt); // Unboxing: Auto
        int m = objInt.intValue();
        System.out.println(m);
    }
}
