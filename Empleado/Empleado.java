package Empleado;

public class Empleado {
	
	//Atributos
	private String nombre;
	private int edad;
	private int id;
	private double salario;
	
	//Constructor
	public Empleado(String nombre, int id, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.salario = salario;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Métodos
	public String dameDatos() {
		
		return "Nombre: " + nombre + "\n"
			+ "Edad: " + edad + "\n"
			+ "ID: " + id + "\n"
			+ "Salario: " + salario;
	}
	
}
