package entityservice;

import dao.UserDao;
import dto.CommentsOfUserDto;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserService() {  userDao = new UserDao(); }

    // Returns comment list of user, the list includes userId, userName, productName, comments, and dates of comments
    // Doesn't return anything for user who doesn't have any comments
    public List<CommentsOfUserDto> findAllCommentsOfUser(Long userId){
        return userDao.findAllCommentsOfUser(userId);
    }
}
