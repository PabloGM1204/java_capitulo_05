import	java.util.Scanner;
public class Ejercicio28{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te calcula el factorial de un número ");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int t = 1;
        if(n<0){
            System.out.println("Número invalido");
        }else if(n == 0){
            System.out.println("0 != 1");
        }else{
            for(int i = 2;i<=n;i++){
                t *= i;
            }
            System.out.println(n+" != "+t);
        }
    }
}