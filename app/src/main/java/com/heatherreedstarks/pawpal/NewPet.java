package com.heatherreedstarks.pawpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NewPet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pet);
    }

    public void submitPetNameForm(View view) {
        EditText editName  = (EditText) findViewById(R.id.editTextPetName);
        TextView newPet = new TextView(this);
        newPet.setText(editName.getText());

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        LinearLayout mLayout=findViewById(R.id.PetListLayout);

        mLayout.addView(newPet,0);
    }
}