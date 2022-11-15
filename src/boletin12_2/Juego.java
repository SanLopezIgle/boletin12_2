/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_2;

import javax.swing.JOptionPane;

public class Juego {
    
    //int numero = (int)(Math.random()*10+1);
    
        public void jugar(){
        
        int a = (int)(Math.random()*50+1); //numero aleatorio entre 1 y 50
        
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de intentos: "));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero: "));
        
        for(int i=1;i<=intentos;i++){
            if(b == a){
                JOptionPane.showConfirmDialog(null, "Acertaste");
                break;
            }
            else if (i == intentos) JOptionPane.showMessageDialog(null, "Fallaste, agotaste los intentos");
            else if ((50-b) > 20) b = Integer.parseInt(JOptionPane.showInputDialog("Muy lejos, dame otro"));
            else if ((50-b) < 20 && (50-b) > 10) b = Integer.parseInt(JOptionPane.showInputDialog("Lejos, dame otro"));
            else if((50-b) > 10 && (50-b)< 5) b = Integer.parseInt(JOptionPane.showInputDialog("Cerca, dame otro"));
            else if((50-b) <= 5) b = Integer.parseInt(JOptionPane.showInputDialog("Muy cerca, dame otro"));
        }
    }
}
