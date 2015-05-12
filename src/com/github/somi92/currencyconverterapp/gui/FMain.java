/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.currencyconverterapp.gui;

import com.github.somi92.currencyconverterapp.service.ServiceClient;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author milos
 */
public class FMain extends javax.swing.JFrame {

    /**
     * Creates new form FMain
     */
    public FMain() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jtxtAmount = new javax.swing.JTextField();
        jcmbCurrency1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcmbCurrency2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblCurrency1 = new javax.swing.JLabel();
        jlblCurrency2 = new javax.swing.JLabel();
        jbtnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konvertor valuta");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Iznos:");

        jcmbCurrency1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AED Arab Emirates Dirham", "AUD Australian Dollar", "BAM Bosnia-Herzegovina Convertible Mark", "CAD Canadian Dollar", "CHF Swiss Franc", "DKK Danish Krone", "EUR Euro", "GBP British Pound Sterling", "JPY Japanese Yen", "NOK Norwegian Krone", "RSD Serbian Dinar", "RUB Russian Ruble", "SEK Swedish Krona", "TRY Turkish Lira", "USD United States Dollar" }));
        jcmbCurrency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrency1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("->");

        jLabel3.setText("Valuta 1:");

        jcmbCurrency2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AED Arab Emirates Dirham", "AUD Australian Dollar", "BAM Bosnia-Herzegovina Convertible Mark", "CAD Canadian Dollar", "CHF Swiss Franc", "DKK Danish Krone", "EUR Euro", "GBP British Pound Sterling", "JPY Japanese Yen", "NOK Norwegian Krone", "RSD Serbian Dinar", "RUB Russian Ruble", "SEK Swedish Krona", "TRY Turkish Lira", "USD United States Dollar" }));
        jcmbCurrency2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrency2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Valuta 2:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("=");

        jlblCurrency1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        jlblCurrency2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jlblCurrency2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jcmbCurrency1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblCurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcmbCurrency2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jlblCurrency2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcmbCurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jcmbCurrency2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jlblCurrency1)
                        .addComponent(jlblCurrency2))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        jbtnConvert.setText("Konvertuj");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbCurrency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrency1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrency1ActionPerformed

    private void jcmbCurrency2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrency2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrency2ActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
 
        try {
            ServiceClient service = new ServiceClient();
            double amount = Double.parseDouble(jtxtAmount.getText().trim());
            String currency1 = jcmbCurrency1.getSelectedItem().toString();
            String currency2 = jcmbCurrency2.getSelectedItem().toString();
            String sourceCurrency = currency1.substring(0, currency1.indexOf(" "));
            String targetCurrency = currency2.substring(0, currency2.indexOf(" "));

            if(sourceCurrency.equals(targetCurrency)) {
                JOptionPane.showMessageDialog(this, "Izabrali ste iste valute. Pokusajte ponovo.");
                return;
            }

            double rate = service.getExchangeRate(sourceCurrency, targetCurrency);
            double result = rate * amount;

            DecimalFormat df = new DecimalFormat("#.000");

            jlblCurrency1.setText(df.format(amount)+" "+sourceCurrency);
            jlblCurrency2.setText(df.format(result)+" "+targetCurrency);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Greska! Nepravilno unet iznos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Greska: "+e.getMessage());
        }
    }//GEN-LAST:event_jbtnConvertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JComboBox jcmbCurrency1;
    private javax.swing.JComboBox jcmbCurrency2;
    private javax.swing.JLabel jlblCurrency1;
    private javax.swing.JLabel jlblCurrency2;
    private javax.swing.JTextField jtxtAmount;
    // End of variables declaration//GEN-END:variables
}
