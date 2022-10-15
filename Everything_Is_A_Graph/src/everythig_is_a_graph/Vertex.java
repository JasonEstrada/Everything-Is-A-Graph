/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import java.awt.Font;
import java.awt.Graphics;
import javafx.scene.paint.Color;

/**
 *
 * @author F-E-R
 */
public class Vertex {

    private int x, y;
    private String name;
    public static final int radio = 20;

    public Vertex(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void pintar(Graphics g, int Alpha) {
        g.setColor(new java.awt.Color(162, 231, 225, Alpha));
        g.fillOval(this.x - radio, this.y - radio, radio * 2, radio * 2);
        g.setColor(new java.awt.Color(0,0,0, Alpha));
        Font myFont = new Font ("Berlin Sans FB", Font.PLAIN, 16);
        g.setFont(myFont);
        g.drawString(name, x-radio-5, y-radio-5);
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
