/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoonlin.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walt
 */
public class Estudiantes {
    private int id;
    private String nombres;
    private String apellidos;
    private String email;
    private List<curso> cursos= new ArrayList<>(); 

    public Estudiantes(){}

    public Estudiantes(int id, String nombres, String apellidos, String email) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<curso> cursos) {
        this.cursos = cursos;
    }

    
    @Override
    public String toString() {
        return "Estudiantes{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
    

    
}
