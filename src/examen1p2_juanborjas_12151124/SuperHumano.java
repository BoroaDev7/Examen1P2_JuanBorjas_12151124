
package examen1p2_juanborjas_12151124;


public class SuperHumano extends Personas{
    private String superpoder;

    public SuperHumano() {
      super();
    }

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.superpoder = superpoder;
    }
    
     public SuperHumano( String nombre, String poder,  String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron,String superpoder) {
        super(nombre, poder, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return super.toString()+ "superpoder=" + superpoder ;
    }

    @Override
    public void FinalChance(Personas p1, Personas p2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
