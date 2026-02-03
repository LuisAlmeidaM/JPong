package principal;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class PanelJuego extends JPanel{

    private int anchoPanel;
    private int altoPanel;
    
    public PanelJuego(int anchoPanel, int altoPanel){
        this.anchoPanel = anchoPanel;
        this.altoPanel = altoPanel;
        this.setPreferredSize(new Dimension(anchoPanel, altoPanel));

        this.setBackground(Color.BLACK);
        this.setFocusable(true);
    }
}
