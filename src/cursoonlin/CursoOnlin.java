
package cursoonlin;

import cursoonlin.dao.CursoDao;
import cursoonlin.dao.CursoDaoImpl;
import cursoonlin.dao.CursosEstudiantesDao;
import cursoonlin.dao.CursosEstudiantesDaoImpl;
import cursoonlin.dao.EstudianteDao;
import cursoonlin.dao.EstudianteDaoImpl;
import cursoonlin.entidades.CursosEstudiantes;
import cursoonlin.entidades.Estudiantes;
import cursoonlin.entidades.curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursoOnlin {
    static String url= "jdbc:postgresql://localhost/cursos_online";
    static String user = "postgres";
    static String password = "1234";
    public static void main(String[] args) {
        CursosEstudiantesDao  estudianteDao = new CursosEstudiantesDaoImpl();
        CursosEstudiantes cursosEstudiante= new CursosEstudiantes(0,2,1); 
        estudianteDao.ingresar(cursosEstudiante);
        System.out.println("Datos Guardado");
        
        
        
//          CursoDao cursoDao= new CursoDaoImpl();
//          List<Estudiantes> estudiante= cursoDao.getEstudiantesPorCurso(1);
//          System.out.println(estudiante);

  //        curso newCurso = new curso(0, "Modificado Nuevo Curso de Java");
//        cursoDao.ingresar(newCurso);
        //cursoDao.actualizar(newCurso);
//        cursoDao.eliminar(5);
//        List<curso> cursos= cursoDao.getCursos();
//        System.out.println(cursos);
        
        //cursos = cursoDao.getCursos();
        //System.out.println(cursos.size());
//        EstudianteDao estudianteDao= new EstudianteDaoImpl();
//        List<curso> curso2= estudianteDao.getCursosEstudiantes(2);
//        List<curso> curso1= estudianteDao.getCursosEstudiantes(1);
//        System.out.println(curso1);
//        System.out.println();
//        System.out.println(curso2);
//      Estudiantes newEstudiante= new Estudiantes(0,"Lorena","Vera","lorena.vera@gmail.com");
//      estudianteDao.ingresar(newEstudiante);
//      estudianteDao.eliminar(4);
//      Estudiantes newEstudiante= new Estudiantes(3,"Jair","Calderon","jair.calderon@gmail.com");
//      estudianteDao.actualizar(newEstudiante);
//        List<Estudiantes> est= estudianteDao.getEstudiantes();
//        System.out.println(est);
        
        
        
    }

}
// NOMBRE: ELVIS CALDERON VERA