
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    
    public static void main(String[] args) {
        
        Monitor monitorDell = new Monitor("USB" , 14);
        Teclado tecladoDell = new Teclado("USB","DELL");
        Raton ratonDell = new Raton ( "USB","DELL");
        
        Monitor monitorHP = new Monitor("USB" , 40);
        Teclado tecladoHP = new Teclado("USB","HP");
        Raton ratonHP = new Raton ( "USB","HP");
        
        Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP,tecladoHP,ratonHP);
        
        Computadora computadoraDELL = new Computadora ("Computadora DELL" , monitorDell, tecladoDell,ratonDell);
        
        Computadora computadoraClone = new Computadora("Computadora Clon" , monitorHP,tecladoDell,ratonDell);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDELL);
        orden1.agregarComputadora(computadoraClone);
        orden1.mostrarOrden();
        
    }
}
