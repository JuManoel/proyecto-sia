package edu.prog2.model;

public class Estudiante extends Persona{
    protected String codigo;
    
    public Estudiante() {
        super();
    }
    
    public Estudiante(String indentificacion,String nombre, String correo,String codigo) {
        super(indentificacion,nombre,correo);
        this.setAtributosUnicos(codigo);
    }

    public Estudiante(Estudiante e) {
        this(e.getIndentificacion(), e.getNombre(), e.getCorreo(), e.getCodigo());
    }

    public Estudiante(Persona p, String codigo) {
        super(p);
        this.setCodigo(codigo);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setAtributosUnicos(String codigo){
        this.setCodigo(codigo);
    }

    @Override
    public String toString() {
        String mensaje=super.toString();
        mensaje+=String.format(
            "Codigo:          %s\n",getCodigo());
        return mensaje;
    }
}
