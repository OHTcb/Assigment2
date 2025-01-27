package il.ac.tcb.assigment2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide; // For image loading
import java.util.List;

import il.ac.tcb.assigment2.R;
import il.ac.tcb.assigment2.models.UserEntity;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<UserEntity> personList;

    public UserAdapter(List<UserEntity> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserEntity person = personList.get(position);
        holder.firstNameTextView.setText(person.firstName);
        holder.lastNameTextView.setText(person.lastName);
        holder.countryTextView.setText(person.country);
        holder.cityTextView.setText(person.city);

        // Load image using Glide or any other image loading library
        Glide.with(holder.imageView.getContext())
                .load(person.imageUrl)
                .placeholder(R.drawable.placeholderpic) // Placeholder image
                .into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public TextView countryTextView;
        public TextView cityTextView;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.profilePicture);
            firstNameTextView = view.findViewById(R.id.firstName);
            lastNameTextView = view.findViewById(R.id.lastName);
            countryTextView = view.findViewById(R.id.Country);
            cityTextView = view.findViewById(R.id.City);
        }
    }
}