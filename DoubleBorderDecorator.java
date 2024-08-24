/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;

class DoubleBorderDecorator extends ShapeDecorator {
    public DoubleBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Doubling border size of " + decoratedShape.getDescription());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with double border size"; }
}