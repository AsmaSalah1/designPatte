/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;
public class SquareLinux extends Shape {

    public SquareLinux() {
        name = "Linux Square Shape";
        properties.add("All sides are equal");
        properties.add("Right angles at each corner");//زوايا قائمة في كل زاوية
         properties.add("Line Style: Custom Line");
        properties.add("Default Color: Green");
        properties.add("Border Width: 1 pixel");
        properties.add("Transparency: 10%");
    }

    @Override
    void draw() {
        System.out.println("Drawing a Linux square");
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