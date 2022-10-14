/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
    private String distance;

    public Edge(int x1, int y1, int x2, int y2, String distance) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.distance = distance;
    }

    public void pintar(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(x1, y1, x2, y2);
        Font myFont = new Font("Arial", 1, 16);
        g2.setFont(myFont);
        if (x1 > x2 && y1 > y2) {
            g2.drawString(distance, x1 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
        } else if (x1 < x2 && y1 < y2) {
            g2.drawString(distance, x2 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
        } else if (x1 > x2 && y1 < y2) {
            g2.drawString(distance, x1 - Math.abs((x1 - x2) / 2), y2 - Math.abs((y1 - y2) / 2));
        } else if (x1 < x2 && y1 > y2) {
            g2.drawString(distance, x2 - Math.abs((x1 - x2) / 2), y1 - Math.abs((y1 - y2) / 2));
        };
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
}
