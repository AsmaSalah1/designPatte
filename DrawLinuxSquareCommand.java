/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;

public class DrawLinuxSquareCommand implements Command {
    private SquareLinux square;

    public DrawLinuxSquareCommand(SquareLinux square) {
        this.square = square;
    }

    @Override
    public void execute() {
        square.draw();
    }
}
