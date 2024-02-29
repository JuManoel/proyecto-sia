package edu.prog2.model;

public class Professor extends Persona {
    private String area;

    public Professor() {
        super();
    }
    public Professor(String indentificacion, String nonbre,String correo, String area) {
        super(indentificacion, nonbre, correo);
        this.setArea(area);
    }

    public Professor(Professor p) {
        this(p.getIndentificacion(), p.getNombre(), p.getCorreo(), p.getArea());
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        String mensaje= super.toString();
        mensaje+=String.format(
            "Especialidad:    %s\n",
            this.getArea()
        );
        return mensaje;
    }
}
