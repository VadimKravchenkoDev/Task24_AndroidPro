package com.example.task24_androidpro;

import android.os.Bundle;
import android.util.Log;

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


        MainClass childClass1 = new ChildClass1();
        MainClass childClass2 = new ChildClass2();
        MainClass childClass3 = new ChildClass3();
        ArrayList<MainClass> listClasses = new ArrayList<>();

        listClasses.add(childClass1);
        listClasses.add(childClass2);
        listClasses.add(childClass3);



        for (int i=0; i<=listClasses.size(); i++){
            Log.d("zmei", String.valueOf(listClasses.get(i)));
        }
        Log.d ("zmei", String.valueOf(listClasses.size()));




        ArrayList<MainClass> list = new ArrayList<>();

        // Создаем объекты классов-потомков и добавляем их в ArrayList
        list.add(new ChildClass1());
        list.add(new ChildClass2());
        list.add(new ChildClass3());
        Log.i("vadik", "222 is working!");
        // Перебираем все элементы в ArrayList и выводим в logcat название их классов
        for (MainClass item : list) {
            Log.d("vadik", "Class: " + item.getClass().getSimpleName());
        }

        // Выводим размер ArrayList
        Log.d("vadik", "Size of ArrayList: " + list.size());




    }
}