import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Colecciones {
    ArrayList<String> cars;
    String[] bikes;
    Set<String> bicicles;
    HashMap<Integer, String> transport;

    public Colecciones() {
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport = new HashMap<Integer, String>();
    }

    public void inicializar() {
        // carros
        cars.add("VW Vento");
        cars.add("Nissan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        // motos
        this.bikes[1] = "Yamaha V-Star 250";
        this.bikes[2] = "Royal Enfield Meteor 350";
        this.bikes[3] = "Kawasaki Eliminator";
        this.bikes[4] = "Honda CMX500A2 SE Rebel.";
        // bicicletas
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String> obtenerHash() {
        // Usamos un HashSet para eliminar duplicados automáticamente
        Set<String> uniqueItems = new HashSet<>();

        // Agregar elementos de 'cars' al conjunto, ignorando nulos o vacíos
        for (String car : cars) {
            if (car != null && !car.isEmpty()) {
                uniqueItems.add(car);
            }
        }

        // Agregar elementos de 'bikes' al conjunto, ignorando nulos o vacíos
        for (String bike : bikes) {
            if (bike != null && !bike.isEmpty()) {
                uniqueItems.add(bike);
            }
        }

        // Agregar elementos de 'bicicles' al conjunto (ya es un Set), ignorando nulos o vacíos
        for (String bicycle : bicicles) {
            if (bicycle != null && !bicycle.isEmpty()) {
                uniqueItems.add(bicycle);
            }
        }

        // Insertar los elementos únicos en el HashMap 'transport' con una llave incremental
        int key = 1;
        for (String item : uniqueItems) {
            transport.put(key++, item);
        }

        return transport;
    }
}
