/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mimoda;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */



public class PRENDA {
  
    //----------------------------------------------------------------------
    // Atributos
    //----------------------------------------------------------------------
    public static final int MAX_TALLA = 50;  
    public static final int MIN_TALLA = 1;   
    
    private String tipoEstilo;      
    private String colorPrimario;    
    private int tallaPrenda;        
    private String material;         
    private String temporada;        
    private boolean disponible;     

    
    
    //----------------------------------------------------------------------
    // Constructores
    //----------------------------------------------------------------------
    
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
        this("basico", "negro", 10, "tela normal", "primavera", true);  
    }

    public PRENDA(PRENDA otraPrenda) {
        this.tipoEstilo = otraPrenda.tipoEstilo;
        this.colorPrimario = otraPrenda.colorPrimario;
        this.tallaPrenda = otraPrenda.tallaPrenda;
        this.material = otraPrenda.material;
        this.temporada = otraPrenda.temporada;
        this.disponible = otraPrenda.disponible;
    }

    
    //----------------------------------------------------------------------
    // getters & setters
    //----------------------------------------------------------------------
    
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
            throw new IllegalArgumentException("Talla fuera de los limites permitidos");
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
    
    
    //----------------------------------------------------------------------
    // Metodos
    //----------------------------------------------------------------------
    
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tipoEstilo);
        hash = 97 * hash + Objects.hashCode(this.colorPrimario);
        hash = 97 * hash + this.tallaPrenda;
        hash = 97 * hash + Objects.hashCode(this.material);
        hash = 97 * hash + Objects.hashCode(this.temporada);
        hash = 97 * hash + (this.disponible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PRENDA other = (PRENDA) obj;
        if (this.tallaPrenda != other.tallaPrenda) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.tipoEstilo, other.tipoEstilo)) {
            return false;
        }
        if (!Objects.equals(this.colorPrimario, other.colorPrimario)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return Objects.equals(this.temporada, other.temporada);
    }
    
    
    
}


   


    

