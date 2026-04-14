//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale Pais = Locale.getDefault();
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:" + idioma.getDisplayLanguage());
        System.out.println("E seu país é:" + Pais.getDisplayCountry());
        }
    }
