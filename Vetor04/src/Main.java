import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int vet[] = {3,7,6,1,9,4,2};
        int pos = Arrays.binarySearch(vet , 3);
        //binarysearch identifica um valor X no vetor\\

        System.out.println("Encontrei o valor na posição " + pos);
        for (int val: vet){
            System.out.print(val + " ");}
        }

    }
