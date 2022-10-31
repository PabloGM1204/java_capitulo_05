import java.util.Scanner;
public class Ejercicio60{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja unos calcetines de navidad");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int esp = 3;
        if(alt<4){
            System.out.println("Error debe ser la altura mayor o igual a 4");
        }else{
            for(int i = 1; i<=alt-2; i++){
                for(int j = 1; j<=esp; j++){
                    System.out.print("*");
                }
                System.out.print("     ");
                for(int j = 1; j<=esp; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("******  ******");
            System.out.print("******  ******");
        }
    }
}