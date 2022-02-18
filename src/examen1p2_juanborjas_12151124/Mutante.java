
package examen1p2_juanborjas_12151124;

import java.util.ArrayList;


public class Mutante extends Personas {
    
    private ArrayList<String>factoresMutantes=new ArrayList();

    public Mutante() {
        super();
    }
    
    public Mutante( String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron,ArrayList<String>factoresMutantes) {
        super(nombre,  poder, debilidad,  HeroeoVillano,  fuerza,  hablidadMental,  habilidadFisica, tieneEscuadron);
        this.factoresMutantes=factoresMutantes;
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public String toString() {
        return super.toString()+ "factoresMutantes=" + factoresMutantes + '}';
    }

    @Override
    public void FinalChance(Personas p1, Personas p2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
