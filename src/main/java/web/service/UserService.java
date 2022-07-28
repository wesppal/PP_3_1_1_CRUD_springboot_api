package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    public void saveUser(User user) {
        userDao.save(user);
    }
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
    @Transactional
    public User getUserById(Long id) {
        return userDao.getReferenceById(id);
    }
    @Transactional
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
