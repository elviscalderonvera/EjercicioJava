/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoonlin.dao;

import cursoonlin.entidades.Estudiantes;
import cursoonlin.entidades.curso;
import java.util.List;

/**
 *
 * @author walt
 */
public interface EstudianteDao {
    List<Estudiantes> getEstudiantes();
    void ingresar(Estudiantes est);
    void actualizar(Estudiantes est);
    void eliminar(int id);
    List<curso> getCursosEstudiantes(int estudianteId);
    
    
}
