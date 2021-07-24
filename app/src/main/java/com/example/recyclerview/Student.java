package com.example.recyclerview;

public class Student {
    private String Name;
    private String ClassName;
    private String ID;
    private int Image;

    public Student() {
    }

    public Student(String name, String className, String ID, int image) {
        Name = name;
        ClassName = className;
        this.ID = ID;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}

