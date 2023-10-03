package DAO;

import Entities.Product;
import java.util.ArrayList;

public class ProductDAO {
    ArrayList<Product> listProduct;

    public ProductDAO() {
        listProduct = new ArrayList<>();
    }
    
    public void addNewProduct(Product product){
        listProduct.add(product);
    }
    
    public void showAllProducts(){
        for (Product p : listProduct) {
            System.out.println(p);
        }
    }
}
