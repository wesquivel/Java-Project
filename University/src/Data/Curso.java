package Data;

public class Curso{
	public int id_materia;
	private String name;
	//private int id_teacher;
	//private int id_classroom;
	//private int id_student;

	
	public Curso(int id_materia, String name) {
		this.id_materia = id_materia;
		this.name = name;
		
	}
	/*
	 * public Materia(int id_materia, String name, int id_teacher, int id_classroom, int id_student) {
		this.id_materia = id_materia;
		this.name = name;
		this.id_teacher = id_teacher;
		this.id_classroom = id_classroom;
		this.id_student = id_student;
	  	
	 */
		
/*		
	}

*/
	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Curso[Materia ID: "+ id_materia + ", Name: \"+ name +\"]\n";
	}
	
}
