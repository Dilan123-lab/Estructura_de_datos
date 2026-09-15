package problema_c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionInventario {

    public static void main(String[] args) {
        
        List<String> hardwarebase = new ArrayList<>();
        
        String[] componentesproveedor = {" tarjeta grafica ", " memoria ram ", " disco ssd ", " fuente de poder "};
        List<String> hardwareproveedor = Arrays.asList(componentesproveedor);
        
        hardwarebase.add(" procesador ");
        hardwarebase.add(" placa madre ");
        hardwarebase.add(" gabinete ");
        hardwarebase.add(" disipador ");
        
        List<String> hardwareconsolidado = new ArrayList<>(hardwarebase);
        hardwareconsolidado.addAll(hardwareproveedor);
        
        System.out.println("\n hardware base: ");
        hardwarebase.forEach(System.out::println);
        System.out.println("\n hardware proveedor: ");
        hardwareproveedor.forEach(System.out::println);
        System.out.println("\n hardware consolidado: ");
        hardwareconsolidado.forEach(System.out::println);
    }
}
