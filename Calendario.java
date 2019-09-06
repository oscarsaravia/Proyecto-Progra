//Oliver Josu� de Le�n Milian
//Clase Calendario
//Terra Plus
//Almacena cada una de las calendarizaciones correspondiente a cada uno de los cultivos.

public class Calendario {
    //M�todos 

    //Calendarizaci�n por c�ltivo

    //Cardamomo
    //Frijol
    //Ca�a
    //Ma�z
    //Caf�
    //Lim�n 
    //Tomate
    //Papa
    //Chile
    //G�isquil
    //G�icoy
    //Yuca
    //Aguacate
    //Rabano
    //Remolacha
    //Cebolla
  

//Calendarizaci�n B�sica de Revisi�n de ciclos de protecci�n y analisis de cultivo    
    public void Ciclos_Revision(){
        for (int i = 3; i < 25; i++){
            System.out.println(i+": Revisi�n mensual, para revisi�n de abono y suministro de agua");
        }
    }
    //Calendarizaci�n B�sica de los cultivos
    public void Calendarizacion_Proceso_Basico(){
        System.out.println("CALENDARIZACI�N DE PROCESO B�SICO");
        System.out.println("D�a 1: Realizar muestreos qu�micos del terreno (Consultar el apartado de contactos)");
        System.out.println("D�a 1: Realizar muestreos qu�micos del agua potable (Consultar el apartado de contactos)");
        System.out.println("D�a 10: Recoger resultados del muestreo qu�mico");
        System.out.println("D�a 11: Comentar con un experto qu�mico o agronomo los resultados obtenidos (Consultar el apartado de contactos)");
        System.out.println("D�a 15: Comenzar la labor de limpieza del terreno (Extracci�n de malas hierbas y plantaci�n de �rboles de sombra)");
        System.out.println("D�a 17: Comprar el abono sugerido por el programa, o el sugerido por el experto al que ha consultado (Consultar el apartado de contactos)");
        System.out.println("D�a 19: Comenzar los arreglos qu�micos, que puedan resolver el estado qu�mico desequilibrado del agua o la tierra");
        System.out.println("D�a 21: Crear un dep�sito de agua, si hay un pre-existente, asegurarse de ubicarlo al menos a 2.5 metros de altura");
        System.out.println("D�a 22: Crear un sistema de riego proveniente del dep�sito de agua, la altura permitir� mitigar el uso de una bomba de presi�n");
        System.out.println("Si se requiriera una bomba de agua, puede consultar el apartado de contactos");
    }
    //Informaci�n de fechas para Cardamomo}
    public void Cardamomo(){
        System.out.println("D�a 23: Comprar los pilones de �rbol, que servir�n para sombra");
        System.out.println("IMPORTANTE: Tomar en cuenta que el tama�o de estos �rboles debe ocupar un espacio promedio de 8 metros cuadrados");
        System.out.println("2do Mes: Colocar los pilones de cardamomo debajo de los �rboles plantados hace 1 mes");
        Ciclos_Revision();
        System.out.println("2do a�o: Realizar estudio qu�mico de hoja");
        System.out.println("2do a�o, 15 d�as: Consultar con un experto qu�mico o agronomo acerca de las necesidades del cultivo en funci�n del estudio qu�mico");
        
    }
     //Informaci�n de fechas para Frijol
    public void Frijol(){
        System.out.println("D�a 23: Comprar los frijoles, para sembrar");
        System.out.println("IMPORTANTE: Se recomienda haber plantado anteriormente ma�z, de esta forma existir�n soportes para el frijol");
        Ciclos_Revision();
        System.out.println("1er semestre: Realizar estudio qu�mico de hoja");
        System.out.println("1er semestre, 15 d�as: Consultar con un experto qu�mico o agronomo acerca de las necesidades del cultivo en funci�n del estudio qu�mico");
    }
     //Informaci�n de fechas para Ca�a
    public void Cana(){
        System.out.println("D�a 23: Comprar los pilones de ca�a de az�car, sembrar posteriormente");
        System.out.println("D�a 25: Regar el terreno con abundante agua");
        Ciclos_Revision();
        System.out.println("1er a�o: Realizar estudio qu�mico de hoja");
        System.out.println("1er a�o, 15 d�as: Consultar con un experto qu�mico o agronomo acerca de las necesidades del cultivo en funci�n del estudio qu�mico");
        System.out.println("IMPORTANTE: Reiniciar el ciclo de crecimiento para cada pilon cada 10 a�os");    
    }
     //Informaci�n de fechas para Ma�z
    public void Maiz(){
        System.out.println("D�a 23: Comprar los pilones de ma�z, sembrar posteriormente");
        Ciclos_Revision();
        System.out.println("1er Semestre: Fin de periodo de crecimiento");

        
    }
     //Informaci�n de fechas para Caf�
    public void Cafe(){
        System.out.println("D�a 23: Comprar los pilones de caf�, sembrar posteriormente");
        Ciclos_Revision();
        System.out.println("4to a�o: Fin de crecimiento, reiniciar ciclo");

        
    }
     //Informaci�n de fechas para Limon
    public void Limon(){
        System.out.println("D�a 23: Comprar los pilones de lim�n, sembrar posteriormente");
        System.out.println("D�a 25: Regar el terreno con abundante agua");
        Ciclos_Revision();
        System.out.println("2do a�o: Realizar estudio qu�mico de hoja");
        System.out.println("2do a�o, 15 d�as: Consultar con un experto qu�mico o agronomo acerca de las necesidades del cultivo en funci�n del estudio qu�mico");
        System.out.println("IMPORTANTE: Reiniciar el ciclo de crecimiento para cada pilon cada 10 a�os");    
        
    }
     //Informaci�n de fechas para Tomate
    public void Tomate(){
        System.out.println("D�a 23: Montar carpas, para mayor rendimiento y evasi�n de plagas");
        System.out.println("D�a 26: Comprar las semillas de tomate");
        System.out.println("D�a 27: Configurar sistemas de riego");
        Ciclos_Revision();
       
        
    }
     //Informaci�n de fechas para Papa
    public void Papa(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Chile
    public void Chile(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para G�isquil
    public void Guisquil(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para G�icoy
    public void Guicoy(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Yuca
    public void Yuca(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Aguacate
    public void Aguacate(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Rabano
    public void Rabano(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Remolacha
    public void Remolacha(){
        Ciclos_Revision();
        
    }
     //Informaci�n de fechas para Cebolla
    public void Cebolla(){
        Ciclos_Revision();
        
    }

}