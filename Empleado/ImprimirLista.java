package Empleado;

public class ImprimirLista {
	
	//Cambiarlo a un Array
	public static void imprimirLista() {
		for (Empleado e: Lista.listaEmpleadosArrayList) {
	
			System.out.println(e.dameDatos());
		}
	}
	
	public static void imprimirListaForEach() {
		for(int i = 0; i < Lista.listaEmpleadosArrayList.size(); i++) {
			Empleado e = Lista.listaEmpleadosArrayList.get(i);
			System.out.println(e.dameDatos());
		}
	}

}
