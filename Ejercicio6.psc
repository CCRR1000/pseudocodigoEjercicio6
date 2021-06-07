Algoritmo Ejercicio6
	
	Definir edad, sumaEMenor, sumaEMayor, contMayor, contMenor como Entero
	Definir promMenor, promMayor Como Real
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese edad " i ":"
		Leer edad
		
		Si edad>=25 Entonces
			sumaEMayor <- sumaEMayor + edad
			contMayor <- contMayor + 1
		SiNo
			sumaEMenor <- sumaEMenor + edad
			contMenor <- contMenor + 1
		Fin Si
		
	Fin Para
	
	promMayor <- sumaEMayor / contMayor
	promMenor <- sumaEMenor / contMenor
	
	Escribir "Promedio de mayores de 25: " promMayor
	Escribir "Promedio de menores de 25: " promMenor
	
FinAlgoritmo
