import java.util.ArrayList;
import java.util.Scanner;

public class Agenda{
	
	//ATRIBUTOS
	private ArrayList<String[]> agenda = new ArrayList<String[]>();
	private String [] Datos = new String[5];
	private String Nombre;
	private String Apellido;
	private String Numtel;
	private String Correo;
	private String Empresa;
	private int Opcioneliminar;
	
	Scanner scan = new Scanner(System.in);	
	
	//METODO PARA AGREGAR LAS PROPIEDADES A LA AGENDA
	public void iniciaragenda(){
		Datos[0] = "Nombre: ";
		Datos[1] = "Apellido: ";
		Datos[2] = "Numero telefonico: ";
		Datos[3] = "Correo electronico: ";
		Datos[4] = "Empresa: ";
	}
		

		
	//USUARIOS POR DEFECTO
		
	public void agregardatos(){
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
	}
	
	//METODO PARA DESPLEGAR LA INFORMACION DE LOS CONTACTOS GUARDADOS
	public String desplegarAgenda(){
		String age = ""; 
		for (int i = 0; i < agenda.size(); i++){
			age+= (i+1);
			age += ".\n";
			for (int k = 0; k < agenda.get(i).length; k++){
				age += Datos[k] + agenda.get(i)[k]+" \n";
			}
			age += "\n";
		}
		return age;
	}
	//METODO QUE PERMITE AGREGAR UN CONTACOT
	public void agregarContacto(String nombre, String apellido, String numtel, String correo, String empresa){
		
		agenda.add(new String[5]);
		
		
		agenda.get(agenda.size()-1)[0] = nombre;
		agenda.get(agenda.size()-1)[1] = apellido;
		agenda.get(agenda.size()-1)[2] = numtel;
		agenda.get(agenda.size()-1)[3] = correo;
		agenda.get(agenda.size()-1)[4] = empresa;
		
	}
	//METODO CON LA FUNCION DE ELIMINAR USUARIOS DEL ARRAY
	public String eliminarContacto(int posicion){
		String eliminacion = "";
		
		if (posicion == 1 || posicion == 2){
			eliminacion += "Error: no puedes eliminar los contactos por defecto\n";
			return eliminacion;
		}
		else{		
			agenda.remove(posicion-1);
			return eliminacion;
		}
		
	}
} 