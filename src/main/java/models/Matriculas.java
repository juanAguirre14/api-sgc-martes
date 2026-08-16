package models;

import java.time.LocalDateTime;

public class Matriculas {

    private Long idStudent;
    private Long idCourse;
    private boolean status;
    private String matriculaDate;

    public Matriculas(){

    }

    public Matriculas (Long idStudent, Long idCourse, boolean status)
    {
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.status = status;
        this.matriculaDate = LocalDateTime.now().toString();
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getStatusTexto() {
        return this.status ? "ACTIVA" : "INACTIVA";
    }
    public String getMatriculaDate() {
        return matriculaDate;
    }

    public void setMatriculaDate(String matriculaDate) {
        this.matriculaDate = matriculaDate;
    }
}
