/*
   6. A un grupo de 100 personas se les consulta la edad. Se desea saber el promedio de edad que tienen las personas con menos 
   de 25 años, y el promedio de edad de las personas mayores o iguales a 25 años.
*/

import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int contMayor=0, contMenor=0, edad;
		double promMayor, promMenor, sumaEMayor=0, sumaEMenor=0;

		System.out.println();

		for (int i=1; i<=100; i++) {

			System.out.print("Ingrese edad "+i+": ");
			edad = read.nextInt();

			if (edad>=25) {
				sumaEMayor += edad;
				contMayor++;
			} else {
				sumaEMenor += edad;
				contMenor++;
			}
		}

		promMayor = sumaEMayor/contMayor;
		promMenor = sumaEMenor/contMenor;

		System.out.println("\n   Promedio de mayores de 25: "+promMayor);
		System.out.println(  "   Promedio de menores de 25: "+promMenor+"\n");
	}


}

