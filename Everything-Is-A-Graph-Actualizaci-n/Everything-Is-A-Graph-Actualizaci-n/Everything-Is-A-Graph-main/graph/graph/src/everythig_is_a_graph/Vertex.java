/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author F-E-R
 */
public class Vertex {

    private int x, y;
    private String name;
    public static final int radio = 20;
    public boolean aislado, visitado, pintado;
    public Vertex prev;

    public Vertex(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.aislado = true;
        this.visitado = false;
        this.pintado = false;
        this.prev = null;
    }

    public void pintar(Graphics g, int Alpha) {
        g.setColor(new java.awt.Color(162, 231, 225, Alpha));
        g.fillOval(this.x - radio, this.y - radio, radio * 2, radio * 2);
        g.setColor(new java.awt.Color(0, 0, 0, Alpha));
        Font myFont = new Font("Berlin Sans FB", Font.BOLD, 16);
        g.setFont(myFont);
        g.drawString(name, x - radio - 5, y - radio - 5);
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public boolean isAislado() {
        return aislado;
    }

    public int getY() {
        return y;
    }
}
