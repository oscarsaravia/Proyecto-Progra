/*Control.java
*/

import java.util.*;

public class Control{
	Cultivo cultivo = new Cultivo();
	Tutoriales tutos = new Tutoriales();
	Calendario calendar=new Calendario();
	Catalogo cat = new Catalogo();
	Agenda agen = new Agenda(); 
	Scanner scan = new Scanner(System.in);
	String clima;
	String departamento;
	String [] listadepas;
	


	public void getDept(int clima){
		cultivo.mostrarDept(clima);
	}

	public void recibirCultivo(String clima, String departamento){
		this.clima = clima;
		this.departamento = departamento;
	}

	public void crearAgenda(){
		agen.iniciaragenda();
		agen.agregardatos();
	}

	public String devolverCultivo(String clima, String departamento){
		String r = "El cultivo que mas se asemeja a su situacion es: "+ cultivo.mostrarCultivo(clima, departamento);
		
		return r;
	}

	//OPCION CALENDARIO
	public void OperacionesCalendario(){
		int scanned = 0;
		do{
			System.out.println("\n__________________________");
			System.out.println(cultivo.getCultivo());
			System.out.println("_________________________");
			calendar.MenuCalendarioDialogo();
			scanned = scan.nextInt();
			calendar.MenuCalendario(scanned);
		}while(scanned != 4);
		

	}
	//OPCION CALENDARIO
	public void opcionDos(){
		OperacionesCalendario();
	}
	
	
	public void opcionTres(){
		if(cultivo.getCultivo().equalsIgnoreCase("cardamomo")) {
							tutos.Cardamomo();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("frijol")) {
							tutos.Frijol();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("maiz")) {
							tutos.Maiz();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cafe")) {
							tutos.Cafe();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("limon")) {
							tutos.Limon();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("tomate")) {
							tutos.Tomate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("papa")){
							tutos.Papa();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("chile")) {
							tutos.Chile();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guisquil")) {
							tutos.Guisquil();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guicoy")) {
							tutos.Guicoy();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("yuca")) {
							tutos.Yuca();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("aguacate")) {
							tutos.Aguacate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("rabano")) {
							tutos.Rabano();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("remolacha")) {
							tutos.Remolacha();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cebolla")) {
							tutos.Cebolla();
						}
	}
	
	public String[] getlistadepartamentos(int opcion){
		listadepas = cultivo.getdepartamentos(opcion);
		return listadepas;
	}

	public String opcionCinco(){
		return cat.getCatalogo();
	}
	
	public String mostrarAgenda(){
		return agen.desplegarAgenda();
	}

	public void agregarContacto(String nombre, String apellido, String numtel, String correo, String empresa){
		agen.agregarContacto(nombre, apellido, numtel, correo, empresa);
	}

	public String eliminarContacto(int posicion){
		return agen.eliminarContacto(posicion);
	}
	




}
