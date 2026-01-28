package azienda;

import java.util.Comparator;

public class ComparatorImpSalario implements Comparator<Impiegato> {

	@Override
	public int compare(Impiegato o1, Impiegato o2) {
		// criterio del salario
		if(o1.getSalario() > o2.getSalario())
			return 1;
		else if (o1.getSalario() < o2.getSalario())
			return -1;
		else
			return 0;
	}

} 