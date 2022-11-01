import java.util.Scanner;
public class Ejercicio69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja una piramide maya");
        System.out.print("Dime la altura de la piramide maya: ");
        int alt = sc.nextInt();
        int p = 1;
        int l = 1;
        int esp = alt-1;
        if(alt<3){
            System.out.println("Error, debe escribir una altura mayor o igual que 3");
        }else{
            for(int i = 1; i<=alt; i++){
                for(int a = 1; a<=esp; a++){
                    System.out.print(" ");
                }
                for(int a = 0; a<=l/2; a++){
                    System.out.print("*");
                }
                if((p%2)==1){
                    System.out.print("****");
                }else{
                    System.out.print("    ");
                }
                for(int a = 0; a<=l/2; a++){
                    System.out.print("*");
                }
                System.out.println("");
                p++;
                esp--;
                l+=2;
            }
        }
    }
}