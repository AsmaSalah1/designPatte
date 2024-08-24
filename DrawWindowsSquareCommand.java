
package com.mycompany.designpetternproject1;

public class DrawWindowsSquareCommand implements Command {
    private SquareWindows square;

    public DrawWindowsSquareCommand(SquareWindows square) {
        this.square = square;
    }

    @Override
    public void execute() {
        square.draw();
    }
}
