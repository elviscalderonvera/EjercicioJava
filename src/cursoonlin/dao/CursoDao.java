
package cursoonlin.dao;
import cursoonlin.entidades.curso;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface CursoDao {
    List<curso> getCursos();
    void ingresar(curso curso);
    void actualizar(curso curso);
    void eliminar(int id);
    
    
}
