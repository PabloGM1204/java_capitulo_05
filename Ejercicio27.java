import java.util.Scanner;;
public class Ejercicio27{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra, cuenta y suma los múltiplos de 3 que hay entre 1 y un número leído por teclado.");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int cont = 0;
        int d = 0;
        int t = 0;
        if(n<2){
            System.out.println("Ese número no sirve");
        }else{
            for(cont = 1; cont<n; cont++){
                if(cont%3 == 0){
                    System.out.print(cont+" ");
                    t +=cont;
                    d++;
                }
            }
            System.out.println("");
            System.out.println("Desde 1 hasta "+n+" hay "+d+" múltiplos de 3 y suman "+t);
        }

    }
}