package Exa;

public class Main {
    public static void main(String[] args) {
        EmpleadoVendedor e1 = new EmpleadoVendedor("515ASHAS213", "Carmona", "Luis", 1200, 20);
        System.out.println("Empleado 1");
        System.out.println("el ingreso es de : " + e1.calcularIngresos() );
        System.out.println("La bonificacion es: " + e1.calcularBonificacion());
        e1.calcularDescuento();
        System.out.println();
        
        EmpleadoPermanente e2 = new EmpleadoPermanente("ASHS231ASDF", "Carmona", "Dorian", 20000, "NNSAHS");
        System.out.println("Empleado 2");
        System.out.println("El descuento es: " +e2.calcularDescuento());
        System.out.println("El sueldo neto es: " + e2.calcularSueldoNeto());

     
    }
    
}
