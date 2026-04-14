import java.awt.Toolkit;
import java.awt.Dimension;
public class Main {
    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Largura:  " + screenSize.width + "  px ");
        System.out.println("Altura:   " + screenSize.height + "  px");




        }
    }
