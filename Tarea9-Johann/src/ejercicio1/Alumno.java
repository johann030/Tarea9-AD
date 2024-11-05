package ejercicio1;

import java.time.LocalDate;

public class Alumno {
	private int nia;
	private String nombre, apellidos, ciclo, curso, grupo;
	private LocalDate nacimiento;
	private char genero;

	public Alumno(int nia, String nombre, String apellidos, char genero, LocalDate nacimiento, String ciclo,
			String curso, String grupo) {
		this.nia = nia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.nacimiento = nacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
		this.grupo = grupo;
	}

	public Alumno() {
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Alumnos [nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciclo=" + ciclo
				+ ", curso=" + curso + ", grupo=" + grupo + ", genero=" + genero + ", nacimiento=" + nacimiento + "]";
	}
}