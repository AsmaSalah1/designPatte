/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;

class ColorFillDecorator extends ShapeDecorator {
    private String color;

    public ColorFillDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling " + decoratedShape.getDescription() + " with " + color + " color");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + color + " fill";
    }
}

