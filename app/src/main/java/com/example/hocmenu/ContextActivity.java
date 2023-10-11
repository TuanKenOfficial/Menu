package com.example.hocmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class ContextActivity extends AppCompatActivity {

    private Button btnMenuContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);
        addControls();
        addEvents();

    }

    private void addEvents() {
        btnMenuContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerForContextMenu(btnMenuContext); // hiện context menu khi bạn nhấn thật lâu
            }
        });

    }



    private void addControls() {
        btnMenuContext = (Button) findViewById(R.id.btnMenuContext);

    }
    //tạo menu context
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_context,menu);
        // khi bạn nhấn chọn lại menu context thì mặc định nó màu trắng
        btnMenuContext.setTextColor(Color.WHITE);
    }

    //tùy chọn layout menu context
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menuDo) {
            btnMenuContext.setTextColor(Color.RED);
            Toast.makeText(this, "Button Chuyển màu đỏ", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menuVang) {
            btnMenuContext.setTextColor(Color.YELLOW);
            Toast.makeText(this, "Button Chuyển màu vàng", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menuXanh) {
            btnMenuContext.setTextColor(Color.BLUE);
            Toast.makeText(this, "Button Chuyển màu vàng", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(ContextActivity.this, OptionActivity.class));
        }

        return super.onContextItemSelected(item);
    }
}