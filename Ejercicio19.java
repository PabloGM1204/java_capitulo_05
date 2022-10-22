import java.util.Scanner;
public class Ejercicio19{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja una piramide");
        System.out.print("De cuanta altura quieres la piramide: ");
        int alt = sc.nextInt();
        System.out.print("De que simbolo quieres la piramide: ");
        String simb = sc.next();
        int e = alt-1;
        int s = 0;
        int cont = 1;
        for(int r = 0; r<alt; r++){
            for(int i = 1; i<=e; i++){
                System.out.print(" ");
            }
            for(int i = 1; i<=cont; i++){
                System.out.print(simb);
            }
            System.out.println("");
            e--;
            cont +=2;
        }
    }
}