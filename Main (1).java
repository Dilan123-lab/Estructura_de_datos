package problema_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Problema_2 {
    
    public static void main(String[] args) {
       
        List <String> materias = new ArrayList <>();
        materias.add(" - piloto - emprendimiento ");
        materias.add(" - estructura de datos ");
        materias.add(" - base de datos ");
        materias.add(" - piloto - proyecto de vida ");
        materias.add(" - calculo integral ");
        
        System.out.println(" \n lista de materias: ");
        materias.forEach(System.out::println);
        
        System.out.println(" \n revision de materias: ");
        
        ListIterator<String> iterator = materias.listIterator();
        while (iterator.hasNext()) {
            String materia = iterator.next();
            System.out.println(" \n * revisando " + materia);
            
            if (materia.equals(" - piloto - emprendimiento ")) {
                iterator.remove();
                System.out.println(" -> se elimino por ser piloto");
            
            }
            
            if (materia.equals(" - piloto - proyecto de vida ")) {
                iterator.remove();
                System.out.println(" -> se elimino por ser piloto ");
            
            }
            
        
        }
        
        System.out.println("\n lista final de materias: ");
        materias.forEach(System.out::println);
        
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
