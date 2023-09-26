package Exa;

abstract class Empleado {
    private String rfc;
    private String apellidos;
    private String nombres;

    public Empleado(String rfc, String apellidos, String nombres) {
        this.rfc = rfc;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    // Métodos getters y setters

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String toString() {
        return "Nombre: " + nombres + "\nRfc: " + rfc + "\nApellidos: " + apellidos;
    }
}

class EmpleadoVendedor extends Empleado {
    private double montoVendido;
    private double tasaComision;

    public EmpleadoVendedor(String rfc, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(rfc, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }

    // Métodos getters y setters 
    public double calcularIngresos() {
        return montoVendido * tasaComision;
    }

    public double calcularBonificacion() {
        double bonificacion = 0;
        if (montoVendido <= 1000) {
            System.out.println("No tienes bonificación");
        } else if (montoVendido <= 5000) {
            bonificacion = montoVendido * 0.05;
            System.out.println("Bonificación: " + bonificacion);
        } else {
            bonificacion = montoVendido * 0.10;
            System.out.println("Bonificación: " + bonificacion);
        }
        return bonificacion;
    }

    public double calcularDescuento() {
        double descuento = 0;
        if (calcularIngresos() <= 1000) {
            descuento = calcularIngresos() * 0.11;
        } else {
            descuento = calcularIngresos() * 0.15;
        }
        System.out.println("Su descuento es: " + descuento);
        return descuento;
    }

    public void calcularSueldoNeto() {
        double ingresos = calcularIngresos();
        double bonificacion = calcularBonificacion();
        double descuento = calcularDescuento();
        double sueldoNeto = ingresos + bonificacion - descuento;
        System.out.println("El sueldo neto es: " + sueldoNeto);
    }
}

class EmpleadoPermanente extends Empleado {
    private double sueldoBase;
    private String seguroSocial;

    public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, String seguroSocial) {
        super(rfc, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.seguroSocial = seguroSocial;
    }

    // Métodos getters y setters

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double calcularDescuento() {
        return sueldoBase * 0.11;
    }

    public double calcularSueldoNeto() {
        double sueldoNeto = sueldoBase - calcularDescuento();
        System.out.println("El sueldo neto es: " + sueldoNeto);
        return sueldoNeto;
    }
}