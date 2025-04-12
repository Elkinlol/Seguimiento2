package punto3;

import java.util.LinkedList;
import java.util.Queue;

public class FiltrarColaPersonas {

    public static Queue<Persona> filtrarCola(Queue<Persona> cola) {
        Queue<Persona> colaFiltrada = new LinkedList<>();

        while (!cola.isEmpty()) {
            Persona p = cola.poll(); // Extraer de la cola original
            if (!(p.sexo == 'M' && p.edad >= 30 && p.edad <= 50)) {
                colaFiltrada.add(p); // Agregar solo los que no cumplen la condición
            }
        }

        return colaFiltrada; // Retornar la nueva cola filtrada
    }

    public static void main(String[] args) {
        Queue<Persona> colaPersonas = new LinkedList<>();
        colaPersonas.add(new Persona("Carlos", 35, 'M'));
        colaPersonas.add(new Persona("Ana", 25, 'F'));
        colaPersonas.add(new Persona("Luis", 40, 'M'));
        colaPersonas.add(new Persona("Marta", 30, 'F'));
        colaPersonas.add(new Persona("Javier", 50, 'M'));
        colaPersonas.add(new Persona("Elena", 28, 'F'));

        System.out.println("Cola original:");
        System.out.println(colaPersonas);

        Queue<Persona> colaFiltrada = filtrarCola(colaPersonas);

        System.out.println("Cola después de la eliminación:");
        System.out.println(colaFiltrada);
    }
}