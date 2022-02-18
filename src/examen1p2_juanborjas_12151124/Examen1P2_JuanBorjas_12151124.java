
package examen1p2_juanborjas_12151124;

import java.util.ArrayList;
import java.util.Scanner;


public class Examen1P2_JuanBorjas_12151124 {

     public static Scanner leer=new Scanner(System.in);
     public static  ArrayList<Personas>miembros=new ArrayList();
     public static ArrayList<Escuadron> escuadron=new ArrayList();
     public static ArrayList<Universo> universo;
     
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
     /*
     
     1. Opciones Universo

1.1 Crear

 1.2 Modificar

 1.3 Eliminar

 1.4 Listar

2. Opciones Escuadron

2.1 Crear

 2.2 Modificar

 2.3 Eliminar

 2.4 Listar

 2.5 Simular Batalla

3. Opciones Persona

1.1 Crear

 1.2 Modificar

 1.3 Eliminar

 1.4 Listar
     
     
     
     
     */
      public static void opciones(int opcion){
         if(opcion==0)
                System.exit(0); 
         if(opcion==1)
            opcionesUniverso(submenuUniverso());
            if(opcion==2)
               submenuEscuadron();
            if(opcion==3)
                submenuPersonas();
          
        
    }
      
      public static int submenuUniverso(){
          System.out.println("1.Crear"+
                             "2.Modificar"+
                             "3.Eliminar"+
                             "4.Listar");
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
         System.out.println("1.Crear"+
                             "2.Modificar"+
                             "3.Eliminar"+
                             "4.Listar");
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
      }
      
      public static void CrearEscuadron(){
          
      }
      
      
      public static int submenuPersonas(){
          
      } 
    
}
