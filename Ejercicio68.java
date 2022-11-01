import java.util.Scanner;
public class Ejercicio68{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te disloca un número y le suma 1 al digito par y le resta 1 al impar");
        System.out.print("Dime un número: ");
        long n = sc.nextInt();
        long nc = n;
        int r = 0;
        long t = 0;
        long t2 = 0;
        do{
            r= (int)n%10;
            if((r%2)==0){
                t=(t*10)+(r+1);
            }else{
                t=(t*10)+(r-1);
            }
            n/=10;
        }while(n>0);
        n = nc;
        while(t>0){
            t2 = (t2*10)+(t%10);
            t/=10;
        }
        System.out.println("Dislocado el "+nc+" sale el "+t2);
    }
}