package com.mycompany.designpetternproject1;
public class FactorySingleton {
    private static Shape windowsSquareInstance;
    private static Shape windowsRectangleInstance;
    private static Shape linuxSquareInstance;
    private static Shape linuxRectangleInstance;

    public static Shape getShapeInstance(String type, ShapeFactory factory) {
        if (factory instanceof WindowsShapeFactory) {
            if (type.equalsIgnoreCase("square")) {//double check
                if (windowsSquareInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (windowsSquareInstance == null) {
                            windowsSquareInstance = factory.createShape("square");
                        }
                    }
                }
                return windowsSquareInstance;
            } else if (type.equalsIgnoreCase("rectangle")) {
                if (windowsRectangleInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (windowsRectangleInstance == null) {
                            windowsRectangleInstance = factory.createShape("rectangle");
                        }
                    }
                }
                return windowsRectangleInstance;
            }
        } else if (factory instanceof LinuxShapeFactory) {
            if (type.equalsIgnoreCase("square")) {
                if (linuxSquareInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (linuxSquareInstance == null) {
                            linuxSquareInstance = factory.createShape("square");
                        }
                    }
                }
                return linuxSquareInstance;
            } else if (type.equalsIgnoreCase("rectangle")) {
                if (linuxRectangleInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (linuxRectangleInstance == null) {
                            linuxRectangleInstance = factory.createShape("rectangle");
                        }
                    }
                }
                return linuxRectangleInstance;
            }
        }
        return null;
    }
}

//public class FactorySingleton {
//
//    private static Shape squareInstance;
//    private static Shape rectangleInstance;
//
//    public static Shape getShapeInstance(String type, ShapeFactory factory) {
//        if (type.equalsIgnoreCase("square")) {
////double check
//            if (squareInstance == null) {
//                synchronized (FactorySingleton.class) {
//                    if (squareInstance == null) {
//                        squareInstance = factory.createShape("square");
//                    }
//                }
//            }
//            return squareInstance;
//        } else if (type.equalsIgnoreCase("rectangle")) {
//            if (rectangleInstance == null) {
//                synchronized (FactorySingleton.class) {
//                    if (rectangleInstance == null) {
//                        rectangleInstance = factory.createShape("rectangle");
//                    }
//                }
//            }
//            return rectangleInstance;
//        }
//        return null;
//    }
//}
