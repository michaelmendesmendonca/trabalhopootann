package exer7;
import java.util.Scanner;

public class controleremoto {
	
	televisao t1 = new televisao();
	
	public void passarCanal() {
		
		if(t1.canal < t1.canalMaximo)
			t1.setCanal(t1.canal+1);
		
		else if(t1.canal == t1.canalMaximo)
			System.out.println("Canal já selecionado.");
	}
	
	public void voltarCanal() {
		
		if(t1.canal > t1.canalMinimo)
			t1.setCanal(t1.canal-1);
		else if(t1.canal == t1.canalMinimo)
			System.out.println("Canal já selecionado.");
	}
	
	public void aumentarVolume() {
		if(t1.volume < t1.volumeMaximo)
			t1.setVolume(t1.volume+1);
	}
	
	public void baixarVolume() {
		if(t1.volume > t1.volumeMinimo)
			t1.setVolume(t1.volume-1);
	}
	
	public void escolherCanal() {
		
		int canalDesejado;
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite o canal desejado: ");
		canalDesejado = input.nextInt();
				
		if(canalDesejado > t1.canalMaximo) {
			System.out.println("Sinal nao encontrado.");
			t1.setCanal(canalDesejado);
		}
		
		else if(canalDesejado < t1.canalMinimo)
			System.out.println("Canal inexistente.");
		
		else t1.setCanal(canalDesejado);
	}
	
	public void escolherVolume() {
		
		int volumeDesejado;
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite o volume desejado: ");
		volumeDesejado = input.nextInt();
		
		if(volumeDesejado > t1.canalMaximo)
			System.out.println("Volume maximo alcançado.");
		
		else if(volumeDesejado < t1.canalMinimo)
			System.out.println("Volume minimo alcançado.");
		
		else t1.setVolume(volumeDesejado);
	}
}