
package com.mycompany.designpetternproject1;
public class SquareWindows extends Shape {

    public SquareWindows() {
        name = "Windows Square Shape";
        properties.add("All sides are equal");
        properties.add("Right angles at each corner");
          properties.add("Line Style: Standard Line");
        properties.add("Default Color: Blue");
        properties.add("Border Width: 2 pixels");
        properties.add("Transparency: 0%");
    }

    @Override
    void draw() {
        System.out.println("Drawing a Windows square");
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