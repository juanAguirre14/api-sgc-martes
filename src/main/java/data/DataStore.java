package data;

import models.Cursos;
import models.Matriculas;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private final List<Students> studentsList;
    private final List<Cursos> cursosList;
    private final List<Matriculas> matriculasList;

    public DataStore() {
        studentsList = new ArrayList<>();
        cursosList = new ArrayList<>();
        matriculasList = new ArrayList<>();
    }

    public List<Students> getStudents() {
        return studentsList;
    }

    public void addStudent(Students student) {
        studentsList.add(student);
    }

    public Students getStudents(Long id) {
        for (Students student : studentsList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Long id) {
        Students student = getStudents(id);
        if (student != null) {
            studentsList.remove(student);
        }

    }

    public List<Cursos> getCursos() {
        return cursosList;
    }

    public void addCurso(Cursos curso) {
        cursosList.add(curso);
    }

    public Cursos getCursos(Long id) {
        for (Cursos cursos : cursosList) {
            if (cursos.getId() == id) {
                return cursos;
            }
        }
        return null;
    }

    public void removeCurso(Long id) {
        Cursos cursos = getCursos(id);
        if (cursos != null) {
            cursosList.remove(cursos);
        }

    }

    public List<Matriculas> getMatriculas() {
        return matriculasList;
    }

    public void addMatricula(Matriculas matriculas) {
        matriculasList.add(matriculas);
    }

    public Matriculas getMatriculas(Long idStudent) {
        for (Matriculas matriculas : matriculasList) {
            if (matriculas.getIdStudent().equals(idStudent)) {
            return matriculas;
        }
            }
        return null;
    }

    public void removeMatriculas(Long idStudent) {
        Matriculas matriculas = getMatriculas(idStudent);
        if (matriculas != null) {
            matriculasList.remove(matriculas);
        }
    }
}


