
package examen1p2_juanborjas_12151124;


public class Deidad extends Extraterrestres{
    private boolean tieneCreyentes;
    private String Religion;

    public Deidad() {
        super();
    }

    public Deidad( String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron,boolean tieneCreyentes, String Religion) {
        super(nombre, poder, debilidad, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.tieneCreyentes = tieneCreyentes;
        this.Religion = Religion;
    }

    public Deidad( String nombre, String poder, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron,boolean tieneCreyentes, String Religion) {
        super(nombre, poder, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.tieneCreyentes = tieneCreyentes;
        this.Religion = Religion;
    }

    
    
    @Override
    public void FinalChance(Personas p1, Personas p2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}
