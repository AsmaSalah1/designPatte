
package com.mycompany.designpetternproject1;


public class WindowsSingelton {
    private static Shape windowsSquareInstance;
    private static Shape windowsRectangleInstance;

    public static Shape getShapeInstance(String type) {
            if (type.equalsIgnoreCase("square")) {//double check
                if (windowsSquareInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (windowsSquareInstance == null) {
                            windowsSquareInstance =new WindowsShapeFactory().createShape("square");
                        }
                    }
                }
                return windowsSquareInstance;
            } else if (type.equalsIgnoreCase("rectangle")) {
                if (windowsRectangleInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (windowsRectangleInstance == null) {
                            windowsRectangleInstance = new WindowsShapeFactory().createShape("rectangle");
                        }
                    }
                }
                return windowsRectangleInstance;
            }
       
        return null;
    } 
}
