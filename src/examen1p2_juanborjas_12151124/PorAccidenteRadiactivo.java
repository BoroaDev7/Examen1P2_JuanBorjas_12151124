
package examen1p2_juanborjas_12151124;


public class PorAccidenteRadiactivo extends Personas {
    private int edadAcidente;
    private String tipoAccidente;

    public PorAccidenteRadiactivo() {
        super();
    }

    public PorAccidenteRadiactivo(int edadAcidente, String tipoAccidente, String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.edadAcidente = edadAcidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAcidente() {
        return edadAcidente;
    }

    public void setEdadAcidente(int edadAcidente) {
        this.edadAcidente = edadAcidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        return super.toString() + "edadAcidente=" + edadAcidente + ", tipoAccidente=" + tipoAccidente ;
    }

    @Override
    public void FinalChance(Personas p1, Personas p2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
