import java.util.Scanner;
public class Ejercicio34{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa coge los números pares e impares y los separa formando nuevos números");
        System.out.print("Dime un número: ");
        long n1 = sc.nextLong();
        long n1_ = n1;
        long p = 0;
        long tp = 0;
        long nv = 0;
        int longn = 0;
        System.out.print("Dime otro número: ");
        long n2 = sc.nextLong();
        long n2_ = n2;
        long im = 0;
        long tim = 0;
        long nv2 = 0;
        while(n1>0){
            nv = (nv*10)+(n1%10);
            longn++;
            n1 /=10;
        }
        for(int i = 0;i<longn;i++){
            p = n1_%10;
            if((p%2)==0){
                tp += p;
                tp *=10;
                n1_ /=10;
            }
            im = n2_%10;
            if((im%2)==0){
                tim += im;
                tim *=10;
                n2_ /=10;
            }
            System.out.println("hola");
        }
        System.out.println("El número formado por los dígitos pares es: "+ tp);
        System.out.println("El número formado por los dígitos impares es: "+ tim);

    }
}