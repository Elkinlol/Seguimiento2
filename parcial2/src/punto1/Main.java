package punto1;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(1);

        System.out.println("Lista original:");
        lista.mostrar();

        lista.invertirConPila();

        System.out.println("Lista invertida:");
        lista.mostrar();
    }
}
