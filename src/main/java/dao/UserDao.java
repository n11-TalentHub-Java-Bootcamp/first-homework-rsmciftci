package dao;

import dto.CommentsOfUserDto;
import hibernate.HibernateUtil;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao{
    public UserDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    // Returns comment list of user, the list includes userId, userName, productName, comments, and dates of comments
    // Doesn't return anything for user who doesn't have any comments
    public List<CommentsOfUserDto> findAllCommentsOfUser(Long userId){
        String sql = " select "
                + " new dto.CommentsOfUserDto( usr.id, usr.name, product.name, productComment.comment, productComment.commentDate )"
                + " from User usr, Product product, ProductComment productComment"
                + " where "
                + " productComment.product.id = product.id and "
                + " productComment.user.id = usr.id and "
                + " usr.id = :id ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", userId);
        return query.list();


    }
}
