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
							tutos.verCardamomo();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("frijol")) {
							tutos.verFrijol();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("maiz")) {
							tutos.verMaiz();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cafe")) {
							tutos.verCafe();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("limon")) {
							tutos.verLimon();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("tomate")) {
							tutos.verTomate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("papa")){
							tutos.verPapa();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("chile")) {
							tutos.verChile();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guisquil")) {
							tutos.verGuisquil();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guicoy")) {
							tutos.verGuicoy();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("yuca")) {
							tutos.verYuca();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("aguacate")) {
							tutos.verAguacate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("rabano")) {
							tutos.verRabano();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("remolacha")) {
							tutos.verRemolacha();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cebolla")) {
							tutos.verCebolla();
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
