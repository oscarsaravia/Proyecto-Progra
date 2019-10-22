/*Driver.java
*/

import java.util.*;

public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Control con = new Control();
		int opcion;

		//Antes de entrar al ciclo, se hace la encuesta para siempre tener guardado un cultivo por lo menos
		System.out.println("Bienvenido\nPara comenzar con el proceso se necesitara que conteste las siguientes preguntas");
		System.out.println("En que clima esta ubicado?\n"); 
		System.out.print("1. Calido: presenta, a lo largo de todo el año, temperaturas elevadas. Se trata de un clima habitual en las sabanas, las selvas y los bosques tropicales.\n"); 
		System.out.print("2. Templado: caracterizado por temperaturas medias anuales que rondan los 15 grados centigrados\n"); 
		System.out.print("3. Frio: se caracteriza por mantener temperaturas bajas a lo largo del ano\n");
		int clima = scan.nextInt();
		System.out.println("En que departamento se encuentra?");
		con.getDept(clima);
		System.out.println("");
		scan.nextLine();
		String departamento = scan.nextLine();
		if(clima == 1){
			con.recibirCultivo("Calido", departamento);
			System.out.println(con.devolverCultivo("Calido", departamento)+"\n \n");
		}
		else if(clima == 2){
			con.recibirCultivo("Templado", departamento);
			System.out.println(con.devolverCultivo("Templado", departamento)+"\n \n");
		}
		else if(clima == 3){
			con.recibirCultivo("Frio", departamento);
			System.out.println(con.devolverCultivo("Frio", departamento)+"\n \n");
		}
		do{
			System.out.println("\nQue desea hacer?\n1. Conocer el cultivo que debe plantar\n2. Calendario de su cultivo\n3. Tutorial del cultivo\n4. Listado de cultivos\n5. Contactos\n6. Salir\n");
			opcion=scan.nextInt();
			switch(opcion){
				case 1:
				System.out.println("En que clima esta ubicado?\n"); 
				System.out.print("1. Calido: presenta, a lo largo de todo el año, temperaturas elevadas. Se trata de un clima habitual en las sabanas, las selvas y los bosques tropicales.\n"); 
				System.out.print("2. Templado: caracterizado por temperaturas medias anuales que rondan los 15 grados centigrados\n"); 
				System.out.print("3. Frio: se caracteriza por mantener temperaturas bajas a lo largo del ano\n");
				clima = scan.nextInt();
				System.out.println("En que departamento se encuentra?");
				con.getDept(clima);
				System.out.println("");
				scan.nextLine();
				departamento = scan.nextLine();
				if(clima == 1){
					con.recibirCultivo("Calido", departamento);
					System.out.println(con.devolverCultivo("Calido", departamento)+"\n \n");
				}
				else if(clima == 2){
					con.recibirCultivo("Templado", departamento);
					System.out.println(con.devolverCultivo("Templado", departamento)+"\n \n");
				}
				else if(clima == 3){
					con.recibirCultivo("Frio", departamento);
					System.out.println(con.devolverCultivo("Frio", departamento)+"\n \n");
				}
				break;

				case 2:
				con.opcionDos();
				break;

				case 3:
				con.opcionTres();
				break;

				/*case 4:
				System.out.println(con.opcionSeis());
				int caso = scan.nextInt();
				scan.nextLine();
				System.out.println(con.seisParteDos(caso));
				break;*/ //No implementado

				case 5:
				System.out.println(con.opcionCinco());
				break;

				case 6:
				System.out.println("\nGracias por utilizar los servicios, ha sido un gusto");
				break;
			}
		}
		while(opcion!=6);
	}
}