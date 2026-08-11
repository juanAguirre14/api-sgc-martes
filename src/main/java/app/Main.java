package app;

import models.Cursos;
import models.Matriculas;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        Students student0 = new Students();
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();


        student0.setId(1L);
        student0.setFirstName("John");
        student0.setLastName("Doe");
        student0.setEmail("john00@cesde.net");
        student0.setPhone("0011234567");
        students.add(student0);


        student1.setId(2L);
        student1.setFirstName("Jane");
        student1.setLastName("Smith");
        student1.setEmail("jane01@cesde.net");
        student1.setPhone("0011234568");
        students.add(student1);


        student2.setId(3L);
        student2.setFirstName("Leinner");
        student2.setLastName("Giraldo");
        student2.setEmail("leinner03@cesde.net");
        student2.setPhone("0011234569");
        students.add(student2);


        student3.setId(4L);
        student3.setFirstName("Valeria");
        student3.setLastName("Alvarez");
        student3.setEmail("valeria04@cesde.net");
        student3.setPhone("0011234560");
        students.add(student3);


        student4.setId(5L);
        student4.setFirstName("Paulina");
        student4.setLastName("Morelo");
        student4.setEmail("paulina05@cesde.net");
        student4.setPhone("0011234561");
        students.add(student4);


        System.out.println("List of students");
        for (Students student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName() + ", Email: " + student.getEmail() + ", Phone: " + student.getPhone());

        }
        List<Cursos> cursos = new ArrayList<>();

        cursos.add(new Cursos(1L, "INGLÉS", "Inglés desde cero", "Curso básico de inglés", 30, "2026-07-29T23:02:51.841622"));
        cursos.add(new Cursos(2L, "CÁTEDRA", "Cátedra ser emprendedor", "Curso básico sobre emprender", 26, "2026-07-29T23:02:51.841622"));

        System.out.println("\nAssigned courses ");
        for (Cursos curso : cursos) {
            System.out.println("ID: " + curso.getId() + " " + "Code: " + curso.getCode() + " " + "Name: " + curso.getName() + " " + "Description: " + curso.getDescription() + " " + "Max capacity: " + curso.getMaxCapacity() + " " + "Created at: " + curso.getCreatedAt());
        }

        List<Matriculas> matriculas = new ArrayList<>();
        matriculas.add(new Matriculas(1L, 2L, true, "2026-08-10T19:02:51.841622"));
        matriculas.add(new Matriculas(2L, 1L, true, "2026-08-10T20:02:51.841622"));
        matriculas.add(new Matriculas(1L, 1L, false, "2023-08-11T19:02:51.841622"));

        System.out.println("\nList of enrollments");
        for (Matriculas matricula : matriculas) {
            System.out.println("ID del estudiante: " + matricula.getIdStudent() + "," + " ID del curso: " + matricula.getIdCourse() + "," + " Estado de la matrícula: " + matricula.getStatusTexto() + "," + " Fecha: " + matricula.getMatriculaDate());

        }
    }
    }

