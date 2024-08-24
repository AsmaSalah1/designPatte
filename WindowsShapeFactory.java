
package com.mycompany.designpetternproject1;

public class WindowsShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("square")) {
//            return new SquareWindows();
            return WindowsSingelton.getShapeInstance("square");

        } else if (type.equalsIgnoreCase("rectangle")) {
//            return new RectangleWindows();
            return WindowsSingelton.getShapeInstance("rectangle");

        }
        return null;
    }
}