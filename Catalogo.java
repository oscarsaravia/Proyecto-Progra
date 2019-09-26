//Clase catalogo

public class Catalogo{
	private String[] catalogo = {"Cardamomo", "Frijol", "Cana", "Maiz", "Cafe", "Limon", "Tomate", "Papa", "Chile", "Guisquil", "Guicoy", "Yuca", "Aguacate", "Rabano", "Remolacha", "Cebolla"};

	public String getCatalogo(){
		String lista = "Los cultivos disponibles son:\n";
		for(int i=0; i<15; i++){
			lista+= catalogo[i];
			lista+= "\n";
		}
		return lista;
	}
}