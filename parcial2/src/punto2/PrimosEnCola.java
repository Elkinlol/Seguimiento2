package punto2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrimosEnCola {

    // Método para verificar si un número es primo
    private static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Método que extrae los primos de una pila y los almacena en una cola
    public static Queue<Integer> extraerPrimos(Stack<Integer> pila) {
        Queue<Integer> cola = new LinkedList<>();
        Stack<Integer> pilaAux = new Stack<>();

        // Paso 1: Vaciar la pila original en una pila auxiliar
        while (!pila.isEmpty()) {
            int num = pila.pop();
            pilaAux.push(num);  // Guardamos los números en el mismo orden
        }

        // Paso 2: Volver a llenar la pila original y filtrar los primos
        while (!pilaAux.isEmpty()) {
            int num = pilaAux.pop();
            pila.push(num);  // Restauramos la pila original
            if (esPrimo(num)) {
                cola.add(num);  // Agregamos los primos a la cola
            }
        }
        return cola;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(7);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(2);

        System.out.println("Pila original: " + pila);
        Queue<Integer> colaPrimos = extraerPrimos(pila);

        System.out.println("Cola con números primos: " + colaPrimos);
        System.out.println("Pila después de la operación: " + pila);  // Se mantiene igual
    }

}
