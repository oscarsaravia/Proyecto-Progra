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
	public void mostrarCultivo(String clima, String departamento){
	if(clima.equalsIgnoreCase("Calido")){
		if(departamento.equalsIgnoreCase("Peten")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el frijol");
			cultivo = "Frijol";
		}
		else if(departamento.equalsIgnoreCase("Retalhuleu")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
			cultivo = "Cana";
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
			cultivo = "Cana";
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
			cultivo = "Cana";
		}
		else if(departamento.equalsIgnoreCase("Santa Rosa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
			cultivo = "Cana";
		}
		else if(departamento.equalsIgnoreCase("Jutiapa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el frijol");
			cultivo = "Frijol";
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el aguacate");
			cultivo = "Aguacate";
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cardamomo");
			cultivo = "Cardamomo";
		}
		else if(departamento.equalsIgnoreCase("Izabal")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
			cultivo = "Maiz";
		}
	}
	else if(clima.equalsIgnoreCase("Templado")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
			cultivo = "Cafe";
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el guisquil");
			cultivo = "Guisquil";
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
			cultivo = "Cafe";
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
			cultivo = "Cafe";
		}
		else if(departamento.equalsIgnoreCase("Baja Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el tomate");
			cultivo = "Tomate";
		}
		else if(departamento.equalsIgnoreCase("El Progreso")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el guicoy");
			cultivo = "Guicoy";
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
			cultivo = "cafe";
		}
		else if(departamento.equalsIgnoreCase("Jalapa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la yuca");
			cultivo = "yuca";
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el limon");
			cultivo = "Limon";
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el limon");
			cultivo = "Limon";
		}
	}
	else if(clima.equalsIgnoreCase("Frio")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
			cultivo = "Maiz";
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el aguacate");
			cultivo = "Aguacate";
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
			cultivo = "maiz";
		}
		else if(departamento.equalsIgnoreCase("Quetzaltenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la papa");
			cultivo = "papa";
		}
		else if(departamento.equalsIgnoreCase("Totonicapan")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cebolla");
			cultivo = "cebolla";
		}
		else if(departamento.equalsIgnoreCase("Solola")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
			cultivo = "cafe";
		}
		else if(departamento.equalsIgnoreCase("Chimaltenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el rabano");
			cultivo = "rabano";
		}
		else if(departamento.equalsIgnoreCase("Sacatepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la remolacha");
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el chile");
			cultivo = "chile";
		}
	}

	}

	public String getClima(){
		return climate;
	}



	public String getCultivo(){
		return cultivo;
	}
}