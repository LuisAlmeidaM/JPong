package principal;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class PanelJuego extends JPanel implements Runnable{

    private int anchoPanel;
    private int altoPanel;

    // Atributos del bucle principal del juego
    private Thread hiloJuego;
    private boolean ejecutandose = false;
    private final int FPS = 60;
    ////
    
    public PanelJuego(int anchoPanel, int altoPanel){
        this.anchoPanel = anchoPanel;
        this.altoPanel = altoPanel;
        this.setPreferredSize(new Dimension(this.anchoPanel, this.altoPanel));

        this.setBackground(Color.BLACK);
        this.setFocusable(true);

        IniciarHilo();
    }

    // Inicial hilo de ejecución
    private void IniciarHilo(){
        System.out.println("thread iniciado");
        hiloJuego = new Thread(this);
        ejecutandose = true;
        hiloJuego.start();
    }

    // Bucle principal del juego
    @Override
    public void run() {
        double intervaloDibujo = 1000000000 / FPS;
        double delta = 0;
        long ultimoTiempo = System.nanoTime();
        long tiempoActual;

        while (ejecutandose) {
            tiempoActual = System.nanoTime();
            delta += (tiempoActual - ultimoTiempo) / intervaloDibujo;
            ultimoTiempo = tiempoActual;

            if(delta >= 1){
                Actualizar();
                repaint();
                delta--;
            }
        }
    }

    // Metodo para actualizar Juego
    private void Actualizar(){
        System.out.println("Actualizando");
    }

    // Metodo para dibujar
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Dibujar cuadro
        g.setColor(Color.RED);
        g.fillRect(100, 100, 64, 64);
    }
}
