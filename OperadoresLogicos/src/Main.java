
public class Main {
    public static void main(String[] args) {
        int x ,y ,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, r2,r3;
         r =(x<y && y<z)?true: false;
         // (&&) Se ambas ocasioes forem verdadeiras retorna true senão retorna false\\
            System.out.println(r);
        r2 =(x>y || y==z)? true:false;
        //  (||) Se alguma das ocasioes ou as duas forem verdadeiras retorna true senão false\\
            System.out.println(r2);
        r3 = (x<y ^ y<z)? true:false;
        //  (^) Somente se UM for verdadeiro retorna TRUE se os dois forem verdadeiros, ou falsos retorna FALSE\\
        System.out.println(r3);


        }
    }
