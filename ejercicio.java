public class Codigo5 {

	    Scanner s = new Scanner();
	    System.out.print("Introduzca un número: "); //se corrigen comilas
	    String ni = s.nextLine();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10; //creo que esto no va acá, pero no sé bien donde
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//le falta la t al print
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}