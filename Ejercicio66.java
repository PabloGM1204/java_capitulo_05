import java.util.Scanner;
public class Ejercicio66{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace el dibujo de una señal de trafico");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        if(alt<3 || (alt%2)==0){
            System.out.println("Error, la altura debe ser  impar y mayor o igual que 3");
        }else{
            for(int i = 0; i<=alt/2; i++){
                for(int a = 0; a<i;a++){
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
            for(int i = alt/2; i>0; i--){
                for(int a = 1; a<i;a++){
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
        }
    }
}