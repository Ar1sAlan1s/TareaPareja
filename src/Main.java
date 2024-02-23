import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numa = 0, x;
        boolean band = false;

        Random ran = new Random();
        numa = ran.nextInt(11);
        Scanner leer = new Scanner(System.in);
        for (; band == false; ) {
            System.out.print("Adivina el numero: ");
            System.out.println(numa);
            x = leer.nextInt();
            if (x == numa) {
                band = true;
            }

        }
        System.out.println("Le atinaste felicidades");
    }
}