/*Cultivo.java
Recibe un clima y un departamento y a partir de los parametros genera un cultivo*/

public class Cultivo{
	private String cultivo;
	private String departamento;
	private int clima;
	private String climate;
	private String[] calido = {"Peten", "Retalhuleu", "Suchitepequez", "Escuintla", "Santa Rosa", "Jutiapa", "Quiche", "Alta Verapaz", "Izabal"};
	private String[] templado = {"Huehuetenango", "Quiche", "Alta Verapaz", "San Marcos", "Baja Verapaz", "El Progreso", "Guatemala", "Jalapa", "Escuintla", "Suchitepequez"};
	private String[] frio = {"Huehuetenango", "Quiche", "San Marcos", "Quetzaltenango", "Totonicapan", "Solola", "Chimaltenango", "Sacatepequez", "Guatemala"};
	private String[] devolverdepartamento;

	//Constructor de cultivo
	public void generarCultivo(String climate, String departamento){
		this.climate = climate;
		this.departamento = departamento;
	}


	//De acuddo al clima ingresado, se muestran los departamentos pertenecientes al clima
	public void mostrarDept(int clima){
		if(clima == 1){
			for(int i=0; i<calido.length;i++){
				System.out.println(calido[i]);
			}
		}
		else if(clima == 2){
			for(int i=0; i<templado.length;i++){
				System.out.println(templado[i]);
			}
		}
		else if(clima == 3){
			for(int i=0; i<frio.length;i++){
				System.out.println(frio[i]);
			}
		}
	}


	//Muetra cultivo de acuerdo al clima y el departamento
	public String mostrarCultivo(String clima, String departamento){
	if(clima.equalsIgnoreCase("Calido")){
		if(departamento.equalsIgnoreCase("Peten")){
			cultivo = "frijol";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Retalhuleu")){
			cultivo = "cana";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			cultivo = "cana";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			cultivo = "cana";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Santa Rosa")){
			cultivo = "cana";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Jutiapa")){
			cultivo = "frijol";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			cultivo = "aguacate";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			cultivo = "cardamomo";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Izabal")){
			cultivo = "maiz";
			return cultivo;
		}
	}
	else if(clima.equalsIgnoreCase("Templado")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			cultivo = "cafe";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			cultivo = "guisquil";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			cultivo = "cafe";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			cultivo = "Cafe";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Baja Verapaz")){
			cultivo = "Tomate";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("El Progreso")){
			cultivo = "Guicoy";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			cultivo = "cafe";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Jalapa")){
			cultivo = "yuca";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			cultivo = "limon";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			cultivo = "limon";
			return cultivo;
		}
	}
	else if(clima.equalsIgnoreCase("Frio")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			cultivo = "maiz";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			cultivo = "aguacate";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			cultivo = "maiz";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Quetzaltenango")){
			cultivo = "papa";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Totonicapan")){
			cultivo = "cebolla";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Solola")){
			cultivo = "cafe";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Chimaltenango")){
			cultivo = "rabano";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Sacatepequez")){
			cultivo = "remolacha";
			return cultivo;
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			cultivo = "chile";
			return cultivo;
		}
	}
	return " ";
	}
	

	public String getClima(){
		return climate;
	}



	public String getCultivo(){
		return cultivo;
	}
	public int getIntClima() {
		return clima;
	}
	public String getDepartamento() {
		return departamento;
	}
	
	public String[] getdepartamentos(int opcion){
		if(opcion == 1){
			devolverdepartamento = calido;
		}
		else if(opcion == 2){
			devolverdepartamento = templado;
		}
		else if(opcion == 3){
			devolverdepartamento = frio;
		}
		return devolverdepartamento;
	}
}
