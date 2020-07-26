
package cursoonlin.entidades;

public class CursosEstudiantes {
    private int id;
    private int IdCursos;
    private int IdEstudiantes; 
 
   public CursosEstudiantes(){}

    public CursosEstudiantes(int id, int IdCursos, int IdEstudiantes) {
        this.id = id;
        this.IdCursos = IdCursos;
        this.IdEstudiantes = IdEstudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCursos() {
        return IdCursos;
    }

    public void setIdCursos(int IdCursos) {
        this.IdCursos = IdCursos;
    }

    public int getIdEstudiantes() {
        return IdEstudiantes;
    }

    public void setIdEstudiantes(int IdEstudiantes) {
        this.IdEstudiantes = IdEstudiantes;
    }

}
