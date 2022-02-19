
package examen1p2_juanborjas_12151124;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Examen1P2_JuanBorjas_12151124 {

     public static Scanner leer =new Scanner(System.in);
     public static  ArrayList<Personas>miembros=new ArrayList();
     public static ArrayList<Escuadron> escuadron=new ArrayList();
     public static ArrayList<Universo> universo=new ArrayList();
     
    public static void main(String[] args) {
       
        
        do{
            opciones( menu() );
        }while(true);
        
    }
    
     public static int menu(){

         System.out.println("");
        System.out.println("");
        System.out.println("Bienvenido");
        System.out.println( "0.Salir\n"+
                            "1.Opciones Universo\n"+
                           " 2.Opciones Escuadron\n"+
                           " 3.Opciones Personas\n"
                           
                                    );
        
        System.out.println("Porfavor ingrese una opcion ");
        return leer.nextInt();
    }
  
      public static void opciones(int opcion){
         if(opcion==0)
                System.exit(0); 
         if(opcion==1)
            opcionesUniverso(submenuUniverso());
            if(opcion==2)
               opcionesEscuadron(submenuEscuadron());
            if(opcion==3)
                opcionesPersonas(submenuPersonas());
          
        
    }
      
      public static int submenuUniverso(){
          System.out.println("1.Crear\n"+
                             "2.Modificar\n"+
                             "3.Eliminar\n"+
                             "4.Listar\n");
          System.out.println("Ingrese la opcion: ");
          return leer.nextInt();
      } 
     
      public static void opcionesUniverso(int opcion1){
          if(opcion1==1)
            CrearUniverso();
            if(opcion1==2)
               ModificarUniverso();
            if(opcion1==3)
                EliminarUniverso();
          if(opcion1==4)
                ListarUniverso();
      }
      
      public static void CrearUniverso(){
          System.out.println("Ingrese el nombre");
          String nombreUni=leer.next();
          Universo uni=new Universo(nombreUni);
         universo.add(uni);

      }
      public static void ModificarUniverso(){
          System.out.println("Ingrese la posicion del universo que quiere modificar");
          int pos=leer.nextInt();
          System.out.println("Ingrese el nombre nuevo");
          universo.get(pos).setNombre(leer.next());
          System.out.println("Asigne uno o mas escuadrones");
          System.out.println("");
          System.out.println("Ingrese la posicion del escuadron a asignar");
          int posi=leer.nextInt();
          universo.get(pos).setSquads(((Escuadron)escuadron.get(posi)));
 
      }
      
      public static void EliminarUniverso(){
          System.out.println("Ingrese la posicion del universo a eliminar");
          int pos=leer.nextInt();
          universo.remove(pos);
      }
      
      public static void ListarUniverso(){
          for (Universo uni : universo) {
              System.out.println(uni.toString());
              
          }
                 
          
      }
      public static int submenuEscuadron(){
         System.out.println("1.Crear\n"+
                             "2.Modificar\n"+
                             "3.Eliminar\n"+
                             "4.Listar\n"+
                              "5.Agregar personas\n");
          System.out.println("Ingrese la opcion: ");
          return leer.nextInt(); 
      } 
      public static void opcionesEscuadron(int opcion1){
          if(opcion1==1)
            CrearEscuadron();
            if(opcion1==2)
               ModificarEscuadron();
            if(opcion1==3)
                EliminarEscuadron();
          if(opcion1==4)
                ListarEscuadron();
            if(opcion1==5)
                AgregarPersonas();
      }
      
      public static void CrearEscuadron(){
          System.out.println("Ingrese el nombre del escuadron");
          String nombreEscuadron=leer.next();
          System.out.println("Ingrese el lugar de la base");  
          String lugarBase=leer.next();
          System.out.println("Ingrese el si los miembros son villanos o heroes");
          String tipoEsc=leer.next();
            Escuadron squad=new Escuadron(nombreEscuadron,lugarBase,tipoEsc);
            escuadron.add(squad);
      }
      public static void ModificarEscuadron(){
          System.out.println("Ingrese la posicion del escuadron a modificar");
          int posSquad=leer.nextInt();
          System.out.println("Ingrese el nuevonombre del escuadron");
          escuadron.get(posSquad).setNombreesc(leer.next());
          System.out.println("Ingrese el nuevo lugar de la base");  
          escuadron.get(posSquad).setLugarBase(leer.next());
          System.out.println("Ingrese el si los miembros son villanos o heroes");
          escuadron.get(posSquad).setHeroeoVillano(leer.next());
         
          }
      
      public static void EliminarEscuadron(){
          System.out.println("Ingrese la posicion del Escuadron a eliminar");
          int posEsc=leer.nextInt();
          escuadron.remove(posEsc);
      }
          
      public static void ListarEscuadron(){
          for (Escuadron squad : escuadron) {
              System.out.println(squad.getNombreesc());
              System.out.println(squad.getLugarBase());
          }  
      }
      public static void AgregarPersonas(){
          System.out.println("Ingrese la posicion del escuadron ");
          int posSquad=leer.nextInt();
          System.out.println("Ingrese la posicion de los miembros a asignar");
          int posEsc=leer.nextInt();
          if(miembros.get(posEsc).getHeroeoVillano().equals(escuadron.get(posSquad).getHeroeoVillano())){
              escuadron.get(posSquad).setMiembros(((Personas)miembros.get(posEsc)));
              System.out.println("¿Le gustaria Agregar mas miembros?");
          String respuesta=leer.next();
          while(respuesta.equals("Si")||respuesta.equals("si")){
              System.out.println("Ingrese la posicion de los miembros a asignar");
           posEsc=leer.nextInt();
           if(miembros.get(posEsc).getHeroeoVillano().equals(escuadron.get(posSquad).getHeroeoVillano())){
              escuadron.get(posSquad).setMiembros(((Personas)miembros.get(posEsc)));
          escuadron.get(posSquad).setMiembros(((Personas)miembros.get(posEsc)));
           }
          System.out.println("¿Le gustaria Agregar mas miembros?");
            respuesta=leer.next();
          } 
          }
          else{
              System.out.println("El tipo de escuadron y el tipo de Heroe no son lo mismo");
          }
          
      }
 
     public static int submenuPersonas(){
         System.out.println("1.Crear\n"+
                             "2.Modificar\n"+
                             "3.Eliminar\n"+
                             "4.Listar\n"
                             );
          System.out.println("Ingrese la opcion: ");
          return leer.nextInt(); 
      } 
    
    public static void opcionesPersonas(int opcion1){
          if(opcion1==1)
            CrearPersona();
            if(opcion1==2)
               ModificarPersona();
            if(opcion1==3)
                EliminarPersona();
          if(opcion1==4)
                ListarPersona();
      }
    
    
    public static void CrearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre=leer.next();
        if(verificarNombre(nombre)){
            System.out.println("Dos personas no pueden tener el mismo nombre");
            System.out.println("");
             System.out.println("Ingrese el nombre de la persona");
        }
        System.out.println("Ingrese si es heroe o villano");
        String HeroeoVillano=leer.next();
        if(HeroeoVillano.equals("Heroe")||HeroeoVillano.equals("heroe")){
            System.out.println("Ingrese el poder del heroe");
            String poder=leer.next();
             System.out.println("Ingrese de que tipo es el heroe");
            String tipo=leer.next();
            System.out.println("Ingrese la fuerza");
            int fuerza=leer.nextInt();
            System.out.println("Ingrese la habilidad mental");
            int habilidadMental=leer.nextInt();
            System.out.println("Ingrese la habilidad Fisica");
            int habilidadFisica=leer.nextInt();
           
            
            if(tipo.equalsIgnoreCase("Persona Normal")){
              boolean tienesquad=false;
            Personas heroes=new PersonaNormal(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad);
            miembros.add(heroes);
            }      
            
           else if(tipo.equalsIgnoreCase("Mutante")){
                ArrayList<String>fact=new ArrayList();
                System.out.println("Ingrese los factores mutantes");
                fact.add(leer.next());
              boolean tienesquad=false;
            Personas heroes=new Mutante (nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,fact);
            miembros.add(heroes);
            }   
            else if(tipo.equalsIgnoreCase("Super Humano")){
                System.out.println("Ingrese el super Poder");
                String superPoder=leer.next();
              boolean tienesquad=false;
            Personas heroes=new SuperHumano(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,superPoder);
            miembros.add(heroes);
            }
            
            else if(tipo.equalsIgnoreCase("Por Accidente Radioactivo")){
                System.out.println("Ingrese la edad ");
                int edad=leer.nextInt();
                System.out.println("Ingrese el tipo de accidente");
                String tipoAc=leer.nextLine();
                boolean tienesquad=false;
            Personas heroes=new PorAccidenteRadiactivo(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,edad,tipoAc);
            miembros.add(heroes);
            }
            else if(tipo.equalsIgnoreCase("Por Accidente Radioactivo")){
                System.out.println("Ingrese la edad ");
                int edad=leer.nextInt();
                System.out.println("Ingrese el tipo de accidente");
                String tipoAc=leer.nextLine();
                boolean tienesquad=false;
            Personas heroes=new PorAccidenteRadiactivo(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,edad,tipoAc);
            miembros.add(heroes);
            }
            else if (tipo.equalsIgnoreCase("Alien")){
                System.out.println("Ingrese el planeta");
                String planeta=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Alien(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,planeta);
            miembros.add(heroes);
            }
            else if (tipo.equalsIgnoreCase("Deidad")){
                boolean creyentes;
                System.out.println("Ingrese si tiene creyentes");
                String crey=leer.next();
                if(crey.equalsIgnoreCase("si")){
                    creyentes=true;
                    System.out.println("Ingrese la religion");
                String religion=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Deidad(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,creyentes,religion);
            miembros.add(heroes);
                }else{
                    creyentes=false;
                    System.out.println("Ingrese la religion");
                String religion=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Deidad(nombre,HeroeoVillano,poder,fuerza,habilidadMental,habilidadFisica,tienesquad,creyentes,religion);
            miembros.add(heroes);
                }
                
            }
        } else  if(HeroeoVillano.equalsIgnoreCase("villano")){
            System.out.println("Ingrese la debilidad del heroe");
            String debilidad=leer.next();
             System.out.println("Ingrese de que tipo es el heroe");
            String tipo=leer.next();
            System.out.println("Ingrese la fuerza");
            int fuerza=leer.nextInt();
            System.out.println("Ingrese la habilidad mental");
            int habilidadMental=leer.nextInt();
            System.out.println("Ingrese la habilidad Fisica");
            int habilidadFisica=leer.nextInt();
           
            
            if(tipo.equalsIgnoreCase("Persona Normal")){
              boolean tienesquad=false;
            Personas heroes=new PersonaNormal(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad);
            miembros.add(heroes);
            }      
            
           else if(tipo.equalsIgnoreCase("Mutante")){
                ArrayList<String>fact=new ArrayList();
                System.out.println("Ingrese los factores mutantes");
                fact.add(leer.nextLine());
              boolean tienesquad=false;
            Personas heroes=new Mutante (nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,fact);
            miembros.add(heroes);
            }   
            else if(tipo.equalsIgnoreCase("Super Humano")){
                System.out.println("Ingrese el super Poder");
                String superPoder=leer.next();
              boolean tienesquad=false;
            Personas heroes=new SuperHumano(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,superPoder);
            miembros.add(heroes);
            }
            
            else if(tipo.equalsIgnoreCase("Por Accidente Radioactivo")){
                System.out.println("Ingrese la edad ");
                int edad=leer.nextInt();
                System.out.println("Ingrese el tipo de accidente");
                String tipoAc=leer.nextLine();
                boolean tienesquad=false;
            Personas heroes=new PorAccidenteRadiactivo(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,edad,tipoAc);
            miembros.add(heroes);
            }
            else if(tipo.equalsIgnoreCase("Por Accidente Radioactivo")){
                System.out.println("Ingrese la edad ");
                int edad=leer.nextInt();
                System.out.println("Ingrese el tipo de accidente");
                String tipoAc=leer.nextLine();
                boolean tienesquad=false;
            Personas heroes=new PorAccidenteRadiactivo(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,edad,tipoAc);
            miembros.add(heroes);
            }
            else if (tipo.equalsIgnoreCase("Alien")){
                System.out.println("Ingrese el planeta");
                String planeta=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Alien(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,planeta);
            miembros.add(heroes);
            }
            else if (tipo.equalsIgnoreCase("Deidad")){
                boolean creyentes;
                System.out.println("Ingrese si tiene creyentes");
                String crey=leer.next();
                if(crey.equalsIgnoreCase("si")){
                    creyentes=true;
                    System.out.println("Ingrese la religion");
                String religion=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Deidad(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,creyentes,religion);
            miembros.add(heroes);
                }else{
                    creyentes=false;
                    System.out.println("Ingrese la religion");
                String religion=leer.next();
                boolean tienesquad=false;
            Personas heroes=new Deidad(nombre,HeroeoVillano,debilidad,fuerza,habilidadMental,habilidadFisica,tienesquad,creyentes,religion);
            miembros.add(heroes);
                }
                
            }
        }
        

    }
    

     public static boolean verificarNombre(String nombre){
        for(Personas persona:miembros){
            if(persona.getNombre().equals(nombre)){
               return true;
            }
        }
       return false;
    }
     
   public static void ModificarPersona(){
       System.out.println("Ingrese la posicion de la persona a modificar");
       int posPer=leer.nextInt();
        System.out.println("Ingrese el nuevo nombre de la persona");
        miembros.get(posPer).setNombre(leer.next());
        if(verificarNombre(miembros.get(posPer).getNombre())){
            System.out.println("Dos personas no pueden tener el mismo nombre");
            System.out.println("");
             System.out.println("Ingrese el nombre de la persona");
        }
        System.out.println("Ingrese si es heroe o villano");
       miembros.get(posPer).setHeroeoVillano(leer.next());
        if(miembros.get(posPer).getHeroeoVillano().equalsIgnoreCase("Heroe")){
            System.out.println("Ingrese el poder del heroe");
           miembros.get(posPer).setPoder(leer.next());
            System.out.println("Ingrese la fuerza");
            miembros.get(posPer).setFuerza(leer.nextInt());
            System.out.println("Ingrese la habilidad mental");
            miembros.get(posPer).setHablidadMental(leer.nextInt());
            System.out.println("Ingrese la habilidad Fisica");
            miembros.get(posPer).setHabilidadFisica(leer.nextInt());
        }
        if(miembros.get(posPer).getHeroeoVillano().equalsIgnoreCase("Villano")){
            System.out.println("Ingrese la debilidad del heroe");
           miembros.get(posPer).setDebilidad(leer.next());
            System.out.println("Ingrese la fuerza");
            miembros.get(posPer).setFuerza(leer.nextInt());
            System.out.println("Ingrese la habilidad mental");
            miembros.get(posPer).setHablidadMental(leer.nextInt());
            System.out.println("Ingrese la habilidad Fisica");
            miembros.get(posPer).setHabilidadFisica(leer.nextInt());
        }
   }
   
   public static void EliminarPersona(){
       System.out.println("Ingrese la posicion de la persona a eliminar");
       int posPers=leer.nextInt();
       miembros.remove(posPers);
       
   }
   
   public static void ListarPersona(){
          for (Personas personas : miembros) {
             if(personas.getHeroeoVillano().equalsIgnoreCase("heroe")){
                 System.out.println("Heroes: "+personas.getNombre()+" "+ personas.getPoder());
             }
             else{
               System.out.println("Villanos: "+personas.getNombre()+" "+ personas.getDebilidad());
          }  
      }
   
   
   
   }
    
}
