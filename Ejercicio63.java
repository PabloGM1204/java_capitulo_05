import java.util.Scanner;
public class Ejercicio63{
    public static void main(String[] args) {
        System.out.println("Este programa pinta dos piramides rellenas con asteriscos");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altp1 = sc.nextInt();
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int altp2 = sc.nextInt();

        int altmax = Math.max(altp1, altp2);
        int esp1 = altp1 - 1;
        int esp2 = altp2 - 1;
        int bp1 = altp1 * 2 - 1;
        int bp2 = altp2 * 2 - 1;
        int astp1 = 1;
        int astp2 = 1;
        for (int i = altmax; i > 0; i--) {
            if (i > altp1) {
                for (int j = 0; j <= bp1; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < esp1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < astp1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= esp1; j++) {
                    System.out.print(" ");
                }
            esp1--;
            astp1 += 2;
            }
            if (i > altp2) {
                for (int j = 0; j < bp2; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < esp2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < astp2; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= esp1; j++) {
                    System.out.print(" ");
                }
                esp2--;
                astp2 += 2;
            }
        System.out.println();
        }
    }
}