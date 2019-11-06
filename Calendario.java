//Autor: Oliver Josué de León Milian
//Clase: Calendario
//PROYECTO "Terra Plus"
//FUNCION DE CLASE:
//Almacena todos los metodos que guardan dentro de si la informacion de cuido y progresion de cada uno 
//de los cultivos.


//Imports
import java.util.Scanner;

public class Calendario implements General{
    //Embajadores de Clase
    Scanner sc = new Scanner(System.in);
    Cultivo CT = new Cultivo();
    
    //_______________________________________________________________________________________________________________________
    //DIALOGOS DE LA OPCION CALENDARIO

    public void MenuCalendarioDialogo(){
        System.out.println("\n_____________________________________");
        System.out.println(" BIENVENIDO AL AREA DE CALENDARIO");
        System.out.println("_____________________________________");
        System.out.println("\n1) CALENDARIZACION DIARIA");
        System.out.println("2) CALENDARIZACION MENSUAL");
        System.out.println("3) CALENDARIZACION ANUAL");
        System.out.println("4) SALIR");
        System.out.println("\nINGRESE UNA OPCION:");
    }  
    //Calendarización Básica de los Cultivos
    public void CalendarizacionProcesoBasico(){
        String input = "";
        System.out.println("\n____________________________________");
        System.out.println(" CALENDARIZACIÓN DE PROCESO BASICO");
        System.out.println("____________________________________");
        
        //DIA 1
        System.out.println("\nDía 1: Realizar muestreos químicos del terreno (Consultar el apartado de contactos)");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        System.out.println("\nDía 1: Realizar muestreos químicos del agua potable (Consultar el apartado de contactos)");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 10
        System.out.println("\nDía 10: Recoger resultados del muestreo químico");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 11
        System.out.println("\nDía 11: Comentar con un experto químico o agronomo los resultados obtenidos (Consultar el apartado de contactos)");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 15
        System.out.println("\nDía 15: Comenzar la labor de limpieza del terreno (Extracción de malas hierbas y plantación de árboles de sombra)");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 17
        System.out.println("\nDía 17: Comprar el abono sugerido por el programa, o el sugerido por el experto al que ha consultado (Consultar el apartado de contactos)");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 19
        System.out.println("\nDía 19: Comenzar los arreglos químicos, que puedan resolver el estado químico desequilibrado del agua o la tierra");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 21
        System.out.println("\nDía 21: Crear un depósito de agua, si hay un pre-existente, asegurarse de ubicarlo al menos a 2.5 metros de altura");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //DIA 22
        System.out.println("\nDía 22: Crear un sistema de riego proveniente del depósito de agua, la altura permitirá mitigar el uso de una bomba de presión");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
        //OTROS
        System.out.println("\nSi se requiriera una bomba de agua, puede consultar el apartado de contactos");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        input = sc.nextLine();
    }
    //CALENDARIZACION ANUAL
    public void CalendarizacionAnualDialogo(){
        String entrada = "";
        System.out.println("\n____________________________________");
        System.out.println("       CALENDARIZACION ANUAL");
        System.out.println("____________________________________");
        //1ER AÑO
        System.out.println("\n1ER ) MANTENER LOS PROCESOS ORDINALES");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        entrada = sc.nextLine();
        //2DO AÑO
        System.out.println("\n2DO ) REALIZAR ESTUDIO DE HOJA");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        entrada = sc.nextLine();
        //6TO AÑO
        System.out.println("\n6TO) RENOVAR CULTIVO Y MANTENER CICLOS NUEVAMENTE");
        System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
        entrada = sc.nextLine();
        
    }

