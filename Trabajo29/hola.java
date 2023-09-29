public class hola {
    public static void main(String[] args) {
        int numerador = 10;
        int[] denominadores = {2, 0, 1, 4, 0, 3};
        for (int i = 0; i < denominadores.length; i++) {
            int resultado;
            if (denominadores[i] == 0) {
                System.out.println("Error: División entre cero.");
            } else {
                resultado = numerador / denominadores[i];
                System.out.println("El resultado es: " + resultado);
            }
        }
    }
}