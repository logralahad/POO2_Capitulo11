/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class DinnerEvent extends Event{
    
    public final static String[] ENTRADAS = {"papas bravas", "croquetas", "canapes", "sopa de verduras"};
    public final static String[] PLATILLOS = {"costillar a la parrilla", "lasagna", "pastel de carne", "lentejas"};
    public final static String[] POSTRES = {"pay de limon", "flan napolitano", "brocheta de frutas", "panque"};
    
    private Integer entrada;
    private Integer plato1;
    private Integer plato2;
    private Integer postre;
    private ArrayList<Employee> empleados;
        
    public DinnerEvent(Integer entrada, Integer plato1, Integer plato2, Integer postre, 
            String evento, Integer num_inv, String telefono, Integer modo_evento) {
        super(evento, num_inv, telefono, modo_evento);
        this.entrada = entrada;
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.postre = postre;
        this.empleados = new ArrayList<Employee>();
    }
    
    public void setEmpleados(ArrayList<Employee> empleados){
        this.empleados = empleados;
    }

    public ArrayList<Employee> getEmpleados() {
        return empleados;
    }
    
    public static String getMenu(){
        String entradas = String.format("Entradas: [0]%s [1]%s [2]%s [3]%s\n", 
                ENTRADAS[0], ENTRADAS[1], ENTRADAS[2], ENTRADAS[3]);
        String platillos = String.format("Platillos: [0]%s [1]%s [2]%s [3]%s\n", 
                PLATILLOS[0], PLATILLOS[1], PLATILLOS[2], PLATILLOS[3]);
        String postres = String.format("Postres: [0]%s [1]%s [2]%s [3]%s\n", 
                POSTRES[0], POSTRES[1], POSTRES[2], POSTRES[3]);
        return String.format("\n%s%s%s", entradas, platillos, postres);
    }
    
    public void printStaff(){
        System.out.print(String.format("\nTienes %d empleados.\n", this.empleados.size()));
        for (int i = 0; i < this.empleados.size(); i++) {
            System.out.println("Empleado " + (i + 1));
            Employee emp = this.empleados.get(i);
            System.out.println(emp.toString() + "\n");
        }
    }
    
    @Override
    public String eCosto(){
        String s1 = super.eCosto();
        String s2 = String.format("\nEntrada: %s\nPlatillo 1: %s\nPlatillo 2: %s\nPostre: %s", ENTRADAS[this.entrada], 
                PLATILLOS[this.plato1], PLATILLOS[this.plato2], POSTRES[this.postre]);
        
        return String.format("%s%s", s1, s2);
    }
    
    public static DinnerEvent crearEvento(int i){
        Scanner sc = new Scanner(System.in);
        int inv = 0, modo= 0, entrada = 0;
        int plato1 = 0, plato2 = 0, postre = 0;
        
        System.out.print("Nombre del evento " + (i + 1) + ": ");
        String name = sc.nextLine();

        do {
            System.out.print("Numero de invitados [5-100]: ");
            inv = sc.nextInt();

        } while (inv < 5 || inv > 100);
        sc.nextLine();

        System.out.print("Telefono: ");
        String tel = sc.nextLine();

        System.out.print("Modo de evento: [0]boda [1]bautizo"
                + " [2]cumpleanios [3]empresarial [4]otro: ");
        modo = sc.nextInt();

        System.out.println(DinnerEvent.getMenu());

        System.out.print("Entrada #: ");
        entrada = sc.nextInt();

        System.out.print("Platillo 1 #: ");
        plato1 = sc.nextInt();

        System.out.print("Platillo 2 #: ");
        plato2 = sc.nextInt();

        System.out.print("Postre #: ");
        postre = sc.nextInt();

        sc.nextLine();
        System.out.println("");
        
        return new DinnerEvent(entrada, plato1, plato2, postre, name, inv, tel, modo);
    }
    
    public void crearStaff(){
        Scanner sc = new Scanner(System.in);
        int mozos = (this.getNum_inv() / 10) + 1;
        int bartenders = (this.getNum_inv() / 25) + 1, i, j;
        
        System.out.print(String.format("Necesitas %d mozos\n", mozos));
        for (i = 0; i < mozos; i++) {
            this.empleados.add(this.crearMozo(i));
        }
        
        System.out.print(String.format("Necesitas %d bartenders\n", bartenders));
        for (j = 0; j < bartenders; j++) {
            this.empleados.add(this.crearBartender(i, j));
            i++;
        }
        
        System.out.print("Necesitas un coordinador.\n");
        this.empleados.add(this.crearCoordinador(i));
        
    }
    
    private Waitstaff crearMozo(Integer i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del mozo " + (i + 1) + ": ");
        String nombre = sc.nextLine();

        System.out.print("Apellido del mozo " + (i + 1) + ": ");
        String apellido = sc.nextLine();

        System.out.print("Pago por hora del mozo " + (i + 1) + ": ");
        int pago = sc.nextInt();

        sc.nextLine();
        System.out.print("\n");
        
        return new Waitstaff(i, nombre, apellido, pago);
    }
    
    private Bartender crearBartender(Integer i, Integer j){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del bartender " + (j + 1) + ": ");
        String nombre = sc.nextLine();

        System.out.print("Apellido del bartender " + (j + 1) + ": ");
        String apellido = sc.nextLine();

        System.out.print("Pago por hora del bartender " + (j + 1) + ": ");
        int pago = sc.nextInt();

        sc.nextLine();
        System.out.print("\n");
        
        return new Bartender(i, nombre, apellido, pago);
    }
    
    private Coordinator crearCoordinador(Integer i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del coordinador: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido del coordinador: ");
        String apellido = sc.nextLine();

        System.out.print("Pago por hora del coordinador: ");
        int pago = sc.nextInt();

        sc.nextLine();
        System.out.print("\n");
        
        return new Coordinator(i, nombre, apellido, pago);
    }
    
    
    
}
