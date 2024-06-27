package il.ac.tcb.assigment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import il.ac.tcb.assigment2.adapter.UserAdapter;
import il.ac.tcb.assigment2.models.AppDatabase;
import il.ac.tcb.assigment2.models.UserEntity;

public class UsersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter adapter;

    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        db = AppDatabase.getInstance(this);
        recyclerView = findViewById(R.id.usersList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<UserEntity> persons = db.userDao().getAll();

        adapter = new UserAdapter(persons);
        recyclerView.setAdapter(adapter);
    }
}