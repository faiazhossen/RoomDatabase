package fayaz.example.com.roomdatabaseex.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import fayaz.example.com.roomdatabaseex.model.User;

/**
 * Created by FAIAZ on 12/21/2017.
 */

@Dao
public interface UserDao {
    @Query("SELECT *FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadByIds(int[] userIds);

    @Query("SELECT * FROM user Where first_name LIKE :first AND last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
