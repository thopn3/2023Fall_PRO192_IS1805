
package Interface;

public class Television implements IVNRemote, IChinaRemote{

    @Override
    public void onDevice() {
        System.out.println("On TV");
    }

    @Override
    public void offDevice() {
        System.out.println("Off TV");
    }
    
    @Override
    public void increseVolum() {
        System.out.println("Increase volum ....");
    }

    @Override
    public void decreseVolum() {
        System.out.println("Decrease volum ....");
    }
    
    public static void main(String[] args) {
        IVNRemote tv = new Television();
        tv.onDevice();
        tv.setLock();
        // Gọi các thành phần trong interface: constant, initial fields, static method
        IVNRemote.setTimer(10);
        System.out.println("Remote TV has: "+IVNRemote.MAXofButtons + " buttons");
        System.out.println("Price: " + IVNRemote.price);
        
        IChinaRemote tv1 = new Television();
        tv1.increseVolum();
    }

    
}
