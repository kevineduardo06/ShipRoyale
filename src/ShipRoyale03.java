
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erickgamer
 */
public class ShipRoyale03 extends javax.swing.JFrame {

    /**
     * Creates new form ShipRoyale03
     */
    public ShipRoyale03() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_ship = new javax.swing.JLabel();
        label_royale = new javax.swing.JLabel();
        button_sair = new javax.swing.JButton();
        button_intrucoes = new javax.swing.JButton();
        button_jogar = new javax.swing.JButton();
        label_palnodefundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1267, 947));
        setResizable(false);
        setSize(new java.awt.Dimension(1267, 947));
        getContentPane().setLayout(null);

        label_ship.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 96)); // NOI18N
        label_ship.setText("SHIP");
        getContentPane().add(label_ship);
        label_ship.setBounds(210, 10, 220, 180);

        label_royale.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 120)); // NOI18N
        label_royale.setText("ROYALE");
        getContentPane().add(label_royale);
        label_royale.setBounds(420, 30, 470, 130);

        button_sair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_sair.setText("Sair");
        button_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sairActionPerformed(evt);
            }
        });
        getContentPane().add(button_sair);
        button_sair.setBounds(140, 500, 120, 25);

        button_intrucoes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_intrucoes.setText("Instruções");
        button_intrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_intrucoesActionPerformed(evt);
            }
        });
        getContentPane().add(button_intrucoes);
        button_intrucoes.setBounds(140, 350, 120, 25);

        button_jogar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        button_jogar.setText("Jogar");
        button_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_jogarActionPerformed(evt);
            }
        });
        getContentPane().add(button_jogar);
        button_jogar.setBounds(140, 300, 120, 25);

        label_palnodefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primeiratela.jpg"))); // NOI18N
        getContentPane().add(label_palnodefundo);
        label_palnodefundo.setBounds(-390, -310, 1860, 1220);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1350, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents
            //funcao do botao jogar:
    private void button_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_jogarActionPerformed
        
        new Telacadastro().setVisible(true);
this.dispose();
    }//GEN-LAST:event_button_jogarActionPerformed

    //funcao do botao sair:
    private void button_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sairActionPerformed
        String aux;
        //aux = JOptionPane.showConfirmDialog(null, "Encerrar",, JOptionPane.QUESTION_MESSAGE); 
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair do jogo??", "Exit", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);// Seu código caso SIM
        }

    }//GEN-LAST:event_button_sairActionPerformed
    //funcao do botao instrucoes
    private void button_intrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_intrucoesActionPerformed
        
        new Telainstrucoes().setVisible(true);
this.dispose();

    }//GEN-LAST:event_button_intrucoesActionPerformed

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
            java.util.logging.Logger.getLogger(ShipRoyale03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipRoyale03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipRoyale03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipRoyale03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipRoyale03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_intrucoes;
    private javax.swing.JButton button_jogar;
    private javax.swing.JButton button_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_palnodefundo;
    private javax.swing.JLabel label_royale;
    private javax.swing.JLabel label_ship;
    // End of variables declaration//GEN-END:variables
}
