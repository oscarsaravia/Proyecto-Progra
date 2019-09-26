/*Driver.java
*/

import java.util.*;

public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Control con = new Control();
		int opcion;

		do{
			System.out.println("Bienvenido\n Que desea hacer?\n 1. Conocer el cultivo que debe plantar\n 2. Calendario de su cultivo\n 3. Tutorial del cultivo\n 4. Salir");
			opcion=scan.nextInt();
			switch(opcion){
				case 1:
				System.out.println("En que clima esta ubicado?\n 1. Calido\n 2. Templado\n 3. Frio");
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
			}
		}
		while(opcion!=4);
	}
}