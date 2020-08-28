package com.universiry.Objects;


    /*
     * Class Curso
     * Same number of course, same number of Materias
     */
    public class Curso{
            public int id_materia;
            public String name;
            public static int new_ID_materia;
            public static boolean new_Student;

            public Curso(int id_materia, String name) {
                this.id_materia = id_materia;
                this.name = name;

            }

            /*
             * Second Constructor
             * Parameter: new_ID_materia
             */
            public Curso(int new_ID_materia) {
                this.new_ID_materia = new_ID_materia;
            }

        /*
         * Third Constructor
         * Parameter: new_Student
         */
            public Curso(boolean new_Student) {this.new_Student = new_Student; }



            public boolean getnew_Student() {return new_Student;}
            public void setnew_Student(int new_ID_materia) {
                this.new_Student = new_Student;
            }

            public int getnew_ID_materia() {return new_ID_materia;}
            public void setnew_ID_materia(int new_ID_materia) {
                this.new_ID_materia = new_ID_materia;
            }

            public int getId_materia() {
                return id_materia;
            }
            public String getName() {
                return name;
            }

            public void setId_materia(int id_materia) {
                this.id_materia = id_materia;
            }
            public void setName(String name) {
                this.name = name;
            }

            /*
             * This method print the Curso records
             */
            @Override
            public String toString() {
                return "Curso[ Materia ID: " + id_materia + ", Name: " + name + "]\n";
            }

    }
