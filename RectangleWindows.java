/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;

public class RectangleWindows extends Shape {

    public RectangleWindows() {
        name = "Windows Rectangle Shape";
        properties.add("Opposite sides are parallel and equal");
           properties.add("Sharp Corners");
        properties.add("Thin Lines");
        properties.add("Light Gray Background Color");
        properties.add("Soft Shadow");
    }

    @Override
    void draw() {
        System.out.println("Drawing a Windows rectangle");
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