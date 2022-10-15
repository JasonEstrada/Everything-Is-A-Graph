/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author F-E-R
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        vertexBtn.setSelected(true);
        infoLbl.setText("Now you are setting vertices");
        this.vectorVertices = new Vector<>();
        this.vectorEdges = new Vector<>();
        infoDelete.setVisible(false);
    }

    private Vector<Vertex> vectorVertices;
    private Vector<Edge> vectorEdges;
    private Point p1, p2, p1_del, p2_del;
    private int adyacency[][], i_ady = 0, deleteVertex;
    private String prev_info;
    private double cost[][];

    ;
//    private Vertex vertexMove;
//    private int iVertex;

    public void draw(int deleteVertex) {
        Graphics g = vistaPn.getGraphics();
        int i = 0;
        for (Vertex vertex : vectorVertices) {
            if (i != deleteVertex) {
                vertex.pintar(g, 255);
            } else {
                Point p = new Point(vertex.getX(), vertex.getY());
                deleteEdges(p);
                vertex.pintar(g, 0);
                vectorVertices.remove(deleteVertex);
                break;
            }
            i++;
        }
        for (Edge edge : vectorEdges) {
            edge.pintar(g);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(deleteVertex);
    }

    private void deleteEdges(Point p) {
        Vector<Edge> aux = new Vector();
        for (Edge edge : vectorEdges) {
            Point p1 = new Point(edge.getX1(), edge.getY1());
            Point p2 = new Point(edge.getX2(), edge.getY2());
            if (!(p.equals(p1) || p.equals(p2))) {
                aux.add(edge);
            }
        }
        vectorEdges = aux;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vistaPn = new javax.swing.JPanel();
        bgLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        vertexBtn = new javax.swing.JToggleButton();
        edgeBtn = new javax.swing.JToggleButton();
        deleteBtn = new javax.swing.JToggleButton();
        floydBtn = new javax.swing.JButton();
        infoDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        vistaPn.setBackground(new java.awt.Color(247, 232, 236));
        vistaPn.setOpaque(false);
        vistaPn.setPreferredSize(new java.awt.Dimension(2000, 2000));
        vistaPn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                vistaPnAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        vistaPn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                vistaPnMouseDragged(evt);
            }
        });
        vistaPn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vistaPnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vistaPnMouseReleased(evt);
            }
        });

        bgLbl.setBackground(new java.awt.Color(0, 0, 0));
        bgLbl.setForeground(new java.awt.Color(0, 0, 0));
        bgLbl.setText("   ");
        bgLbl.setToolTipText("");
        bgLbl.setOpaque(true);
        bgLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout vistaPnLayout = new javax.swing.GroupLayout(vistaPn);
        vistaPn.setLayout(vistaPnLayout);
        vistaPnLayout.setHorizontalGroup(
            vistaPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaPnLayout.createSequentialGroup()
                .addComponent(bgLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        vistaPnLayout.setVerticalGroup(
            vistaPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaPnLayout.createSequentialGroup()
                .addComponent(bgLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(vistaPn);

        infoLbl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        infoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLbl.setText("You are doing something");
        infoLbl.setAlignmentX(0.5F);

        vertexBtn.setText("Vertex");
        vertexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexBtnActionPerformed(evt);
            }
        });

        edgeBtn.setText("Edge");
        edgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgeBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        floydBtn.setText("Floyd-Warshall");
        floydBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                floydBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                floydBtnMouseExited(evt);
            }
        });
        floydBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floydBtnActionPerformed(evt);
            }
        });

        infoDelete.setText("?");
        infoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(vertexBtn)
                .addGap(135, 135, 135)
                .addComponent(edgeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infoDelete)
                .addGap(90, 90, 90)
                .addComponent(floydBtn))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(infoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vertexBtn)
                    .addComponent(edgeBtn)
                    .addComponent(deleteBtn)
                    .addComponent(infoDelete)
                    .addComponent(floydBtn))
                .addGap(14, 14, 14)
                .addComponent(infoLbl))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void floydBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floydBtnActionPerformed
        matrices();
        if (vectorVertices.size() != 0) {
            for (int k = 0; k < adyacency.length; k++) {
                System.out.println("");
                for (int l = 0; l < adyacency.length; l++) {
                    System.out.print(adyacency[k][l] + "     ");
                }
            }

            for (int k = 0; k < cost.length; k++) {
                System.out.println("");
                for (int l = 0; l < cost.length; l++) {
                    System.out.print(cost[k][l] + "     ");
                }
            }
        }
        infoDelete.setVisible(false);
    }//GEN-LAST:event_floydBtnActionPerformed

    private void floydBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_floydBtnMouseExited
        infoLbl.setText(prev_info);
    }//GEN-LAST:event_floydBtnMouseExited

    private void floydBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_floydBtnMouseEntered
        prev_info = infoLbl.getText();
        infoLbl.setText("Click to see minimum paths");
    }//GEN-LAST:event_floydBtnMouseEntered

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (!edgeBtn.isSelected() && !vertexBtn.isSelected()) {
            deleteBtn.setSelected(true);
        }
        edgeBtn.setSelected(false);
        vertexBtn.setSelected(false);
        infoLbl.setText("Now you are deleting objects");
        infoDelete.setVisible(true);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void edgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edgeBtnActionPerformed
        if (!vertexBtn.isSelected() && !deleteBtn.isSelected()) {
            edgeBtn.setSelected(true);
        }
        vertexBtn.setSelected(false);
        deleteBtn.setSelected(false);
        infoLbl.setText("Now you are setting edges. Select the first vertex");
        infoDelete.setVisible(false);
    }//GEN-LAST:event_edgeBtnActionPerformed

    private void vertexBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexBtnActionPerformed
        if (!edgeBtn.isSelected() && !deleteBtn.isSelected()) {
            vertexBtn.setSelected(true);
        }
        edgeBtn.setSelected(false);
        deleteBtn.setSelected(false);
        infoLbl.setText("Now you are setting vertices. Click to workspace to add a new vertex");
        infoDelete.setVisible(false);
    }//GEN-LAST:event_vertexBtnActionPerformed

    private void vistaPnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaPnMouseReleased
        //        vertexMove = null;
        //        iVertex = -1;
    }//GEN-LAST:event_vistaPnMouseReleased

    private void vistaPnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaPnMousePressed

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
    }//GEN-LAST:event_vistaPnMousePressed

    private void vistaPnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vistaPnMouseDragged
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
            //            draw();
            //        }
    }//GEN-LAST:event_vistaPnMouseDragged

    private void vistaPnAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vistaPnAncestorMoved
        draw(-1);
    }//GEN-LAST:event_vistaPnAncestorMoved

    private void bgLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgLblMousePressed
        int i = 0;
        if (p1_del != null && evt.getButton() == MouseEvent.BUTTON1) {
            p1_del = null;
        }
        if (vertexBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            infoLbl.setText("Now you are setting vertices. Click to workspace to add a new vertex");
            if (!IsOnTop(evt.getPoint())) {
                String name = JOptionPane.showInputDialog("Enter the vertex name");
                if (name != null) {
                    this.vectorVertices.add(new Vertex(evt.getX(), evt.getY(), name));
                    draw(-1);
                }
            }

        } else if (edgeBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            infoLbl.setText("Now you are setting edges. Select the first vertex");
            for (Vertex vertex : vectorVertices) {
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(vertex.getX(), vertex.getY());
                        infoLbl.setText("Select the second vertex");
                    } else {
                        p2 = new Point(vertex.getX(), vertex.getY());
                        if (p2.equals(p1)) {
                            infoLbl.setText("You can't do that, only between different vertices");
                        } else if (!ThereIsAnEdge(p1, p2)) {
                            String distance = JOptionPane.showInputDialog("Enter the distance between vertices");
                            if (distance != null) {
                                while (!isNumber(distance)) {
                                    distance = JOptionPane.showInputDialog("Must be a number. Please try again");
                                }
                                this.vectorEdges.add(new Edge(p1.x, p1.y, p2.x, p2.y, distance));
                            }
                        } else {
                            infoLbl.setText("There is already an edge between these vertices");
                        }

                        p1 = null;
                        p2 = null;
                    }
                    draw(-1);
                    break;
                }
            }
        } else if (deleteBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            infoLbl.setText("Now you are deleting objects");
            for (Vertex vertex : vectorVertices) {
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    draw(i);
                    deleteVertex = i;
                    break;
                }
                i++;
            }
            repaint();
            deleteVertex = -1;
        } else if (deleteBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON3) {
            infoLbl.setText("Now you are deleting objects");
            for (Vertex vertex : vectorVertices) {
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    if (p1_del == null) {
                        p1_del = new Point(vertex.getX(), vertex.getY());
                    } else {
                        p2_del = new Point(vertex.getX(), vertex.getY());
                        Vector<Edge> aux = vectorEdges;
                        for (Edge edge : vectorEdges) {
                            Point p_aux1 = new Point(edge.getX1(), edge.getY1());
                            Point p_aux2 = new Point(edge.getX2(), edge.getY2());
                            if ((p1_del.equals(p_aux1) || p1_del.equals(p_aux2)) && (p2_del.equals(p_aux1) || p2_del.equals(p_aux2)) && !p1_del.equals(p2_del)) {
                                aux.remove(edge);
                                break;
                            }
                        }
                        vectorEdges = aux;
                        p1_del = null;
                        p2_del = null;
                    }
                    deleteVertex = -1;
                    repaint();
                    break;
                }
            }
        }
    }//GEN-LAST:event_bgLblMousePressed

    private void infoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDeleteActionPerformed
        JOptionPane.showMessageDialog(null, "To delete a vertex, left click on it.\n "
                + "To delete edge, click on the first vertex of the edge and then on the second one, both with right click.");
    }//GEN-LAST:event_infoDeleteActionPerformed


    private boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean IsOnTop(Point p) {
        Rectangle rect_aux = new Rectangle(p.x - Vertex.radio, p.y - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2);
        for (Vertex vertex : vectorVertices) {
            if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).intersects(rect_aux)) {
                return true;
            }
        }
        return false;
    }

    private boolean ThereIsAnEdge(Point p1, Point p2) {
        for (Edge edge : vectorEdges) {
            Point p1_aux = new Point(edge.getX1(), edge.getY1());
            Point p2_aux = new Point(edge.getX2(), edge.getY2());
            if ((p1.equals(p1_aux) || p1.equals(p2_aux)) && (p2.equals(p1_aux) || p2.equals(p2_aux))) {
                return true;
            }
        }
        return false;
    }

    private void matrices() {
        adyacency = new int[vectorVertices.size()][vectorVertices.size()];
        cost = new double[vectorVertices.size()][vectorVertices.size()];
        for (int i = 0; i < adyacency.length; i++) {
            Point vertex1 = new Point(vectorVertices.get(i).getX(), vectorVertices.get(i).getY());
            for (int j = 0; j < adyacency.length; j++) {
                Point vertex2 = new Point(vectorVertices.get(j).getX(), vectorVertices.get(j).getY());
                for (Edge edge : vectorEdges) {
                    Point p_aux1 = new Point(edge.getX1(), edge.getY1());
                    Point p_aux2 = new Point(edge.getX2(), edge.getY2());
                    if ((vertex1.equals(p_aux1) || vertex1.equals(p_aux2)) && (vertex2.equals(p_aux1) || vertex2.equals(p_aux2)) && !vertex1.equals(vertex2)) {
                        adyacency[i][j] = 1;
                        cost[i][j] = Double.parseDouble(edge.getDistance());
                        break;
                    }
                }
            }
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLbl;
    private javax.swing.JToggleButton deleteBtn;
    private javax.swing.JToggleButton edgeBtn;
    private javax.swing.JButton floydBtn;
    private javax.swing.JButton infoDelete;
    private javax.swing.JLabel infoLbl;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton vertexBtn;
    private javax.swing.JPanel vistaPn;
    // End of variables declaration//GEN-END:variables
}
