import java.util.Scanner;
public class Ejercicio58{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la media de los números de otro");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int t = 0;
        int cont = 0;
        do{
            t += n%10;
            cont++;
            n/=10;
        }while(n>0);
        System.out.println("La media de sus dígitos es: "+(double)t/cont);
    }
}