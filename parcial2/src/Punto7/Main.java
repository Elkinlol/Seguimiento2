package Punto7;
public class Main {
    public static void main(String[] args) {
        Nodo cabeza = new Nodo(3);
        cabeza.siguiente = new Nodo(5);
        cabeza.siguiente.siguiente = new Nodo(8);  // Suma total = 3 + 5 + 8 = 16

        ListaRecursiva.procesar(cabeza);  // Si hay un nodo con valor 16, se le agregará un 2 después

        ListaRecursiva.imprimir(cabeza);  // Ver el resultado
    }
}