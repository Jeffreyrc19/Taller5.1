package Matriz2;
import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Basica extends javax.swing.JFrame {
private String resultadoAnterior = "";
ScriptEngineManager sem = new ScriptEngineManager();
ScriptEngine se = sem.getEngineByName("JavaScript");

 
    public Basica() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_pot = new javax.swing.JButton();
        btn_porc = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_por = new javax.swing.JButton();
        btn_me = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_pun = new javax.swing.JButton();
        btn_Ant = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 255, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 328, 38));

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResultadoMouseClicked(evt);
            }
        });
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 320, 60));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btn_inicio.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(0, 204, 0));
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_inicio.setText("•");
        btn_inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioMouseClicked(evt);
            }
        });
        jPanel1.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("•");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("•");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pot.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_pot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_pot.setText("CE");
        btn_pot.setBorder(null);
        btn_pot.setFocusPainted(false);
        btn_pot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_pot.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_porc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_porc.setText("%");
        btn_porc.setBorder(null);
        btn_porc.setFocusPainted(false);
        btn_porc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_porc.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_div.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setBorder(null);
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_div.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_por.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        btn_por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_por.setText("X");
        btn_por.setBorder(null);
        btn_por.setFocusPainted(false);
        btn_por.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_por.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_por.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porActionPerformed(evt);
            }
        });
        jPanel2.add(btn_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_me.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_me.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_me.setText("-");
        btn_me.setBorder(null);
        btn_me.setFocusPainted(false);
        btn_me.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_me.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_me.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_me.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_meActionPerformed(evt);
            }
        });
        jPanel2.add(btn_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btn_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_c.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setBorder(null);
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_c.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        jButton13.setText("C");
        jButton13.setBorder(null);
        jButton13.setFocusPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        jButton13.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        jButton14.setText("C");
        jButton14.setBorder(null);
        jButton14.setFocusPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        jButton14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        jButton15.setText("C");
        jButton15.setBorder(null);
        jButton15.setFocusPainted(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        jButton15.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_pun.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_pun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_pun.setText(".");
        btn_pun.setBorder(null);
        btn_pun.setFocusPainted(false);
        btn_pun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_pun.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_pun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_punActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pun, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        btn_Ant.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Ant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_Ant.setText("Ant");
        btn_Ant.setBorder(null);
        btn_Ant.setFocusPainted(false);
        btn_Ant.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Ant.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_Ant.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_Ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AntActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Ant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        btn_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn_igual.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonIgual.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_igual.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn_mas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_mas.setText("+");
        btn_mas.setBorder(null);
        btn_mas.setFocusPainted(false);
        btn_mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_mas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1CuandoPresione.png"))); // NOI18N
        btn_3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonNumero.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porActionPerformed
        addNumber("*");
        
    }//GEN-LAST:event_btn_porActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_punActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_punActionPerformed
        addNumber(".");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_punActionPerformed

    private void btn_potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
        
    }//GEN-LAST:event_btn_potActionPerformed

    private void btn_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_porcActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
        
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_meActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_meActionPerformed
      addNumber("-");
      
    }//GEN-LAST:event_btn_meActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
addNumber("+");    
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
    try {
        File archivo = new File("historial.txt");
        FileWriter escritor = new FileWriter(archivo, true);

        String operacion = txtOperacion.getText().trim();
        String resultado = txtResultado.getText().trim();

        String registro = "Operacion = " + operacion ;
        String registro1="\nResultado= " + resultado + "\n";
        escritor.write(registro);
        escritor.write(registro1);
        escritor.close();

        txtOperacion.setText(operacion);
        txtResultado.setText(resultado);
    } catch (IOException ex) {
        ex.printStackTrace();
    }


    try {
        String resultado =  se.eval(txtOperacion.getText()).toString();
        resultadoAnterior = resultado; // Actualiza resultadoAnterior con el resultado actual
        txtResultado.setText(resultado);
    } catch(Exception e) {
        //txtOperacion.setText("Error");
    }


    }//GEN-LAST:event_btn_igualActionPerformed

    boolean modoOscuro = false;
        
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if(!modoOscuro){
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        txtOperacion.setForeground(Color.decode("#0db387"));
        txtResultado.setForeground(Color.decode("#0db387"));
       cambiarColorBtn1(btn_por);
       cambiarColorBtn1(btn_c);
       cambiarColorBtn1(btn_mas);
       cambiarColorBtn1(btn_me);
       cambiarColorBtn1(btn_div);
       cambiarColorBtn1(btn_porc);
       cambiarColorBtn1(btn_pot);
       cambiarColorBtn2(btn_1);
       cambiarColorBtn2(btn_2);
       cambiarColorBtn2(btn_3);
       cambiarColorBtn2(btn_4);
       cambiarColorBtn2(btn_5);
       cambiarColorBtn2(btn_6);
       cambiarColorBtn2(btn_7);
       cambiarColorBtn2(btn_8);
       cambiarColorBtn2(btn_9);
       cambiarColorBtn2(btn_0);
       cambiarColorBtn2(btn_pun);
       cambiarColorBtn2(btn_Ant);
       
        btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/imagenes/dark.png")));
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/FondoOscu.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/FondoOscu.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/Fondooscu2.png")));
        btn_igual.setForeground(Color.decode("#212b41"));
        modoOscuro =true;
        
        }else{
            Basica frame = new Basica();
            this.dispose();
            frame.setVisible(true);
        }

    }//GEN-LAST:event_btn_oscuroActionPerformed

 
    private void btn_AntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AntActionPerformed
            txtOperacion.setText(resultadoAnterior);
                    
    }//GEN-LAST:event_btn_AntActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btn_inicioMouseClicked

    private void txtResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResultadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        GranMenu gm = new GranMenu();
        gm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basica().setVisible(true);
                
            }
        });
    }
    public void cambiarColorBtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/BotonPresionado.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/BotonPresionado.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/BotonOscuro3.png")));
        btn.setForeground(Color.decode("#18d4a3"));
    }
    public void cambiarColorBtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/BotonOscuro2.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/BotonOscuro2.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/BotonPresionado.png")));
        btn.setForeground(Color.decode("#96a8a0"));
        
    }
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Ant;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_igual;
    private javax.swing.JLabel btn_inicio;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_me;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_por;
    private javax.swing.JButton btn_porc;
    private javax.swing.JButton btn_pot;
    private javax.swing.JButton btn_pun;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
