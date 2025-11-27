package PrimoEsercizio;

public class cicliCondizionali {

	public static void main(String[] args) {
		etichetta:
			for(int i =0; i< 20; i++){
			for(int j =0; j< 10; j++){
			if(i==12 && j==5)
			continue etichetta;
			System.out.println(j);
			}
			System.out.println(" -- "+i);
			} 

	}

}
