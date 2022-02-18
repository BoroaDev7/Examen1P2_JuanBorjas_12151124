
package examen1p2_juanborjas_12151124;

public class Personas {
    private String nombre,poder,debilidad,HeroeoVillano;
    private int fuerza,hablidadMental,habilidadFisica;
    private boolean tieneEscuadron;

    public Personas() {
    }

    public Personas(String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int hablidadMental, int habilidadFisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.HeroeoVillano = HeroeoVillano;
        this.fuerza = fuerza;
        this.hablidadMental = hablidadMental;
        this.habilidadFisica = habilidadFisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(String HeroeoVillano) {
        this.HeroeoVillano = HeroeoVillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHablidadMental() {
        return hablidadMental;
    }

    public void setHablidadMental(int hablidadMental) {
        this.hablidadMental = hablidadMental;
    }

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HeroeoVillano=" + HeroeoVillano + ", fuerza=" + fuerza + ", hablidadMental=" + hablidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }
    
    
}
