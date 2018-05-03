package vue;

import metier.ListeMateriel;

public class FrmMain extends java.awt.Frame {
    ListeMateriel listMateriel;
    
    public FrmMain() {
        initComponents();
        listMateriel = new ListeMateriel(new obsLstMateriel(lstMateriel));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFiltre = new java.awt.Label();
        tfFiltre = new java.awt.TextField();
        lstMateriel = new java.awt.List();
        lblNb = new java.awt.Label();
        tfNb = new java.awt.TextField();
        lblMtTot = new java.awt.Label();
        tfMtTot = new java.awt.TextField();
        btnSolder = new java.awt.Button();

        setTitle("Matériel de ski à solder");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblFiltre.setText("Filtre (nom ou prix max)");

        tfFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltreActionPerformed(evt);
            }
        });
        tfFiltre.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tfFiltreTextValueChanged(evt);
            }
        });

        lstMateriel.setMultipleMode(true);
        lstMateriel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstMaterielItemStateChanged(evt);
            }
        });

        lblNb.setText("Nombre d'articles sélectionnés");

        tfNb.setEditable(false);

        lblMtTot.setText("Montant total");

        tfMtTot.setEditable(false);

        btnSolder.setEnabled(false);
        btnSolder.setLabel("Solder");
        btnSolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lstMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(lblFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfMtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnSolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void tfFiltreTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_tfFiltreTextValueChanged
        String recherche = tfFiltre.getText();
        listMateriel.MettreAJourListe(recherche);//mise à jour de la liste
    }//GEN-LAST:event_tfFiltreTextValueChanged

    private void lstMaterielItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstMaterielItemStateChanged
        int[] selectedIndexes = lstMateriel.getSelectedIndexes();
        String[] infoMaterielSelectionnes = listMateriel.getInfoMateriel(selectedIndexes);
        tfMtTot.setText(infoMaterielSelectionnes[0]);
        tfNb.setText(infoMaterielSelectionnes[1]);
        if(selectedIndexes.length>0){btnSolder.setEnabled(true);}else{btnSolder.setEnabled(false);}
    }//GEN-LAST:event_lstMaterielItemStateChanged

    private void btnSolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolderActionPerformed
        int[] selectedIndexes = lstMateriel.getSelectedIndexes();
        FrmSolder.getInstance(selectedIndexes, listMateriel, lstMateriel).setVisible(true);
        btnSolder.setEnabled(false);
        for(int i = 0;i<selectedIndexes.length;i++){
            lstMateriel.select(selectedIndexes[i]);
        }  
    }//GEN-LAST:event_btnSolderActionPerformed

    private void tfFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnSolder;
    private java.awt.Label lblFiltre;
    private java.awt.Label lblMtTot;
    private java.awt.Label lblNb;
    private java.awt.List lstMateriel;
    private java.awt.TextField tfFiltre;
    private java.awt.TextField tfMtTot;
    private java.awt.TextField tfNb;
    // End of variables declaration//GEN-END:variables
}