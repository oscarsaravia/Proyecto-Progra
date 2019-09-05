//Driver.java

import java.util.*;


public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido\n Que desea hacer?\n 1. Conocer el cultivo que debe plantar\n 2. Calendario de su cultivo\n 3. Tutorial del cultivo");
		int opcion = scan.nextInt();

		Cultivo cultivo = new Cultivo();
		Tutoriales tutos = new Tutoriales();
		Calendario calendar=new Calendario();

		if(opcion == 1){
			System.out.println("En que clima esta ubicado?\n 1. Calido\n 2. Templado\n 3. Frio");
			int clima = scan.nextInt();
			System.out.println("En que departamento se encuentra?");
			cultivo.mostrarDept(clima);
			System.out.println("");
			scan.nextLine();
			String departamento = scan.nextLine();
			if(clima == 1){
				cultivo.generarCultivo("Calido", departamento);
				cultivo.mostrarCultivo("Calido", departamento);
			}
			else if(clima == 2){
				cultivo.generarCultivo("Templado", departamento);
				cultivo.mostrarCultivo("Templado", departamento);
			}
			else if(clima == 3){
				cultivo.generarCultivo("Frio", departamento);
				cultivo.mostrarCultivo("Frio", departamento);
			}
			
		}
		else if(opcion == 2){
			if(cultivo.getCultivo()=="cardamomo") {
				calendar.Cardamomo();
			}
			else if(cultivo.getCultivo()=="frijol") {
				calendar.Frijol();
			}
			else if(cultivo.getCultivo()=="maiz") {
				calendar.Maiz();
			}
			else if(cultivo.getCultivo()=="cafe") {
				calendar.Cafe();
			}
			else if(cultivo.getCultivo()=="limon") {
				calendar.Limon();
			}
			else if(cultivo.getCultivo()=="tomate") {
				calendar.Tomate();
			}
			else if(cultivo.getCultivo()=="papa") {
				calendar.Papa();
			}
			else if(cultivo.getCultivo()=="chile") {
				calendar.Chile();
			}
			else if(cultivo.getCultivo()=="guisquil") {
				calendar.Guisquil();
			}
			else if(cultivo.getCultivo()=="guicoy") {
				calendar.Guicoy();
			}
			else if(cultivo.getCultivo()=="yuca") {
				calendar.Yuca();
			}
			else if(cultivo.getCultivo()=="aguacate") {
				calendar.Aguacate();
			}
			else if(cultivo.getCultivo()=="rabano") {
				calendar.Rabano();
			}
			else if(cultivo.getCultivo()=="remolacha") {
				calendar.Remolacha();
			}
			else if(cultivo.getCultivo()=="cebolla") {
				calendar.Cebolla();
			}
		}
		else if(opcion == 3){
			if(cultivo.getCultivo()=="cardamomo") {
				tutos.verCardamomo();
			}
			else if(cultivo.getCultivo()=="frijol") {
				tutos.verFrijol();
			}
			else if(cultivo.getCultivo()=="maiz") {
				tutos.verMaiz();
			}
			else if(cultivo.getCultivo()=="cafe") {
				tutos.verCafe();
			}
			else if(cultivo.getCultivo()=="limon") {
				tutos.verLimon();
			}
			else if(cultivo.getCultivo()=="tomate") {
				tutos.verTomate();
			}
			else if(cultivo.getCultivo()=="papa") {
				tutos.verPapa();
			}
			else if(cultivo.getCultivo()=="chile") {
				tutos.verChile();
			}
			else if(cultivo.getCultivo()=="guisquil") {
				tutos.verGuisquil();
			}
			else if(cultivo.getCultivo()=="guicoy") {
				tutos.verGuicoy();
			}
			else if(cultivo.getCultivo()=="yuca") {
				tutos.verYuca();
			}
			else if(cultivo.getCultivo()=="aguacate") {
				tutos.verAguacate();
			}
			else if(cultivo.getCultivo()=="rabano") {
				tutos.verRabano();
			}
			else if(cultivo.getCultivo()=="remolacha") {
				tutos.verRemolacha();
			}
			else if(cultivo.getCultivo()=="cebolla") {
				tutos.verCebolla();
			}
		}
	}
}