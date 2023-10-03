package GUI;
import DAO.ProductDAO;
import Entities.Product;

public class ProductList {
    public static void main(String[] args) {
        ProductDAO pDao = new ProductDAO();
        
        Product p = new Product("P001", "IPhone 15 ProMax - Titan", 1700, 100);
        Product p1 = new Product("P002", "IPhone 4 ProMax", 1000, 10);
        pDao.addNewProduct(p);
        pDao.addNewProduct(p1);
        
        pDao.showAllProducts();
    }
}
