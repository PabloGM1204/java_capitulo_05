import java.util.Scanner;
public class Ejercicio36{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice si un númeo es capicuo o no");
        System.out.print("Dime un número: ");
        long n = sc.nextInt();
        long nv = 0;
        long n_ = n;
        int longi = 0;
        boolean capicuo = true;
        while (n>0) {
            nv = (nv*10)+(n%10);
            n/=10;
            longi++;
        }
        if(n_==nv){
            System.out.println("El "+n_+" es capicuo");
        }else{
            System.out.println("El "+n_+" no es capicuo");
        }
    }
}