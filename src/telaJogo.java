
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class telaJogo extends javax.swing.JFrame {

    /**
     * Creates new form telaJogo
     */
    botoes[][] botoes = new botoes[10][10];
    JPanel moldura = new JPanel();

    public telaJogo() {

       

    }

    public telaJogo(String jogador1, String jogador2) {
        configuraPainel();
        geraBotoes();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        nomejogador1.setText(jogador1.toString());
        jLabel11.setText(jogador2.toString());

    }

    public void configuraPainel() {
        moldura.setLayout(new GridLayout(10, 10));
        moldura.setSize(600, 600);
        moldura.setLocation(650, 70);
        moldura.setVisible(true);
        this.add(moldura);

    }

    public void geraBotoes() {
        String m[][] = new String[10][10];
        Random mapa = new Random();
        int p = mapa.nextInt(10);
        switch (p) {
            case 0:
                m[0][0] = "~";
                m[0][1] = "~";
                m[0][2] = "S";
                m[0][3] = "~";
                m[0][4] = "~";
                m[0][5] = "~";
                m[0][6] = "~";
                m[0][7] = "~";
                m[0][8] = "~";
                m[0][9] = "~";

                m[1][0] = "~";
                m[1][1] = "~";
                m[1][2] = "~";
                m[1][3] = "C";
                m[1][4] = "C";
                m[1][5] = "C";
                m[1][6] = "~";
                m[1][7] = "~";
                m[1][8] = "D";
                m[1][9] = "D";

                m[2][0] = "C";
                m[2][1] = "C";
                m[2][2] = "C";
                m[2][3] = "~";
                m[2][4] = "~";
                m[2][5] = "D";
                m[2][6] = "~";
                m[2][7] = "~";
                m[2][8] = "~";
                m[2][9] = "~";

                m[3][0] = "~";
                m[3][1] = "~";
                m[3][2] = "~";
                m[3][3] = "~";
                m[3][4] = "~";
                m[3][5] = "D";
                m[3][6] = "~";
                m[3][7] = "C";
                m[3][8] = "~";
                m[3][9] = "~";

                m[4][0] = "~";
                m[4][1] = "S";
                m[4][2] = "~";
                m[4][3] = "~";
                m[4][4] = "~";
                m[4][5] = "~";
                m[4][6] = "~";
                m[4][7] = "C";
                m[4][8] = "~";
                m[4][9] = "N";

                m[5][0] = "P";
                m[5][1] = "~";
                m[5][2] = "~";
                m[5][3] = "~";
                m[5][4] = "D";
                m[5][5] = "D";
                m[5][6] = "~";
                m[5][7] = "C";
                m[5][8] = "~";
                m[5][9] = "N";

                m[6][0] = "P";
                m[6][1] = "~";
                m[6][2] = "N";
                m[6][3] = "N";
                m[6][4] = "N";
                m[6][5] = "N";
                m[6][6] = "~";
                m[6][7] = "~";
                m[6][8] = "~";
                m[6][9] = "N";

                m[7][0] = "P";
                m[7][1] = "~";
                m[7][2] = "~";
                m[7][3] = "D";
                m[7][4] = "D";
                m[7][5] = "~";
                m[7][6] = "~";
                m[7][7] = "S";
                m[7][8] = "~";
                m[7][9] = "N";

                m[8][0] = "P";
                m[8][1] = "~";
                m[8][2] = "~";
                m[8][3] = "~";
                m[8][4] = "~";
                m[8][5] = "~";
                m[8][6] = "~";
                m[8][7] = "~";
                m[8][8] = "~";
                m[8][9] = "~";

                m[9][0] = "P";
                m[9][1] = "~";
                m[9][2] = "~";
                m[9][3] = "~";
                m[9][4] = "~";
                m[9][5] = "S";
                m[9][6] = "~";
                m[9][7] = "~";
                m[9][8] = "S";
                m[9][9] = "~";
      
                break;

            case 1:

                m[0][0] = "S";
                m[0][1] = "~";
                m[0][2] = "~";
                m[0][3] = "~";
                m[0][4] = "S";
                m[0][5] = "~";
                m[0][6] = "~";
                m[0][7] = "~";
                m[0][8] = "~";
                m[0][9] = "C";

                m[1][0] = "~";
                m[1][1] = "~";
                m[1][2] = "~";
                m[1][3] = "~";
                m[1][4] = "~";
                m[1][5] = "~";
                m[1][6] = "S";
                m[1][7] = "~";
                m[1][8] = "~";
                m[1][9] = "C";

                m[2][0] = "~";
                m[2][1] = "~";
                m[2][2] = "D";
                m[2][3] = "D";
                m[2][4] = "~";
                m[2][5] = "~";
                m[2][6] = "~";
                m[2][7] = "~";
                m[2][8] = "~";
                m[2][9] = "C";

                m[3][0] = "~";
                m[3][1] = "~";
                m[3][2] = "~";
                m[3][3] = "~";
                m[3][4] = "S";
                m[3][5] = "~";
                m[3][6] = "C";
                m[3][7] = "C";
                m[3][8] = "C";
                m[3][9] = "~";

                m[4][0] = "~";
                m[4][1] = "~";
                m[4][2] = "~";
                m[4][3] = "~";
                m[4][4] = "~";
                m[4][5] = "~";
                m[4][6] = "~";
                m[4][7] = "~";
                m[4][8] = "~";
                m[4][9] = "~";

                m[5][0] = "N";
                m[5][1] = "~";
                m[5][2] = "~";
                m[5][3] = "P";
                m[5][4] = "P";
                m[5][5] = "P";
                m[5][6] = "P";
                m[5][7] = "P";
                m[5][8] = "~";
                m[5][9] = "~";

                m[6][0] = "N";
                m[6][1] = "~";
                m[6][2] = "D";
                m[6][3] = "~";
                m[6][4] = "~";
                m[6][5] = "~";
                m[6][6] = "~";
                m[6][7] = "~";
                m[6][8] = "~";
                m[6][9] = "N";

                m[7][0] = "N";
                m[7][1] = "~";
                m[7][2] = "D";
                m[7][3] = "~";
                m[7][4] = "~";
                m[7][5] = "S";
                m[7][6] = "~";
                m[7][7] = "D";
                m[7][8] = "~";
                m[7][9] = "N";

                m[8][0] = "N";
                m[8][1] = "~";
                m[8][2] = "~";
                m[8][3] = "D";
                m[8][4] = "D";
                m[8][5] = "~";
                m[8][6] = "~";
                m[8][7] = "D";
                m[8][8] = "~";
                m[8][9] = "N";

                m[9][0] = "~";
                m[9][1] = "~";
                m[9][2] = "~";
                m[9][3] = "~";
                m[9][4] = "C";
                m[9][5] = "C";
                m[9][6] = "C";
                m[9][7] = "~";
                m[9][8] = "~";
                m[9][9] = "N";
     
                break;

            case 2:
                m[0][0] = "N";
                m[0][1] = "~";
                m[0][2] = "~";
                m[0][3] = "P";
                m[0][4] = "P";
                m[0][5] = "P";
                m[0][6] = "P";
                m[0][7] = "P";
                m[0][8] = "~";
                m[0][9] = "~";

                m[1][0] = "N";
                m[1][1] = "~";
                m[1][2] = "D";
                m[1][3] = "~";
                m[1][4] = "~";
                m[1][5] = "~";
                m[1][6] = "~";
                m[1][7] = "~";
                m[1][8] = "~";
                m[1][9] = "N";

                m[2][0] = "N";
                m[2][1] = "~";
                m[2][2] = "D";
                m[2][3] = "~";
                m[2][4] = "~";
                m[2][5] = "S";
                m[2][6] = "~";
                m[2][7] = "D";
                m[2][8] = "~";
                m[2][9] = "N";

                m[3][0] = "N";
                m[3][1] = "~";
                m[3][2] = "~";
                m[3][3] = "D";
                m[3][4] = "D";
                m[3][5] = "~";
                m[3][6] = "~";
                m[3][7] = "D";
                m[3][8] = "~";
                m[3][9] = "N";

                m[4][0] = "~";
                m[4][1] = "~";
                m[4][2] = "~";
                m[4][3] = "~";
                m[4][4] = "C";
                m[4][5] = "C";
                m[4][6] = "C";
                m[4][7] = "~";
                m[4][8] = "~";
                m[4][9] = "N";

                m[5][0] = "S";
                m[5][1] = "~";
                m[5][2] = "~";
                m[5][3] = "~";
                m[5][4] = "S";
                m[5][5] = "~";
                m[5][6] = "~";
                m[5][7] = "~";
                m[5][8] = "~";
                m[5][9] = "~";

                m[6][0] = "~";
                m[6][1] = "~";
                m[6][2] = "~";
                m[6][3] = "~";
                m[6][4] = "~";
                m[6][5] = "~";
                m[6][6] = "S";
                m[6][7] = "~";
                m[6][8] = "~";
                m[6][9] = "~";

                m[7][0] = "~";
                m[7][1] = "~";
                m[7][2] = "D";
                m[7][3] = "D";
                m[7][4] = "~";
                m[7][5] = "~";
                m[7][6] = "~";
                m[7][7] = "~";
                m[7][8] = "~";
                m[7][9] = "~";

                m[8][0] = "~";
                m[8][1] = "~";
                m[8][2] = "~";
                m[8][3] = "~";
                m[8][4] = "S";
                m[8][5] = "~";
                m[8][6] = "C";
                m[8][7] = "C";
                m[8][8] = "C";
                m[8][9] = "~";

                m[9][0] = "~";
                m[9][1] = "C";
                m[9][2] = "C";
                m[9][3] = "C";
                m[9][4] = "~";
                m[9][5] = "~";
                m[9][6] = "~";
                m[9][7] = "~";
                m[9][8] = "~";
                m[9][9] = "~";
           
                break;

            case 3:
                m[0][0] = "~";
                m[0][1] = "~";
                m[0][2] = "~";
                m[0][3] = "~";
                m[0][4] = "~";
                m[0][5] = "N";
                m[0][6] = "N";
                m[0][7] = "N";
                m[0][8] = "N";
                m[0][9] = "N";

                m[1][0] = "~";
                m[1][1] = "~";
                m[1][2] = "~";
                m[1][3] = "C";
                m[1][4] = "C";
                m[1][5] = "C";
                m[1][6] = "~";
                m[1][7] = "~";
                m[1][8] = "~";
                m[1][9] = "N";

                m[2][0] = "C";
                m[2][1] = "C";
                m[2][2] = "C";
                m[2][3] = "~";
                m[2][4] = "~";
                m[2][5] = "~";
                m[2][6] = "~";
                m[2][7] = "~";
                m[2][8] = "~";
                m[2][9] = "N";

                m[3][0] = "~";
                m[3][1] = "~";
                m[3][2] = "~";
                m[3][3] = "S";
                m[3][4] = "~";
                m[3][5] = "S";
                m[3][6] = "~";
                m[3][7] = "~";
                m[3][8] = "~";
                m[3][9] = "N";

                m[4][0] = "D";
                m[4][1] = "~";
                m[4][2] = "~";
                m[4][3] = "~";
                m[4][4] = "S";
                m[4][5] = "~";
                m[4][6] = "~";
                m[4][7] = "~";
                m[4][8] = "~";
                m[4][9] = "~";

                m[5][0] = "D";
                m[5][1] = "~";
                m[5][2] = "~";
                m[5][3] = "S";
                m[5][4] = "~";
                m[5][5] = "S";
                m[5][6] = "~";
                m[5][7] = "P";
                m[5][8] = "~";
                m[5][9] = "D";

                m[6][0] = "~";
                m[6][1] = "D";
                m[6][2] = "D";
                m[6][3] = "~";
                m[6][4] = "~";
                m[6][5] = "~";
                m[6][6] = "~";
                m[6][7] = "P";
                m[6][8] = "~";
                m[6][9] = "D";

                m[7][0] = "~";
                m[7][1] = "~";
                m[7][2] = "~";
                m[7][3] = "~";
                m[7][4] = "~";
                m[7][5] = "D";
                m[7][6] = "~";
                m[7][7] = "P";
                m[7][8] = "~";
                m[7][9] = "~";

                m[8][0] = "~";
                m[8][1] = "~";
                m[8][2] = "~";
                m[8][3] = "~";
                m[8][4] = "~";
                m[8][5] = "D";
                m[8][6] = "~";
                m[8][7] = "P";
                m[8][8] = "~";
                m[8][9] = "~";

                m[9][0] = "~";
                m[9][1] = "~";
                m[9][2] = "C";
                m[9][3] = "C";
                m[9][4] = "C";
                m[9][5] = "~";
                m[9][6] = "~";
                m[9][7] = "P";
                m[9][8] = "~";
                m[9][9] = "~";
                
                break;

              
                case 4:
        m[0][0] = "~";
        m[0][1] = "~";
        m[0][2] = "D";
        m[0][3] = "D";
        m[0][4] = "~";
        m[0][5] = "~";
        m[0][6] = "~";
        m[0][7] = "~";
        m[0][8] = "~";
        m[0][9] = "~";

        m[1][0] = "~";
        m[1][1] = "~";
        m[1][2] = "~";
        m[1][3] = "S";
        m[1][4] = "~";
        m[1][5] = "D";
        m[1][6] = "D";
        m[1][7] = "~";
        m[1][8] = "~";
        m[1][9] = "~";

        m[2][0] = "~";
        m[2][1] = "S";
        m[2][2] = "~";
        m[2][3] = "~";
        m[2][4] = "~";
        m[2][5] = "~";
        m[2][6] = "~";
        m[2][7] = "~";
        m[2][8] = "D";
        m[2][9] = "~";

        m[3][0] = "D";
        m[3][1] = "~";
        m[3][2] = "~";
        m[3][3] = "S";
        m[3][4] = "~";
        m[3][5] = "~";
        m[3][6] = "~";
        m[3][7] = "~";
        m[3][8] = "D";
        m[3][9] = "~";

        m[4][0] = "D";
        m[4][1] = "~";
        m[4][2] = "~";
        m[4][3] = "~";
        m[4][4] = "~";
        m[4][5] = "S";
        m[4][6] = "~";
        m[4][7] = "C";
        m[4][8] = "~";
        m[4][9] = "~";

        m[5][0] = "~";
        m[5][1] = "N";
        m[5][2] = "N";
        m[5][3] = "N";
        m[5][4] = "N";
        m[5][5] = "~";
        m[5][6] = "~";
        m[5][7] = "C";
        m[5][8] = "~";
        m[5][9] = "~";

        m[6][0] = "~";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "~";
        m[6][4] = "~";
        m[6][5] = "~";
        m[6][6] = "~";
        m[6][7] = "C";
        m[6][8] = "~";
        m[6][9] = "N";

        m[7][0] = "~";
        m[7][1] = "S";
        m[7][2] = "~";
        m[7][3] = "~";
        m[7][4] = "~";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "~";
        m[7][8] = "~";
        m[7][9] = "N";

        m[8][0] = "~";
        m[8][1] = "~";
        m[8][2] = "~";
        m[8][3] = "P";
        m[8][4] = "P";
        m[8][5] = "P";
        m[8][6] = "P";
        m[8][7] = "P";
        m[8][8] = "~";
        m[8][9] = "N";

        m[9][0] = "C";
        m[9][1] = "C";
        m[9][2] = "C";
        m[9][3] = "~";
        m[9][4] = "~";
        m[9][5] = "C";
        m[9][6] = "C";
        m[9][7] = "C";
        m[9][8] = "~";
        m[9][9] = "N";

break;

case 5:
        m[0][0] = "~";
        m[0][1] = "P";
        m[0][2] = "~";
        m[0][3] = "~";
        m[0][4] = "S";
        m[0][5] = "~";
        m[0][6] = "D";
        m[0][7] = "D";
        m[0][8] = "~";
        m[0][9] = "N";

        m[1][0] = "~";
        m[1][1] = "P";
        m[1][2] = "~";
        m[1][3] = "~";
        m[1][4] = "~";
        m[1][5] = "~";
        m[1][6] = "~";
        m[1][7] = "~";
        m[1][8] = "~";
        m[1][9] = "N";

        m[2][0] = "~";
        m[2][1] = "P";
        m[2][2] = "~";
        m[2][3] = "N";
        m[2][4] = "N";
        m[2][5] = "N";
        m[2][6] = "N";
        m[2][7] = "~";
        m[2][8] = "~";
        m[2][9] = "N";

        m[3][0] = "~";
        m[3][1] = "P";
        m[3][2] = "~";
        m[3][3] = "~";
        m[3][4] = "~";
        m[3][5] = "~";
        m[3][6] = "~";
        m[3][7] = "~";
        m[3][8] = "~";
        m[3][9] = "N";

        m[4][0] = "~";
        m[4][1] = "P";
        m[4][2] = "~";
        m[4][3] = "C";
        m[4][4] = "C";
        m[4][5] = "C";
        m[4][6] = "~";
        m[4][7] = "~";
        m[4][8] = "S";
        m[4][9] = "~";

        m[5][0] = "~";
        m[5][1] = "~";
        m[5][2] = "~";
        m[5][3] = "~";
        m[5][4] = "~";
        m[5][5] = "~";
        m[5][6] = "~";
        m[5][7] = "~";
        m[5][8] = "~";
        m[5][9] = "D";

        m[6][0] = "S";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "S";
        m[6][4] = "~";
        m[6][5] = "C";
        m[6][6] = "C";
        m[6][7] = "C";
        m[6][8] = "~";
        m[6][9] = "D";

        m[7][0] = "~";
        m[7][1] = "D";
        m[7][2] = "D";
        m[7][3] = "~";
        m[7][4] = "~";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "~";
        m[7][8] = "~";
        m[7][9] = "~";

        m[8][0] = "~";
        m[8][1] = "~";
        m[8][2] = "~";
        m[8][3] = "~";
        m[8][4] = "C";
        m[8][5] = "C";
        m[8][6] = "C";
        m[8][7] = "~";
        m[8][8] = "D";
        m[8][9] = "~";

        m[9][0] = "~";
        m[9][1] = "~";
        m[9][2] = "S";
        m[9][3] = "~";
        m[9][4] = "~";
        m[9][5] = "~";
        m[9][6] = "~";
        m[9][7] = "~";
        m[9][8] = "D";
        m[9][9] = "~";
break;
    
case 6:

        m[0][0] = "S";
        m[0][1] = "~";
        m[0][2] = "S";
        m[0][3] = "~";
        m[0][4] = "P";
        m[0][5] = "~";
        m[0][6] = "~";
        m[0][7] = "D";
        m[0][8] = "D";
        m[0][9] = "~";

        m[1][0] = "~";
        m[1][1] = "~";
        m[1][2] = "~";
        m[1][3] = "~";
        m[1][4] = "P";
        m[1][5] = "~";
        m[1][6] = "~";
        m[1][7] = "~";
        m[1][8] = "~";
        m[1][9] = "S";

        m[2][0] = "S";
        m[2][1] = "~";
        m[2][2] = "~";
        m[2][3] = "~";
        m[2][4] = "P";
        m[2][5] = "~";
        m[2][6] = "~";
        m[2][7] = "D";
        m[2][8] = "D";
        m[2][9] = "~";

        m[3][0] = "C";
        m[3][1] = "C";
        m[3][2] = "C";
        m[3][3] = "~";
        m[3][4] = "P";
        m[3][5] = "~";
        m[3][6] = "~";
        m[3][7] = "~";
        m[3][8] = "~";
        m[3][9] = "~";

        m[4][0] = "~";
        m[4][1] = "~";
        m[4][2] = "~";
        m[4][3] = "~";
        m[4][4] = "P";
        m[4][5] = "~";
        m[4][6] = "N";
        m[4][7] = "N";
        m[4][8] = "N";
        m[4][9] = "N";

        m[5][0] = "~";
        m[5][1] = "~";
        m[5][2] = "~";
        m[5][3] = "N";
        m[5][4] = "~";
        m[5][5] = "~";
        m[5][6] = "~";
        m[5][7] = "~";
        m[5][8] = "~";
        m[5][9] = "~";

        m[6][0] = "~";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "N";
        m[6][4] = "~";
        m[6][5] = "C";
        m[6][6] = "C";
        m[6][7] = "C";
        m[6][8] = "~";
        m[6][9] = "D";

        m[7][0] = "~";
        m[7][1] = "~";
        m[7][2] = "~";
        m[7][3] = "N";
        m[7][4] = "~";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "~";
        m[7][8] = "~";
        m[7][9] = "D";

        m[8][0] = "~";
        m[8][1] = "~";
        m[8][2] = "~";
        m[8][3] = "N";
        m[8][4] = "~";
        m[8][5] = "~";
        m[8][6] = "C";
        m[8][7] = "C";
        m[8][8] = "C";
        m[8][9] = "~";

        m[9][0] = "~";
        m[9][1] = "S";
        m[9][2] = "~";
        m[9][3] = "~";
        m[9][4] = "~";
        m[9][5] = "~";
        m[9][6] = "~";
        m[9][7] = "~";
        m[9][8] = "D";
        m[9][9] = "D";

break;

case 7:

        m[0][0] = "~";
        m[0][1] = "~";
        m[0][2] = "P";
        m[0][3] = "P";
        m[0][4] = "P";
        m[0][5] = "P";
        m[0][6] = "P";
        m[0][7] = "~";
        m[0][8] = "N";
        m[0][9] = "~";

        m[1][0] = "~";
        m[1][1] = "S";
        m[1][2] = "~";
        m[1][3] = "~";
        m[1][4] = "~";
        m[1][5] = "~";
        m[1][6] = "~";
        m[1][7] = "~";
        m[1][8] = "N";
        m[1][9] = "~";

        m[2][0] = "D";
        m[2][1] = "~";
        m[2][2] = "D";
        m[2][3] = "~";
        m[2][4] = "~";
        m[2][5] = "~";
        m[2][6] = "S";
        m[2][7] = "~";
        m[2][8] = "N";
        m[2][9] = "~";

        m[3][0] = "D";
        m[3][1] = "~";
        m[3][2] = "D";
        m[3][3] = "~";
        m[3][4] = "~";
        m[3][5] = "~";
        m[3][6] = "~";
        m[3][7] = "~";
        m[3][8] = "N";
        m[3][9] = "~";

        m[4][0] = "~";
        m[4][1] = "~";
        m[4][2] = "~";
        m[4][3] = "~";
        m[4][4] = "D";
        m[4][5] = "D";
        m[4][6] = "~";
        m[4][7] = "~";
        m[4][8] = "~";
        m[4][9] = "S";

        m[5][0] = "~";
        m[5][1] = "D";
        m[5][2] = "D";
        m[5][3] = "~";
        m[5][4] = "~";
        m[5][5] = "~";
        m[5][6] = "~";
        m[5][7] = "~";
        m[5][8] = "N";
        m[5][9] = "~";

        m[6][0] = "D";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "~";
        m[6][4] = "C";
        m[6][5] = "C";
        m[6][6] = "C";
        m[6][7] = "~";
        m[6][8] = "N";
        m[6][9] = "~";

        m[7][0] = "D";
        m[7][1] = "~";
        m[7][2] = "~";
        m[7][3] = "~";
        m[7][4] = "~";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "~";
        m[7][8] = "N";
        m[7][9] = "~";

        m[8][0] = "~";
        m[8][1] = "C";
        m[8][2] = "C";
        m[8][3] = "C";
        m[8][4] = "~";
        m[8][5] = "~";
        m[8][6] = "~";
        m[8][7] = "~";
        m[8][8] = "N";
        m[8][9] = "~";

        m[9][0] = "~";
        m[9][1] = "~";
        m[9][2] = "~";
        m[9][3] = "~";
        m[9][4] = "~";
        m[9][5] = "C";
        m[9][6] = "C";
        m[9][7] = "C";
        m[9][8] = "~";
        m[9][9] = "~";

break;

case 8:

        m[0][0] = "P";
        m[0][1] = "P";
        m[0][2] = "P";
        m[0][3] = "P";
        m[0][4] = "P";
        m[0][5] = "~";
        m[0][6] = "~";
        m[0][7] = "~";
        m[0][8] = "~";
        m[0][9] = "N";

        m[1][0] = "~";
        m[1][1] = "~";
        m[1][2] = "~";
        m[1][3] = "C";
        m[1][4] = "C";
        m[1][5] = "C";
        m[1][6] = "~";
        m[1][7] = "~";
        m[1][8] = "~";
        m[1][9] = "N";

        m[2][0] = "~";
        m[2][1] = "N";
        m[2][2] = "~";
        m[2][3] = "~";
        m[2][4] = "~";
        m[2][5] = "~";
        m[2][6] = "~";
        m[2][7] = "~";
        m[2][8] = "~";
        m[2][9] = "N";

        m[3][0] = "~";
        m[3][1] = "N";
        m[3][2] = "~";
        m[3][3] = "~";
        m[3][4] = "C";
        m[3][5] = "C";
        m[3][6] = "C";
        m[3][7] = "~";
        m[3][8] = "~";
        m[3][9] = "N";

        m[4][0] = "~";
        m[4][1] = "N";
        m[4][2] = "~";
        m[4][3] = "S";
        m[4][4] = "~";
        m[4][5] = "~";
        m[4][6] = "~";
        m[4][7] = "~";
        m[4][8] = "~";
        m[4][9] = "~";

        m[5][0] = "~";
        m[5][1] = "N";
        m[5][2] = "~";
        m[5][3] = "~";
        m[5][4] = "C";
        m[5][5] = "C";
        m[5][6] = "C";
        m[5][7] = "~";
        m[5][8] = "~";
        m[5][9] = "S";

        m[6][0] = "S";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "~";
        m[6][4] = "~";
        m[6][5] = "~";
        m[6][6] = "~";
        m[6][7] = "D";
        m[6][8] = "~";
        m[6][9] = "~";

        m[7][0] = "~";
        m[7][1] = "D";
        m[7][2] = "~";
        m[7][3] = "~";
        m[7][4] = "S";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "D";
        m[7][8] = "~";
        m[7][9] = "~";

        m[8][0] = "~";
        m[8][1] = "D";
        m[8][2] = "~";
        m[8][3] = "~";
        m[8][4] = "~";
        m[8][5] = "~";
        m[8][6] = "~";
        m[8][7] = "~";
        m[8][8] = "D";
        m[8][9] = "D";

        m[9][0] = "~";
        m[9][1] = "~";
        m[9][2] = "~";
        m[9][3] = "D";
        m[9][4] = "D";
        m[9][5] = "~";
        m[9][6] = "~";
        m[9][7] = "S";
        m[9][8] = "~";
        m[9][9] = "~";

break;

case 9:

        m[0][0] = "N";
        m[0][1] = "~";
        m[0][2] = "~";
        m[0][3] = "C";
        m[0][4] = "C";
        m[0][5] = "C";
        m[0][6] = "~";
        m[0][7] = "~";
        m[0][8] = "~";
        m[0][9] = "N";

        m[1][0] = "N";
        m[1][1] = "~";
        m[1][2] = "~";
        m[1][3] = "S";
        m[1][4] = "~";
        m[1][5] = "S";
        m[1][6] = "~";
        m[1][7] = "~";
        m[1][8] = "~";
        m[1][9] = "N";

        m[2][0] = "N";
        m[2][1] = "~";
        m[2][2] = "S";
        m[2][3] = "~";
        m[2][4] = "S";
        m[2][5] = "~";
        m[2][6] = "S";
        m[2][7] = "~";
        m[2][8] = "~";
        m[2][9] = "N";

        m[3][0] = "N";
        m[3][1] = "~";
        m[3][2] = "~";
        m[3][3] = "~";
        m[3][4] = "~";
        m[3][5] = "~";
        m[3][6] = "~";
        m[3][7] = "~";
        m[3][8] = "~";
        m[3][9] = "N";

        m[4][0] = "~";
        m[4][1] = "~";
        m[4][2] = "P";
        m[4][3] = "P";
        m[4][4] = "P";
        m[4][5] = "P";
        m[4][6] = "P";
        m[4][7] = "~";
        m[4][8] = "~";
        m[4][9] = "~";

        m[5][0] = "D";
        m[5][1] = "D";
        m[5][2] = "~";
        m[5][3] = "~";
        m[5][4] = "~";
        m[5][5] = "~";
        m[5][6] = "~";
        m[5][7] = "~";
        m[5][8] = "D";
        m[5][9] = "D";

        m[6][0] = "~";
        m[6][1] = "~";
        m[6][2] = "~";
        m[6][3] = "C";
        m[6][4] = "C";
        m[6][5] = "C";
        m[6][6] = "~";
        m[6][7] = "~";
        m[6][8] = "~";
        m[6][9] = "~";

        m[7][0] = "~";
        m[7][1] = "C";
        m[7][2] = "~";
        m[7][3] = "~";
        m[7][4] = "~";
        m[7][5] = "~";
        m[7][6] = "~";
        m[7][7] = "~";
        m[7][8] = "D";
        m[7][9] = "D";

        m[8][0] = "~";
        m[8][1] = "C";
        m[8][2] = "~";
        m[8][3] = "~";
        m[8][4] = "~";
        m[8][5] = "~";
        m[8][6] = "D";
        m[8][7] = "~";
        m[8][8] = "~";
        m[8][9] = "~";

        m[9][0] = "~";
        m[9][1] = "C";
        m[9][2] = "~";
        m[9][3] = "~";
        m[9][4] = "~";
        m[9][5] = "~";
        m[9][6] = "D";
        m[9][7] = "~";
        m[9][8] = "~";
        m[9][9] = "~";
break;
    
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                botoes[i][j] = new botoes(this);
                botoes[i][j].valor = (m[i][j]);
                moldura.add(botoes[i][j]);

            }

        }
       

    }
    //Altera os labels 
  public void alteraLabel1(String jogador1, String jogador2){
        this.jLabel17.setText(jogador1);
        this.jLabel18.setText(jogador2);
        
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeldascolunas = new javax.swing.JLabel();
        buttonfinalizar = new javax.swing.JButton();
        Paineldospontos = new javax.swing.JPanel();
        nomejogador1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pontuacaojogador1 = new javax.swing.JLabel();
        pontuacaojogador2 = new javax.swing.JLabel();
        labelrodada = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        labeldascolunas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labeldascolunas.setForeground(new java.awt.Color(255, 255, 255));
        labeldascolunas.setText("A          B          C          D         E          F         G         H          I           J");
        getContentPane().add(labeldascolunas);
        labeldascolunas.setBounds(670, 40, 570, 22);

        buttonfinalizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonfinalizar.setText("Finalizar partida");
        buttonfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonfinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonfinalizar);
        buttonfinalizar.setBounds(280, 690, 170, 25);

        nomejogador1.setText("a");
        nomejogador1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nomejogador1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel11.setText("b");
        jLabel11.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel11AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Rodada");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Pontuação");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setText("Placar");

        pontuacaojogador1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pontuacaojogador1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pontuacaojogador2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pontuacaojogador2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelrodada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelrodada.setText("1");
        labelrodada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelrodadaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Marinheiro");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Pirata");

        javax.swing.GroupLayout PaineldospontosLayout = new javax.swing.GroupLayout(Paineldospontos);
        Paineldospontos.setLayout(PaineldospontosLayout);
        PaineldospontosLayout.setHorizontalGroup(
            PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldospontosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldospontosLayout.createSequentialGroup()
                        .addGap(0, 157, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldospontosLayout.createSequentialGroup()
                        .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PaineldospontosLayout.createSequentialGroup()
                                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addGroup(PaineldospontosLayout.createSequentialGroup()
                                        .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel15)
                                            .addComponent(nomejogador1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pontuacaojogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pontuacaojogador2))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PaineldospontosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaineldospontosLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(95, 95, 95)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelrodada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PaineldospontosLayout.setVerticalGroup(
            PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldospontosLayout.createSequentialGroup()
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldospontosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(labelrodada)))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejogador1)
                    .addComponent(pontuacaojogador1))
                .addGap(22, 22, 22)
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(22, 22, 22)
                .addGroup(PaineldospontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pontuacaojogador2))
                .addGap(32, 32, 32))
        );

        getContentPane().add(Paineldospontos);
        Paineldospontos.setBounds(50, 30, 330, 200);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 100, 34, 14);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 160, 30, 14);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 210, 10, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 270, 10, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 330, 10, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 390, 10, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 450, 10, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(600, 510, 10, 22);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 570, 10, 22);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("10");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(600, 630, 40, 14);

        voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        voltar.setText("Voltar para cadastro");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(80, 690, 180, 25);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/000002.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(-590, -250, 2000, 1350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Se voltar para o menu perderá o progresso atual. Deseja mesmo voltar??", "Exit", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            
            new Telacadastro().show();
            this.dispose();
        }
    }//GEN-LAST:event_voltarActionPerformed

    private void labelrodadaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelrodadaAncestorAdded


    }//GEN-LAST:event_labelrodadaAncestorAdded

    private void pontuacaojogador1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pontuacaojogador1AncestorAdded


    }//GEN-LAST:event_pontuacaojogador1AncestorAdded

    private void nomejogador1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nomejogador1AncestorAdded


    }//GEN-LAST:event_nomejogador1AncestorAdded

    private void buttonfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonfinalizarActionPerformed
        if((this.jLabel17.getText()==null) || (this.jLabel17.getText().trim().equals(""))){
            JOptionPane.showMessageDialog(null,"O jogo ainda não foi iniciado!" );
        } else{
            
int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar o jogo??", "Exit", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            TelaCampeao c;
                c =  new TelaCampeao(this.nomejogador1.getText() , this.jLabel11.getText() , this.jLabel17.getText(), this.jLabel18.getText());
                  c.setVisible(true);
                  
            this.dispose();
        }
        }
       
    }//GEN-LAST:event_buttonfinalizarActionPerformed

    private void pontuacaojogador2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pontuacaojogador2AncestorAdded
//       pontuacaojogador2.setText(Integer.toString(botoes.contjogador2));
    }//GEN-LAST:event_pontuacaojogador2AncestorAdded

    private void jLabel11AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel11AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11AncestorAdded

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
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaJogo().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Paineldospontos;
    private javax.swing.JButton buttonfinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labeldascolunas;
    public javax.swing.JLabel labelrodada;
    public javax.swing.JLabel nomejogador1;
    public static javax.swing.JLabel pontuacaojogador1;
    public static javax.swing.JLabel pontuacaojogador2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
