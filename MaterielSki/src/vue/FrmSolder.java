package vue;
import java.awt.List;

import metier.ListeMateriel;

public class FrmSolder extends java.awt.Frame {

    private static FrmSolder frmSolder = null;
        int[] selectedIndexes;
        ListeMateriel listMateriel;
    
    private FrmSolder(int[] selectedIndexes, ListeMateriel listMateriel, List lstMateriel) {
        initComponents(); 
        this.selectedIndexes = selectedIndexes;
        this.listMateriel = listMateriel;
        lblNb.setText(Integer.toString(selectedIndexes.length));
        listMateriel.addObserver(new obsSelectedMateriel(lstMateriel,lblNb));
    }
    
    
    public static FrmSolder getInstance(int[] selectedIndexes, ListeMateriel listMateriel, List lstMateriel) {
        if (frmSolder == null) { 
            frmSolder = new FrmSolder(selectedIndexes, listMateriel, lstMateriel);
        }
        return frmSolder;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        lblNb = new java.awt.Label();
        tfRabais = new java.awt.TextField();
        btnAppliquer = new java.awt.Button();

        setTitle("Définition du rabais à appliquer");
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setText("Rabais à appliquer sur ces");

        label2.setText("articles sélectionnés");

        lblNb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNb.setMinimumSize(new java.awt.Dimension(4, 18));

        tfRabais.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tfRabaisTextValueChanged(evt);
            }
        });

        btnAppliquer.setEnabled(false);
        btnAppliquer.setLabel("Appliquer");
        btnAppliquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppliquerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfRabais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNb, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAppliquer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRabais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppliquer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAppliquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppliquerActionPerformed
        int rabais = Integer.parseInt(tfRabais.getText());
        listMateriel.MettreAJourRabais(selectedIndexes, rabais);
    }//GEN-LAST:event_btnAppliquerActionPerformed

    private void tfRabaisTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_tfRabaisTextValueChanged
        if( outils.Validation.isIntValid(tfRabais.getText()) && selectedIndexes.length > 0){
            btnAppliquer.setEnabled(true);
        }else{
            btnAppliquer.setEnabled(false);
        }    
    }//GEN-LAST:event_tfRabaisTextValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAppliquer;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label lblNb;
    private java.awt.TextField tfRabais;
    // End of variables declaration//GEN-END:variables
}