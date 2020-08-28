package com.universiry.Objects;


import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;



public class MainClass {


    static Scanner university = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int options;


        do {
            options = menuprincipal();

            try {

                switch (options) {
                    case 1:
                        if (options == 1) {
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("                                    \n");

                            ArrayList<Teacher> Teacher_List = new ArrayList<Teacher>();

                            Teacher profeuno 	= 	new Teacher (001, "Felipe Jimenez", 10000, true, 0);
                            Teacher profedos 	= 	new Teacher (002, "Caro Aguilar", 11000, true, 0);
                            Teacher profetres 	= 	new Teacher (003, "Jessi Rodriguez", 12000, true, 0);
                            Teacher profecuatro = 	new Teacher (004, "Andres Cruz", 3500, false, 18);
                            Teacher profecinco 	= 	new Teacher (005, "Pepito Perez", 2500, false, 20);

                            Teacher_List.add(profeuno);
                            Teacher_List.add(profedos);
                            Teacher_List.add(profetres);
                            Teacher_List.add(profecuatro);
                            Teacher_List.add(profecinco);

                            System.out.println(Teacher_List);
                        }

                        break;

                    case 2:

                        if (options == 2);{

                            ArrayList<Student> student_list = new ArrayList<Student>();

                            Student st_uno 		= 	new Student (001, "Carlos Caro", 23, 16, 31);
                            Student st_dos 		= 	new Student (002, "Sergio Diaz", 21, 015, 30);
                            Student st_tres 	= 	new Student (003, "Ivan Teno", 24, 015, 30);
                            Student st_cuatro 	= 	new Student (004, "Tom Pasta", 25, 015, 30);
                            Student st_cinco 	= 	new Student (005, "Ester castro", 26, 015, 30);
                            Student st_seis 	= 	new Student (006, "Viviana castro", 27, 015, 31);
                            Student st_siete 	= 	new Student (007, "Luz castro", 28, 015, 31);


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

                        /*
                         * Call the course Class and send a list
                         */
                            ArrayList<Curso> topic = new ArrayList<Curso>();

                            Curso topic_uno 	= 	new Curso (30, "Calculo I");
                            Curso topic_dos 	= 	new Curso (31, "Calculo II");
                            Curso topic_tres 	= 	new Curso (32, "Ing SFW");
                            Curso topic_cuatro 	= 	new Curso (33, "Teoria general de sistemas");
                            Curso topic_cinco 	= 	new Curso (34, "Multivariado");
                            Curso topic_seis 	= 	new Curso (35, "Desarrollo web");
                            Curso topic_siete 	= 	new Curso (36, "proyecto de grado");

                            topic .add(topic_uno );
                            topic .add(topic_dos);
                            topic .add(topic_tres);
                            topic .add(topic_cuatro);
                            topic .add(topic_cinco);
                            topic .add(topic_seis );
                            topic .add(topic_siete);

                            System.out.println(topic);
                            System.out.println("Press 4 if you want to see the Matheria's Details ");
                            System.out.println("Press 5 if you want to go back to the before menu ");

                            do{

                                /*
                                 * Submenu for materias details
                                 */
                                int options1 = 0;
                                Scanner university1 = new Scanner(System.in);
                                options1 = university1.nextInt();

                                try {

                                    switch (options1) {
                                        case 4:
                                            if (options1 == 4) {


                                                    Scanner keyboard6 = new Scanner(System.in);
                                                    System.out.println("Materia´s ID:");
                                                    int new_ID_materia = keyboard6.nextInt();


                                                    ArrayList<Materia> subject = new ArrayList<Materia>();
                                                    Curso id = new Curso(new_ID_materia);
                                                    //id.searchMateria();


                                                    Materia matter_uno = new Materia(30, "Calculo I", 1, 40, 1);
                                                    Materia matter_dos = new Materia(31, "Calculo II", 2, 41, 2);
                                                    Materia matter_tres = new Materia(32, "Iing SFTw", 24, 42, 3);
                                                    Materia matter_cuatro = new Materia(33, "Teoria de sistemas", 4, 43, 4);
                                                    Materia matter_cinco = new Materia(34, "Multivariado", 5, 44, 5);
                                                    Materia matter_seis = new Materia(35, "Desarrollo web", 1, 45, 6);
                                                    Materia matter_siete = new Materia(36, "proyecto de ssgrado", 5, 46, 7);
                                                    Materia matter_ocho = new Materia(30, "proyecto de ssgrado", 5, 46, 8);

                                                    subject.add(matter_uno);
                                                    subject.add(matter_dos);
                                                    subject.add(matter_tres);
                                                    subject.add(matter_cuatro);
                                                    subject.add(matter_cinco);
                                                    subject.add(matter_seis);
                                                    subject.add(matter_siete);
                                                    subject.add(matter_ocho);


                                                    System.out.println(subject);

                                                    //pendiente como regresar al menu del 3

                                            }
                                    break;
                                    case 5:
                                        if (options1 == 5)
                                        {
                                            System.out.println("You are in the main menu again");
                                            menuprincipal();
                                            break;

                                            //pendiente como regresar al menu principal
                                        }
                                    /*
                                    *default: No pemite que al ingresar un numero mayor al ultimo numero del
                                    * menu se vuelva error, no hay necesidad de controloarlo por codigo
                                    */
                                    default:
                                }
                            }catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número del 4 al 5");
                                System.out.println("----------------------------------------\n");
                                System.out.println("----------------------------------------\n");
                                university1.next();
                            }
                        }while (salir!=true);   


                    }
                    break;

                    case 6:

                        if (options == 6); {

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


                        Student topic_uno = new Student(id_student, name, age, id_course, id_materia);



                        System.out.println("Estudiante CReado:");
                        System.out.println("-------------------");
                        System.out.println(topic_uno);
                        System.out.println("-------------------");

                    }

                    break;
                    case 7:

                        if (options == 7); {

                        boolean new_Student = true;

                        ArrayList<Materia> topics = new ArrayList<Materia>();

                        Curso otherStudent = new Curso(new_Student);

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




                        Materia topic_uno = new Materia(id_materia, name, id_teacher, id_classroom, id_student);

                        topics.add(topic_uno);

                        System.out.println("Materia Creada:");
                        System.out.println("-------------------");
                        System.out.println(topics);
                        System.out.println("-------------------");


                    }

                    break;

                    case 8:
                        System.out.println("You selected to Exit");
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

    /**********
     *Main Menu
     * ********/
    public static int menuprincipal(){
        System.out.println("Select the wished option:");
        System.out.println("----------------------------------------\n");
        System.out.println("Option 1: Teacher Info List");
        System.out.println("Option 2: Classess Info List");
        System.out.println("Option 3: Materias Info List - Search Student By Materia");
        System.out.println("Option 6: Add a Student to One Materia");
        System.out.println("Option 7: Add a Materia");
        System.out.println("Option 8: Exit From Menu");
        int opc = university.nextInt();
        return opc;
    }
}

