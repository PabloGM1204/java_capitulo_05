import java.util.Scanner;
public class Ejercicio26{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la posicion/es de un número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime otro número para buscarlo: ");
        int d = sc.nextInt();
        int v = 0;
        int p = 1;
        n = n*10+1;
        if(n>=0 && n<10){
            System.out.println("Al ser un número de una cifra no sirve");
        }else{
            while(n>0){
                v=(v*10)+(n%10);
                n /=10;
            }
            while(v != 1){
                if(v%10 == d){
                    System.out.println(p+" posición ");
                }
                v /=10;
                p++;
            }
        }
    }
}