/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;

import Entidades.*;
import Logica.LogicaProducto;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class VistaConsola {
    
    private LogicaProducto logica;
    
    public VistaConsola(){
        this.logica = new LogicaProducto();
    }
    
    public void MostrarMenuProducto(){
        System.out.println("");
        System.out.println("------ Menu Opcion Producto -------");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Listar Productos");
        System.out.println("3. Buscar Producto");
        System.out.println("4. Eliminar Producto");
        System.out.println("5. Modificar Producto");
        System.out.println("6. Salir");
    }
    
    public void EjecutarMenuProducto(){
        int opcionSeleccionada;
        do {
            this.MostrarMenuProducto();
            opcionSeleccionada = Entrada.leerInt("Seleccione una opcion");
            switch (opcionSeleccionada) {
                case 1:
                    this.opcionAgregarProducto();
                    break;
                case 2:
                    this.opcionListaProducto();
                    break;
                case 3:
                    this.opcionBuscarProducto();
                    break;
                case 4:
                    this.opcionEliminarProducto();
                case 5:
                    //this.opcionModificarProducto();
                case 6:
                    System.out.println("!! Funcion finalizada con exito ¡¡");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");
            }

        } while (opcionSeleccionada != 6);    
    }
    
    public void opcionAgregarProducto(){
        boolean op = true;
        
        while(op == true){
            System.out.println("");
            System.out.println("-------- Agregar Producto -------");
            System.out.println("---------------------------------");
            Producto nuevoProducto;
            
            String referencia = Entrada.leerLinea("Ingrese la referencia del producto");
            String descripcion = Entrada.leerLinea("Ingrese el nombre del producto");
            char categoria = Entrada.leerChar("Categoria: [A -> Accesorio] o [* -> Cosmetico]");
            
            String base = "DISPONIBLE";
            EstadoDeProducto Estado = Enum.valueOf(EstadoDeProducto.class, base);
            String estado = Estado.getEstado();
            String categoriaP;
            
            switch (categoria) {
                case 'A' -> {
                    String baseA = "ACCESORIO";
                    TipoDeProducto tipo = Enum.valueOf(TipoDeProducto.class, baseA);
                    categoriaP = tipo.getCategoria();
                    String detalle = Entrada.leerLinea("Ingrese genero o talla del accesorio");
                    nuevoProducto = new Accesorio(detalle, referencia, descripcion, estado, categoriaP,0);
                }
                default -> {
                    String baseC = "COSMETICO";
                    TipoDeProducto tipo = Enum.valueOf(TipoDeProducto.class, baseC);
                    categoriaP = tipo.getCategoria();
                    LocalDate fechaDeCaducidad = Entrada.leerFecha("Fecha de caducidad");
                    nuevoProducto = new Cosmetico(fechaDeCaducidad, referencia, descripcion, estado, categoriaP,0);
                }
            }
            this.logica.registrarProducto(nuevoProducto);
            System.out.println("Producto Registrado con Exito!!");
            op = Entrada.Control("Desea registrar otro Producto [S/N]");
        }
    }
    
    public void opcionListaProducto(){
        char salirAlMenu;
        
        System.out.println("");
        System.out.println("-------------------------------------------------- Lista De Productos -----------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %20s %20s %19s %35s\n", 
                           "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for (Producto f : this.logica.consultarProducto()) {
            System.out.println(f);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Productos Registrados : " + this.logica.consultarProducto().size());
        System.out.println("");
        salirAlMenu = Entrada.leerChar("Presione cualquier tecla para volver al menu");
    }
    
    public void opcionBuscarProducto(){
        boolean op = true;
        
        while(op == true){
            
            System.out.println("");
            System.out.println(" -------- BUSCAR PRODUCTO -------- ");
            System.out.println("-----------------------------------");
            this.menuBuscarProducto();
            int opcionBusqueda = Entrada.leerInt("Ingresa una opcion de busqueda");
            switch (opcionBusqueda) {
                case 1:
                    this.buscarReferencia();
                    break;
                case 2:
                    this.buscarDescripcion();
                    break;
                case 3:
                    this.buscarCategoria();
                    break;
                case 4:
                    this.buscarEstado();
                    break;
                default:
                    System.out.println("Opcion invalida!!!");
            }
            op = Entrada.Control("Desea Buscar otro Producto [S/N]");
        }
        
    }
    
    public void menuBuscarProducto(){
        System.out.println("Elija una opcion para Buscar Productos");
        System.out.println("1. Por Referencia");
        System.out.println("2. Por Descripcion");
        System.out.println("3. Por Categotia");
        System.out.println("4. Por Estado");        
    }
    
    public void buscarReferencia(){
        Producto productoBuscado;
            int opcionBusqueda = 1;
            String CarProducto = Entrada.leerLinea("Referencia");
            productoBuscado = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
            System.out.println("---------------------------------");
            if(productoBuscado==null){
                System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
            }
            else{
                System.out.printf("%15s %20s %20s %19s %35s\n", 
                           "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                this.logica.buscarProducto(CarProducto, opcionBusqueda);
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
    }
    
    public void buscarDescripcion(){
            Producto productoBuscado;
            int opcionBusqueda = 2;
            String CarProducto = Entrada.leerLinea("Descripcion");
            productoBuscado = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
            System.out.println("---------------------------------");
            if(productoBuscado==null){
                System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
            }
            else{
                System.out.printf("%15s %20s %20s %19s %35s\n", 
                           "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                this.logica.buscarProducto(CarProducto, opcionBusqueda);
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
    }
    
    public void buscarCategoria(){   
            Producto productoBuscado;
            int opcionBusqueda = 3;
            String CarProducto = this.seleccionCategoria();
            productoBuscado = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
            
            System.out.println("---------------------------------");
            if(productoBuscado==null){
                System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
            }
            else{
                System.out.printf("%15s %20s %20s %19s %35s\n", 
                           "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                this.logica.buscarProducto(CarProducto, opcionBusqueda);
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
    }
    
    public String seleccionCategoria(){
        String categoriaP; 
        char categoria = Entrada.leerChar("Categoria: [A -> Accesorio] o [* -> Cosmetico]");
        switch (categoria) {
                case 'A' -> {
                    String baseA = "ACCESORIO";
                    TipoDeProducto tip = Enum.valueOf(TipoDeProducto.class, baseA);
                    categoriaP = tip.getCategoria();
                }
                default -> {
                    String baseC = "COSMETICO";
                    TipoDeProducto tip = Enum.valueOf(TipoDeProducto.class, baseC);
                    categoriaP = tip.getCategoria();
                }
            }   
        return categoriaP;
    }
                     
    public void buscarEstado(){
        Producto productoBuscado;
        int opcionBusqueda = 4;
        String CarProducto = this.seleccionEstado();
        productoBuscado = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
        System.out.println("---------------------------------");
        if(productoBuscado==null){
            System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
        }
        else{
            System.out.printf("%15s %20s %20s %19s %35s\n", 
                    "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            this.logica.buscarProducto(CarProducto, opcionBusqueda);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
    
    public String seleccionEstado(){
        String estadoP; 
        char estado = Entrada.leerChar("Categoria: [D -> Disponible], [A -> Agotado] o [* -> Inactivo]");
        switch (estado) {
                case 'D' -> {
                    String estadoD = "DISPONIBLE";
                    EstadoDeProducto est = Enum.valueOf(EstadoDeProducto.class, estadoD);
                    estadoP = est.getEstado();
                }
                case 'A' ->{
                    String estadoA = "AGOTADO";
                    EstadoDeProducto est = Enum.valueOf(EstadoDeProducto.class, estadoA);
                    estadoP = est.getEstado();
                }
                default -> {
                    String estadoI = "INACTIVO";
                    EstadoDeProducto est = Enum.valueOf(EstadoDeProducto.class, estadoI);
                    estadoP = est.getEstado();
                }
            }   
        return estadoP;
    }
    
    
    public void opcionEliminarProducto(){
        boolean op = true;
        
        while(op == true){
        Producto productoDelete;
        int opcionBusqueda = 1;
        String CarProducto = Entrada.leerLinea("Referencia");
        productoDelete = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
        System.out.println("---------------------------------");
        if(productoDelete==null){
            System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
        }
        else{
            System.out.printf("%15s %20s %20s %19s %35s\n", 
                       "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(productoDelete.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        this.logica.eliminarProducto(productoDelete);
        System.out.println("Producto Eliminado Exitosamente !!");
        op = Entrada.Control("Desea eliminar otro Producto [S/N]");
        }
    }
   
    public void opcionModificarProducto(){
        boolean op = true;
        int opmod;
        
        while(op == true){
            
            Producto productoMod;
            int opcionBusqueda = 1;
            String CarProducto = Entrada.leerLinea("Referencia");
            productoMod = this.logica.confirmarbusquedaProducto(CarProducto, opcionBusqueda);
            System.out.println("---------------------------------");
            if(productoMod==null){
                System.out.println("!! Este Producto no ha sido registrado ¡¡\n ");
            }
            else{
                System.out.printf("%15s %20s %20s %19s %35s\n", 
                           "Referencia", "Descripcion", "Estado", "Categoria", "Detalle de producto");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(productoMod.toString());
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            
            op = Entrada.Control("Desea modificar otro Producto [S/N]");
        }
    }
    
    
    
}
    
