package ru.mirea.sergeev.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BrowseGo(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Здравствуй, MIREA!",Toast.LENGTH_SHORT);
        toast.show();
        Uri address = Uri.parse("https://www.mirea.ru");
       Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        if (openLinkIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(openLinkIntent);
        }else {
            Log.d("Intent", "Проблемы с намерением!");
       }
        }
    }
