/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpetternproject1;

public class DrawLinuxRectangulaCommand implements Command {
    private RectangleLinux rectangula;

    public DrawLinuxRectangulaCommand(RectangleLinux rectangula) {
        this.rectangula = rectangula;
    }

    @Override
    public void execute() {
        rectangula.draw();
    }
}
