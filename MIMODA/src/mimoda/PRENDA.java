/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimoda;

/**
 *
 * @author USUARIO
 */

public class PRENDA {
  

    public static final int MAX_TALLA = 50;  
    public static final int MIN_TALLA = 1;   
    
    private String tipoEstilo;      
    private String colorPrimario;    
    private int tallaPrenda;        
    private String material;         
    private String temporada;        
    private boolean disponible;     

    public PRENDA (String tipoEstilo, String colorPrimario, int tallaPrenda, String material, String temporada, boolean disponible) {
        this.tipoEstilo = tipoEstilo;
        this.colorPrimario = colorPrimario;

        if (tallaPrenda >= MIN_TALLA && tallaPrenda <= MAX_TALLA) {
            this.tallaPrenda = tallaPrenda;
        } else {
            throw new IllegalArgumentException("Talla fuera de los límites permitidos");
        }

        this.material = material;
        this.temporada = temporada;
        this.disponible = disponible;
    }

    public PRENDA() {
        this("moderno", "negro", 10, "algodón", "verano", true);  
    }

    public PRENDA(PRENDA otraPrenda) {
        this.tipoEstilo = otraPrenda.tipoEstilo;
        this.colorPrimario = otraPrenda.colorPrimario;
        this.tallaPrenda = otraPrenda.tallaPrenda;
        this.material = otraPrenda.material;
        this.temporada = otraPrenda.temporada;
        this.disponible = otraPrenda.disponible;
    }

    public String getTipoEstilo() {
        return tipoEstilo;
    }

    

    public String getColorPrimario() {
        return colorPrimario;
    }

    public int getTallaPrenda() {
        return tallaPrenda;
    }

    public String getMaterial() {
        return material;
    }

    public String getTemporada() {
        return temporada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTipoEstilo(String tipoEstilo) {
        this.tipoEstilo = tipoEstilo;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setTallaPrenda(int tallaPrenda) throws IllegalArgumentException {
        if (tallaPrenda >= MIN_TALLA && tallaPrenda <= MAX_TALLA) {
            this.tallaPrenda = tallaPrenda;
        } else {
            throw new IllegalArgumentException("Talla fuera de los límites permitidos");
        }
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PRENDA{");
        sb.append("tipoEstilo=").append(tipoEstilo);
        sb.append(", colorPrimario=").append(colorPrimario);
        sb.append(", tallaPrenda=").append(tallaPrenda);
        sb.append(", material=").append(material);
        sb.append(", temporada=").append(temporada);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    }
    
    
}


   


    

