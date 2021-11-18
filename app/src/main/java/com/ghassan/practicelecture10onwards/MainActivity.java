package com.ghassan.practicelecture10onwards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast= Toast.makeText(this,"Welcome Ghassan!",Toast.LENGTH_LONG);
        toast.show();
    }
}