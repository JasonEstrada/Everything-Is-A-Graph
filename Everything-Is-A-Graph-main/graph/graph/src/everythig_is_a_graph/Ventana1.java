/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import everythig_is_a_graph.Edge;
import everythig_is_a_graph.Vertex;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import everythig_is_a_graph.name;
import java.awt.Color;

/**
 *
 * @author F-E-R
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana1() {
        initComponents();
        ButtonTransparent();
        this.setLocationRelativeTo(null);
        vertexBtn.setSelected(true);
        infoLbl.setText("Now you are setting vertices");
        this.vectorVertices = new Vector<>();
        this.vectorEdges = new Vector<>();
        this.vecReco = new Vector<>();
        infoDelete.setVisible(false);
    }

    name p = new name();
    private Vector<Vertex> vectorVertices;
    private Vector<Edge> vectorEdges;
    private Vector<Vertex> vecReco;
    private Vertex recovertex[][];
    private Point p1, p2, p1_del, p2_del;
    private int adyacency[][], i_ady = 0, deleteVertex;
    private String prev_info;
    private double cost[][];
    private String recorridos[][];
    private String caminomin = "";
    private String inicio, fin;
    private Vertex start, end, h;
    private String name, distance;
    private int c = 0, k = 1;

    ;

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
        Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vistaPn = new javax.swing.JPanel();
        bgLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        vertexBtn = new javax.swing.JToggleButton();
        edgeBtn = new javax.swing.JToggleButton();
        deleteBtn = new javax.swing.JToggleButton();
        floydBtn = new javax.swing.JButton();
        infoDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 670));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1130, 670));
        jPanel1.setMinimumSize(new java.awt.Dimension(1130, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close (2).png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 40, 40));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1130, 670));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1130, 670));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1130, 670));

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

        bgLbl.setBackground(new java.awt.Color(0, 0, 0));
        bgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
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
                .addContainerGap()
                .addComponent(bgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        vistaPnLayout.setVerticalGroup(
            vistaPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(vistaPn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 830, 550));

        infoLbl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        infoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLbl.setText("You are doing something");
        infoLbl.setAlignmentX(0.5F);
        jPanel1.add(infoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 595, 713, -1));

        vertexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexBtnActionPerformed(evt);
            }
        });
        jPanel1.add(vertexBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 160, 70));

        edgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(edgeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 160, 60));

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 150, 120));

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
        jPanel1.add(floydBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 180, 110));

        infoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(infoDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backg6.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 860));

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

        if (!deleteBtn.isSelected() && !edgeBtn.isSelected() && !vertexBtn.isSelected()) {
            floydBtn.setSelected(true);
        }
        edgeBtn.setSelected(false);
        deleteBtn.setSelected(false);
        vertexBtn.setSelected(false);
        floydBtn.setSelected(true);
        infoLbl.setText("Click to workspace to choose a way");
        infoDelete.setVisible(false);
        start = null;      //Para que se vuelva a realizar el floyd warshall cada que se presione el boton
        end = null;
        caminomin = "";
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

    private void vistaPnAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vistaPnAncestorMoved
        draw(-1);
    }//GEN-LAST:event_vistaPnAncestorMoved

    private void bgLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgLblMousePressed
        int i = 0;
        if (p1_del != null && evt.getButton() == MouseEvent.BUTTON1) {
            p1_del = null;
        }
        if (vertexBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            c = 0;
            infoLbl.setText("Now you are setting vertices. Click to workspace to add a new vertex");
            if (!IsOnTop(evt.getPoint())) {

                boolean m = false;

                do {

                    name = JOptionPane.showInputDialog("Enter the vertex name");
                    while (name.trim().equals("")) {
                        infoLbl.setText("Please set a name");
                        name = JOptionPane.showInputDialog("Enter the vertex name");
                    }

                    for (Vertex vertex : vectorVertices) {
                        if (vertex.getName().equals(name)) {
                            m = true;
                            break;
                        } else {
                            m = false;
                        }
                    }
                } while (m == true);

                if (name != null) {
                    this.vectorVertices.add(new Vertex(evt.getX(), evt.getY(), name));
                    draw(-1);
                }
            }

        } else if (edgeBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            c = 0;
            infoLbl.setText("Now you are setting edges. Select the first vertex");
            for (Vertex vertex : vectorVertices) {
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(vertex.getX(), vertex.getY());
                        h = vertex;
                        infoLbl.setText("Select the second vertex");
                        vertex.aislado = false;
                    } else {
                        p2 = new Point(vertex.getX(), vertex.getY());
                        vertex.aislado = false;
                        if (p2.equals(p1)) {
                            infoLbl.setText("You can't do that, only between different vertices");
                        } else if (!ThereIsAnEdge(p1, p2)) {
                            distance = JOptionPane.showInputDialog("Enter the distance between vertices");
                            if (distance != null) {
                                while (!isNumber(distance)) {
                                    distance = JOptionPane.showInputDialog("Must be a number. Please try again");
                                }

                                while (Double.parseDouble(distance) <= 0) {
                                    distance = JOptionPane.showInputDialog("The distance cannot be less than zero");
                                }

                                this.vectorEdges.add(new Edge(p1.x, p1.y, p2.x, p2.y, distance, h, vertex));
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
            c = 0;
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
            c = 0;
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
        } else if (floydBtn.isSelected() && evt.getButton() == MouseEvent.BUTTON1) {
            Graphics g = vistaPn.getGraphics();
            for (Vertex vertex : vectorVertices) {
                vertex.visitado = false;
                vertex.pintado = false;
            }
            for (Edge edge : vectorEdges) {
                edge.mycolor = new Color(0, 0, 0);
                edge.pintar(g);
            }
            vecReco.clear();
            infoLbl.setText("Now you can choose a new way!");
            if (c == 0) {
                matrices();
                cost1(cost);
                recorrido1(recorridos);
                floydw(cost, recorridos);
            }

            for (Vertex vertex : vectorVertices) {
                infoLbl.setText("Click on the end vertex");
                if (new Rectangle(vertex.getX() - Vertex.radio, vertex.getY() - Vertex.radio, Vertex.radio * 2, Vertex.radio * 2).contains(evt.getPoint())) {
                    if (start == null) {
                        if (vertex.isAislado() == false) {
                            start = vertex;
                        } else {
                            infoLbl.setText("Enter a non-isolated vertex");
                        }
                    } else {
                        if (vertex.isAislado() == false) {
                            end = vertex;
                            caminomin = "";

                            floyd1();
                            k++;
                        } else {
                            infoLbl.setText("Enter a non-isolated vertex");
                        }
                    }
                    draw(-1);
                }

            }
            c++;
        }
    }//GEN-LAST:event_bgLblMousePressed

    private void infoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoDeleteActionPerformed
        JOptionPane.showMessageDialog(null, "To delete a vertex, left click on it.\n "
                + "To delete edge, click on the first vertex of the edge and then on the second one, both with right click.");
    }//GEN-LAST:event_infoDeleteActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
        recorridos = new String[vectorVertices.size()][vectorVertices.size()];
        recovertex = new Vertex[vectorVertices.size()][vectorVertices.size()];
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

    public void floyd1() {
        inicio = start.getName();
        fin = end.getName();
        caminomin = inicio;

        if (vectorVertices.size() != 0) {
            caminomin = min(recorridos, inicio, fin, caminomin, cost);
            p.setVisible(true);
            p.ruta.setText(caminomin);
            p.distancia.setText(Double.toString(distance(cost, inicio, fin)));
            highlight();

        }

    }

    public void prevs() {
        Vertex f = null;
        int i = 0;
        for (Vertex vertex : vecReco) {
            if (i == 0) {
                f = vertex;
                vertex.prev = null;
                i++;
            } else {
                vertex.prev = f;
                f = vertex;
            }
        }
    }

    public void highlight() {
        prevs();
        
        Graphics g = vistaPn.getGraphics();
        int i = 0;
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for (Edge edge : vectorEdges) {
            System.out.println(edge.getv1().getName() + "-" + edge.getv2().getName());
            if (edge.getv1().visitado == true && edge.getv2().visitado == true) {
                if ((edge.getv1().prev == edge.getv2()) || (edge.getv2().prev == edge.getv1())) {
                    edge.mycolor = new Color(255, 0, 0);
                }
            }
            edge.pintar(g);
        }
    }

    public void cost1(double costos[][]) {
        int i, j;
        for (i = 0; i < vectorVertices.size(); i++) {
            for (j = 0; j < vectorVertices.size(); j++) {
                if (i != j) {
                    if (costos[i][j] == 0) {
                        costos[i][j] = Double.POSITIVE_INFINITY;
                    }
                }
            }
        }
    }

    public void recorrido1(String recorridos[][]) {
        int i, j;
        for (j = 0; j < vectorVertices.size(); j++) {
            for (i = 0; i < vectorVertices.size(); i++) {
                if (i == j) {
                    recorridos[i][j] = "-";
                } else {
                    recorridos[i][j] = vectorVertices.get(j).getName();
                    recovertex[i][j] = vectorVertices.get(i);
                }
            }
        }
    }

    public double distance(double costos[][], String inicio, String fin) {
        int j = busqueda(recorridos, fin);
        int i = busqueda(recorridos, inicio);
        double distance;

        if (costos[i][j] == Double.POSITIVE_INFINITY) {
            distance = 0;
        } else {
            distance = costos[i][j];
        }

        return distance;
    }

    public void floydw(double costos[][], String recorridos[][]) {
        int i, j, k;

        for (k = 0; k < vectorVertices.size(); k++) {
            for (j = 0; j < vectorVertices.size(); j++) {
                for (i = 0; i < vectorVertices.size(); i++) {
                    if (j != k && i != j && k != i) {
                        if (costos[i][k] + costos[k][j] < costos[i][j]) {
                            costos[i][j] = costos[i][k] + costos[k][j];
                            recorridos[i][j] = vectorVertices.get(k).getName();
                            recovertex[i][j] = vectorVertices.get(k);
                        }
                    }
                }
            }
        }

    }

    public String min(String recorridos[][], String inicio, String fin, String camino, double costos[][]) {
        int j = busqueda(recorridos, fin);
        int i = busqueda(recorridos, inicio);
        vecReco.add(start);
        start.visitado = true;

        if (costos[i][j] == Double.POSITIVE_INFINITY) {
            camino = "";
        } else {
            while (true) {
                if (recorridos[i][j].equals(fin)) {
                    camino = camino + "-" + fin;
                    break;
                } else {
                    camino = camino + "- " + recorridos[i][j];
                    vecReco.add(recovertex[i][j]);
                    try {
                        recovertex[i][j].visitado = true;
                    } catch (Exception e) {
                    }
                }
                i = busqueda(recorridos, recorridos[i][j]);
            }

            vecReco.add(end);
            end.visitado = true;
        }

        return camino;
    }

    public int busqueda(String recorrido[][], String element) {
        int i;
        int pos = 0;

        for (i = 0; i < vectorVertices.size(); i++) {
            if (vectorVertices.get(i).getName().equals(element)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public void ButtonTransparent() {
        vertexBtn.setOpaque(false);
        vertexBtn.setContentAreaFilled(false);
        vertexBtn.setBorderPainted(false);
        edgeBtn.setOpaque(false);
        edgeBtn.setContentAreaFilled(false);
        edgeBtn.setBorderPainted(false);
        deleteBtn.setOpaque(false);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setBorderPainted(false);
        infoDelete.setOpaque(false);
        infoDelete.setContentAreaFilled(false);
        infoDelete.setBorderPainted(false);
        floydBtn.setOpaque(false);
        floydBtn.setContentAreaFilled(false);
        floydBtn.setBorderPainted(false);
        Exit.setOpaque(false);
        Exit.setContentAreaFilled(false);
        Exit.setBorderPainted(false);
        
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel bgLbl;
    private javax.swing.JToggleButton deleteBtn;
    private javax.swing.JToggleButton edgeBtn;
    private javax.swing.JButton floydBtn;
    private javax.swing.JButton infoDelete;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton vertexBtn;
    private javax.swing.JPanel vistaPn;
    // End of variables declaration//GEN-END:variables
}
