package Primer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fakulteti {

	 public static void main (String []args) {
		   List<String> fakulteti =new ArrayList<String>();
		   fakulteti.add("FIKT");
		   fakulteti.add("Ekonomski");
		   fakulteti.add("Biotehnicki");
		   Collections.sort(fakulteti);
		   System.out.println(fakulteti);
	 }
}
		   
