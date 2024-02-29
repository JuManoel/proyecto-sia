package edu.prog2.model;

public class EstudianteRegular extends Estudiante{
    protected String programa;
    protected int semestre;
    public EstudianteRegular() {
        super();
    }
    public EstudianteRegular(String indentificacion,String nombre, String correo,String codigo,String programa,int semestre) {
        super(indentificacion, nombre, correo, codigo);
        setSemestre(semestre);
        setPrograma(programa);

    }

    public EstudianteRegular(EstudianteRegular er) {
        this(er.getIndentificacion(), er.getNombre(), er.getCorreo(), er.getCodigo(), er.getPrograma(),er.getSemestre());
    }
    public EstudianteRegular(Estudiante e, String programa,int semestre) {
        super(e);
        this.setAtributosUnicos(programa, semestre);
    }

    public EstudianteRegular(Persona p, String codigo, String programa,int semestre) {
        super(p, codigo);
        this.setAtributosUnicos(programa, semestre);
    }

    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAtributosUnicos(String programa, int semestre) {
        this.setPrograma(programa);
        this.setSemestre(semestre);
    }

    @Override
    public String toString() {
        String mensaje=super.toString();
        mensaje+=String.format(
            
            "Programa:        %s\n"+
            "Semestre:        %d\n", getPrograma(),getSemestre());
        return mensaje;
    }
}
