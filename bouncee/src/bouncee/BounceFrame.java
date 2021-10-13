/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bouncee;
import static bouncee.BounceFrame.DELAY;
import static bouncee.BounceFrame.STEPS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author guidi
 */
public class BounceFrame extends JFrame{
    
    private BallComponent comp;
    public static final int STEPS = 2000;
    public static final int DELAY = 2;

    /**
     * Construtor
     */
    public BounceFrame() {
        setTitle("Bounce"); //define o título da janela (frame)

        comp = new BallComponent(); //instancia o componente onde as bolas ficarão quicando
        add(comp, BorderLayout.CENTER); //adiciona o componente no centro do layout da janela

        JPanel buttonPanel = new JPanel(); //cria um componente que irá armazenar os botões

        //adicionando botões no componente buttonPanel
        addButton(buttonPanel, "Começar", new ActionListener() {
            public void actionPerformed(ActionEvent event) {
             /*  Thread t = new Thread(new BallTask(comp));
                t.start();
                **/
                Thread t = new Thread(new Runnable(){

                    @Override
                    public void run() {
                    addBall();    
                    }
                    
                });
                t.start();
            }
        });
        addButton(buttonPanel, "Fechar", new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        add(buttonPanel, BorderLayout.SOUTH); //coloca o componente com botões na parte de baixo da tela
        pack();
    }

    /**
     * Adiciona um botao ao conteiner
     *
     * @param c o conteiner
     * @param title o titulo do botao
     * @param listener o action listener do botao
     */
    public void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    /**
     * Adiciona uma bola ao painel e a faz pular 1000 vezes
     */
    public void addBall() {

        try {
            Ball ball = new Ball();
            comp.add(ball);

            for (int i = 1; i <= STEPS; i++) {
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
        }

    }
    
}
class BallTask implements Runnable{
    private BallComponent comp;
    public static final int STEPS = 3000;
    public static final int DELAY = 1;
     public BallTask(BallComponent comp){
    this.comp = comp;
    }
    
    private void addBall() {
        try {
            Ball ball = new Ball();
            comp.add(ball);

            for (int i = 1; i <= STEPS; i++) {
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
        }

    }
    


    @Override
    public void run() {
        addBall();
        }
    
}
