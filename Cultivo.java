/*Cultivo.java
Recibe un objeto de tierra y a partir de los parametros genera un cultivo*/

public class Cultivo{
	private String cultivo;
	private String departamento;

	public void generarCultivo(Tierra tierra){
		int dept = tierra.getDepartamento();
		int rain = tierra.getLluvia();
		int clima = tierra.getClima();
		
		}

	public String getCultivo(){
		return cultivo;
	}
}