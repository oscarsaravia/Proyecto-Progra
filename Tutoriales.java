import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Tutoriales implements General{
	
	private String pagina;
	private String cultivo;
	public void abrirTutorial() {
		URL url=null;
		try {
		    url = new URL(pagina);
		    try {
		        Desktop.getDesktop().browse(url.toURI());
		    } catch (IOException e) {
		        e.printStackTrace();
		    } catch (URISyntaxException e) {
		        e.printStackTrace();
		    }
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}
	}
	public void Cardamomo() {
		cultivo="cardamomo";
		if (cultivo=="cardamomo") {
			pagina="https://youtu.be/Y11Yp7foC8E";
			abrirTutorial();
		}
	}
	public void Frijol() {
		cultivo="frijol";
		if (cultivo=="frijol") {
			pagina="https://youtu.be/AzaH8gHPEdo";
			abrirTutorial();
		}
	}
	public void Cana() {
		cultivo="cana";
		if (cultivo=="cana") {
			pagina="https://youtu.be/TWdTc91f2RY";
			abrirTutorial();
		}
		
	}
	public void Maiz() {
		if (cultivo=="maiz") {
			pagina="https://youtu.be/dEHhEsJLzxQ";
			abrirTutorial();
		}
		
	}
	public void Cafe() {
		if (cultivo=="cafe") {
			pagina="https://youtu.be/kURSVdwRRJc";
			abrirTutorial();
		}
		
	}
	public void Limon() {
		cultivo="limon";
		if (cultivo=="limon") {
			pagina="https://youtu.be/cMUJGKDXUcE";
			abrirTutorial();
		}
	}
	public void Tomate() {
		cultivo="tomate";
		if (cultivo=="tomate") {
			pagina="https://youtu.be/CQMwxA9MZHk";
			abrirTutorial();
		}
		
	}
	public void Papa() {
		cultivo="papa";
		if (cultivo=="papa") {
			pagina="https://youtu.be/NH7lAnImZQY";
			abrirTutorial();
		}
	}
	public void Chile() {
		cultivo="chile";
		if (cultivo=="chile") {
			pagina="https://youtu.be/pdzFbapuhd0";
			abrirTutorial();
		}
	}
	public void Guisquil() {
		cultivo="guisquil";
		if (cultivo=="guisquil") {
			pagina="https://youtu.be/OO4EP8VSQUA";
			abrirTutorial();
		}
	}
	public void Guicoy() {
		cultivo="guicoy";
		if (cultivo=="guicoy") {
			pagina="https://youtu.be/3gK8TNIDh6M";
			abrirTutorial();
		}
	}
	public void Yuca() {
		cultivo="yuca";
		if (cultivo=="yuca") {
			pagina="https://youtu.be/5p6SeApVev4";
			abrirTutorial();
		}
	}
	public void Aguacate() {
		cultivo="aguacate";
		if (cultivo=="aguacate") {
			pagina="https://youtu.be/cXBlBhefBO4";
			abrirTutorial();
		}
	}
	public void Rabano() {
		cultivo="rabano";
		if (cultivo=="rabano") {
			pagina="https://youtu.be/yIbrr_jBRZk";
			abrirTutorial();
		}
	}
	public void Remolacha() {
		cultivo="remolacha";
		if (cultivo=="remolacha") {
			pagina="https://youtu.be/BVR5UT4KG7Y";
			abrirTutorial();
		}
	}
	public void Cebolla() {
		cultivo="cebolla";
		if (cultivo=="cebolla") {
			pagina="https://youtu.be/T-SMmICoDGo";
			abrirTutorial();
		}
	}
	public String getPagina() {
		return this.pagina;
	}
	public void setPagina(String pagina) {
		this.pagina=pagina;
	}
	public String getCultivo() {
		return this.cultivo;
	}
	public void setCultivo(String cultivo) {
		this.cultivo=cultivo;
	}
}
