/*Tierra.java
La clase, a partir de los parametros ingresados, genera un objeto tipo tierra*/

public class Tierra{
	private String region;
	private double lluvia;
	private String clima;

	public void crearTierra(String region, double lluvia, String clima){
		this.region = region;
		this.lluvia = lluvia;
		this.clima = clima;
	}

	public String getRegion(){
		return region;
	}

	public double getLluvia(){
		return lluvia;
	}

	public String getClima(){
		return clima;
	}
}