//Clase catalogo

public class Catalogo{
	private String[] catalogo = {"Cardamomo\nInformacion nutricional (100 g):\n311 kcal\n6.70g grasa\n68.5g carbohidratos\n10.76g proteina\n", "Frijol\nInformacion nutricional (100 g):\n71 kcal\n0.29g grasa\n13.3g carbohidratos\n4.07g proteina\n", "Cana\nInformacion nutricional (100 g):\n70 kcal\n0.10g grasa\nN/D carbohidratos\n0.10g proteina\n", "Maiz\nInformacion nutricional (100 g):\n86 kcal\n1.2g grasa\n19g carbohidratos\n3.2g proteina\n", "Cafe\nInformacion nutricional (100 g):\n2.0 kcal\n0.0g grasa\n0.34g carbohidratos\n0.1g proteina\n", "Limon\nInformacion nutricional (100 g):\n22 kcal\n0.2g grasa\n7.0g carbohidratos\n0.4g proteina\n", "Tomate\nInformacion nutricional (100 g):\n22 kcal\n0.11g grasa\n3.5g carbohidratos\n1.0g proteina\n", "Papa\nInformacion nutricional (100 g):\n77 kcal\n0.1g grasa\n17g carbohidratos\n2g proteina\n", "Chile\nInformacion nutricional (100 g):\n32.0 kcal\n0.44g grasa\n6.7g carbohidratos\n1.74g proteina\n", "Guisquil\nInformacion nutricional (100 g):\n19 kcal\n0.1g grasa\n4.5g carbohidratos\n0.8g proteina\n", "Guicoy\nInformacion nutricional (100 g):\nN/D kcal\nN/D grasa\nN/D carbohidratos\nN/D proteina\n", "Yuca\nInformacion nutricional (100 g):\n159 kcal\n0.3g grasa\n38g carbohidratos\n1.4g proteina\n", "Aguacate\nInformacion nutricional (100 g):\n160 kcal\n14.7g grasa\n8.5g carbohidratos\n2.0g proteina\n", "Rabano\nInformacion nutricional (100 g):\n14 kcal\nN/D grasa\nN/D carbohidratos\nN/D proteina\n", "Remolacha\nInformacion nutricional (100 g):\n37 kcal\n0g grasa\nN/D carbohidratos\nN/D proteina\n", "Cebolla\nInformacion nutricional (100 g):\n23 kcal\n0.2g grasa\n3.5g carbohidratos\n1.4g proteina\n"};

	public String getCatalogo(){
		String lista = "Los cultivos disponibles son:\n";
		for(int i=0; i<15; i++){
			lista+= catalogo[i];
			lista+= "\n";
		}
		return lista;
	}
}