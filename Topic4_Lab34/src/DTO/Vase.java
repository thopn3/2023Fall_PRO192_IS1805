package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase(){
        super.output();
        System.out.println("; Height: " + height + "; Material: "+ material);
    }
    
    public void inputVase(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        this.height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter material: ");
        this.material = sc.nextLine();
    }
}
