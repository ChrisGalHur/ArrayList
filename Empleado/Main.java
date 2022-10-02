package Empleado;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	//Arraylist de 10
		ArrayList <Empleado> listaMuestra = new ArrayList<Empleado>();
	//ArrayList de 11 elementos
		listaMuestra.ensureCapacity(11);
		
	//Recortamos el espacio utilizado para almacenar datos en un ArrayList
	//-Se escribe despues de añadir los datos pero permite ir añadiendo más como haría anteriormente
		listaMuestra.trimToSize();
		
	//Crear Objetos para añadir a una ArrayList
		Empleado empleado1 = new Empleado("Pedro", 36, 001, 1755);
		Empleado empleado2 = new Empleado("Roberto", 28, 002, 1856);
		Empleado empleado3 = new Empleado("Alicia", 32, 003, 1524);
		Empleado empleado4 = new Empleado("Juana", 38, 004, 700);
		Empleado empleado5 = new Empleado("Francisca", 45, 005, 534);
		
	//Añadir a un Arraylist
		Lista.listaEmpleadosArrayList.add(empleado1);
		Lista.listaEmpleadosArrayList.add(empleado2);
		Lista.listaEmpleadosArrayList.add(empleado3);
		Lista.listaEmpleadosArrayList.add(empleado4);
		
	//Decirle dónde queremos añadir el elemento en el ArrayList (posicion, elemento)
		Lista.listaEmpleadosArrayList.set(0,empleado5);
		
	//Ver numero de elementos en la ArrayList
		System.out.println("Número de elementos: " + Lista.listaEmpleadosArrayList.size());
		
	//Ver solamente la posición deseada
		System.out.println("Elemento en laposicion 2: " + Lista.listaEmpleadosArrayList.get(2).dameDatos());
		
	//Copiar un ArrayList a un Array
	//-Creamos un Array con el mismo tamaño que el ArrayList
		Empleado arrayEmpleados[] = new Empleado[Lista.listaEmpleadosArrayList.size()];
	//-Copiamos el ArrayList en el Array
		Lista.listaEmpleadosArrayList.toArray(arrayEmpleados);
		
	//Imprimir el Array
		System.out.println("\nImprimimos Array copiado desde un ArrayList");
		for(int i = 0; i < arrayEmpleados.length; ++i) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}
		
		ImprimirLista.imprimirListaForEach();
	}

}
