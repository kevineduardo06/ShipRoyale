
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class botoes extends JButton implements ActionListener {
    String valor = "";
    public static int contjogador1 = 0, contjogador2 = 0, jogadadequem = 0, contarodadas = 0 , contarodadas2 = 1  ;
    public static String maior;
    telaJogo t;
    
    
    
    public botoes (telaJogo telaJogo){
        this.addActionListener(this);
        this.t = telaJogo;
       contjogador1 = 0;
       contjogador2 = 0;
       jogadadequem = 0 ;
       contarodadas = 0;
       contarodadas2 = 1;
        
    }

    

public void verificaTurno(String valor){
        
        
        
            if(jogadadequem % 2 == 0){
                 t.jLabel16.setForeground(Color.green);
                 t.jLabel15.setForeground(Color.black);
                
                //JOptionPane.showMessageDialog(null,"Vez do Pirata!!!");
                
                    if(!"~".equals(valor)){
                        contjogador1 = contjogador1+1;
                       
                          
                    }
                    
            }        
           else{
                t.jLabel15.setForeground(Color.green);
                t.jLabel16.setForeground(Color.black);
               //JOptionPane.showMessageDialog(null,"Vez do Marinheiro!!!");
                    if(!"~".equals(valor)){
                        contjogador2 = contjogador2+1;   
                        
            }
                   
    }
                

       t.alteraLabel1(Integer.toString(contjogador1),Integer.toString(contjogador2));
       
    }    
        

    @Override
    public void actionPerformed(ActionEvent e) {
        contarodadas=contarodadas+1;
        contarodadas2 = contarodadas2 +1;
        if(contarodadas2 % 2 ==0){
            t.labelrodada.setText(String.valueOf(Integer.valueOf(contarodadas2/2)));
            
        }
            if(contarodadas2 == 101){
                
                    contarodadas=0;
                   chamaTelaCampeao();
      
            }else{
                
            }


		if(contarodadas == 20) {
			int resposta = JOptionPane.showConfirmDialog(null, "10 Rodadas completas!!! Deseja continuar batalhando: ", "Exit", JOptionPane.YES_NO_OPTION);
				if(resposta != JOptionPane.YES_OPTION){
						chamaTelaCampeao();
                                                
                                                
                                                
					}else{
                                                                                      
                                      
                                  } 
                                contarodadas = 0;
                              }

	this.setText(valor);
        this.setEnabled(false);
        verificaTurno(valor);
        
       
        
jogadadequem = jogadadequem + 1;
        

           
    }
     public void chamaTelaCampeao(){
            
         TelaCampeao c;
                c =  new TelaCampeao(t.nomejogador1.getText() , t.jLabel11.getText() , t.jLabel17.getText(), t.jLabel18.getText());
                  c.setVisible(true);
         
        }
}

