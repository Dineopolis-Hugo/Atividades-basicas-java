public class Main {


    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        // transforma o fatorial em objeto para puxar classes e métodos\\
        f.setvalor(5);
        // add o valor do fatorial que eu  quero, EX: fat de 5 \\
        System.out.println(f.getFormula());
        // printar a fórmula \\
        System.out.println(f.getFatorial());
        // printar o resultado \\
    }
}