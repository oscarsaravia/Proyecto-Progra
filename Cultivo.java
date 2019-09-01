/*Cultivo.java
Recibe un clima y un departamento y a partir de los parametros genera un cultivo*/

public class Cultivo{
	private String cultivo;
	private String departamento;
	private String clima;
	private String[] calido = {"Peten", "Retalhuleu", "Suchitepequez", "Escuintla", "Santa Rosa", "Jutiapa", "Quiche", "Alta Verapaz", "Izabal"};
	private String[] templado = {"Huehuetenango", "Quiche", "Alta Verapaz", "San Marcos", "Baja Verapaz", "El Progreso", "Guatemala", "Jalapa", "Escuintla", "Suchitepequez"};
	private String[] frio = {"Huehuetenango", "Quiche", "San Marcos", "Quetzaltenango", "Totonicapan", "Solola", "Chimaltenango", "Sacatepequez", "Guatemala"};

	/*public void generarCultivo(int clima, int departamento){
		
		}*/

	public void mostrarDept(int clima){
		if(clima == 1){
			for(int i=0; i<calido.length();i++){
				System.out.println(calido[i]);
			}
		}
		else if(clima == 2){
			for(int i=0; i<templado.length();i++){
				System.out.println(templado[i]);
			}
		}
		else if(clima == 3){
			for(int i=0; i<frio.length();i++){
				System.out.println(frio[i]);
			}
		}
	}

	public String getCultivo(){
		return cultivo;
	}
}