package cl.bennu.springbootlabs2.dao.impl;

import cl.bennu.springbootlabs2.dao.iface.IUserDAO;
import cl.bennu.springbootlabs2.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO implements IUserDAO {

    private final SqlSession sqlSession;

    public UserDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<User> getAll() {
        return this.sqlSession.selectList("getAllUser");
    }

    @Override
    public List<User> find(User user) {
        return null;
    }


    @Override
    public User getById(Long id) {
        return this.sqlSession.selectOne("getUserById", id);
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(Long id) {

    }

}
