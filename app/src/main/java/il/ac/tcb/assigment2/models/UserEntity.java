package il.ac.tcb.assigment2.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "persons",
        indices = {@Index(value = {"uuid"}, unique = true)})
public class UserEntity {
    @PrimaryKey()
    @ColumnInfo(name = "uuid")
    @NonNull
    public String uuid;
    @ColumnInfo(name = "first_name")
    public String firstName;
    @ColumnInfo(name = "last_name")
    public String lastName;
    @ColumnInfo(name = "age")
    public Integer age;
    @ColumnInfo(name = "email")
    public String email;
    @ColumnInfo(name = "city")
    public String city;
    @ColumnInfo(name = "country")
    public String country;
    @ColumnInfo(name = "image_url")
    public String imageUrl;
}
