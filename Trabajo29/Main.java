import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    int[]arreglo = new int[2];
    Scanner entrada= new Scanner (System.in);
    try{
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el valor "+ (i+1)+ " : ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("Felicidades");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Se a excedido de la capacidad del arreglo......");
        e.printStackTrace();
    }
    entrada.close();
    }    
}

 