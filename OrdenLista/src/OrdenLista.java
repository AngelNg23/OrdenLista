import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OrdenLista {

	public static void main(String[] args) {
		ArrayList<Integer> listaDesordenada = new ArrayList<Integer>(Arrays.asList(1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4));
		Collections.sort(listaDesordenada , Collections.reverseOrder());
		
		for (Integer numero: listaDesordenada) {
	        System.out.println(numero);
	    } 

	}

}
