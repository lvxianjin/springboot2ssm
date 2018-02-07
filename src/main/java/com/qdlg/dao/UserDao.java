package com.qdlg.dao;

import com.qdlg.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 10184 on 2018/2/7.
 */
@Repository
public interface UserDao {
    User selectUserByName(String name);
}
