public class Fatorial {
    private int num = 0;
    // Usa private pra as var ficar só nessa classe \\
    private int fat = 1;
    private String formula = "";
    public void setvalor(int n)
    {// public para ser acessado no main e void para não retornar valor \\
        num = n;
        // numero que eu vou botar dps no MAIN \\
        int f = 1;
        String s = "";
        for (int c = n; c>1; c--){
            // contador = numero digitado, enquanto cont > 1 cont -1 \\
            f*=c;
            // fatorial = fatorial * contador \\
            s += c + " x ";
            // formula = contador + " x " que é para mostrar a multplicação \\
        }s += " 1 = ";
        // add o 1 que nao vem do contador e o = \\
        fat = f;
        formula = s;
    }

    public int getFatorial() {
        // metodo pra obter resultado \\
        return fat;
    }
public String getFormula(){
       // metodo para obter formula \\
return formula;
}

}