package eccezioni;

import java.io.FileReader;
import java.io.IOException;

public class EsempioEccezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		//FileReader reader = new FileReader("file.txt");
			Double divisione = dividi(3,0);
			System.out.println(divisione);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

	public static Double dividi(Integer a,Integer b)throws ArithmeticException {
		
		Double result = (double) (a/b);
		return result;
	}
}
