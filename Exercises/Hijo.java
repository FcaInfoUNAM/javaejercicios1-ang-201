package Exercises;

public class Hijo extends Padre {
    String nombre;

    public Hijo(String nombre, String apellido) {
        super(apellido); // Llama al constructor de Padre para inicializar el apellido
        this.nombre = nombre;
    }
}

