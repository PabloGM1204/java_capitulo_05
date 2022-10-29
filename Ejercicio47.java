import java.util.Scanner;
public class Ejercicio47{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace un 8 con la M");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        if(alt<5 || (alt%2) == 0){
            System.out.println("Debe escribir una altura impar, mayor o igual que 5");
        }else{
            System.out.println("MMMMMM");
            for(int i = 1;i<=alt/3;i++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for(int i = 1;i<=alt/3;i++){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        }
    }
}