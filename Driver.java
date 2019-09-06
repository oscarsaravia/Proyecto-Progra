//Driver.java

import java.util.*;


public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean continuar=true;
		int opcion = 0;
		Cultivo cultivo = new Cultivo();
		Tutoriales tutos = new Tutoriales();
		Calendario calendar=new Calendario();
		
		do {
			do {
				do {
					do {
						System.out.println("Bienvenido\n Que desea hacer?\n 1. Conocer el cultivo que debe plantar\n 2. Calendario de su cultivo\n 3. Tutorial del cultivo\n 4. Salir");
						opcion=scan.nextInt();
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
						else if(opcion==2) {
							continuar=false;
						}
						else if(opcion==3) {
							continuar=false;
						}
						else if(opcion==4) {
							continuar=false;
						}
					} while (continuar==true);
					if(opcion == 2){
						continuar=true;
						if(cultivo.getCultivo().equalsIgnoreCase("cardamomo")) {
							calendar.Cardamomo();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("frijol")) {
							calendar.Frijol();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("maiz")) {
							calendar.Maiz();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cafe")) {
							calendar.Cafe();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("limon")) {
							calendar.Limon();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("tomate")) {
							calendar.Tomate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("papa")){
							calendar.Papa();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("chile")) {
							calendar.Chile();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guisquil")) {
							calendar.Guisquil();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guicoy")) {
							calendar.Guicoy();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("yuca")) {
							calendar.Yuca();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("aguacate")) {
							calendar.Aguacate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("rabano")) {
							calendar.Rabano();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("remolacha")) {
							calendar.Remolacha();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cebolla")) {
							calendar.Cebolla();
						}
				}
					else if(opcion==3) {
						continuar=false;
					}
					else if(opcion==4) {
						continuar=false;
					}
					} while(continuar==true);
					if(opcion==3){
						continuar=true;
						if(cultivo.getCultivo().equalsIgnoreCase("cardamomo")) {
							tutos.verCardamomo();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("frijol")) {
							tutos.verFrijol();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("maiz")) {
							tutos.verMaiz();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cafe")) {
							tutos.verCafe();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("limon")) {
							tutos.verLimon();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("tomate")) {
							tutos.verTomate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("papa")){
							tutos.verPapa();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("chile")) {
							tutos.verChile();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guisquil")) {
							tutos.verGuisquil();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("guicoy")) {
							tutos.verGuicoy();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("yuca")) {
							tutos.verYuca();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("aguacate")) {
							tutos.verAguacate();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("rabano")) {
							tutos.verRabano();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("remolacha")) {
							tutos.verRemolacha();
						}
						else if(cultivo.getCultivo().equalsIgnoreCase("cebolla")) {
							tutos.verCebolla();
						}
					} 
			}while(continuar==true);
		}while(continuar==true);
		if (opcion==4) {
			continuar=false;
		}
		scan.close();
	}
}
