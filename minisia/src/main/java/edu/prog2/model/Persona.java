package edu.prog2.model;

public class Persona {
    //atributos persona
    protected String indentificacion;
    protected String nombre;
    protected String correo;

    public Persona() {
        //constructor por defecto
        super();
    }
    public Persona(String indentificacion,String nombre,String correo) {
        //constructor parametrizado
        setCorreo(correo);
        setNombre(nombre);
        setIndentificacion(indentificacion);
    }

    public Persona(Persona p) {
        //constructor copia
        this(p.getIndentificacion(), p.getNombre(), p.getCorreo());
    }

    //setters y getters
    public void setCorreo(String correo) {
        this.correo = correo;
    }public String getCorreo() {
        return correo;
    }public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }public String getIndentificacion() {
        return indentificacion;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String mensaje=String.format(
        "Indentificacion: %s\n"+
        "Nombre:          %s\n"+
        "Correo:          %s\n"
        ,getIndentificacion(),getNombre(),getCorreo());
        return mensaje;
    }
}
