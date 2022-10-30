import java.util.Scanner;
public class Ejercicio52{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pasa los números una posición a la izquierda");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int nc = 0;
        int lon = 0;
        int f = 0;
        int f2 = 0;
        int ft = 0;
        double expo = 0;
        if(n<10){
            System.out.println("El número resultado es: "+n);
        }else if(n>=10 && n<1000){
            System.out.println("El número resultado es: "+(n%10)+(n/10));
        }else{
            nc = n;
            while(n>0){
                lon++;
                n/=10;
            }
            expo = Math.pow(10,lon-1);
            f = ((int)nc%(int)expo);
            f2 = (nc/(int)expo);
            ft = f*10+f2;
            System.out.println("El número resultado es: "+ft);
        }
    }
}