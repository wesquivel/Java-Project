package Data;

class Materia extends Curso {
	
	
	private int id_teacher;
	private int id_classroom;
	private int id_student;
	
		public Materia(int id_materia, String name, int id_teacher, int id_classroom, int id_student) {
		super (id_materia, name);
		
		this.id_teacher 	=  id_teacher;
		this.id_classroom 	=  id_classroom;
		this.id_student 	=  id_student;
		
		}
		
		public int getId_teacher() {
			return id_teacher;
		}

		public void setId_teacher(int id_teacher) {
			this.id_teacher = id_teacher;
		}

		public int getId_classroom() {
			return id_classroom;
		}

		public void setId_classroom(int id_classroom) {
			this.id_classroom = id_classroom;
		}

		public int getId_student() {
			return id_student;
		}

		public void setId_student(int id_student) {
			this.id_student = id_student;
		}
		
	@Override
	public String toString() {
		return "Materia[Materia_ID: \"+ id_materia +\", Materia Name: \"+ name  +\",  Teacher_ID: \"+ id_teacher+\", Classroom: \"+ id_classroom +\", Student: \"+id_student+\"]\n";
	}
	
}