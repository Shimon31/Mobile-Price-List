package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.ViewHolder> {
    List<Student> students;

    public Student_Adapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public Student_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_student,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Student_Adapter.ViewHolder holder, int position) {

        Student student = students.get(position);

        holder.nameTV.setText(student.getName());
        holder.classTV.setText(student.getClassName());
        holder.idTV.setText(student.getID());
        holder.imageView.setImageResource(student.getImage());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTV,classTV,idTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            nameTV = itemView.findViewById(R.id.nameTV);
            classTV = itemView.findViewById(R.id.classTv);
            idTV = itemView.findViewById(R.id.idTV);
        }
    }
}
