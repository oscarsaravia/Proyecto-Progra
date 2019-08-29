/*Tierra.java
La clase, a partir de los parametros ingresados, genera un objeto tipo tierra*/

public class Tierra{
	private int departamento;
	private int lluvia;
	private int clima;
	private String[] departamentos = {"Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla","Guatemala","Huehuetenango","Izabal","Jalapa","Jutiapa","Peten","Quetzaltenango","Quiche", "Retalhuleu","Sacatepequez","San Marcos","Santa Rosa","Solola","Suchitepequez","Totonicapan","Zacapa"};


	public void crearTierra(int departamento, int lluvia, int clima){
		this.departamento = departamento;
		this.lluvia = lluvia;
		this.clima = clima;
	}

	

	public String getDepartamento(){
		String depart = departamentos[departamento-1];
		return depart;
	}

	public String getLluvia(){
		return lluv;
	}

	public String getClima(){
		return climas;
	}
}