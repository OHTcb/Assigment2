package il.ac.tcb.assigment2.results;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("/api")
    public Call<Results> getUsers();
}