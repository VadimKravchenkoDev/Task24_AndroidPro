package com.example.task24_androidpro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MainClass mainClass = new MainClass();
        MainClass childClass1 = new ChildClass1();
        MainClass childClass2 = new ChildClass2();
        MainClass childClass3 = new ChildClass3();
        ArrayList<MainClass> listClasses = new ArrayList<>();

        listClasses.add(childClass1);
        listClasses.add(childClass2);
        listClasses.add(childClass3);

        

    }
}