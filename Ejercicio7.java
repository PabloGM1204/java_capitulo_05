import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa crear una caja fuerte");
        System.out.print("Escribe la contraseña de 4 cifras: ");
        int c = sc.nextInt();
        int n = 4321;
        if(c != n){
            for(int i =3;i>0;i--){
                System.out.println("Contraseña incorrecta, tienes "+i+" intentos restantes");
                c = sc.nextInt();
            }
        } else {
            System.out.println("Contraseña correcta");
        }
    }
}