package gui;

import bl.Storage;
import javax.swing.JOptionPane;

public class StorageDialog extends javax.swing.JDialog {

    private Storage storage;
    private boolean ok;
            
    public StorageDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfplace = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jPanel1.add(tfid);

        jLabel2.setText("Description");
        jPanel1.add(jLabel2);
        jPanel1.add(tfdescription);

        jLabel3.setText("Place");
        jPanel1.add(jLabel3);
        jPanel1.add(tfplace);

        btok.setText("OK");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });
        jPanel1.add(btok);

        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        jPanel1.add(btcancel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        ok = true;
        try{
            storage = new Storage(Integer.parseInt(tfid.getText()),tfdescription.getText(),Integer.parseInt(tfplace.getText()));
            dispose();
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Fehlerhafte Eingabe!");
        }
        
    }//GEN-LAST:event_btokActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        ok = false;
        dispose();
    }//GEN-LAST:event_btcancelActionPerformed

    public Storage getStorage() {
        return storage;
    }

    public boolean isOk() {
        return ok;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField tfdescription;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfplace;
    // End of variables declaration//GEN-END:variables
}
