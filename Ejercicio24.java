import java.util.Scanner;
public class Ejercicio24{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace una piramides con números");
        System.out.print("Dime la altura de la piramide: ");
        int alt = sc.nextInt();
        int e = alt-1;
        int cont = 1;
        int i = 0;
        for(int r = 0; r<alt; r++){
            for(i = 1; i<=e; i++){
                System.out.print(" ");
            }
            for(i = 1; i<cont; i++){
                System.out.print(i);
            }
            for(i = cont; i>0; i--){
                System.out.print(i);
            }
            System.out.println("");
            e--;
            cont++;
        }
    }
}