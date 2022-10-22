import java.util.Scanner;
public class Ejercicio17{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te suma los 100 siguientes números");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int t = 0;
        if(n<0){
            System.out.println("Su número es negativo porfavor escriba uno positivo");
        }else{
            for(int i = n; i<n+100;i++){
                t += i;
            }
            System.out.println(t);
        }
    }
}