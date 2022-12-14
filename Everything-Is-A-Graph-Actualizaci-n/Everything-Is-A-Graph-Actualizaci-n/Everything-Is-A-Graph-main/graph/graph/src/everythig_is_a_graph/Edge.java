/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author F-E-R
 */
public class Edge {

    private int x1, y1, x2, y2;
    private Vertex v1, v2;
    private String distance;
    public Color mycolor = new java.awt.Color(0, 0, 0);

    public Edge(int x1, int y1, int x2, int y2, String distance, Vertex v1, Vertex v2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.distance = distance;
        this.v1 = v1;
        this.v2 = v2;
    }

    public void pintar(Graphics g) {
        g.setColor(this.mycolor);
        g.drawLine(x1, y1, x2, y2);
        Font myFont = new Font("Arial", 1, 16);
        g.setFont(myFont);
        if (x1 > x2 && y1 > y2) {
            g.drawString(distance, x1 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
        } else if (x1 < x2 && y1 < y2) {
            g.drawString(distance, x2 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
        } else if (x1 > x2 && y1 < y2) {
            g.drawString(distance, x1 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
        } else if (x1 < x2 && y1 > y2) {
            g.drawString(distance, x2 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
        }
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public String getDistance() {
        return distance;
    }

    public Vertex getv1() {
        return v1;
    }

    public Vertex getv2() {
        return v2;
    }
}
