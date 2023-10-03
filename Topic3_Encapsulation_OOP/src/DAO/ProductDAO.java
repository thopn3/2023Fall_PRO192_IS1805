package DAO;

import Entities.Product;

public class ProductDAO {
    Product[] listProduct;

    public ProductDAO() {
        listProduct = new Product[100];
    }
    
    public void addNewProduct(Product product){
        int count = listProduct.length;
        listProduct[count+1] = product;
    }
    
    public void showAllProducts(){
        for (Product p : listProduct) {
            System.out.println(p);
        }
    }
}
