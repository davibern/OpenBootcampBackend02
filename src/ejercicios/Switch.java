package ejercicios;

public class Switch {
    // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
    // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
    // También habrá que poner un default para cuando el valor de la variable no sea una estación.
    public static void main(String[] args) {
        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("La estación no coincide");
        }
    }
}
