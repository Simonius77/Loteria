
import java.util.Random;
public class Loteria {
public static void main (String [] args){
	Random generadorAleatorio = new Random();
		for(int i=1; i<=5; i++){
			int numero=generadorAleatorio.nextInt(9);
			System.out.print( numero );
		
		}	
	}
}
	