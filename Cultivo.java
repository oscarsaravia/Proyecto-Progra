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

	public void generarCultivo(String climate, String departamento){
		this.climate = climate;
		this.departamento = departamento;
	}

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


	public void mostrarCultivo(String clima, String departamento){
	if(clima.equalsIgnoreCase("Calido")){
		if(departamento.equalsIgnoreCase("Peten")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el frijol");
		}
		else if(departamento.equalsIgnoreCase("Retalhuleu")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
		}
		else if(departamento.equalsIgnoreCase("Santa Rosa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cana de azucar");
		}
		else if(departamento.equalsIgnoreCase("Jutiapa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el frijol");
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el aguacate");
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cardamomo");
		}
		else if(departamento.equalsIgnoreCase("Izabal")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
		}
	}
	else if(clima.equalsIgnoreCase("Templado")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el guisquil");
		}
		else if(departamento.equalsIgnoreCase("Alta Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
		}
		else if(departamento.equalsIgnoreCase("Baja Verapaz")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el tomate");
		}
		else if(departamento.equalsIgnoreCase("El Progreso")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el guicoy");
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
		}
		else if(departamento.equalsIgnoreCase("Jalapa")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la yuca");
		}
		else if(departamento.equalsIgnoreCase("Escuintla")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el limon");
		}
		else if(departamento.equalsIgnoreCase("Suchitepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el limon");
		}
	}
	else if(clima.equalsIgnoreCase("Frio")){
		if(departamento.equalsIgnoreCase("Huehuetenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
		}
		else if(departamento.equalsIgnoreCase("Quiche")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el aguacate");
		}
		else if(departamento.equalsIgnoreCase("San Marcos")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el maiz blanco");
		}
		else if(departamento.equalsIgnoreCase("Quetzaltenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la papa");
		}
		else if(departamento.equalsIgnoreCase("Totonicapan")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la cebolla");
		}
		else if(departamento.equalsIgnoreCase("Solola")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el cafe");
		}
		else if(departamento.equalsIgnoreCase("Chimaltenango")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el rabano");
		}
		else if(departamento.equalsIgnoreCase("Sacatepequez")){
			System.out.println("El cultivo que mejor se asimila a su situacion es la remolacha");
		}
		else if(departamento.equalsIgnoreCase("Guatemala")){
			System.out.println("El cultivo que mejor se asimila a su situacion es el chile");
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