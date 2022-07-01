package ejercicios;

public class Condicional {

    public static void main(String[] args) {
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es mayor a 0");
        } else if (numeroIf < 0) {
            System.out.println("El numero es menor a 0");
        } else {
            System.out.println("El numero es igual a 0");
        }
    }
}
