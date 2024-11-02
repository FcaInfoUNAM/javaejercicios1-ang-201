package Exercises;

public class Sobrecarga {

    String nombre;
    String materia;
    int calificacion;

    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Método reprobar en Sobrecarga
    public String reprobar() {
        if (this.calificacion > 5)
            return "true";
        else
            return "false";
    }

    /**
     * Clase Profesor, hereda de Sobrecarga
     */
    class Profesor extends Sobrecarga {
        public Profesor(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        @Override
        public String reprobar() {
            if (this.calificacion > 5)
                return ">:) Sacaste " + this.calificacion + " en " + this.materia;
            else
                return ":(";
        }
    }

    /**
     * Clase Alumno, hereda de Sobrecarga
     */
    class Alumno extends Sobrecarga {
        public Alumno(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        @Override
        public String reprobar() {
            if (this.calificacion < 6)
                return ":(";
            else
                return ":)";
        }
    }
}

