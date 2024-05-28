/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license0
 */

package com.mycompany.eva3_11_leer_archivos;

/**
 *
 * @author leo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ElectroZone {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Vendedor> vendedores = new ArrayList<>();
    private static ArrayList<Producto> carrito = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Bienvenido a ElectroZone");
            System.out.println("Seleccione 01 para Cliente o 02 para Vendedor:");
            String opcion = scanner.nextLine();

            try {
                if (opcion.equals("01")) {
                    if (productos.isEmpty()) {
                        System.out.println("Upps por el momento no esta disponible");
                        continue;
                    }
                    Cliente cliente = registrarCliente(scanner);
                    mostrarMenuCliente(scanner, cliente);
                } else if (opcion.equals("02")) {
                    Vendedor vendedor = registrarVendedor(scanner);
                    mostrarMenuVendedor(scanner, vendedor);
                } else {
                    throw new InputInvalidoException("Opción no válida. Intente nuevamente.");
                }
            } catch (InputInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    private static Cliente registrarCliente(Scanner scanner) throws InputInvalidoException {
        System.out.println("Registro de Cliente:");
        // Solicitar datos del cliente
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Sexo (H/M): ");
        String sexo = scanner.nextLine();
        System.out.print("Número de celular: ");
        String numeroCel = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Municipio: ");
        String municipio = scanner.nextLine();
        System.out.print("Número de tarjeta: ");
        String numeroTarjeta = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilio = scanner.nextLine();
        System.out.print("Número de casa: ");
        String numeroCasa = scanner.nextLine();
        System.out.print("Código postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.print("NIP: ");
        String nip = scanner.nextLine();
        System.out.print("CVN: ");
        String cvn = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellidos, fechaNacimiento, sexo, numeroCel, pais, estado, municipio, numeroTarjeta, domicilio, numeroCasa, codigoPostal, nip, cvn);
        clientes.add(cliente);
        return cliente;
    }

    private static Vendedor registrarVendedor(Scanner scanner) throws InputInvalidoException {
        System.out.println("Registro de Vendedor:");
        // Solicitar datos del vendedor
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Sexo (H/M): ");
        String sexo = scanner.nextLine();
        System.out.print("Número de celular: ");
        String numeroCel = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Municipio: ");
        String municipio = scanner.nextLine();
        System.out.print("Número de tarjeta: ");
        String numeroTarjeta = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nombre, apellidos, fechaNacimiento, sexo, numeroCel, pais, estado, municipio, numeroTarjeta);
        vendedores.add(vendedor);
        return vendedor;
    }

    private static void mostrarMenuCliente(Scanner scanner, Cliente cliente) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("Menú del Cliente:");
            System.out.println("1. Seleccionar producto");
            System.out.println("2. Agregar al carrito");
            System.out.println("3. Seleccionar unidades");
            System.out.println("4. Pagar");
            System.out.println("5. Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    seleccionarProducto(scanner);
                    break;
                case "2":
                    agregarAlCarrito(scanner);
                    break;
                case "3":
                    seleccionarUnidades(scanner);
                    break;
                case "4":
                    pagar(scanner, cliente);
                    break;
                case "5":
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenuVendedor(Scanner scanner, Vendedor vendedor) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("Menú del Vendedor:");
            System.out.println("1. Agregar un producto nuevo");
            System.out.println("2. Editar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Modificar precio");
            System.out.println("5. Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarProducto(scanner);
                    break;
                case "2":
                    editarProducto(scanner);
                    break;
                case "3":
                    eliminarProducto(scanner);
                    break;
                case "4":
                    modificarPrecio(scanner);
                    break;
                case "5":
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void seleccionarProducto(Scanner scanner) {
        System.out.println("Seleccionar producto:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productoSeleccionado = producto;
                break;
            }
        }
        if (productoSeleccionado != null) {
            carrito.add(productoSeleccionado);
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void agregarAlCarrito(Scanner scanner) {
        boolean agregando = true;
        while (agregando) {
            System.out.println("Agregar al carrito:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
            System.out.print("Ingrese el código del producto: ");
            String codigo = scanner.nextLine();
            Producto productoSeleccionado = null;
            for (Producto producto : productos) {
                if (producto.getCodigo().equals(codigo)) {
                    productoSeleccionado = producto;
                    break;
                }
            }
            if (productoSeleccionado != null) {
                carrito.add(productoSeleccionado);
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("Producto no encontrado.");
            }
            System.out.print("¿Desea agregar otro producto al carrito? (S/N): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("S")) {
                agregando = false;
            }
        }
    }

    private static void seleccionarUnidades(Scanner scanner) {
        System.out.println("Seleccionar unidades:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productoSeleccionado = producto;
                break;
            }
        }
        if (productoSeleccionado != null) {
            System.out.print("Ingrese la cantidad de unidades: ");
            int unidades = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < unidades; i++) {
                carrito.add(productoSeleccionado);
            }
            System.out.println("Unidades agregadas al carrito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void pagar(Scanner scanner, Cliente cliente) {
        System.out.println("Pagar:");
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        System.out.println("Total a pagar: $" + total);
        System.out.print("Ingrese el número de tarjeta: ");
        String numeroTarjeta = scanner.nextLine();
        if (numeroTarjeta.equals(cliente.getNumeroTarjeta())) {
            System.out.println("Pago exitoso. Gracias por su compra.");
            carrito.clear();
        } else {
            System.out.println("Número de tarjeta incorrecto. Intente nuevamente.");
        }
    }

    private static void agregarProducto(Scanner scanner) {
        System.out.println("Agregar un producto nuevo:");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Unidades: ");
        int unidades = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();
        Producto producto = new Producto(nombre, descripcion, unidades, precio, codigo);
        productos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void editarProducto(Scanner scanner) {
        System.out.println("Editar producto:");
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productoSeleccionado = producto;
                break;
            }
        }
        if (productoSeleccionado != null) {
            System.out.print("Nuevo nombre del producto: ");
            productoSeleccionado.setNombre(scanner.nextLine());
            System.out.print("Nueva descripción del producto: ");
            productoSeleccionado.setDescripcion(scanner.nextLine());
            System.out.print("Nuevas unidades: ");
            productoSeleccionado.setUnidades(Integer.parseInt(scanner.nextLine()));
            System.out.print("Nuevo precio: ");
            productoSeleccionado.setPrecio(Double.parseDouble(scanner.nextLine()));
            System.out.println("Producto editado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto(Scanner scanner) {
        System.out.println("Eliminar producto:");
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productoSeleccionado = producto;
                break;
            }
        }
        if (productoSeleccionado != null) {
            productos.remove(productoSeleccionado);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void modificarPrecio(Scanner scanner) {
        System.out.println("Modificar precio:");
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productoSeleccionado = producto;
                break;
            }
        }
        if (productoSeleccionado != null) {
            System.out.print("Nuevo precio: ");
            productoSeleccionado.setPrecio(Double.parseDouble(scanner.nextLine()));
            System.out.println("Precio modificado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

abstract class Persona {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;
    private String numeroCel;
    private String pais;
    private String estado;
    private String municipio;
    private String numeroTarjeta;

    public Persona(String nombre, String apellidos, String fechaNacimiento, String sexo, String numeroCel, String pais, String estado, String municipio, String numeroTarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.numeroCel = numeroCel;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.numeroTarjeta = numeroTarjeta;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}

class Cliente extends Persona {
    private String domicilio;
    private String numeroCasa;
    private String codigoPostal;
    private String nip;
    private String cvn;

    public Cliente(String nombre, String apellidos, String fechaNacimiento, String sexo, String numeroCel, String pais, String estado, String municipio, String numeroTarjeta, String domicilio, String numeroCasa, String codigoPostal, String nip, String cvn) {
        super(nombre, apellidos, fechaNacimiento, sexo, numeroCel, pais, estado, municipio, numeroTarjeta);
        this.domicilio = domicilio;
        this.numeroCasa = numeroCasa;
        this.codigoPostal = codigoPostal;
        this.nip = nip;
        this.cvn = cvn;
    }

    // Getters y setters
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getCvn() {
        return cvn;
    }

    public void setCvn(String cvn) {
        this.cvn = cvn;
    }
}

class Vendedor extends Persona {
    public Vendedor(String nombre, String apellidos, String fechaNacimiento, String sexo, String numeroCel, String pais, String estado, String municipio, String numeroTarjeta) {
        super(nombre, apellidos, fechaNacimiento, sexo, numeroCel, pais, estado, municipio, numeroTarjeta);
    }
}

class Producto {
    private String nombre;
    private String descripcion;
    private int unidades;
    private double precio;
    private String codigo;

    public Producto(String nombre, String descripcion, int unidades, double precio, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
        this.codigo = codigo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", unidades=" + unidades +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

class InputInvalidoException extends Exception {
    public InputInvalidoException(String mensaje) {
        super(mensaje);
    }
}
