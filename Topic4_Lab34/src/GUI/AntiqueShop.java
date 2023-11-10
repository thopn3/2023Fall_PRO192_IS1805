package GUI;

import DTO.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        int choice = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.println("-- Items Management --");
            System.out.println("1. Input Vase");
            System.out.println("2. Input Painting");
            System.out.println("3. Display items");
            System.out.println("4. Exit");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    Vase v = new Vase();
                    v.inputVase();
                    items.add(v);
                    break;
                case 2:
                    Painting p = new Painting();
                    p.inputPainting();
                    items.add(p);
                    break;
                case 3:
                    for (Object item : items) {
                        if(item instanceof Vase)
                            ((Vase) item).outputVase();
                        if(item instanceof Painting)
                            ((Painting) item).outputPainting();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            
        } while (choice<=4);
        
    }
}
