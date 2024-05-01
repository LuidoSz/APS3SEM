package metodos;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Resolucao {


    public Resolucao() {
        Dimension Resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        double width = Resolucao.getWidth();
        double height = Resolucao.getHeight();
    
    }
    
    
}
