package punto4;
import java.util.Stack;

public class DecimalABinario {
    public static int convertirABinario(int numero) {
        if (numero == 0) return 0; // Caso especial para el 0

        Stack<Integer> pila = new Stack<>();
        while (numero > 0) {
            pila.push(numero % 2); // Guardar el residuo en la pila
            numero /= 2;
        }

        // Construir el número binario
        StringBuilder binarioStr = new StringBuilder();
        while (!pila.isEmpty()) {
            binarioStr.append(pila.pop()); // Extraer los dígitos en orden correcto
        }

        return Integer.parseInt(binarioStr.toString()); // Convertir a entero y retornar
    }

    public static void main(String[] args) {
        int numero = 61;
        int binario = convertirABinario(numero);
        System.out.println(numero + " en binario es: " + binario);
    }
}
