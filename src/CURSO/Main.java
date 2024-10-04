package CURSO;

import CURSO.Curso;
import CURSO.Estudiante;

public class Main{
    public static void main(String[] args) {
        //CURSOS//
        Curso fisica =new Curso("fisica", 6, "Alan");
        System.out.println(fisica.mostrarInfoCurso());

        Curso artes = new Curso("artes",4, "Diana");
        System.out.println(artes.mostrarInfoCurso());

        Curso historia = new Curso("historia", 9, "Santiago");
        System.out.println(historia.mostrarInfoCurso());

        //Estudiantes//
        Estudiante estudianteUno=new Estudiante("Wendy", 43);
        estudianteUno.agregarCurso(fisica);
        estudianteUno.agregarCurso(artes);
        estudianteUno.agregarCurso(historia);
        estudianteUno.mostrarInformacion();

        Estudiante estudianteDos=new Estudiante("Rosa Elia", 29);
        estudianteDos.agregarCurso(historia);
        estudianteDos.agregarCurso(fisica);
        estudianteDos.mostrarInformacion();


        Estudiante estudianteTres=new Estudiante("Vannesa", 31);
        estudianteTres.mostrarInformacion();
    }
}