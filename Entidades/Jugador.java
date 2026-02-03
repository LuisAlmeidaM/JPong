package Entidades;

import java.awt.Color;
import java.awt.Graphics;

public class Jugador {
    private int x;
    private int y;
    private int ancho;
    private int alto;

    public Jugador(int x, int y, int ancho, int alto){
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void Dibujar(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x, y, ancho, alto);
    }
}
