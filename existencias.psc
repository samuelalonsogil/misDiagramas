Algoritmo almacén
	Definir existencias Como Real
	Definir entregadas Como Real
	existencias <- 3200
	Escribir 'selecciona el num de existencias a pedir'
	Leer entregadas
	Mientras existencias>=100 Hacer
		Escribir existencias
		existencias <- existencias-entregadas
	FinMientras
FinAlgoritmo
