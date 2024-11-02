package Exercises;

public class EspirituSanto extends Hijo {
    String apellidoReal;

    public EspirituSanto(String nombre, String apellido, String apellidoReal) {
        super(nombre, apellido); // Llama al constructor de Hijo para inicializar nombre y apellido
        this.apellidoReal = apellidoReal;
    }

    // Método que verifica si el apellido del Padre coincide con el apellidoReal
    public Boolean pruebaParternidad() {
        return this.apellido.equals(this.apellidoReal); // Compara los apellidos usando equals
    }
}

