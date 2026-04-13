
public class Main {
    public static void main(String[] args) {
    int cc = 0;

        //WHILE FAZ O TESTE LÓGICO ANTES\\
        while (cc < 10){
            cc++;
            if (cc ==5 || cc == 8 || cc == 9){
                continue;
        //COMO O CONTINUE EXECUTA O COMANDO DE BAIXO, PULOU O 5 E O  NA CONTAGEM\\
            }

            if (cc == 7){
                break;}

            System.out.println("CAMBALHOTA " + cc );
            //CC+1 ENTRE PARENTESES PARA PULAR A CAMBALHOTA ZERO\\

            //CC++ = CC+1\\
        }
        }
    }
