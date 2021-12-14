package dao;

import dto.ProductCommentsDto;
import dto.AllProductsAndTheirNumberOfCommentsDto;
import entity.Product;
import hibernate.HibernateUtil;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDao extends BaseDao{


    public ProductDao(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Product> findAll(){

       String sql = "select product from Product product";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }


    public Product findById(Long id) {
        String sql = "select product from Product product where product.id = :givenId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);
        return (Product) query.uniqueResult();
    }

    // Method returns not just the comments
    // but also productName, CategoryName, price, userName, userSurname, userEmail
    // userPhoneNumber, comments and comments' dates
    // Doesn't return anything if product hasn't got any comments
    public List<ProductCommentsDto> findAllCommentsOfProduct(Long productId){
        String sql = " select "
                + " new dto.ProductCommentsDto( product.name, category.name, product.price, users.name, users.surname, users.email, users.phoneNumber, productComment.comment, productComment.commentDate )"
                + " from Product product, Category category, ProductComment productComment, User users"
                + " where "
                + " product.category.id = category.id and"
                + " product.id = productComment.product.id and "
                + " productComment.user.id  = users.id and"
                + " product.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", productId);
        return query.list();
    }


    // Question 3
    // Returns productId, productName, price, number of Comments for all products
    public List<AllProductsAndTheirNumberOfCommentsDto> findAllProductsAndTheirNumberOfComments(){
        String subQueryForCountingProductComments = " NULLIF((Select count(productComment) FROM ProductComment productComment where productComment.product.id = product.id),0 ) as numberOfProductComments ";
        String sql = " select "
                + " new dto.AllProductsAndTheirNumberOfCommentsDto( product.id, product.name, product.price, " + subQueryForCountingProductComments + " ) "
                + " from Product product ";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

}


