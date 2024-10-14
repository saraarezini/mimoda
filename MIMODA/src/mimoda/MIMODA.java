/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mimoda;

/**
 *
 * @author USUARIO
 */
public class MIMODA {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Test Constructores
        PRENDA prenda1 = new PRENDA("urbano", "rojo", 38, "poliester", "primavera", true);
        System.out.println("Test 1: Constructor Parametrico");
        System.out.println(prenda1.toString());  
        System.out.println();

        PRENDA prenda2 = new PRENDA();
        System.out.println("Test 2: Constructor por Defecto");
        System.out.println(prenda2.toString());  
        System.out.println();

        PRENDA prendaCopia = new PRENDA(prenda1);
        System.out.println("Test 3: Constructor Copia");
        System.out.println(prendaCopia.toString());  
        System.out.println();
        
        // Test getters y setters
        
        prenda1.setTipoEstilo("formal");
        prenda1.setColorPrimario("azul");
        prenda1.setTallaPrenda(42);
        prenda1.setMaterial("seda");
        prenda1.setTemporada("invierno");
        prenda1.setDisponible(false);
        System.out.println("Test 4 : Modificar valores con Setters");
        System.out.println(prenda1.toString());  
        System.out.println();

 
    }
}