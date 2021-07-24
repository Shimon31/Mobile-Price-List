package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> studentList;

    RecyclerView recyclerView;
    Student_Adapter student_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        student_adapter = new Student_Adapter(studentList);
        recyclerView.setAdapter(student_adapter);

        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));
        studentList.add(new Student("Shimon","Ten","3204",R.drawable.shimon));


        student_adapter.notifyDataSetChanged();

    }
}