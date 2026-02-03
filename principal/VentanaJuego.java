package principal;

import javax.swing.JFrame;

public class VentanaJuego extends JFrame{

    private int anchoVentana;
    private int altoVentana;
    private String nombreVentana;
    
    public VentanaJuego(int anchoVentana, int altoVentana, String nombreVentana){
        this.anchoVentana = anchoVentana;
        this.altoVentana = altoVentana;
        this.nombreVentana = nombreVentana;

        this.setTitle(this.nombreVentana);
        this.setSize(this.anchoVentana, this.altoVentana);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void Mostrar(){
        this.setVisible(true);
    }

}
