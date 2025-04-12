package punto3;
import java.util.LinkedList;
import java.util.Queue;

class Persona {
    String nombre;
    int edad;
    char sexo; // 'M' para masculino, 'F' para femenino

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + sexo + ")";
    }
}
