import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while(opcion!=3){
            System.out.println("Notas Pao :)");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Lista de Tareas");
            System.out.println("3.Salir");
            try{
                opcion=sc.nextInt();
                sc.nextLine();
                switch(opcion){
                    case 1:
                        System.out.println("Ingresa tu tarea");
                        try (FileWriter writer = new FileWriter("ListDeTareas.txt", true);
                             BufferedWriter bw = new BufferedWriter(writer)){
                            System.out.print("Ingrese su tarea: ");
                            String tarea = sc.nextLine();
                            bw.write(tarea + "\n");
                        }catch (IOException e){
                            System.out.println("Error aal sobreescribir el archivo: " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Lista de tares: ");
                        try (BufferedReader read = new BufferedReader(new FileReader("ListaDeTareas.txt"))) {
                            String lectura;
                            while ((lectura = read.readLine()) != null) {
                                System.out.println(lectura);
                            }
                        } catch (IOException e){
                            System.out.println("Error al leer el archivo :(" + e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("Programa cerrado :/ ");
                        break;

                    default:
                        System.out.println("Opcion invalida");


                }

            }catch(Exception e){
                System.out.println("Ingrese un numero por favor");
                sc.nextLine();

            }
            System.out.println();
        }

    }

}