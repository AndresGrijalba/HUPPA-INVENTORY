/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Visual;

/**
 *
 * @author oswal
 */
import Persistencia.*;
import Entidades.*;
import Logica.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Proveedores");
            System.out.println("2. Clientes");
            System.out.println("3. Empresa");
            System.out.println("4. Usuarios");
            System.out.println("5. Inventario");
            System.out.println("6. Producto");
            System.out.println("7. Salir del menú");
            System.out.print("Elija una opción: ");

            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            switch (opcionPrincipal) {
                case 1:
                    menuProveedores();
                    break;
                case 2:
                    menuClientes();
                    break;
                case 3:
                    menuEmpresa();
                    break;
                case 4:
                    menuUsuarios();
                    break;
                case 5: 
                     menuInventario();
                    break;
                case 6:
                    VistaConsola pantallaProducto = new VistaConsola();
                    pantallaProducto.EjecutarMenuProducto();
                    break;
                case 7:
                    System.out.println("Saliendo del menú principal.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void menuProveedores() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de Proveedores:");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Mostrar Proveedores Registrados");
            System.out.println("3. Modificar Proveedor");
            System.out.println("4. Borrar Proveedor");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    ListaProveedor.registrarProveedor();
                    break;
                case 2:
                    ListaProveedor.mostrarProveedoresRegistrados();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del proveedor a modificar:");
                    String nombreProveedorModificar = scanner.nextLine();
                    ListaProveedor.modificarProveedor(nombreProveedorModificar);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del proveedor a eliminar:");
                    String nombreProveedorEliminar = scanner.nextLine();
                    ListaProveedor.borrarProveedor(nombreProveedorEliminar);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
        }
                    
            }
    }

    public static void menuClientes() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de Clientes:");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Mostrar Clientes Registrados");
            System.out.println("3. Modificar Cliente");
            System.out.println("4. Borrar Cliente");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    ListaCliente.registrarCliente();
                    break;
                case 2:
                    ListaCliente.mostrarClientesRegistrados();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cliente a modificar:");
                    String nombreClienteModificar = scanner.nextLine();
                    ListaCliente.modificarCliente(nombreClienteModificar);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del cliente a eliminar:");
                    String nombreClienteEliminar = scanner.nextLine();
                    ListaCliente.borrarCliente(nombreClienteEliminar);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void menuEmpresa() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de Empresa:");
            System.out.println("1. Agregar información de la empresa");
            System.out.println("2. Volver al menú principal");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    Empresa.registrarEmpresa();
                    break;
                case 2:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
    
    public static void menuUsuarios(){
        ListaUsuario listaUsuarios = new ListaUsuario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de Usuario");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Mostrar Lista de Usuarios");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Modificar Usuario");
            System.out.println("5. Borrar Usuario");
            System.out.println("6. Salir del Menú");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar Usuario
                    Usuario usuario = crearUsuario();
                    listaUsuarios.agregarUsuario(usuario);
                    break;
                case 2:
                    // Mostrar Lista de Usuarios
                    listaUsuarios.mostrarListaUsuario();
                    break;
                case 3:
                    // Buscar Usuario
                    System.out.print("Ingrese el ID del usuario a buscar: ");
                    String idBuscar = scanner.next();
                    Usuario usuarioEncontrado = listaUsuarios.buscarUsuario(idBuscar);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuario encontrado:");
                        System.out.println("ID: " + usuarioEncontrado.getId());
                        System.out.println("Nombre: " + usuarioEncontrado.getNombre());
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;
                case 4:
                    // Modificar Usuario
                    System.out.print("Ingrese el ID del usuario a modificar: ");
                    String idModificar = scanner.next();
                    Usuario nuevoUsuario = crearUsuario();
                    listaUsuarios.modificarUsuario(idModificar, nuevoUsuario);
                    break;
                case 5:
                    // Borrar Usuario
                    System.out.print("Ingrese el ID del usuario a borrar: ");
                    String idBorrar = scanner.next();
                    listaUsuarios.borrarUsuario(idBorrar);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
        }
                    
        }
    }

    private static Usuario crearUsuario() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la persona: ");
    String nombre = scanner.next();
    System.out.print("Ingrese el ID del usuario: ");
    String id = scanner.next();
    System.out.print("Ingrese el nombre de usuario: ");
    String name = scanner.next();
    System.out.print("Ingrese la contraseña del usuario: ");
    String password = scanner.next();
    System.out.print("¿Es un usuario Administrador? (S/N): ");
    String isAdmin = scanner.next();

    if (isAdmin.equalsIgnoreCase("S")) {
        System.out.print("Ingrese el nivel del administrador: ");
        String nivel = scanner.next();
        return new Administrador(name, password, nivel, nombre, id);
    } else {
        System.out.print("Ingrese el nivel del empleado: ");
        String nivel = scanner.next();
        return new Empleado(name, password, nivel, nombre, id);
    }
}
    



public static void menuInventario() {
   
        ListaProducto listaProductos = new ListaProducto();
        Inventario inventario = new Inventario(listaProductos);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de Inventario");
            System.out.println("1. Buscar Producto");
            System.out.println("2. Entrada de Producto");
            System.out.println("3. Salida de Producto");
            System.out.println("4. Mostrar Lista de Productos");
            System.out.println("5. Salir del Menú");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
              case 1:
                    System.out.print("Ingrese la referencia del producto a buscar: ");
                    String referencia = scanner.nextLine();
                    Producto productoBuscado = inventario.buscarProducto(referencia);
                    if (productoBuscado != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println(productoBuscado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la referencia del producto para entrada: ");
                    String refEntrada = scanner.nextLine();
                    System.out.print("Ingrese la cantidad para entrada: ");
                    int cantidadEntrada = scanner.nextInt();
                    inventario.EntradaProducto(refEntrada, cantidadEntrada);
                    break;
                case 3:
                    System.out.print("Ingrese la referencia del producto para salida: ");
                    String refSalida = scanner.nextLine();
                    System.out.print("Ingrese la cantidad para salida: ");
                    int cantidadSalida = scanner.nextInt();
                    inventario.SalidaProducto(refSalida, cantidadSalida);
                    break;
                case 4:
                    inventario.mostrarListaProductos();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

}





