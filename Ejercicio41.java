import java.util.Scanner;
public class Ejercicio41{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la cantidad de número pares e impares en un número");
        System.out.print("Dime un número: ");
        long n = sc.nextLong();
        long n2 = n;
        int pa = 0;
        int im = 0;
        while(n>0){
            if((n % 2)==0){
                pa++;
            }else{
                im++;
            }
            n/=10;
        }
        System.out.println("El "+n2+" contiene "+pa+" dígitos pares y "+im+" impares");
    }
}