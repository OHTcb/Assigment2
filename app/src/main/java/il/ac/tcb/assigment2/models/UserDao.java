package il.ac.tcb.assigment2.models;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM persons")
    List<UserEntity> getAll();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(UserEntity user);

    @Query("DELETE FROM persons")
    void deleteAll();
}
