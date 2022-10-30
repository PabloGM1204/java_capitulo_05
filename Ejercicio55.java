import java.util.Scanner;
public class Ejercicio55{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa da la vuelta a un número de izquierda a derecha");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int nc = 0;
        int lon = 0;
        double f = 0;
        double f2 = 0;
        double ft = 0;
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
            f = (nc%10);
            f2 = ((nc/10)/expo);
            ft = (f+f2)*expo;
            System.out.println("El número resultado es: "+(int)ft);
        }
    }
}