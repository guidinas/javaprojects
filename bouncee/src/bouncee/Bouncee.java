/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bouncee;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author guidi
 */
public class Bouncee {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //coloca a criação e atualização da janela na thread do Swing
			public void run() {
				JFrame frame = new BounceFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
    }
}

    

