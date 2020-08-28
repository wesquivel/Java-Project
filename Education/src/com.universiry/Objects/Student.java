package com.universiry.Objects;

    public class Student {
        public int id_student;
        private String name;
        private int age;
        private int id_course;
        private int id_materia;

        public Student(int id_student, String name, int age, int id_course, int id_materia){
            this.id_student = id_student;
            this.name = name;
            this.age = age;
            this.id_course = id_course;
            this.id_materia = id_materia;

        }

    // setter Methods
        public void setid(int id_student) {
            this.id_student = id_student;
        }

        public void setname(String name) {
            this.name = name;
        }

        public void setage(int age) {
            this.age = age;
        }

        public void setid_course(int id_course) {
            this.id_course = id_course;
        }

        public void setid_materia(int id_materia) {
            this.id_materia= id_materia;
        }

        //Getter Methods
        public int getid_student() {
            return id_student;
        }

        public String getname() {return name;}

        public int getage() {return age;}

        public int getid_course() {
            return id_course;
        }

        public int getid_materia() {
            return id_materia;
        }


    @Override
    public String toString() {
        return "Student[Student ID: "+ id_student +" , Name: " + name + ", Age: " + age+ ", CourseID: "+ id_course + ", Topic: "+id_materia+"]\n";
    }


}
