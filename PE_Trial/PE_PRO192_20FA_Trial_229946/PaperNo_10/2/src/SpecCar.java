
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
        super();
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+ type;
    }
    
    public void setData(){
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(20+super.getPrice());
    }
    
    public int getValue(){
        if(type<7)
            return super.getPrice() + 10;
        else
            return super.getPrice() + 15;
    }
}
