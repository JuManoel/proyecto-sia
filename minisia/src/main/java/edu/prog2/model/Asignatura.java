package edu.prog2.model;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int horas;
    private boolean cuantitativa;


    public Asignatura() {
        super();
    }

    public Asignatura(String codigo,String nombre,int horas, boolean cuantitativa) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuantitativa(cuantitativa);
    }

    public Asignatura(Asignatura a) {
        this(a.getCodigo(),a.getNombre(),a.getHoras(),a.getCuantitativa());
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean getCuantitativa(){
        return this.cuantitativa;
    }
    public void setCuantitativa(boolean cuantitativa) {
        this.cuantitativa = cuantitativa;
    }

    @Override
    public String toString() {
        String mensaje=String.format(
            "Codigo:          %s\n"+
            "Nombre:          %s\n"+
            "Horas:           %d\n"+
            "Cuantitativa:    %s\n",
            this.getCodigo(),this.getNombre(),this.getHoras(),this.getCuantitativa()?"Si":"No"
        );
        return mensaje;
    }
}
