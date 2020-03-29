

package Data;


import java.util.Scanner;
import Data.Student; 
import java.util.ArrayList;
import java.util.InputMismatchException;
import Data.Curso;



public class MainClass {

	
	
	
	
		public static void main(String[] args) {
		
			boolean salir = false;
		
		do { 
		
		
			System.out.println("Select the wished option:");
			System.out.println("----------------------------------------\n");
			System.out.println("Option 1: Teacher Info list");
			System.out.println("Option 2: Classess List");
			System.out.println("Option 3: Submenu - Classes Detail");
			System.out.println("Option 4: Create New Student");
			System.out.println("Option 5: Create New Class");
			System.out.println("Option 6: Found the Student Classes");
			
			
			int options;
			Scanner university = new Scanner(System.in);
			options = university.nextInt();
			
			try {
		
			  switch (options) {
                    case 1:
                    	
                    	System.out.println("Has seleccionado la opcion 1");
                    	System.out.println("                                    \n");
                  
                    	if (options == 1) {
                    	     //options = university.nextInt();
                    	
                    		
                    		ArrayList<Teacher> Teacher_List = new ArrayList<Teacher>();
                    		
	                    	
	                    	
	                    	
	                    	Teacher profeuno 	= 	new Teacher (001, "Felipe Jimenez", 10000, true, 1);
	                    	Teacher profedos 	= 	new Teacher (002, "Caro Aguilar", 11000, true, 1);
	                    	Teacher profetres 	= 	new Teacher (003, "Jessi Rodriguez", 12000, true, 1);
	                    	Teacher profecuatro = 	new Teacher (004, "Andres Cruz", 3500, false, 18);
	                    	Teacher profecinco 	= 	new Teacher (005, "Pepito Perez", 2500, false, 20);
	                    	
	                    	//int id_teacher, String name, int salary, boolean fulltime, int hours_per_week
	                    	
	                    	Teacher_List.add(profeuno);
	                    	Teacher_List.add(profedos);
	                    	Teacher_List.add(profetres);
	                    	Teacher_List.add(profecuatro);
	                    	Teacher_List.add(profecinco);
                    	}
                    
                        break;
                        
                    case 2:
                    	
                    	if (options == 2);{
                    	
                    	ArrayList<Student> student_list = new ArrayList<Student>();
                		
                    	Student st_uno 		= 	new Student (001, "Carlos Caro", 23, 16, 031);
                    	Student st_dos 		= 	new Student (002, "Sergio Diaz", 21, 015, 030);
                    	Student st_tres 	= 	new Student (003, "Ivan Teno", 24, 015, 030);
                    	Student st_cuatro 	= 	new Student (004, "Tom Pasta", 25, 015, 030);
                    	Student st_cinco 	= 	new Student (005, "Ester castro", 26, 015, 030);
                    	Student st_seis 	= 	new Student (006, "Viviana castro", 27, 015, 031);
                    	Student st_siete 	= 	new Student (007, "Luz castro", 28, 015, 031);
                    	
             
                    	student_list .add(st_uno);
                    	student_list .add(st_dos);
                    	student_list .add(st_tres);
                    	student_list .add(st_cuatro);
                    	student_list .add(st_cinco);
                    	student_list .add(st_seis );
                    	student_list .add(st_siete);
                    	
                    	System.out.println(student_list);
                	} 
                    	
                	
                    	
                       
                        break;
                        
                    case 3:
                        
                    	if (options == 3);{
                        	
                        	ArrayList<Curso> topic = new ArrayList<Curso>();
                    		
                        	Curso topic_uno 	= 	new Curso (030, "Calculo I");
                        	Curso topic_dos 	= 	new Curso (031, "Calculo II");
                        	Curso topic_tres 	= 	new Curso (032, "Iing SFTw");
                        	Curso topic_cuatro 	= 	new Curso (033, "Teoria de sistemas");
                        	Curso topic_cinco 	= 	new Curso (034, "Multivariado");
                        	Curso topic_seis 	= 	new Curso (035, "Desarrollo web");
                        	Curso topic_siete 	= 	new Curso (036, "proyecto de grado");
                        
                        	topic .add(topic_uno );
                        	topic .add(topic_dos);
                        	topic .add(topic_tres);
                        	topic .add(topic_cuatro);
                        	topic .add(topic_cinco);
                        	topic .add(topic_seis );
                        	topic .add(topic_siete);
                        	
                        	System.out.println(topic);
                        	System.out.println("Press 4 if you want to see the Matheria's Details ");
                    	
                    	} 
                    	//Will be a SubMenu
                    	/*
                    	 * else if (options == 4); {
                    	
                    	
                        	
                        	ArrayList<Materia> subject = new ArrayList<Materia>();
           
                        	Materia topic_uno 		= 	new Materia (030, "Calculo I", 001, 040, 001);
                        	Materia topic_dos 		= 	new Materia (031, "Calculo II", 002, 041, 002);
                        	Materia topic_tres 		= 	new Materia (032, "Iing SFTw", 24, 042, 003);
                        	Materia topic_cuatro 	= 	new Materia (033, "Teoria de sistemas", 004, 043, 004);
                        	Materia topic_cinco 	= 	new Materia (034, "Multivariado", 005, 044, 005);
                        	Materia topic_seis 		= 	new Materia (035, "Desarrollo web", 001, 045, 006);
                        	Materia topic_siete 	= 	new Materia (036, "proyecto de grado", 005, 046, 007);
                        	
                        	//int id_materia, String name, int id_teacher, int id_classroom, int id_student
                        	
                        	subject .add(topic_uno );
                        	subject .add(topic_dos);
                        	subject .add(topic_tres);
                        	subject .add(topic_cuatro);
                        	subject .add(topic_cinco);
                        	subject .add(topic_seis );
                        	subject .add(topic_siete);
                        	
                        	System.out.println(subject);
                    	} */
                    	
                    	
                        break;
                        
                    case 4:
                        
                    	if (options == 4); {
                    		
                    		ArrayList<Student> std = new ArrayList<Student>();
                    		
                    		Scanner keyboard1 = new Scanner (System.in);
                    		System.out.println("Student Id:");
                    		int id_student = keyboard1.nextInt();
                    		
                    		
                    		Scanner keyboard2 = new Scanner (System.in);
                    		System.out.println("Student Name:");
                    		String name = keyboard2.nextLine();
                    		
                    		Scanner keyboard3 = new Scanner (System.in);
                    		System.out.println("Student Age:");
                    		int age = keyboard3.nextInt();
                    		
                    		Scanner keyboard4 = new Scanner (System.in);
                    		System.out.println("Course ID");
                    		int id_course = keyboard4.nextInt();
                    		
                    		Scanner keyboard5 = new Scanner (System.in);
                    		System.out.println("Materia ID:");
                    		int id_materia = keyboard5.nextInt();
                    		
                    		
                    		
                    		//int id_student, String name, int age, int id_course, int id_materia
                    		//id_student, "name", age, id_course, id_materia
                    		
                    		Student topic_uno = new Student(id_student, "name", age, id_course, id_materia);
                    		
                    		std.add(topic_uno);
                    		
                    		System.out.println("Estudiante CReado:");
                    		System.out.println("-------------------");
                    
                    		System.out.println(std.add(topic_uno));
                    		
                    		
                    	}//(int id_student, String name, int age, int id_course, int id_materia)
                    	
                    	
                    	
                    	
                        break;
                    case 5:
                    
                    		if (options == 5); {
                    		
                    		ArrayList<Materia> topics = new ArrayList<Materia>();
                    		
                    		Scanner keyboard1 = new Scanner (System.in);
                    		System.out.println("Materia ID:");
                    		int id_materia = keyboard1.nextInt();
                    		
                    		
                    		
							Scanner keyboard2 = new Scanner (System.in);
                    		System.out.println("Matheria Name:");
                    		String name = keyboard2.nextLine();
                    		
                    		
							Scanner keyboard3 = new Scanner (System.in);
                    		System.out.println("Teacher ID:");
                    		int id_teacher = keyboard3.nextInt();
                    		
                    		
							Scanner keyboard4 = new Scanner (System.in);
                    		System.out.println("Classroom ID");
                    		int id_classroom = keyboard4.nextInt();
                    		
                    		
							Scanner keyboard5 = new Scanner (System.in);
                    		System.out.println("Student ID:");
                    		int id_student = keyboard5.nextInt();
                    		
                    	//int id_materia, String name, int id_teacher, int id_classroom, int id_student)
                    		
                    		
                    		Materia topic_uno = new Materia(id_materia, name, id_teacher, id_classroom, id_student);
                    		
                    		topics.add(topic_uno);
                    		
                    		System.out.println("Materia Creada:");
                    		System.out.println("-------------------");
                    
                    		System.out.println(topics);
                    		
                    		
                    	}
                    	
                    	
                    		
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        salir = true;
                        break;
                        
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
			  
			}catch (InputMismatchException e) {
                System.out.println("Debes insertar un número del 1 al 6");
                System.out.println("----------------------------------------\n");
                System.out.println("----------------------------------------\n");
                university.next();
			}
	   }while (salir != true);
  }

		private static Student Student(int id_materia, String name, int id_materia2, int id_materia3, int id_materia4) {
			// TODO Auto-generated method stub
			return null;
		}
}


//funcion orquestar menu  OK
//inicializar profesores
//inicializar estudiantes
//