package problema_a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MantenimientoSistema {
    
    public static void main(String[] args) {
       
        List<String> tareas = new ArrayList<>();
        tareas.add(" - temporal - limpieza de logs ");
        tareas.add(" - optimizacion de base de datos ");
        tareas.add(" - migracion de servidores ");
        tareas.add(" - temporal - respaldo secundario ");
        tareas.add(" - actualizacion de seguridad ");
        
        System.out.println(" \n lista de tareas: ");
        tareas.forEach(System.out::println);
        
        System.out.println(" \n revision de tareas: ");
        
        ListIterator<String> iterator = tareas.listIterator();
        while (iterator.hasNext()) {
            String tarea = iterator.next();
            System.out.println(" \n * revisando " + tarea);
            
            if (tarea.equals(" - temporal - limpieza de logs ")) {
                iterator.remove();
                System.out.println(" -> se elimino por ser tarea temporal");
            }
            
            if (tarea.equals(" - temporal - respaldo secundario ")) {
                iterator.remove();
                System.out.println(" -> se elimino por ser tarea temporal ");
            }
        }
        
        System.out.println("\n lista final de tareas: ");
        tareas.forEach(System.out::println);
    }
}
