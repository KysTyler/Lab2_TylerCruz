/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_tylercruz;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author Tyler C
 */
public class Lab2_TylerCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList empleados = new ArrayList();

        int salarioGerente = 50000, salarioAseador = 30000, salarioCajero = 40000, salarioSeguridad = 38000;
        boolean login = false;
        Scanner read = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("1. Registro de Empleados\n"
                    + "2. Despedir Empleados\n"
                    + "3. Log In\n"
                    + "4. Ascender Cajero\n"
                    + "5. Listar Empleados\n"
                    + "6. Modificar Empleado\n"
                    + "7. RANDOM\n"
                    + "8. Salir");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String name = read.next();
                    System.out.println("Ingrese su Apellido: ");
                    String apellido = read.next();
                    System.out.println("Ingrese su color favorito: ");
                    String favColor = read.next();
                    System.out.println("Ingrese su edad: ");
                    int edad = read.nextInt();
                    System.out.println("Ingrese su genero: (H/M) ");
                    String genero = read.next();
                    System.out.println("Ingrese altura: ");
                    double altura = read.nextDouble();
                    System.out.println("Ingrese peso: ");
                    int peso = read.nextInt();
                    System.out.println("Ingrese Titulo:  ");
                    String titulo = read.next();
                    System.out.println("Ingese su Cargo: ");
                    String cargo = read.next();
                    empleados.add(new Empleados(name, apellido, favColor, edad, genero, altura, peso, titulo, cargo));
                    break;
                case 2:

                    System.out.println("Ingresar el posicion del empleado que deseas Despedir: ");
                    int pos = read.nextInt();
                    empleados.remove(pos);
                    break;
                case 3:
                    System.out.println("Ingrese su username: ");
                    String username = read.next();
                    System.out.println("Ingrese password: ");
                    String password = read.next();
                    login = Login(username, password);
                    break;
                case 4:
                    //(Carro) inventario.get(p)).setMarca(m);
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Cajero")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    break;
                case 5:
                    for (Object o : empleados) {
                        System.out.println(empleados.indexOf(o) + "-" + o + "\n");
                    }
                    break;
                case 6:
                    int option1 = 0;
                    //p = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar"));
                    System.out.println("Ingrese el posicion a modificar: ");
                    int posM = read.nextInt();
                    while (option1 != 10) {
                        System.out.println("Que atributos deseas modificar: \n"
                                + "1) Modificar Nombre\n"
                                + "2) Modificar Apellido\n"
                                + "3) Modificar Color\n"
                                + "4) Modificar Edad\n"
                                + "5) Modificar Genero\n"
                                + "6) Modificar Altura\n"
                                + "7) Modificar Peso\n"
                                + "8) Modificar Titulo\n"
                                + "9) Modificar Cargo\n"
                                + "10) Salir");
                        option1 = read.nextInt();
                        switch (option1) {
                            case 1:
                                System.out.println("Ingrese el nuevo Nombre: ");
                                String newName = read.nextLine();
                                ((Empleados) empleados.get(posM)).setNombre(newName);

                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo Apellido: ");
                                String newApellido = read.nextLine();
                                ((Empleados) empleados.get(posM)).setApellido(newApellido);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo Color: ");
                                String newColor = read.nextLine();
                                ((Empleados) empleados.get(posM)).setColor(newColor);
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo Edad: ");
                                int newEdad = read.nextInt();
                                ((Empleados) empleados.get(posM)).setEdad(newEdad);
                                break;
                            case 5:
                                System.out.println("Ingrese el nuevo Genero (M/H): ");
                                String newGenero = read.next();
                                ((Empleados) empleados.get(posM)).setGenero(newGenero);
                                break;
                            case 6:
                                System.out.println("Ingrese el nuevo Altura: ");
                                int newAltura = read.nextInt();
                                ((Empleados) empleados.get(posM)).setAltura(newAltura);
                                break;
                            case 7:
                                System.out.println("Ingrese el nuevo Peso: ");
                                int newPeso = read.nextInt();
                                ((Empleados) empleados.get(posM)).setPeso(newPeso);
                                break;
                            case 8:
                                System.out.println("Ingrese el nuevo Titulo: ");
                                String newTitulo = read.next();
                                ((Empleados) empleados.get(posM)).setTitulo(newTitulo);
                                break;
                            case 9:
                                System.out.println("Ingrese el nuevo Cargo: ");
                                String newCargo = read.next();
                                ((Empleados) empleados.get(posM)).setCargo(newCargo);
                                break;

                        }
                    }

                    break;
                case 7:
                    break;

            }
        }

    }

    public static boolean Login(String name, String password) {
        String N = "leobanegas";
        String P = "99";
        if (name.equals(N) && password.equals(P)) {
            return true;
        } else {
            return false;
        }
    }

}
