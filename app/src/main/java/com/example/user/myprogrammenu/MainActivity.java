package com.example.user.myprogrammenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // идентификаторы для пунктов меню
    private static final int IDM_OPEN = 101;
    private static final int IDM_SAVE = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
/*
            menu.add(Menu.NONE, IDM_OPEN, Menu.NONE, "Открыть");
            menu.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Сохранить");
*/

            getMenuInflater().inflate(R.menu.menu, menu);

/*
            menu.add(Menu.NONE, IDM_OPEN, Menu.NONE, "Открыть").setIcon(android.R.drawable.ic_menu_help);
            menu.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Сохранить").setIcon(R.drawable.ic_launcher);;
*/

            return true;
            //return(super.onCreateOptionsMenu(menu));
        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.textView);

        switch(id) {
            case IDM_OPEN:
                infoTextView.setText("Вы выбрали пункт ОТКРЫТЬ");
                return true;
            case IDM_SAVE:
                infoTextView.setText("Вы выбрали пункт СОХРАНИТЬ");
            case R.id.menu_open:
                infoTextView.setText("Вы выбрали пункт ОТКРЫТЬ");
                return true;
            case R.id.menu_save:
                infoTextView.setText("Вы выбрали пункт СОХРАНИТЬ");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
