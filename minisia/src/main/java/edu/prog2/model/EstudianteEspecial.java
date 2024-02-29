package edu.prog2.model;

public class EstudianteEspecial extends Estudiante{
    protected String curso;
    public EstudianteEspecial() {
        super();
    }
    public EstudianteEspecial(String indentificacion,String nombre, String correo,String codigo, String curso) {
        super(indentificacion, nombre, correo, codigo);
        setCurso(curso);
    }

    public EstudianteEspecial(EstudianteEspecial es) {
        this(es.getIndentificacion(), es.getNombre(), es.getCorreo(), es.getCodigo(), es.getCurso());
    }
    public EstudianteEspecial(Estudiante e,String curso) {
        super(e);
        System.out.println(">>>>"+this.toString());
        this.setAtributosUnicos(curso);

    }
    public EstudianteEspecial(Persona p,String codigo,String curso) {
        super(p, codigo);
        this.setAtributosUnicos(curso);
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void setAtributosUnicos(String curso) {
        this.setCurso(curso);
    }

    @Override
    public String toString() {
        String mensaje=super.toString();
        mensaje+=String.format(
            "curso:           %s\n", getCurso());
        return mensaje;
    }

}
