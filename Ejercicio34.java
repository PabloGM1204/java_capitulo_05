import java.util.Scanner;
public class Ejercicio34{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa coge los números pares e impares y los separa formando nuevos números");
        System.out.print("Dime un número: ");
        long n1 = sc.nextLong();
        long nv = 0;
        System.out.print("Dime otro número: ");
        long n2 = sc.nextLong();
        long n = n1;
        int longn = 0;
        if (n == 1){
            longn = 1;
        }
        while(n>0){
            nv = (nv*10)+(n%10);
            n /=10;
            longn++;
        }
        n = n2;
        long nv2 = 0;
        while(n>0){
            nv2 = (nv2*10)+(n%10);
            n /=10;
        }
        long tim = 0;
        long tp = 0;
        long digito;
        for(int i = 0;i<longn;i++){
            digito = nv%10;
            if((digito%2)==0){
                tp = tp * 10+digito ;
            }else{
                tim = tim * 10 + digito;
            }
            digito = nv2%10;
            if((digito%2)==0){
                tp = digito + tp * 10;
            }else{
                tim = tim * 10 + digito;
            }
            nv /=10;
            nv2 /=10;
        }
        System.out.println("El número formado por los dígitos pares es: "+ tp);
        System.out.println("El número formado por los dígitos impares es: "+ tim);

    }
}