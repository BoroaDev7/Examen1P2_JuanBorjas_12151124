
package examen1p2_juanborjas_12151124;

public class Alien extends Extraterrestres {
    private String planeta;

    public Alien() {
        super();
    }

    public Alien(String nombre, String poder,  String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron,String planeta) {
       super(nombre, poder, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return super.toString() + "planeta=" + planeta ;
    }

    @Override
    public void FinalChance(Personas p1, Personas p2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
