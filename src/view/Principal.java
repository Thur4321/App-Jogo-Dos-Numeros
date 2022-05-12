/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.CartaoAposta;
import classes.CartaoSorteio;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author lucca
 */
public class Principal extends javax.swing.JFrame {

    private static final int CRIACAO = 0;
    private static final int INICIALIZACAO = 1;
    private static final int FINALIZAÇAO = 2;
    private static final int BLOQUEIO = 3;
    private int estado;
    private int qtde = 0;
    private CartaoSorteio sorteio;
    private CartaoAposta aposta;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTB1 = new javax.swing.JToggleButton();
        jTB4 = new javax.swing.JToggleButton();
        jTB2 = new javax.swing.JToggleButton();
        jTB5 = new javax.swing.JToggleButton();
        jTB3 = new javax.swing.JToggleButton();
        jTB11 = new javax.swing.JToggleButton();
        jTB12 = new javax.swing.JToggleButton();
        jTB13 = new javax.swing.JToggleButton();
        jTB14 = new javax.swing.JToggleButton();
        jTB15 = new javax.swing.JToggleButton();
        jTB21 = new javax.swing.JToggleButton();
        jTB22 = new javax.swing.JToggleButton();
        jTB23 = new javax.swing.JToggleButton();
        jTB24 = new javax.swing.JToggleButton();
        jTB25 = new javax.swing.JToggleButton();
        jTB31 = new javax.swing.JToggleButton();
        jTB32 = new javax.swing.JToggleButton();
        jTB33 = new javax.swing.JToggleButton();
        jTB34 = new javax.swing.JToggleButton();
        jTB35 = new javax.swing.JToggleButton();
        jTB41 = new javax.swing.JToggleButton();
        jTB42 = new javax.swing.JToggleButton();
        jTB43 = new javax.swing.JToggleButton();
        jTB44 = new javax.swing.JToggleButton();
        jTB45 = new javax.swing.JToggleButton();
        jTB46 = new javax.swing.JToggleButton();
        jTB36 = new javax.swing.JToggleButton();
        jTB26 = new javax.swing.JToggleButton();
        jTB16 = new javax.swing.JToggleButton();
        jTB6 = new javax.swing.JToggleButton();
        jTB7 = new javax.swing.JToggleButton();
        jTB17 = new javax.swing.JToggleButton();
        jTB27 = new javax.swing.JToggleButton();
        jTB37 = new javax.swing.JToggleButton();
        jTB47 = new javax.swing.JToggleButton();
        jTB48 = new javax.swing.JToggleButton();
        jTB38 = new javax.swing.JToggleButton();
        jTB28 = new javax.swing.JToggleButton();
        jTB18 = new javax.swing.JToggleButton();
        jTB8 = new javax.swing.JToggleButton();
        jTB9 = new javax.swing.JToggleButton();
        jTB19 = new javax.swing.JToggleButton();
        jTB29 = new javax.swing.JToggleButton();
        jTB39 = new javax.swing.JToggleButton();
        jTB49 = new javax.swing.JToggleButton();
        jTB50 = new javax.swing.JToggleButton();
        jTB40 = new javax.swing.JToggleButton();
        jTB30 = new javax.swing.JToggleButton();
        jTB10 = new javax.swing.JToggleButton();
        jTB20 = new javax.swing.JToggleButton();
        jBVerificarAcertos = new javax.swing.JButton();
        jBJogar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo dos Números");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Jogo dos números");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marque entre 6 e 10 números", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jTB1.setText("01");
        jTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB4.setText("04");
        jTB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB2.setText("02");
        jTB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB5.setText("05");
        jTB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB3.setText("03");
        jTB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB11.setText("11");
        jTB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB12.setText("12");
        jTB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB13.setText("13");
        jTB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB14.setText("14");
        jTB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB15.setText("15");
        jTB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB21.setText("21");
        jTB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB22.setText("22");
        jTB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB23.setText("23");
        jTB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB24.setText("24");
        jTB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB25.setText("25");
        jTB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB31.setText("31");
        jTB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB32.setText("32");
        jTB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB33.setText("33");
        jTB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB34.setText("34");
        jTB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB35.setText("35");
        jTB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB41.setText("41");
        jTB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB42.setText("42");
        jTB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB43.setText("43");
        jTB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB44.setText("44");
        jTB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB45.setText("45");
        jTB45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB46.setText("46");
        jTB46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB36.setText("36");
        jTB36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB26.setText("26");
        jTB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB16.setText("16");
        jTB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB6.setText("06");
        jTB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB7.setText("07");
        jTB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB17.setText("17");
        jTB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB27.setText("27");
        jTB27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB37.setText("37");
        jTB37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB47.setText("47");
        jTB47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB48.setText("48");
        jTB48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB38.setText("38");
        jTB38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB28.setText("28");
        jTB28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB18.setText("18");
        jTB18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB8.setText("08");
        jTB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB9.setText("09");
        jTB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB19.setText("19");
        jTB19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB29.setText("29");
        jTB29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB39.setText("39");
        jTB39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB49.setText("49");
        jTB49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB50.setText("50");
        jTB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB40.setText("40");
        jTB40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB30.setText("30");
        jTB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB10.setText("10");
        jTB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        jTB20.setText("20");
        jTB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEstado(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB1)
                        .addGap(4, 4, 4)
                        .addComponent(jTB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB11)
                        .addGap(4, 4, 4)
                        .addComponent(jTB12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB21)
                        .addGap(4, 4, 4)
                        .addComponent(jTB22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB31)
                        .addGap(4, 4, 4)
                        .addComponent(jTB32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB41)
                        .addGap(4, 4, 4)
                        .addComponent(jTB42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTB36)
                        .addGap(4, 4, 4)
                        .addComponent(jTB37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTB6)
                                .addGap(4, 4, 4)
                                .addComponent(jTB7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTB16)
                                .addGap(4, 4, 4)
                                .addComponent(jTB17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTB26)
                                .addGap(4, 4, 4)
                                .addComponent(jTB27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTB46)
                                .addGap(4, 4, 4)
                                .addComponent(jTB47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB50)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB42, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB44, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTB46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB47, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB50, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB49, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTB48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBVerificarAcertos.setText("Verificar");
        jBVerificarAcertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarAcertosActionPerformed(evt);
            }
        });

        jBJogar.setText("Jogar Novamente");
        jBJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarActionPerformed(evt);
            }
        });

        jTAResultado.setEditable(false);
        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jScrollPane1.setViewportView(jTAResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVerificarAcertos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBJogar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBJogar, jBVerificarAcertos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVerificarAcertos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBJogar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarActionPerformed
        java.awt.Component[] componentes = jPanel1.getComponents();
        setEstado(0);
        qtde = 0;
        jTAResultado.setText(null);
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof javax.swing.JToggleButton) {
                javax.swing.JToggleButton combo = (javax.swing.JToggleButton) componentes[i];
                combo.setSelected(false);
                combo.setBackground(new Color(187, 187, 187));
            }
        }
    }//GEN-LAST:event_jBJogarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setEstado(0);
    }//GEN-LAST:event_formWindowOpened


    private void defineEstado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineEstado
        if (qtde < 9) {
            qtde++;
        } else {
            JOptionPane.showMessageDialog(this, "Número máximo atingido", "Aviso", 0);
            setEstado(3);
        }
        if (qtde >= 6) {
            setEstado(1);
        } else {
            setEstado(0);

        }

    }//GEN-LAST:event_defineEstado

    private void jBVerificarAcertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarAcertosActionPerformed
        java.awt.Component[] componentes = jPanel1.getComponents();
        setEstado(2);
        sorteio = new CartaoSorteio();
        aposta = new CartaoAposta(qtde);
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof javax.swing.JToggleButton) {
                javax.swing.JToggleButton combo = (javax.swing.JToggleButton) componentes[i];
                if (combo.isSelected()) {
                    aposta.addNumeros(Integer.parseInt(combo.getActionCommand()));
                }
                if (sorteio.existe(Integer.parseInt(combo.getActionCommand()))) {
                    if (aposta.existe(Integer.parseInt(combo.getActionCommand()))) {
                        combo.setBackground(Color.blue);
                    }
                }
            }

        }
        jTAResultado.setText("Aposta nº " + aposta.getNumeroAposta() + "\nNúmeros sorteados:\n" + sorteio.numerosCartao() + "\nValor da aposta: R$" + aposta.calculaAposta() + "\nTotal de acertos: " + aposta.acertos(sorteio).getTotNumeros());

    }//GEN-LAST:event_jBVerificarAcertosActionPerformed

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        java.awt.Component[] componentes = jPanel1.getComponents();
        this.estado = estado;
        switch (estado) {
            case CRIACAO:
                jBVerificarAcertos.setEnabled(false);
                jBJogar.setEnabled(false);
                for (int i = 0; i < componentes.length; i++) {
                    if (componentes[i] instanceof javax.swing.JToggleButton) {
                        javax.swing.JToggleButton combo = (javax.swing.JToggleButton) componentes[i];
                        combo.setEnabled(true);
                    }
                }
                break;
            case INICIALIZACAO:
                jBVerificarAcertos.setEnabled(true);
                jBJogar.setEnabled(false);
                break;
            case FINALIZAÇAO:
                jBVerificarAcertos.setEnabled(false);
                jBJogar.setEnabled(true);
                break;
            case BLOQUEIO:
                jBVerificarAcertos.setEnabled(true);
                jBJogar.setEnabled(false);
                for (int i = 0; i < componentes.length; i++) {
                    if (componentes[i] instanceof javax.swing.JToggleButton) {
                        javax.swing.JToggleButton combo = (javax.swing.JToggleButton) componentes[i];
                        if (!combo.isSelected()) {
                            combo.setEnabled(false);
                        }
                    }
                }
                break;
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBJogar;
    private javax.swing.JButton jBVerificarAcertos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JToggleButton jTB1;
    private javax.swing.JToggleButton jTB10;
    private javax.swing.JToggleButton jTB11;
    private javax.swing.JToggleButton jTB12;
    private javax.swing.JToggleButton jTB13;
    private javax.swing.JToggleButton jTB14;
    private javax.swing.JToggleButton jTB15;
    private javax.swing.JToggleButton jTB16;
    private javax.swing.JToggleButton jTB17;
    private javax.swing.JToggleButton jTB18;
    private javax.swing.JToggleButton jTB19;
    private javax.swing.JToggleButton jTB2;
    private javax.swing.JToggleButton jTB20;
    private javax.swing.JToggleButton jTB21;
    private javax.swing.JToggleButton jTB22;
    private javax.swing.JToggleButton jTB23;
    private javax.swing.JToggleButton jTB24;
    private javax.swing.JToggleButton jTB25;
    private javax.swing.JToggleButton jTB26;
    private javax.swing.JToggleButton jTB27;
    private javax.swing.JToggleButton jTB28;
    private javax.swing.JToggleButton jTB29;
    private javax.swing.JToggleButton jTB3;
    private javax.swing.JToggleButton jTB30;
    private javax.swing.JToggleButton jTB31;
    private javax.swing.JToggleButton jTB32;
    private javax.swing.JToggleButton jTB33;
    private javax.swing.JToggleButton jTB34;
    private javax.swing.JToggleButton jTB35;
    private javax.swing.JToggleButton jTB36;
    private javax.swing.JToggleButton jTB37;
    private javax.swing.JToggleButton jTB38;
    private javax.swing.JToggleButton jTB39;
    private javax.swing.JToggleButton jTB4;
    private javax.swing.JToggleButton jTB40;
    private javax.swing.JToggleButton jTB41;
    private javax.swing.JToggleButton jTB42;
    private javax.swing.JToggleButton jTB43;
    private javax.swing.JToggleButton jTB44;
    private javax.swing.JToggleButton jTB45;
    private javax.swing.JToggleButton jTB46;
    private javax.swing.JToggleButton jTB47;
    private javax.swing.JToggleButton jTB48;
    private javax.swing.JToggleButton jTB49;
    private javax.swing.JToggleButton jTB5;
    private javax.swing.JToggleButton jTB50;
    private javax.swing.JToggleButton jTB6;
    private javax.swing.JToggleButton jTB7;
    private javax.swing.JToggleButton jTB8;
    private javax.swing.JToggleButton jTB9;
    // End of variables declaration//GEN-END:variables
}
