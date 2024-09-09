package com.example.login_signup;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<itemModel> items = new ArrayList<itemModel>();
        items.add(new itemModel("Guy Bruno", "NDIKUMANA", "guybrunondikumana@gmail.com", R.drawable.a));
        items.add(new itemModel("Lamar", "Kendrick", "kendrick@lamar.com", R.drawable.b));
        items.add(new itemModel("Franky", "Delton", "frankydelton@gmail.com", R.drawable.c));
        items.add(new itemModel("Milner", "Carton", "milnerCarton@gmail.com", R.drawable.d));
        items.add(new itemModel("MayorKun", "Delta", "mayorkun@delta.com", R.drawable.e));
        items.add(new itemModel("Jacob", "Leroy", "jacobLeroy@gmail.com", R.drawable.f));
        items.add(new itemModel("Charlie", "Puth", "charlieputh@gmail.com", R.drawable.g));
        items.add(new itemModel("Halmington", "Delta", "halmington@dc.com", R.drawable.h));
        items.add(new itemModel("Guy Bruno", "NDIKUMANA", "guybrunondikumana@gmail.com", R.drawable.a));
        items.add(new itemModel("Lamar", "Kendrick", "kendrick@lamar.com", R.drawable.b));
        items.add(new itemModel("Franky", "Delton", "frankydelton@gmail.com", R.drawable.c));
        items.add(new itemModel("Milner", "Carton", "milnerCarton@gmail.com", R.drawable.d));
        items.add(new itemModel("MayorKun", "Delta", "mayorkun@delta.com", R.drawable.e));
        items.add(new itemModel("Jacob", "Leroy", "jacobLeroy@gmail.com", R.drawable.f));
        items.add(new itemModel("Charlie", "Puth", "charlieputh@gmail.com", R.drawable.g));
        items.add(new itemModel("Halmington", "Delta", "halmington@dc.com", R.drawable.h));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerViewAdapter(getApplicationContext(), items));
    }
}