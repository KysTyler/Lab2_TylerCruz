/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_tylercruz;

import java.util.ArrayList;
import java.util.Random;
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
    static Random R = new Random();

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList empleados = new ArrayList();
        String name = "", apellido = "", favColor = "", genero = "", titulo = "", cargo = "";
        int cantGerentes = 0;
        int edad = 0, peso = 0;
        double altura = 0;
        int salarioGerente = 50000, salarioAseador = 30000, salarioCajero = 40000, salarioSeguridad = 38000;
        boolean login = false;
        Scanner read = new Scanner(System.in);
        int option = 0;
        while (option != 8) {
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
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        String username = read.next();
                        System.out.println("Ingrese password: ");
                        String password = read.next();
                        login = Login(username, password);

                    }
                    System.out.println("Ingrese su nombre: ");
                    name = read.next();
                    System.out.println("Ingrese su Apellido: ");
                    apellido = read.next();
                    System.out.println("Ingrese su color favorito: ");
                    favColor = read.next();
                    System.out.println("Ingrese su edad: ");
                    edad = read.nextInt();
                    System.out.println("Ingrese su genero: (H/M) ");
                    genero = read.next();
                    System.out.println("Ingrese altura: ");
                    altura = read.nextDouble();
                    System.out.println("Ingrese peso: ");
                    peso = read.nextInt();
                    System.out.println("Ingrese Titulo:  ");
                    titulo = read.next();
                    System.out.println("Ingese su el Cargo: \n"
                            + "1) Gerente\n"
                            + "2) Aseadores\n"
                            + "3) Seguridad\n"
                            + "4) Cajero");
                    int cargo00 = read.nextInt();
                    switch (cargo00) {
                        case 1:
                            if (cantGerentes <= 2) {

                                cargo = "Gerente";
                                cantGerentes++;
                            } else {
                                System.out.println("No se pudo asignar Gerente");
                            }
                            break;
                        case 2:
                            cargo = "Aseador";
                            break;
                        case 3:
                            cargo = "Seguridad";
                            break;
                        case 4:
                            cargo = "Cajero";
                            break;

                    }
                    empleados.add(new Empleados(name, apellido, favColor, edad, genero, altura, peso, titulo, cargo));
                    break;
                case 2:
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        String username = read.next();
                        System.out.println("Ingrese password: ");
                        String password = read.next();
                        login = Login(username, password);

                    }
                    System.out.println("Ingresar el posicion del empleado que deseas Despedir: ");
                    int pos = read.nextInt();
                    empleados.remove(pos);
                    if (((Empleados) empleados.get(pos)).getCargo().equals("Gerente")) {
                        cantGerentes--;
//                        for (int i = 0; i < empleados.size(); i++) {
//                            if (((Empleados) empleados.get(i)).getCargo().equals("Cajero")) {
//                               ((Empleados) empleados.get(i)).setCargo("Gerente");
//                            }
//                        }
                    }
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
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        username = read.next();
                        System.out.println("Ingrese password: ");
                        password = read.next();
                        login = Login(username, password);

                    }
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Cajero")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    System.out.println("Ingrese la posicion del Cajero que deseas Ascender: ");
                    int posA = read.nextInt();
                    if (((Empleados) empleados.get(posA)).getCargo().equals("Cajero")) {
                        if (cantGerentes <= 2) {
                            ((Empleados) empleados.get(posA)).setCargo("Gerente");
                        }
                    }
                    break;
                case 5:
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        username = read.next();
                        System.out.println("Ingrese password: ");
                        password = read.next();
                        login = Login(username, password);

                    }
                    System.out.println("Gerente: ");
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Gerente")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    System.out.println("");
                    System.out.println("Aseadores: ");
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Aseador")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    System.out.println("");
                    System.out.println("Cajeros: ");
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Cajero")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    System.out.println("");
                    System.out.println("Seguridad: ");
                    for (int i = 0; i < empleados.size(); i++) {
                        if (((Empleados) empleados.get(i)).getCargo().equals("Seguridad")) {
                            System.out.println(empleados.indexOf(i) + "- " + empleados.get(i) + "\n");
                        }
                    }
                    System.out.println("");

                    break;
                case 6:
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        username = read.next();
                        System.out.println("Ingrese password: ");
                        password = read.next();
                        login = Login(username, password);

                    }
                    int option1 = 0;
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
                                newName = read.nextLine();
                                ((Empleados) empleados.get(posM)).setNombre(newName);

                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo Apellido: ");
                                String newApellido = read.nextLine();
                                newApellido = read.nextLine();
                                ((Empleados) empleados.get(posM)).setApellido(newApellido);
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo Color: ");
                                String newColor = read.nextLine();
                                newColor = read.nextLine();
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
                                if (cantGerentes <= 3) {

                                    System.out.println("Ingrese el nuevo Cargo: ");
                                    String newCargo = read.next();
                                    ((Empleados) empleados.get(posM)).setCargo(newCargo);
                                    System.out.println("Ingese su el Cargo: \n"
                                            + "1) Gerente\n"
                                            + "2) Aseadores\n"
                                            + "3) Seguridad\n"
                                            + "4) Cajeros");
                                    cargo00 = read.nextInt();
                                    switch (cargo00) {
                                        case 1:
                                            cargo = "Gerente";
                                            break;
                                        case 2:
                                            cargo = "Aseador";
                                            break;
                                        case 3:
                                            cargo = "Seguridad";
                                            break;
                                        case 4:
                                            cargo = "Cajero";
                                            break;
                                    }
                                } else {
                                    System.out.println("No se pudo hacer el cambio porque no pueden habermas de 3 Gerentes");
                                }

                                break;

                        }
                    }

                    break;
                case 7:
                    int randomsize = 0;
                    while (login == false) {
                        System.out.println("Primero tienes que ingresar al Login:");
                        System.out.println("Ingrese su username: ");
                        username = read.next();
                        System.out.println("Ingrese password: ");
                        password = read.next();
                        login = Login(username, password);

                    }
                    String[] cargos = {"Gerente", "Aseador", "Seguridad", "Cajero"};
                    System.out.println("Ingrese un numero: ");
                    int randomN = read.nextInt();
                    while (randomsize < randomN) {
                        if (cantGerentes <= 2) {
                            ((Empleados) empleados.get(0 + R.nextInt(empleados.size()))).setCargo(cargos[0 + R.nextInt(cargos.length)]);

                        }
                        randomsize++;

                    }

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
