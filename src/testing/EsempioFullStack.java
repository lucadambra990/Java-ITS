package testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsempioFullStack {
	private static final Logger Logger = LogManager.getLogger(EsempioFullStack.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsempioFullStack es = new EsempioFullStack();
		boolean palindroma=es.isPalindroma("osso");
		int occorrenza = es.ContaOccorrenze("albicocca", "c");
		
		
		Logger.info("La parola è palindroma? " + palindroma);
		Logger.debug("Le occorenze in tutto sono " + occorrenza);
	}

	
	public boolean isPalindroma(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		return str1.equals(str);
	}
	
	public int ContaOccorrenze(String str,String token) {
		//conta le occorrenze del token nella stringa
		int occ=0;
		int lenToken = token.length();
		
		for (int i = 0; i <=str.length() - lenToken; i++) {
			if (str.substring(i,i + lenToken).equals(token)) {
				occ++;
			}
		}
		return occ;
	}
}
