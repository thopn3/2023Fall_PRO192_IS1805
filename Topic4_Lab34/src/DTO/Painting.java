
package DTO;

import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void outputPainting(){
        super.output();
        System.out.println("; Height: "+ height + "; Width: "+ width + 
                "; isWaterColour: "+ isWaterColour + "; isFramed: " + isFramed);
    }
    
    public void inputPainting(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        this.height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter width: ");
        this.width = Integer.parseInt(sc.nextLine());
        System.out.print("Enter isWaterColour: ");
        this.isWaterColour = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter isFramed: ");
        this.isFramed = Boolean.parseBoolean(sc.nextLine());
    }
}
