package com.workshop.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_example,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,"selected item:"+item,Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.search:
                return true;
            case R.id.upload:
                return true;
            case R.id.print:
                return true;
            default:
                return false;
        }
    }
}
