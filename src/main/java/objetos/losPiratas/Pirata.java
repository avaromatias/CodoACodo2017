package objetos.losPiratas;

import java.util.LinkedList;
import java.util.List;

public class Pirata {
	
	List<String> items = new LinkedList<String>();
	int nivelEbriedad, monedas;
	
	public Pirata(List<String> unosItems, int unNivel, int unasMonedas){
		items = unosItems;
		nivelEbriedad = unNivel;
		monedas = unasMonedas;
	}
	
	public List<String> getItems() {
		return items;
	}
	
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	public int getNivelEbriedad() {
		return nivelEbriedad;
	}
	
	public void setNivelEbriedad(int nivelEbriedad) {
		this.nivelEbriedad = nivelEbriedad;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	public boolean tieneItemsBusquedaDelTesoro(){
		return (this.tiene("Brujula") || this.tiene("Mapa") || this.tiene("Botella de ron"));
	}
	
	public boolean tiene(String unItem) {
		return items.contains(unItem);
	}
	
	public boolean tieneMenosMonedasQue(int unasMonedas){
		return monedas < unasMonedas;
	}
	
	public int cuantosItemsTiene(){
		return items.size();
	}
	
	public boolean tieneMasItemsQue(int cantidad){
		return this.cuantosItemsTiene() >= cantidad;
	}

	public boolean estaPasadoDeRon() {
		return this.nivelEbriedadMayorA(70);
	}
	
	public boolean nivelEbriedadMayorA(int unNivel){
		return nivelEbriedad >= unNivel;
	}
	
	public boolean seAnimaASaquear(Victima unaVictima){
		return unaVictima.seAnimaASaquearme(this);
	}
	
}
