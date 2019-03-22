package exer7;
import java.util.Scanner;

public class exer7 {

	public static void main(String []args) {
	
		Scanner input = new Scanner(System.in);
		controleremoto c = new controleremoto();
		int opc;
		
		do {
			
			System.out.println("1. Aumentar volume\n"
					+ "2. Diminuir volume\n"
					+ "3. Passar canal\n"
					+ "4. Voltar canal\n"
					+ "5. Escolher canal\n"
					+ "6. Escolher volume\n"
					+ "7. Ver status da televisao\n"
					+ "8. Sair");
			System.out.println("\nOpção desejada: ");
			
			opc = input.nextInt();
			
			switch(opc) {
				case 1:
					c.aumentarVolume();
				break;
				
				case 2:
					c.baixarVolume();
				break;
				
				case 3:
					c.passarCanal();
				break;
				
				case 4:c.voltarCanal();
				break;
				
				case 5:
					c.escolherCanal();
				break;
				
				case 6:
					c.escolherVolume();
				break;
				
				case 7:
					System.out.println(c.t1.toString());
				break;
				
				case 8:
				break;
				
				default:
					System.out.println("Opção inválida.");
			}
			
		}while(opc != 8);
		
		
		input.close();
	}
}