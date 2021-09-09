//binary
import java.util.Scanner;
public class hadiah3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	System.out.println("12,13,15,26,27,28,30,11,25"); 
        System.out.print("Input bilangan : ");
        int bilangan = scan.nextInt();

        int n = 0;
        int[] binary = { 12,13,15,26,27,28,30,11,25 };
        int binaryLength = binary.length;

        for (int x : binary) { 
            if (bilangan == x) {
                System.out.println("bilangan tersebut di indeks ke-" + n);
                break;
            }
            n++;
        }

        if (n == binaryLength) {
            System.out.println("bilanganmu tidak ada di list, bye~");
        }
    }
}
