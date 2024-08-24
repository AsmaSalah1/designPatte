/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;
public class RectangleLinux extends Shape {

    public RectangleLinux() {
        name = "Linux Rectangle Shape";
        properties.add("Opposite sides are parallel and equal");
     properties.add("Rounded Corners");
        properties.add("Thick Lines");
        properties.add("Dark Gray Background Color");
        properties.add("No Shadow");
    }

    @Override
    void draw() {
        System.out.println("Drawing a Linux rectangle");
    }

    @Override
     public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Description of ").append(name).append(":\n");
        for (String property : properties) {
            description.append("   ").append(property).append("\n");
        }
        return description.toString();
    }

}