package problema_b;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SalaEspera {

    public static void main(String[] args) {
        List<String> jugadores = new ArrayList<>();
        jugadores.add(" andres gomez ");
        jugadores.add(" valeria rios ");
        jugadores.add(" mateo mendoza ");
        jugadores.add(" sofia castro ");
        
        System.out.println(" \n posicion de los jugadores: ");
        
        ListIterator<String> iterator = jugadores.listIterator();
        
        while (iterator.hasNext()) {
            int posicion = iterator.nextIndex() + 1;
            String jugador = iterator.next();
            System.out.println(" posicion " + posicion + ": " + jugador);
            
            if (posicion == 1) {
                iterator.add(" vip - lucas ramirez ");
            }
        }
        
        System.out.println(" \n posicion de los jugadores (invertida): ");
        while (iterator.hasPrevious()) { 
            int posicioninversa = iterator.previousIndex() + 1;
            String jugador = iterator.previous();
            System.out.println(" posicion " + posicioninversa + ": " + jugador);
        }
        
        System.out.println(" \n posicion final de los jugadores: ");
        while (iterator.hasNext()) {
            int posicion = iterator.nextIndex() + 1;
            String jugador = iterator.next();
            System.out.println(" posicion " + posicion + ": " + jugador);
        }
    }
}
