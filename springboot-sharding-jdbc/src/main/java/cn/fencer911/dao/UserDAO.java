package cn.fencer911.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import cn.fencer911.entity.User;



@Mapper
@Repository
public interface UserDAO {

    /**
     * 获取所有用户
     *
     * @return 所有用户
     */
    List<User> queryList();

    /**
     * 添加新用户
     *
     * @param user 新用户
     */
    void insert(User user);
}
