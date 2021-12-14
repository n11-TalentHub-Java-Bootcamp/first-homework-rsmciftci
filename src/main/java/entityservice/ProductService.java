package entityservice;

import dao.ProductDao;
import dto.ProductCommentsDto;
import dto.AllProductsAndTheirNumberOfCommentsDto;
import entity.Product;

import java.util.List;

public class ProductService {
    private ProductDao productDao;
    public ProductService(){ productDao = new ProductDao();}
    public List<Product> findAll(){return productDao.findAll();}
    public Product findById(Long id){
        return productDao.findById(id);
    }


    // Method returns not just the comments
    // but also productName, CategoryName, price, userName, userSurname, userEmail
    // userPhoneNumber, comments and comments' dates
    // Doesn't return anything if product hasn't got any comments
    public List<ProductCommentsDto> findAllCommentsOfProduct(Long productId){
        return productDao.findAllCommentsOfProduct(productId);
    }

    // Returns productId, productName, price, number of Comments for all products
    public List<AllProductsAndTheirNumberOfCommentsDto> findAllProductsAndTheirNumberOfComments(){
        return productDao.findAllProductsAndTheirNumberOfComments();
    }
}
