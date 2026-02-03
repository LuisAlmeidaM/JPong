package principal;

public class Main{
    public static void main(String[] args) {
        // Configuraciones de la ventana
        int anchoVentana = 640;
        int altoVentana = 480;
        String nombreVentana = "Juego Java";
        
        System.out.println("Hola mundo");

        VentanaJuego ventana = new VentanaJuego(anchoVentana, altoVentana, nombreVentana);
        ventana.Mostrar();

    }
}