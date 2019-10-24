/*Driver.java
*/

import java.util.*;

public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Control con = new Control();
		int opcion = 0;
		boolean banderainicio = true;
		int clima = 0;
		String departamento = "";

		con.crearAgenda();

		//Antes de entrar al ciclo, se hace la encuesta para siempre tener guardado un cultivo por lo menos
		System.out.println("Bienvenido\nPara comenzar con el proceso se necesitara que conteste las siguientes preguntas");
		System.out.println("En que clima esta ubicado?\n"); 
		System.out.print("1. Calido: presenta, a lo largo de todo el año, temperaturas elevadas. Se trata de un clima habitual en las sabanas, las selvas y los bosques tropicales.\n"); 
		System.out.print("2. Templado: caracterizado por temperaturas medias anuales que rondan los 15 grados centigrados\n"); 
		System.out.print("3. Frio: se caracteriza por mantener temperaturas bajas a lo largo del ano\n");	
	
		while(banderainicio == true){
			try{
				clima = scan.nextInt();
				if(clima<= 3 && clima >=1){
					banderainicio = false;
				}
				else{
					System.out.println("Error: opcion invalida\n"
					+ "Ingresa una opcion nuevamente");
				}
			}
			catch(InputMismatchException e){
				System.out.println("Error: opcion invalida\n"
					+ "Ingresa una opcion nuevamente");
				scan.next();
			}
		}
		
		
		System.out.println("En que departamento se encuentra?");
		con.getDept(clima);
		System.out.println("");
		scan.nextLine();
		
		
		banderainicio = true;
		while(banderainicio == true){
			try{
				departamento = scan.nextLine();
				for(int i = 0; i < con.getlistadepartamentos(clima).length; i++){
					if(con.getlistadepartamentos(clima)[i].equalsIgnoreCase(departamento)){
						banderainicio = false;
					}
				}
				if(banderainicio == true){
					System.out.println("El departamento ingresado no se encuentra en las opciones\n"
						+ "Ingrese el departamento nuevamente");
				}
			}
			catch(InputMismatchException e){
				System.out.println("El departamento ingresado no se encuentra en las opciones\n"
					+ "Ingrese el departamento nuevamente");
					scan.next();
			}
		}
		
		
		
		banderainicio = true;
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
			System.out.println("\nQue desea hacer?\n1. Conocer el cultivo que debe plantar\n2. Calendario de su cultivo\n3. Tutorial del cultivo\n4. Contactos\n5. Listado de cultivos\n6. Salir\n");
			
			banderainicio = true;
			while(banderainicio == true){
					try{
						opcion = scan.nextInt();
						if(opcion<= 6 && opcion >=1){
							banderainicio = false;
						}
						else{
							System.out.println("Error: opcion invalida\n"
							+ "Ingresa una opcion nuevamente");
						}
					}
					catch(InputMismatchException e){
						System.out.println("Error: opcion invalida\n"
							+ "Ingresa una opcion nuevamente");
						scan.next();
					}
				}
			
			
			
			switch(opcion){
				case 1:
				System.out.println("En que clima esta ubicado?\n"); 
				System.out.print("1. Calido: presenta, a lo largo de todo el año, temperaturas elevadas. Se trata de un clima habitual en las sabanas, las selvas y los bosques tropicales.\n"); 
				System.out.print("2. Templado: caracterizado por temperaturas medias anuales que rondan los 15 grados centigrados\n"); 
				System.out.print("3. Frio: se caracteriza por mantener temperaturas bajas a lo largo del ano\n");
				
				while(banderainicio == true){
					try{
						clima = scan.nextInt();
						if(clima<= 3 && clima >=1){
							banderainicio = false;
						}
						else{
							System.out.println("Error: opcion invalida\n"
							+ "Ingresa una opcion nuevamente");
						}
					}
					catch(InputMismatchException e){
						System.out.println("Error: opcion invalida\n"
							+ "Ingresa una opcion nuevamente");
						scan.next();
					}
				}
				
				
				System.out.println("En que departamento se encuentra?");
				con.getDept(clima);
				System.out.println("");
				scan.nextLine();
			
				banderainicio = true;
				while(banderainicio == true){
					try{
						departamento = scan.nextLine();
						for(int i = 0; i < con.getlistadepartamentos(clima).length; i++){
							if(con.getlistadepartamentos(clima)[i].equalsIgnoreCase(departamento)){
								banderainicio = false;
							}
						}
						if(banderainicio == true){
							System.out.println("El departamento ingresado no se encuentra en las opciones\n"
							+ "Ingrese el departamento nuevamente");
						}
					}
					catch(InputMismatchException e){
						System.out.println("El departamento ingresado no se encuentra en las opciones\n"
							+ "Ingrese el departamento nuevamente");
							scan.next();
					}
				}
			
			
			
			
			
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
				System.out.println("Que desea hacer?\n1. Mostrar agenda\n2. Agregar contacto\n3. Eliminar contacto\n");
				int caso = scan.nextInt();
				scan.nextLine();
				if(caso == 1){
					System.out.println(con.mostrarAgenda());
				}else if(caso == 2){
					System.out.println("Ingrese el nombre del contacto: \n");
					String name = scan.nextLine();
					System.out.println("Ingrese el apellido del contacto: \n");
					String lname = scan.nextLine();
					System.out.println("Ingrese el numero de telefono del contacto: \n");
					String numtel = scan.nextLine();
					System.out.println("Ingrese el correo electronico del contacto: \n");
					String mail = scan.nextLine();
					System.out.println("Lugar de trabajo del contacto: \n");
					String job = scan.nextLine();
					scan.nextLine();
					con.agregarContacto(name, lname, numtel, mail, job);
				}else if(caso == 3){
					System.out.println("POR FAVOR INGRESE EL NUMERO DE USUARIO QUE DESEA ELIMINAR...\n");
					System.out.println(con.mostrarAgenda());
					int pos = scan.nextInt();
					scan.nextLine();
					System.out.println(con.eliminarContacto(pos));
				}else{
					System.out.println("Opcion ingresada no valida");
				}
				break;

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