package com.mycompany.designpetternproject1;

import java.util.ArrayList;

// فئة Shape الأساسية
public abstract class Shape {

    String name; //اسم الشكل. يتم تعيينه في الفئات المشتقة.
    ArrayList<String> properties = new ArrayList<>(); //قائمة تحتوي على خصائص الشكل. يتم تعيين هذه الخصائص في الفئات المشتقة.

    // رسم الشكل
    void draw() {
        System.out.println("Drawing the shape");
    }

//    public abstract void getDescription();
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Description of ").append(name).append(":\n");
        for (String property : properties) {
            description.append("   ").append(property).append("\n");
        }
        return description.toString();
    }

}
