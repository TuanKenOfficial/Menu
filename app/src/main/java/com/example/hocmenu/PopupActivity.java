package com.example.hocmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupActivity extends AppCompatActivity {

    private Button   btnMenuPopup ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        addControls();
        addEvevents();
    }

    private void addEvevents() {
        btnMenuPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu();
            }
        });
    }
    private void showPopupMenu() {
        PopupMenu popupMenu = new PopupMenu(this, btnMenuPopup);

        popupMenu.getMenu().add(Menu.NONE,0,0,"Menu Bottom");
        popupMenu.getMenu().add(Menu.NONE,1,1,"Menu Context");
        popupMenu.getMenu().add(Menu.NONE,2,2,"Thông báo");

        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == 0){
                    Toast.makeText(PopupActivity.this, "Chuyển sang màn hình Bottom menu", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(PopupActivity.this, BottomActivity.class);
                    startActivity(intent);
                }
                else if (itemId == 1){
                    Toast.makeText(PopupActivity.this, "Chuyển sang màn hình Context menu", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(PopupActivity.this, ContextActivity.class));
                }
                else if (itemId == 2){
                    Toast.makeText(PopupActivity.this, "Bạn đã làm thành công!!Chúc mừng bạn", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(PopupActivity.this, OptionActivity.class));
                }
                return true;
            }
        });
    }

    private void addControls() {
        btnMenuPopup = (Button) findViewById(R.id.btnMenuPopup);
    }
}