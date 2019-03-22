package exer7;
public class televisao {
	
	protected final int volumeMaximo = 99;
	protected final int volumeMinimo = 0;
	protected final int canalMaximo = 500;
	protected final int canalMinimo = 0;
	
	protected int volume;
	protected int canal;
	
	public televisao() {
		
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {		
		this.volume = volume;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}

	
	public String toString() {
		return "\nCanal atual: " + getCanal() + "\nVolume atual: " + getVolume() + "\n";
	}
	
	
}