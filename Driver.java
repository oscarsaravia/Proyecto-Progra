/*Driver.java
*/

import java.util.*;

public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Control con = new Control();
		int opcion;

		do{
			System.out.println("Bienvenido\n Que desea hacer?\n 1. Conocer el cultivo que debe plantar\n 2. Calendario de su cultivo\n 3. Tutorial del cultivo\n 4. Salir\n 5. Listado de cultivos\n 6. Contactos");
			opcion=scan.nextInt();
			switch(opcion){
				case 1:
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
				break;

				case 2:
				con.opcionDos();
				break;

				case 3:
				con.opcionTres();
				break;

				case 4:
				System.out.println("\nGracias por utilizar los servicios, ha sido un gusto");
				break;

				case 5:
				System.out.println(con.opcionCinco());
				break;

				/*case 6:
				System.out.println(con.opcionSeis());
				int caso = scan.nextInt();
				scan.nextLine();
				System.out.println(con.seisParteDos(caso));
				break;*/ //No implementado
			}
		}
		while(opcion!=4);
	}
}