    //Información de fechas para Cardamomo}
    public void Cardamomo(){
        System.out.println("Día 23: Comprar los pilones de árbol, que servirán para sombra");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de estos árboles debe ocupar un espacio promedio de 8 metros cuadrados");
        System.out.println("2do Mes: Colocar los pilones de cardamomo debajo de los árboles plantados hace 1 mes");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }
     //Información de fechas para Frijol
    public void Frijol(){
        System.out.println("Día 23: Comprar los frijoles, para sembrar");
        System.out.println("IMPORTANTE: Se recomienda haber plantado anteriormente maíz, de esta forma existirán soportes para el frijol");
        Ciclos_Revision();
        System.out.println("1er semestre: Realizar estudio químico de hoja");
        System.out.println("1er semestre, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
    }

     //Información de fechas para Caña
    public void Cana(){
        System.out.println("Día 23: Comprar los pilones de caña de azúcar, sembrar posteriormente");
        System.out.println("Día 25: Regar el terreno con abundante agua");
        Ciclos_Revision();
        System.out.println("1er año: Realizar estudio químico de hoja");
        System.out.println("1er año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        System.out.println("IMPORTANTE: Reiniciar el ciclo de crecimiento para cada pilon cada 10 años");    
    }

     //Información de fechas para Maíz
    public void Maiz(){
        System.out.println("Día 23: Comprar los pilones de maíz, sembrar posteriormente");
        Ciclos_Revision();
        System.out.println("1er Semestre: Fin de periodo de crecimiento");

        
    }

     //Información de fechas para Café
    public void Cafe(){
        System.out.println("Día 23: Comprar los pilones de café, sembrar posteriormente");
        Ciclos_Revision();
        System.out.println("4to año: Fin de crecimiento, reiniciar ciclo");

        
    }

     //Información de fechas para Limon
    public void Limon(){
        System.out.println("Día 23: Comprar los pilones de limón, sembrar posteriormente");
        System.out.println("Día 25: Regar el terreno con abundante agua");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        System.out.println("IMPORTANTE: Reiniciar el ciclo de crecimiento para cada pilon cada 10 años");    
        
    }

     //Información de fechas para Tomate
    public void Tomate(){
        System.out.println("Día 23: Montar carpas, para mayor rendimiento y evasión de plagas");
        System.out.println("Día 26: Comprar las semillas de tomate");
        System.out.println("Día 27: Configurar sistemas de riego");
        Ciclos_Revision();
       
        
    }

     //Información de fechas para Papa
    public void Papa(){
        System.out.println("Día 23: Comprar los pilones de papa");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de estos pilones debe ocupar un espacio promedio de 0.5 metros cuadrados");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Chile
    public void Chile(){
        System.out.println("Día 23: Comprar los pilones de chile, para evitar cuidades tediosos e intensivos");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de estos pilones variara en funcion del relieve del terreno");
        System.out.println("2do Mes: Colocar los pilones bajo observacion");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Güisquil
    public void Guisquil(){
        System.out.println("Día 23: Comprar los pilones de guisquil, y plantar junto a la enredadera");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de la cerca influenciara en el crecimiento del pilon");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Güicoy
    public void Guicoy(){
        System.out.println("Día 23: Comprar los pilones de guicoy");
        System.out.println("IMPORTANTE: Un riego desmedido puede echar a perder la siembra");
        System.out.println("2do Mes: Colocar los pilones en observacion");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Yuca
    public void Yuca(){
        System.out.println("Día 23: Comprar los pilones de Yuca");
        System.out.println("IMPORTANTE: Tomar en cuenta que la yuca al ser raiz es propensa a los cambios de pH");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Aguacate
    public void Aguacate(){
        System.out.println("Día 23: Comprar los pilones de árbol");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de estos árboles debe ocupar un espacio promedio de 8 metros cuadrados");
        System.out.println("2do Mes: Colocar los pilones de aguacate en observacion 1 mes");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Rabano
    public void Rabano(){
        System.out.println("Día 23: Comprar los pilones de rabano");
        System.out.println("IMPORTANTE: Tomar en cuenta que el pH variante del agua y tierra");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Remolacha
    public void Remolacha(){
        System.out.println("Día 23: Comprar los pilones de remolacha");
        System.out.println("IMPORTANTE: Requiere de humedad progresiva");
        System.out.println("2do Mes: Colocar los pilones bajo estudio de humedad y pH");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }

     //Información de fechas para Cebolla
    public void Cebolla(){
        System.out.println("Día 23: Comprar los pilones de cebolla");
        System.out.println("IMPORTANTE: Consultar a un experto en cuanto al abono del cultivo");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }
    
    //_________________________________________________________________________________________________________________________
    //FUNCIONES OPERACIONALES
    
    //Menu Principal de Calendario
    public void MenuCalendario(int Opcion){
       
        //CALENDARIZACION DIARIA
        if(Opcion == 1){
            CalendarizacionProcesoBasico();
        //CALENDARIZACION MENSUAL
        }else if (Opcion == 2){
            CalendarioCultivos(CT.getCultivo());
        //CALENDARIZACION ANUAL
        }else if (Opcion == 3){
            CalendarizacionAnualDialogo();
        }
    }
  

//Calendarización Básica de Revisión de ciclos de protección y analisis de cultivo    
    public void Ciclos_Revision(){
        for (int i = 3; i < 25; i++){
            String in = "";
            System.out.println(i+": Revisión mensual, para revisión de abono y suministro de agua");
            System.out.println("PRESIONE [ENTER] PARA CONTINUAR");
            in = sc.nextLine();
        }
    }
    // CONDICIONALES PARA CALENDARIO DE CULTIVOS

    public void CalendarioCultivos(String Cultivo){
        if(Cultivo.equalsIgnoreCase("cardamomo")) {
			Cardamomo();
		}
		else if(Cultivo.equalsIgnoreCase("frijol")) {
			Frijol();
		}
		else if(Cultivo.equalsIgnoreCase("maiz")) {
			Maiz();
		}
		else if(Cultivo.equalsIgnoreCase("cafe")) {
			Cafe();
		}
		else if(Cultivo.equalsIgnoreCase("limon")) {
			Limon();
		}
		else if(Cultivo.equalsIgnoreCase("tomate")) {
			Tomate();
		}
		else if(Cultivo.equalsIgnoreCase("papa")){
			Papa();
		}
		else if(Cultivo.equalsIgnoreCase("chile")) {
			Chile();
		}
		else if(Cultivo.equalsIgnoreCase("guisquil")) {
			Guisquil();
		}
		else if(Cultivo.equalsIgnoreCase("guicoy")) {
			Guicoy();
		}
		else if(Cultivo.equalsIgnoreCase("yuca")) {
			Yuca();
		}
		else if(Cultivo.equalsIgnoreCase("aguacate")) {
			Aguacate();
		}
		else if(Cultivo.equalsIgnoreCase("rabano")) {
			Rabano();
		}
		else if(Cultivo.equalsIgnoreCase("remolacha")) {
			Remolacha();
		}
		else if(Cultivo.equalsIgnoreCase("cebolla")) {
			Cebolla();
		}
    }
}
