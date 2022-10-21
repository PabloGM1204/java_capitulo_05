import java.util.Scanner;
public class Ejercicio10{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ");
        System.out.println("Escriba los números de los cuales quiere hacer la média:");
        boolean salida = true;
        double n;
        double t = 0;
        int cont = 0;
        do{
            n = sc.nextDouble();
            if(n<0){
                salida = false;
            } else {
                t += n;
                cont++;
            }
        }while(salida);
        System.out.println("La media total seria: "+(t/cont));
    }
}