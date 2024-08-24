
package com.mycompany.designpetternproject1;


public class linuxSingleton {
  private static Shape linuxSquareInstance;
    private static Shape linuxRectangleInstance;
    
    public static Shape getShapeInstance(String type) {
            if (type.equalsIgnoreCase("square")) {
                if (linuxSquareInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (linuxSquareInstance == null) {
                            linuxSquareInstance = new LinuxShapeFactory().createShape("square");
                        }
                    }
                }
                return linuxSquareInstance;
            } else if (type.equalsIgnoreCase("rectangle")) {
                if (linuxRectangleInstance == null) {
                    synchronized (FactorySingleton.class) {
                        if (linuxRectangleInstance == null) {
                            linuxRectangleInstance =new LinuxShapeFactory().createShape("rectangle"); 
                        }
                    }
                }
                return linuxRectangleInstance;
            }
        
        return null;
    }


}
