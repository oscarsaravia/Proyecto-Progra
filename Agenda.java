import java.util.ArrayList;
import java.util.Scanner;

public class agenda{
	
	//ATRIBUTOS
	private ArrayList<String[]> agenda = new ArrayList<String[]>();
	private String [] Datos = new String[5];
	private String Nombre;
	private String Apellido;
	private String Numtel;
	private String Correo;
	private String Empresa;
	
	Scanner scan = new Scanner(System.in);	
	
	Datos[0] = "Nombre: ";
	Datos[1] = "Apellido: ";
	Datos[2] = "Numero telefonico: ";
	Datos[3] = "Correo electronico: ";
	Datos[4] = "Empresa: ";
		

		
	//USUARIOS POR DEFECTO
		
	agenda.add(new String[5]);
	agenda.get(0)[0] = "Oscar";
	agenda.get(0)[1] = "Saravia";
	agenda.get(0)[2] = "55435678";
	agenda.get(0)[3] = "oscarsaravia@hotmail.com";
	agenda.get(0)[4] = "Terra";
		
	agenda.add(new String[5]);
	agenda.get(1)[0] = "Carlos";
	agenda.get(1)[1] = "Perez";
	agenda.get(1)[2] = "54672309";
	agenda.get(1)[3] = "carlitos@hotmail.com";
	agenda.get(1)[4] = "Acma";
	
	public void DesplegarAgenda(){
		for (int i = 0; i < agenda.size(); i++){
			for (int k = 0; k < agenda.get(i).length; k++){
				System.out.print(Datos[k] + agenda.get(i)[k]+" \n");
			}
			System.out.print("\n");
		}
	}
	public void AgregarContacto(){
		agenda.add(new String[5]);
		System.out.print("Ingrese el nombre del contacto: \n");
		Nombre = scan.nextLine();
		System.out.print("Ingrese el apellido del contacto: \n");
		Apellido = scan.nextLine();
		System.out.print("Ingrese el numero de telefono del contacto: \n");
		Numtel = scan.nextLine();
		System.out.print("Ingrese el correo electronico del contacto: \n");
		Correo = scan.nextLine();
		System.out.print("ILugar de trabajo del contacto: \n");
		Empresa = scan.nextLine();
		
		agenda.get(agenda.size()-1)[0] = Nombre;
		agenda.get(agenda.size()-1)[1] = Apellido;
		agenda.get(agenda.size()-1)[2] = Numtel;
		agenda.get(agenda.size()-1)[3] = Correo;
		agenda.get(agenda.size()-1)[4] = Empresa;
		
	}
}