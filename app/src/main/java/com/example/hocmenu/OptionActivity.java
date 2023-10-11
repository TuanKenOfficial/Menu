package com.example.hocmenu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);


    }

    //tạo ra menu option
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    //lựa chọn các layout menu trong menu_option
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menuContext) {
            Toast.makeText(this, "Chuyển sang màn hình context menu", Toast.LENGTH_SHORT).show();
            Intent intentContext = new Intent(OptionActivity.this, ContextActivity.class);
            startActivity(intentContext);
        }
        else if (itemId == R.id.menuBottom) {
            Toast.makeText(this, "Chuyển sang màn hình bottom menu", Toast.LENGTH_SHORT).show();
            Intent intentBottom = new Intent(OptionActivity.this, BottomActivity.class);
            startActivity(intentBottom);
        }
        else if (itemId == R.id.menuPopup) {
            Toast.makeText(this, "Chuyển sang màn hình popup menu", Toast.LENGTH_SHORT).show();
            Intent intentBottom = new Intent(OptionActivity.this, PopupActivity.class);
            startActivity(intentBottom);
        }
        return super.onOptionsItemSelected(item);
    }
}