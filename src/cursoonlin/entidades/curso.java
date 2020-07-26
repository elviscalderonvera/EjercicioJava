/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoonlin.entidades;

import java.util.ArrayList;
import java.util.List;

public class curso {
    private int id;
    private String nombre;
    private List<Estudiantes> estudiante= new ArrayList<>(); 

    public curso() {}
    
    public curso(int id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiantes> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<Estudiantes> estudiante) {
        this.estudiante = estudiante;
    }

    
    @Override
    public String toString() {
        return "curso{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    
   
    
    
}
