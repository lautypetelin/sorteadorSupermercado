package com.lautaropetelin.sorteador.igu;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private String mes, min, max;
    private int contSorteo = 1,
            cantGanadores,
            minimo, maximo;
    private Random numRandom;

    public Principal() {
        initComponents();
        numRandom = new Random();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCantGanadores = new javax.swing.JTextField();
        btnSortear = new javax.swing.JButton();
        btnSortear1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGanadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/sorteador/imagenes/carrito128x128.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Sorteador Supermercado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Datos del sorteo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mes del sorteo:");

        cmbMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad de ganadores:");

        txtCantGanadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantGanadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSortear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSortear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/sorteador/imagenes/bolillero64x64.png"))); // NOI18N
        btnSortear.setText("Sortear");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        btnSortear1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSortear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lautaropetelin/sorteador/imagenes/escoba64x64.png"))); // NOI18N
        btnSortear1.setText("Cerrar sorteo");
        btnSortear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantGanadores))
                            .addComponent(btnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSortear1))
                        .addGap(84, 84, 84))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMes))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnSortear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Ganadores");

        tblGanadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGanadores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(232, 232, 232))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed

        //Validaciones
        if (validar()) {

            // Rango de valores
            mes = (String) cmbMes.getSelectedItem();
            min = "01";

            if (mes.equals("02")) {
                max = "28";
            } else if (mes.equals("11") || mes.equals("06") || mes.equals("04") || mes.equals("09")) {
                max = "30";
            } else {
                max = "31";
            }

            // Sortear random
            minimo = Integer.parseInt(min);
            maximo = Integer.parseInt(max);
            String numeroSorteado = sortear(numRandom);

            // Controlar que no haya salido antes el número
            while (buscarRepetido(numeroSorteado)) {
                numeroSorteado = sortear(numRandom);
            }

            // Agregar el ganador a la tabla
            agregarValorATabla(contSorteo, numeroSorteado);

        } else {
            return;
        }
    }//GEN-LAST:event_btnSortearActionPerformed

    private void btnSortear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortear1ActionPerformed

        if (JOptionPane.showConfirmDialog(this, "¿Desea realmente finalizar el sorteo?", "Finalización de sorteo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION /* == 1*/) {

            cmbMes.setSelectedIndex(0);
            txtCantGanadores.setEnabled(true);
            txtCantGanadores.setText(null);

            // Modificar el modelo para que tenga 0.
            DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
            modelo.setRowCount(0);

            contSorteo = 1;

            JOptionPane.showMessageDialog(this, "Ahora puede realizar un nuevo sorteo.", "Reseteo completo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSortear1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortear;
    private javax.swing.JButton btnSortear1;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGanadores;
    private javax.swing.JTextField txtCantGanadores;
    // End of variables declaration//GEN-END:variables

    private String agregarCeros(int dia, String mes, int ticket) {

        String numeroSorteado;

        // Agregar ceros al dia
        int largoRandomDia = (Integer.toString(dia)).length();

        numeroSorteado = ((largoRandomDia < 2) ? "0" + dia : dia) + mes;

        // Agregar ceros al ticket
        int largoTicket = (Integer.toString(ticket)).length();

        if (largoTicket == 3) {
            numeroSorteado = numeroSorteado + "0" + ticket;
        } else if (largoTicket == 2) {
            numeroSorteado = numeroSorteado + "00" + ticket;
        } else if (largoTicket == 1) {
            numeroSorteado = numeroSorteado + "000" + ticket;
        } else {
            numeroSorteado = numeroSorteado + ticket;
        }

        return numeroSorteado;
    }

    private boolean validar() {

        if (txtCantGanadores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo \"Cantidad de ganadores\" no puede quedar vacío.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            cantGanadores = Integer.parseInt(txtCantGanadores.getText());
            txtCantGanadores.setEnabled(false);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor númerico en el campo \"Cantidad de ganadores\"", "Dato inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (contSorteo > cantGanadores) {
            JOptionPane.showMessageDialog(this, "Ya se han sorteado todos los premios.");
            return false;
        }

        if (contSorteo > cantGanadores) {
            JOptionPane.showMessageDialog(this, "Ya se alcanzó la cantidad de ganadores.", "Límite alcanzado", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;
    }

    private String sortear(Random random) {
        int randomDia = random.nextInt(maximo - minimo) + minimo,
                randomTicket = random.nextInt(9999 - 0001) + 0001;

        return agregarCeros(randomDia, mes, randomTicket);
    }

    private boolean buscarRepetido(String numeroSorteado) {

        DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();

        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            String numeroSorteadoTabla = (String) modelo.getValueAt(i, 1);

            if (numeroSorteadoTabla.equals(numeroSorteado)) {
                return true;
            }
        }

        return false;
    }

    private void agregarValorATabla(int contSorteo, String numeroSorteado) {

        DefaultTableModel modelo = (DefaultTableModel) tblGanadores.getModel();
        Object row[] = {contSorteo, numeroSorteado};
        modelo.addRow(row);
        this.contSorteo++;
    }
}
