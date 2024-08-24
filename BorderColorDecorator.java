
package com.mycompany.designpetternproject1;


class BorderColorDecorator extends ShapeDecorator {
    private String borderColor;

    public BorderColorDecorator(Shape shape, String borderColor) {
        super(shape);
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding " + borderColor + " border color to " + decoratedShape.getDescription());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + borderColor + " border";
    }
}

