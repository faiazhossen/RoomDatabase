package fayaz.example.com.roomdatabaseex.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import fayaz.example.com.roomdatabaseex.dao.UserDao;
import fayaz.example.com.roomdatabaseex.model.User;

/**
 * Created by FAIAZ on 12/21/2017.
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{

    public abstract UserDao userDao();
}
