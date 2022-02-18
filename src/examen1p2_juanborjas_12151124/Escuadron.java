
package examen1p2_juanborjas_12151124;

import java.util.ArrayList;


public class Escuadron {
    private String nombreesc,lugarBase;
    private Personas lider ;
    private String HeroeoVillano;
    ArrayList<Personas>miembros=new ArrayList();

    public Escuadron(String nombreesc, String lugarBase, String HeroeoVillano) {
        this.nombreesc = nombreesc;
        this.lugarBase = lugarBase;
        this.HeroeoVillano = HeroeoVillano;
    }

    public String getNombreesc() {
        return nombreesc;
    }

    public void setNombreesc(String nombreesc) {
        this.nombreesc = nombreesc;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public Personas getLider() {
        return lider;
    }

    public void setLider(Personas lider) {
        this.lider = lider;
    }

    public String getHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(String HeroeoVillano) {
        this.HeroeoVillano = HeroeoVillano;
    }

   

    public ArrayList<Personas> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Personas> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre escuadron=" + nombreesc + ", lugar Base=" + lugarBase + ", lider=" + lider + ", Heroe o Villano=" + HeroeoVillano + ", miembros=" + miembros + '}';
    }
    
    
    
}
