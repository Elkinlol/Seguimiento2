package Punto7;

public class ListaRecursiva {

    public static void procesar(Nodo nodo) {
        insertarRecursivo(nodo, calcularSuma(nodo));
    }

    private static int calcularSuma(Nodo nodo) {
        if (nodo == null) return 0;
        return nodo.valor + calcularSuma(nodo.siguiente);
    }

    private static void insertarRecursivo(Nodo nodo, int suma) {
        if (nodo == null) return;

        if (nodo.valor == suma) {
            Nodo nuevo = new Nodo(2);
            nuevo.siguiente = nodo.siguiente;
            nodo.siguiente = nuevo;
            // Avanzamos dos nodos porque el siguiente es el que acabamos de insertar
            insertarRecursivo(nuevo.siguiente, suma);
        } else {
            insertarRecursivo(nodo.siguiente, suma);
        }
    }

    // Método para imprimir la lista (solo para verificar)
    public static void imprimir(Nodo nodo) {
        while (nodo != null) {
            System.out.print(nodo.valor + " -> ");
            nodo = nodo.siguiente;
        }
        System.out.println("null");
    }
}