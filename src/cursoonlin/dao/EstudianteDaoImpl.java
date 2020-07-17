/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoonlin.dao;

import cursoonlin.entidades.Estudiantes;
import cursoonlin.util.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walt
 */
public class EstudianteDaoImpl implements EstudianteDao{

    @Override
    public List<Estudiantes> getEstudiantes() {
        List<Estudiantes> estudiante= new ArrayList<>();
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url,Util.user,Util.password);
            System.out.println("Conexion exitosa....");
            String sql= "SELECT id, nombres, apellidos, email FROM public.estudiantes;";
            PreparedStatement stm= conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Estudiantes est= new Estudiantes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                estudiante.add(est);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return estudiante;
    }

    @Override
    public void ingresar(Estudiantes est) {
        String query= "INSERT INTO public.estudiantes(nombres, apellidos, email)VALUES (?, ?, ?);";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url,Util.user,Util.password);
            PreparedStatement stm= conn.prepareStatement(query);
            stm.setString(1, est.getNombres());
            stm.setString(2, est.getApellidos());
            stm.setString(3, est.getEmail());
            stm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Estudiantes est) {
        String query="UPDATE public.estudiantes SET nombres=?, apellidos=?, email=? WHERE id=?;";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url,Util.user,Util.password);
            PreparedStatement stm= conn.prepareStatement(query);
            stm.setString(1, est.getNombres());
            stm.setString(2, est.getApellidos());
            stm.setString(3, est.getEmail());
            stm.setInt(4, est.getId());
            stm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        String query= "DELETE FROM public.estudiantes WHERE id=?;";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url,Util.user,Util.password);
            PreparedStatement stm= conn.prepareStatement(query);
            stm.setInt(1, id);
            stm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    
}
