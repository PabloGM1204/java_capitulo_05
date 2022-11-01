import java.util.Scanner;
public class Ejercicio65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa escribe con asteriscos la letra A");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        System.out.print("Dime en que fila quieres el palito: ");
        int p = sc.nextInt();
        int ext = alt-1;
        int espint = 1;
        if(alt<3){
            System.out.println("Error, la altura introducida debe ser mayor que 3");
        }else if(p<2 || p>alt){
            System.out.println("Errot, la fila introducida no es correcta");
        }else{
            for(int i = 1; i<alt; i++){
                System.out.print(" ");
            }
            System.out.println("*");
            for(int i = 1; i<alt;i++){
                for(int a = 1; a<ext; a++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i==p-1){
                    for(int a = 1; a<=espint+1; a++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    ext--;
                    espint+=2;
                }else{
                    for(int a = 1; a<=espint; a++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    ext--;
                    espint+=2;
                }
            }
        }


    }
}