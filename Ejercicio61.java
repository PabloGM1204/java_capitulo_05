import java.util.Scanner;
public class Ejercicio61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace una V");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int ext = 1;
        int espint = alt*2-1;
        if(alt<3){
            System.out.println("Error la altura debe ser mayor o igual a 3");
        }else{
            for(int i = 1; i<=alt; i++){
                for(int a = 1; a<ext; a++){
                    System.out.print(" ");
                }
                System.out.print("***");
                for(int a = 1; a<espint; a++){
                    System.out.print(" ");
                }
                System.out.println("***");
                espint-=2;
                ext++;
            }
        }
    }
}