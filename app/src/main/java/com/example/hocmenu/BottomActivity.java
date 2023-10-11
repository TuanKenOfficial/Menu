package com.example.hocmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomActivity extends AppCompatActivity {
    private BottomNavigationView bottomNv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        addControls();
        addEvents();
    }

    private void addEvents() {
        bottomNv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId== R.id.menuHome){
                    //Home item click, Fragment Home
                    Toast.makeText(BottomActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    return true;

                }
                else if (itemId == R.id.menuSearch){
                    //Home item click, Fragment Chat
                    Toast.makeText(BottomActivity.this, "Search", Toast.LENGTH_SHORT).show();
                    return true;

                }
                else if (itemId == R.id.menuAdd){
                    Toast.makeText(BottomActivity.this, "Add", Toast.LENGTH_SHORT).show();
                    return true;

                }
                else if (itemId == R.id.menuNotification){
                    //Home item click, Fragment Profile
                    Toast.makeText(BottomActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                    return true;

                }
                else {
                    Toast.makeText(BottomActivity.this, "User", Toast.LENGTH_SHORT).show();
                    return false;
                }

            }
        });
    }


    private void addControls() {
        bottomNv = (BottomNavigationView) findViewById(R.id.bottomNv);
    }

    public void manHinhOptionMenu(View view) {
        Toast.makeText(this, "Quay về màn hình option menu", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(BottomActivity.this,OptionActivity.class));
    }
}