
package com.mycompany.designpetternproject1;


public class SketchBoard {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void drawTheShape() {
        command.execute();}
}
