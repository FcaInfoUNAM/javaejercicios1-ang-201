    package Exercises;

public class Padre {
    String apellido;

    public Padre(String apellido) {
        this.apellido = apellido;
    }

    // Método que creará instancias de Hijo y EspirituSanto, y llamará a pruebaPaternidad
    public Boolean test() {
        // Crear instancia de Hijo con nombre "Juan" y apellido del padre
        Hijo hijo = new Hijo("Juan", this.apellido);
        
        // Crear instancia de EspirituSanto con nombre del hijo, apellido del padre y apellidoReal "Lopez"
        EspirituSanto es = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        
        // Retornar el resultado de pruebaPaternidad
        return es.pruebaParternidad();
    }
}


