package com.example.login_signup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView ;
    TextView firstName, lastName, email;

    public ViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imgContainer);
        firstName = itemView.findViewById(R.id.firstName);
        lastName = itemView.findViewById(R.id.lastName);
        email = itemView.findViewById(R.id.email);
    }
}
