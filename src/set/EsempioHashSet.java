package set;

import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

import azienda.ComparatorImpSalario;
import azienda.Impiegato;

public class EsempioHashSet {

	public static void main(String[] args) {
		HashSet<Impiegato> set = new HashSet<>();
		System.out.println(set.size());
		set.add(new Impiegato("Luca", 1200, new Date()));
		set.add(new Impiegato("mario", 900, new Date()));
		set.add(new Impiegato("giuseppe", 1000, new Date()));
		set.add(new Impiegato("carolina", 1100, new Date()));
		set.add(new Impiegato("Luca", 1200, new Date()));
		
		for (Impiegato impiegato : set) {
			System.out.println(impiegato);
		}
		
		
		System.out.println("-------------senza Comparatore-------------");
		
		TreeSet<Impiegato> tSet = new TreeSet<>();
		tSet.add(new Impiegato("luca", 1200, new Date()));
		tSet.add(new Impiegato("mario", 900, new Date()));
		tSet.add(new Impiegato("giuseppe", 1000, new Date()));
		tSet.add(new Impiegato("carolina", 1100, new Date()));
		tSet.add(new Impiegato("salvatore", 1200, new Date()));
		
		for (Impiegato impiegato : tSet) {
			System.out.println(impiegato);
		}
		
		System.out.println("-------------con Comparatore-------------");
		
		TreeSet<Impiegato> zSet = new TreeSet<>(new ComparatorImpSalario());
		zSet.add(new Impiegato("luca", 1200, new Date()));
		zSet.add(new Impiegato("mario", 900, new Date()));
		zSet.add(new Impiegato("giuseppe", 1000, new Date()));
		zSet.add(new Impiegato("carolina", 1100, new Date()));
		zSet.add(new Impiegato("salvatore", 1300, new Date()));
		
		for (Impiegato impiegato : zSet) {
			System.out.println(impiegato);
		}
		
		
		
		
	}
}
