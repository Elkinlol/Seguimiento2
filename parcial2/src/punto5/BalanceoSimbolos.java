package punto5;
import java.util.Stack;

public class BalanceoSimbolos {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            // Si encontramos un símbolo de apertura, lo añadimos a la pila
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            // Si encontramos un símbolo de cierre, verificamos con la pila
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false; // No hay apertura correspondiente
                char top = pila.pop();

                // Verificamos si los símbolos coinciden
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // La pila debe estar vacía si todo está balanceado
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String expresion1 = "(6-7)/4]"; // Incorrecta
        String expresion2 = "[(1+2)*4]+5"; // Correcta

        System.out.println("Expresión 1: " + estaBalanceado(expresion1)); // false
        System.out.println("Expresión 2: " + estaBalanceado(expresion2)); // true
    }
}
