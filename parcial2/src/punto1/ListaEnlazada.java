package punto1;

import java.util.Stack;

class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void invertirConPila() {
        Stack<Nodo> pila = new Stack<>();
        Nodo actual = cabeza;

        while (actual != null) {
            pila.push(actual);
            actual = actual.siguiente;
        }

        if (pila.isEmpty()) return;

        cabeza = pila.pop();
        actual = cabeza;

        while (!pila.isEmpty()) {
            actual.siguiente = pila.pop();
            actual = actual.siguiente;
        }
        actual.siguiente = null;
    }
}