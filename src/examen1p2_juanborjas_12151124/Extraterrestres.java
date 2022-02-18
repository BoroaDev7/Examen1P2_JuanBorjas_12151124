
package examen1p2_juanborjas_12151124;


public abstract class Extraterrestres extends Personas {

    public Extraterrestres() {
    }

    public Extraterrestres(String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, fuerza, hablidadMental, habilidadFisica, tieneEscuadron);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

    
   
}
