package DTO;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output(){
        System.out.print("Value: "+ this.value + "; Creator: " + this.creator);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        // Nhập giá trị cho: value
        System.out.print("Enter value: ");
        this.value = Integer.parseInt(sc.nextLine());
        while(this.value<=0){
            System.out.print("The value must be greater than 0.\nRe-Enter value: ");
            this.value = Integer.parseInt(sc.nextLine());
        }
        // Nhập giái trị cho: creator 
        System.out.print("Enter creator: ");
        this.creator = sc.nextLine();
        while(this.creator.isEmpty()){
            System.out.print("The creator is required.\nRe-Enter creator: ");
            this.creator = sc.nextLine();
        }
    }
}

