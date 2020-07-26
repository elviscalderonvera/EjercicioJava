/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoonlin.dao;

import cursoonlin.entidades.CursosEstudiantes;
import cursoonlin.util.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author walt
 */
public class CursosEstudiantesDaoImpl implements CursosEstudiantesDao{

    @Override
    public void ingresar(CursosEstudiantes cursos) {
        String query= "INSERT INTO public.cursos_estudiantes(curso_id, estudiante_id)VALUES (?, ?);";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url,Util.user,Util.password);
            PreparedStatement stm= conn.prepareStatement(query);
            stm.setInt(1, cursos.getIdCursos());
            stm.setInt(2, cursos.getIdEstudiantes());
            stm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
