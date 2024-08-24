
package com.mycompany.designpetternproject1;


public class DrawWindowsRectangulaCommand implements Command {
    private RectangleWindows rectangula;

    public DrawWindowsRectangulaCommand(RectangleWindows rectangula) {
        this.rectangula = rectangula;
    }

    @Override
    public void execute() {
        rectangula.draw();
    }
}
