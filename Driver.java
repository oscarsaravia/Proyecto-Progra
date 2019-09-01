//Driver.java

import java.util.*;


public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido\n Que desea hacer?\n 1. Conocer el cultivo que debe plantar\n 2. Calendario de su cultivo\n 3. Tutorial del cultivo");
		int opcion = scan.nextInt();

		Cultivo cultivo = new Cultivo();

		if(opcion == 1){
			System.out.println("En que clima esta ubicado?\n 1. Calido\n 2. Templado\n 3. Frio");
			int clima = scan.nextInt();
			System.out.println("En que departamento se encuentra?");
			cultivo.mostrarDept(clima);
			System.out.println("");
			scan.nextLine();
			String departamento = scan.nextLine();
			if(clima == 1){
				cultivo.generarCultivo("Calido", departamento);
				cultivo.mostrarCultivo("Calido", departamento);
			}
			else if(clima == 2){
				cultivo.generarCultivo("Templado", departamento);
				cultivo.mostrarCultivo("Templado", departamento);
			}
			else if(clima == 3){
				cultivo.generarCultivo("Frio", departamento);
				cultivo.mostrarCultivo("Frio", departamento);
			}
			
		}
		else if(opcion == 2){
			System.out.println("Funcion pendiente");
		}
		else if(opcion == 3){
			System.out.println("Funcion pendiente");
		}
	}
}