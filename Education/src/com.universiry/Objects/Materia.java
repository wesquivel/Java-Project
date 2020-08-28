package com.universiry.Objects;


/*
 * Class Materi
 * Extend from class Curso whith two constructors
 * public Materia(int id_materia, String name) and public Materia(int new_ID_materia)
 */
class Materia extends Curso {


        private  int id_teacher;
        private  int id_classroom;
        private  int id_student;
        //private boolean new_Student;

        public Materia(int id_materia, String name, int id_teacher, int id_classroom, int id_student) {
            super (id_materia, name);

            this.id_teacher 	=  id_teacher;
            this.id_classroom 	=  id_classroom;
            this.id_student 	=  id_student;
            }

        /*
         * Second Constructor inherited from class Curso
         */
        public Materia(int new_ID_materia) {
            super(new_ID_materia);
         }

         public Materia(boolean new_Student) {super (new_Student);}




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

        /*
        * searchMateria() Method
        * Identify which student records match with the materia ID searched (new_ID_materia)
         */
        public String  searchMateria(){
            if (new_ID_materia == id_materia || new_Student==true) {
                System.out.println("Materia_ID: " + id_materia + ", Materia Name: " + name + ",  Teacher_ID: " + id_teacher + ", " +
                        "Classroom: " + id_classroom + ", " + "Student: " + id_student + "\n");

            }
            return null;
        }

        /*
         * This method print the Materias records
         */
        @Override
        public String toString() {
            //if (new_ID_materia == id_materia) {
               // return  ("Materia_ID: " + id_materia + ", Materia Name: " + name + ",  Teacher_ID: " + id_teacher + ", " +
                 //       "Classroom: " + id_classroom + ", " + "Student: " + id_student + "\n");
           // }
            return searchMateria();

        }

}