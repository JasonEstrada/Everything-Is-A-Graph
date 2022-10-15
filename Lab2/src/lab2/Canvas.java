/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author F-E-R
 */
public class Canvas extends JPanel implements MouseListener, MouseMotionListener {

    private Vector<Vertex> vectorVertices;
    private Vector<Edge> vectorEdges;
    private Point p1, p2;
//    private Vertex vertexMove;
//    private int iVertex;
    static public int action = 1;


    public Canvas() {
        this.vectorVertices = new Vector<>();
        this.vectorEdges = new Vector<>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Vertex vertices : vectorVertices) {
            vertices.pintar(g, 255);
        }
        for (Edge edge : vectorEdges) {
            edge.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent evt) {

    }

    @Override
    public void mousePressed(MouseEvent evt) {
        
        if (evt.getButton() == MouseEvent.BUTTON1 && action ==1) {
            String name = JOptionPane.showInputDialog("Enter the vertex name");
            if (name != null) {
                this.vectorVertices.add(new Vertex(evt.getX(), evt.getY(), name));
                repaint();
                
            }
        } else if (evt.getButton() == MouseEvent.BUTTON1 && action == 2) {
            for (Vertex vertex : vectorVertices) {
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(vertex.getX(), vertex.getY());
                    } else {
                        p2 = new Point(vertex.getX(), vertex.getY());
                        String distance = JOptionPane.showInputDialog("Enter the distance between vertices");
                        if (distance != null) {
                            this.vectorEdges.add(new Edge(p1.x, p1.y, p2.x, p2.y, distance));
                            repaint();
                        }

                        p1 = null;
                        p2 = null;
                    }
                }
            }
        }

//        if (evt.getButton() == MouseEvent.BUTTON3) {
//            int c = 0;
//            for (Vertex vertex : vectorVertices) {
//                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
//                    vertexMove = vertex;
//                    iVertex = c;
//                    break;
//                }
//                c++;
//            }
//        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
//        vertexMove = null;
//        iVertex = -1;
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseDragged(MouseEvent evt) {
//        if (vertexMove != null) {
//            this.vectorVertices.set(iVertex, new Vertex(evt.getX(), evt.getY(), vertexMove.getName()));
//            int c = 0;
//            for (Edge edge : vectorEdges) {
//                if (new Rectangle(edge.getX1() - Vertex.radio, edge.getY1() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
//                    this.vectorEdges.set(c, new Edge(evt.getX(), evt.getY(), edge.getX2(), edge.getY2(), edge.getDistance()));
//                } else if (new Rectangle(edge.getX2() - Vertex.radio, edge.getY2() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
//                    this.vectorEdges.set(c, new Edge(edge.getX1(), edge.getY1(), evt.getX(), evt.getY(), edge.getDistance()));
//                }
//                c++;
//            }
//            repaint();
//        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

}
