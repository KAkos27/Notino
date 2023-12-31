/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package notino;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author KosztolányiÁkos(SZOF
 */
public class Notino extends javax.swing.JFrame {

    int parfumAlapAr, reszOsszeg, vegOsszeg, csomOsszeg = 0;
    int darabSzorzo = 1;
    double mlSzorzo= 1;
    double kuponSzorzo = 1;
    /**
     * Creates new form Notino
     */
    public Notino() {
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

        bgMl = new javax.swing.ButtonGroup();
        bgCsomagolas = new javax.swing.ButtonGroup();
        plCsom = new javax.swing.JPanel();
        rbAjandek = new javax.swing.JRadioButton();
        rbKornyezet = new javax.swing.JRadioButton();
        rbAlap = new javax.swing.JRadioButton();
        plTermek = new javax.swing.JPanel();
        lbReszOsszeg = new javax.swing.JLabel();
        srDb = new javax.swing.JSpinner();
        cbTermek = new javax.swing.JComboBox<>();
        lbForint1 = new javax.swing.JLabel();
        rb30 = new javax.swing.JRadioButton();
        rb50 = new javax.swing.JRadioButton();
        rb100 = new javax.swing.JRadioButton();
        plAjandek = new javax.swing.JPanel();
        cbAjandek = new javax.swing.JComboBox<>();
        plKupon = new javax.swing.JPanel();
        tfKupon = new javax.swing.JTextField();
        lbKupon = new javax.swing.JLabel();
        btKupon = new javax.swing.JButton();
        lbKep = new javax.swing.JLabel();
        plVegso = new javax.swing.JPanel();
        btVasarlas = new javax.swing.JButton();
        lbForint2 = new javax.swing.JLabel();
        lbVegosszeg = new javax.swing.JLabel();
        btMegse = new javax.swing.JButton();
        lbVegosszegFelirat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notino.hu");
        setBackground(new java.awt.Color(51, 204, 255));
        setType(java.awt.Window.Type.UTILITY);

        plCsom.setBorder(javax.swing.BorderFactory.createTitledBorder("Csomagolás"));

        bgCsomagolas.add(rbAjandek);
        rbAjandek.setText("Csomagolás ajándékként (+1330Ft)");
        rbAjandek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAjandek.setEnabled(false);
        rbAjandek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAjandekActionPerformed(evt);
            }
        });

        bgCsomagolas.add(rbKornyezet);
        rbKornyezet.setText("Környezetbarát csomagolás (+220Ft)");
        rbKornyezet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbKornyezet.setEnabled(false);
        rbKornyezet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKornyezetActionPerformed(evt);
            }
        });

        bgCsomagolas.add(rbAlap);
        rbAlap.setSelected(true);
        rbAlap.setText("Alap csomagolás");
        rbAlap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAlap.setEnabled(false);
        rbAlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plCsomLayout = new javax.swing.GroupLayout(plCsom);
        plCsom.setLayout(plCsomLayout);
        plCsomLayout.setHorizontalGroup(
            plCsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCsomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbKornyezet)
                    .addComponent(rbAjandek)
                    .addComponent(rbAlap, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        plCsomLayout.setVerticalGroup(
            plCsomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCsomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAjandek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbKornyezet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlap)
                .addGap(9, 9, 9))
        );

        plTermek.setBorder(javax.swing.BorderFactory.createTitledBorder("Termék:"));

        lbReszOsszeg.setText("0");

        srDb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        srDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srDb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                srDbStateChanged(evt);
            }
        });

        cbTermek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "Dior Sauvage", "Bleu de Chanel", "Calvin Klein Eternity", "Tom Ford Noir" }));
        cbTermek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTermek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTermekActionPerformed(evt);
            }
        });

        lbForint1.setText("Ft");

        bgMl.add(rb30);
        rb30.setText("30ml");
        rb30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb30.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb30ItemStateChanged(evt);
            }
        });

        bgMl.add(rb50);
        rb50.setSelected(true);
        rb50.setText("50ml");
        rb50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb50.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb50ItemStateChanged(evt);
            }
        });

        bgMl.add(rb100);
        rb100.setText("100ml");
        rb100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb100.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb100ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout plTermekLayout = new javax.swing.GroupLayout(plTermek);
        plTermek.setLayout(plTermekLayout);
        plTermekLayout.setHorizontalGroup(
            plTermekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTermekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTermekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTermekLayout.createSequentialGroup()
                        .addComponent(cbTermek, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbReszOsszeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbForint1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srDb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plTermekLayout.createSequentialGroup()
                        .addComponent(rb30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb100, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plTermekLayout.setVerticalGroup(
            plTermekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTermekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTermekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTermek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReszOsszeg)
                    .addComponent(lbForint1)
                    .addComponent(srDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plTermekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb30)
                    .addComponent(rb50)
                    .addComponent(rb100))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        plAjandek.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajándék(30.000 Ft felett)"));

        cbAjandek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz!", "Nivea arckrém 30ml", "Ysl Y 1ml teszter", "Bioderma arctisztító 30ml", "Cerave arckrém 30ml" }));
        cbAjandek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbAjandek.setEnabled(false);

        javax.swing.GroupLayout plAjandekLayout = new javax.swing.GroupLayout(plAjandek);
        plAjandek.setLayout(plAjandekLayout);
        plAjandekLayout.setHorizontalGroup(
            plAjandekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAjandekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbAjandek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plAjandekLayout.setVerticalGroup(
            plAjandekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAjandekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbAjandek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        plKupon.setBorder(javax.swing.BorderFactory.createTitledBorder("Kuponkód beválltás"));

        tfKupon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbKupon.setText("KUPON123 (- 20%)");

        btKupon.setBackground(new java.awt.Color(0, 204, 255));
        btKupon.setText("Ok!");
        btKupon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btKupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKuponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plKuponLayout = new javax.swing.GroupLayout(plKupon);
        plKupon.setLayout(plKuponLayout);
        plKuponLayout.setHorizontalGroup(
            plKuponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plKuponLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plKuponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plKuponLayout.createSequentialGroup()
                        .addComponent(tfKupon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plKuponLayout.createSequentialGroup()
                        .addComponent(lbKupon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plKuponLayout.setVerticalGroup(
            plKuponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plKuponLayout.createSequentialGroup()
                .addComponent(lbKupon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plKuponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btKupon))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lbKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/Kolni.png"))); // NOI18N

        plVegso.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btVasarlas.setBackground(new java.awt.Color(0, 204, 255));
        btVasarlas.setText("Vásárlás");
        btVasarlas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVasarlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVasarlasActionPerformed(evt);
            }
        });

        lbForint2.setText("Ft");

        lbVegosszeg.setText("0");

        btMegse.setBackground(new java.awt.Color(0, 204, 255));
        btMegse.setText("Mégse");
        btMegse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegseActionPerformed(evt);
            }
        });

        lbVegosszegFelirat.setText("Végösszeg:");

        javax.swing.GroupLayout plVegsoLayout = new javax.swing.GroupLayout(plVegso);
        plVegso.setLayout(plVegsoLayout);
        plVegsoLayout.setHorizontalGroup(
            plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plVegsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVegosszegFelirat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMegse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plVegsoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbVegosszeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbForint2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btVasarlas))
                .addGap(30, 30, 30))
        );
        plVegsoLayout.setVerticalGroup(
            plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plVegsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVegosszeg)
                    .addComponent(lbForint2)
                    .addComponent(lbVegosszegFelirat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plVegsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMegse)
                    .addComponent(btVasarlas))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(plTermek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plKupon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbKep, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plCsom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plAjandek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(plVegso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plTermek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plCsom, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plAjandek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plVegso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbKep)))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbTermekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTermekActionPerformed
        int parfumIndex = cbTermek.getSelectedIndex();
        
        if (parfumIndex == 0){
            parfumAlapAr = 0;
        }else if (parfumIndex == 1){
            parfumAlapAr = 25000;
        }else if (parfumIndex == 2){
            parfumAlapAr = 27000;
        }else if (parfumIndex == 3){
            parfumAlapAr = 22000;
        }else if (parfumIndex == 4){
            parfumAlapAr = 35000;
        }
       
        szamolas();
    }//GEN-LAST:event_cbTermekActionPerformed

   
    private void srDbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_srDbStateChanged
        darabSzorzo = (int) srDb.getValue();
        
        szamolas();
    }//GEN-LAST:event_srDbStateChanged

    private void rb30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb30ItemStateChanged
        mlSzorzo = 0.75;
        
        szamolas();        
    }//GEN-LAST:event_rb30ItemStateChanged

    private void rb50ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb50ItemStateChanged
        mlSzorzo = 1;
        
        szamolas();
    }//GEN-LAST:event_rb50ItemStateChanged

    private void rb100ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb100ItemStateChanged
        mlSzorzo = 1.25;
        
        szamolas();
    }//GEN-LAST:event_rb100ItemStateChanged

    private void btKuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKuponActionPerformed
        String kuponSzoveg = tfKupon.getText();
        
        if ("KUPON123".equals(kuponSzoveg)){
            kuponSzorzo = 0.8;
        }else{
            kuponSzorzo = 1;
        }
        
        szamolas();
    }//GEN-LAST:event_btKuponActionPerformed

    private void rbAlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlapActionPerformed
        csomOsszeg = 0;
        szamolas();
    }//GEN-LAST:event_rbAlapActionPerformed

    private void rbKornyezetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKornyezetActionPerformed
        csomOsszeg = 220;
        szamolas();
    }//GEN-LAST:event_rbKornyezetActionPerformed

    private void rbAjandekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAjandekActionPerformed
        csomOsszeg = 1330;
        szamolas();
    }//GEN-LAST:event_rbAjandekActionPerformed

    private void btVasarlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVasarlasActionPerformed
        int dbSzam = (int) srDb.getValue();
        String termek = (String) cbTermek.getSelectedItem();
        String ajandek = (String) cbAjandek.getSelectedItem();
        String nagysag = "";
        String ablakSzoveg = "";
        
        if (rb30.isSelected()){
            nagysag = "(30ml)";
        }
        if (rb50.isSelected()){
            nagysag = "(50ml)";
        }
        if (rb100.isSelected()){
            nagysag = "(100ml)";
        }
        
        if ("Válassz!".equals(ajandek)){
            ablakSzoveg = dbSzam+"db "+termek+" "+nagysag;
        }else{
            ablakSzoveg = dbSzam+"db "+termek+" "+nagysag+"\nAjándék: "+ajandek;
        }
        
        if (reszOsszeg !=0){
            JOptionPane.showMessageDialog(rootPane, "Köszönjük a vásárlást!\n"+ablakSzoveg, "Megrendelés", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Válassz terméket!", "Hiba!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btVasarlasActionPerformed

    private void btMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btMegseActionPerformed
    
    private void szamolas() {
       reszOsszeg = (int) ((parfumAlapAr) * darabSzorzo * mlSzorzo);
       lbReszOsszeg.setText( reszOsszeg + "");
       
       if (reszOsszeg >= 30000){
           cbAjandek.setEnabled(true);
       }else{
           cbAjandek.setSelectedIndex(0);
           cbAjandek.setEnabled(false);
       }
       
       if (reszOsszeg > 0){
           rbAjandek.setEnabled(true);
           rbKornyezet.setEnabled(true);
           rbAlap.setEnabled(true);
       }else{
           rbAjandek.setEnabled(false);
           rbKornyezet.setEnabled(false);
           rbAlap.setEnabled(false);
       }
       
       vegOsszeg = (int) ((reszOsszeg + csomOsszeg) * kuponSzorzo);
       lbVegosszeg.setText(vegOsszeg + "");
     
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
            java.util.logging.Logger.getLogger(Notino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCsomagolas;
    private javax.swing.ButtonGroup bgMl;
    private javax.swing.JButton btKupon;
    private javax.swing.JButton btMegse;
    private javax.swing.JButton btVasarlas;
    private javax.swing.JComboBox<String> cbAjandek;
    private javax.swing.JComboBox<String> cbTermek;
    private javax.swing.JLabel lbForint1;
    private javax.swing.JLabel lbForint2;
    private javax.swing.JLabel lbKep;
    private javax.swing.JLabel lbKupon;
    private javax.swing.JLabel lbReszOsszeg;
    private javax.swing.JLabel lbVegosszeg;
    private javax.swing.JLabel lbVegosszegFelirat;
    private javax.swing.JPanel plAjandek;
    private javax.swing.JPanel plCsom;
    private javax.swing.JPanel plKupon;
    private javax.swing.JPanel plTermek;
    private javax.swing.JPanel plVegso;
    private javax.swing.JRadioButton rb100;
    private javax.swing.JRadioButton rb30;
    private javax.swing.JRadioButton rb50;
    private javax.swing.JRadioButton rbAjandek;
    private javax.swing.JRadioButton rbAlap;
    private javax.swing.JRadioButton rbKornyezet;
    private javax.swing.JSpinner srDb;
    private javax.swing.JTextField tfKupon;
    // End of variables declaration//GEN-END:variables
}
