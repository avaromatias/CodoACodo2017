package objetos.pepita;

public class Ave {

	int energia = 100;
	Comida alimento;
	
	public void comer(){
		energia += 2 + alimento.getEnergia();
	}
	
	public Comida getAlimento() {
		return alimento;
	}

	public void darComida(Comida alimento) {
		this.alimento = alimento;
	}

	public void volar(int kilometros){
		energia -= 2 + kilometros;
	}

	public int getEnergia() {
		return energia;
	}

	public void reset(){
		this.energia = 100;
	}
}