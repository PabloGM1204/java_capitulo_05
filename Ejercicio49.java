import java.util.Scanner;
public class Ejercicio49{
    public static void main(String [] ars) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado.");
        System.out.print("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        boolean primo;
        int contn = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        do{
            int n = sc.nextInt();
            primo = true;
            for(int i = 2;i<n;i++){
                if((n%i)==0){
                    primo = false;
                }
            }
            if(!primo){
                contn++;
                suma+=n;
                max = n> max ? n : max;
                min = n> min ? n : min;
            }
        }while(!primo);
        System.out.println("Ha introducido "+contn+" números no primos");
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.println("Media: "+(double)suma/contn);
    }
}