package edu.prog2;

import java.util.ArrayList;

import edu.prog2.model.Asignatura;
import edu.prog2.model.Estudiante;
import edu.prog2.model.EstudianteEspecial;
import edu.prog2.model.EstudianteRegular;
import edu.prog2.model.Persona;
import edu.prog2.model.Professor;

public class App {
    public static void main(String[] args) {

        Persona p1=new Persona("1055761669","Juan Manoel Miranda Gómez","juan.miranda41303@ucaldas.edu.co");
        Estudiante s1=new Estudiante(p1, "41303");
        EstudianteRegular er1=new EstudianteRegular(s1, "Ingenieria Alimentos", 5);
        EstudianteEspecial es1=new EstudianteEspecial(s1, "Tecnico Informatica");
        
        Professor pro1=new Professor("Prof01", "Carlos Cuesta", "carlos.cuesta@ucaldas.edu.co", "Programacion Orientada a Objetos");
        ArrayList<Persona> listaPersonas=new ArrayList<>();
        
        listaPersonas.add(p1);
        listaPersonas.add(s1);
        listaPersonas.add(er1);
        listaPersonas.add(es1);
        listaPersonas.add(pro1);

        Asignatura as1=new Asignatura("41C04","Prog1",96,true);
        Asignatura as2=new Asignatura("42C04","Prog2",96,true);
        Asignatura as3=new Asignatura("43C04","Prog3",96,true);
        ArrayList<Asignatura> listaAsignaturas=new ArrayList<>();

        listaAsignaturas.add(as1);
        listaAsignaturas.add(as2);
        listaAsignaturas.add(as3);
        
        verPersonas(listaPersonas);
        verAsignaturas(listaAsignaturas);
    }

    private static void verPersona(Persona p){
        System.out.println(p);
        System.out.println("-----------------------------");
    }

    private static void verPersonas(ArrayList<Persona> p){
        for (Persona persona : p) {
            verPersona(persona);
        }
    }

    private static void verAsignatura(Asignatura a){
        System.out.println(a);
        System.out.println("-----------------------------");
    }

    private static void verAsignaturas(ArrayList<Asignatura> a){
        for (Asignatura asignatura : a) {
            verAsignatura(asignatura);
        }
    }
}