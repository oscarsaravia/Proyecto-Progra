//Oliver Josué de León Milian
//Clase Calendario
//Terra Plus
//Almacena cada una de las calendarizaciones correspondiente a cada uno de los cultivos.

public class Calendario {
    //Métodos 

    //Calendarización por cúltivo

    //Cardamomo
    //Frijol
    //Caña
    //Maíz
    //Café
    //Limón 
    //Tomate
    //Papa
    //Chile
    //Güisquil
    //Güicoy
    //Yuca
    //Aguacate
    //Rabano
    //Remolacha
    //Cebolla
  

//Calendarización Básica de Revisión de ciclos de protección y analisis de cultivo    
    public void Ciclos_Revision(){
        for (int i = 3; i < 25; i++){
            System.out.println(i+": Revisión mensual, para revisión de abono y suministro de agua");
        }
    }
    //Calendarización Básica de los cultivos
    public void Calendarizacion_Proceso_Basico(){
        System.out.println("CALENDARIZACIÓN DE PROCESO BÁSICO");
        System.out.println("Día 1: Realizar muestreos químicos del terreno (Consultar el apartado de contactos)");
        System.out.println("Día 1: Realizar muestreos químicos del agua potable (Consultar el apartado de contactos)");
        System.out.println("Día 10: Recoger resultados del muestreo químico");
        System.out.println("Día 11: Comentar con un experto químico o agronomo los resultados obtenidos (Consultar el apartado de contactos)");
        System.out.println("Día 15: Comenzar la labor de limpieza del terreno (Extracción de malas hierbas y plantación de árboles de sombra)");
        System.out.println("Día 17: Comprar el abono sugerido por el programa, o el sugerido por el experto al que ha consultado (Consultar el apartado de contactos)");
        System.out.println("Día 19: Comenzar los arreglos químicos, que puedan resolver el estado químico desequilibrado del agua o la tierra");
        System.out.println("Día 21: Crear un depósito de agua, si hay un pre-existente, asegurarse de ubicarlo al menos a 2.5 metros de altura");
        System.out.println("Día 22: Crear un sistema de riego proveniente del depósito de agua, la altura permitirá mitigar el uso de una bomba de presión");
        System.out.println("Si se requiriera una bomba de agua, puede consultar el apartado de contactos");
    }
    //Información de fechas para Cardamomo}
    public void Cardamomo(){
        System.out.println("Día 23: Comprar los pilones de árbol, que servirán para sombra");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tamaño de estos árboles debe ocupar un espacio promedio de 8 metros cuadrados")
        System.out.println("2do Mes: Colocar los pilones de cardamomo debajo de los árboles plantados hace 1 mes");
        Ciclos_Revision();
        System.out.println("2do año: Realizar estudio químico de hoja");
        System.out.println("2do año, 15 días: Consultar con un experto químico o agronomo acerca de las necesidades del cultivo en función del estudio químico");
        
    }
     //Información de fechas para Frijol
    public void Frijol(){
        System.out.println("Día 23: Comprar los frijoles, para sembrar");
        System.out.printlm("IMPORTANTE: Se recomienda haber plantado anteriormente maíz, de esta forma existirán soportes para el frijol");
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
        Ciclos_Revision();
        
    }
     //Información de fechas para Chile
    public void Chile(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Güisquil
    public void Guisquil(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Güicoy
    public void Guicoy(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Yuca
    public void Yuca(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Aguacate
    public void Aguacate(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Rabano
    public void Rabano(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Remolacha
    public void Remolacha(){
        Ciclos_Revision();
        
    }
     //Información de fechas para Cebolla
    public void Cebolla(){
        Ciclos_Revision();
        
    }

}