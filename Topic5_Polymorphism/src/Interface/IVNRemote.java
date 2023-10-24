
package Interface;

public interface IVNRemote {
    // Constant
    final int MAXofButtons = 20;
    // Initial field
    int price = 10;
    
    // Static method
    public static void setTimer(int number){
        System.out.println("Shutdown after "+ number + " seconds.");
    }
    
    // Default method
    default void setLock(){
        System.out.println("Set lock");
    }
    
    // Abstract methods (Prototype functions)
    public abstract void onDevice();
    public abstract void offDevice();
    
}
