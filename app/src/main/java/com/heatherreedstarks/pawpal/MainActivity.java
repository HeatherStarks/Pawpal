package com.heatherreedstarks.pawpal;

        import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String ADD_PET = "com.heatherreedstarks.pawpal.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAddPet(View view) {
        Intent intent = new Intent(this, NewPet.class);
        startActivity(intent);
    }
}