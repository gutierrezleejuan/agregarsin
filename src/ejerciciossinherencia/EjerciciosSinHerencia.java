/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciossinherencia;
import javax.swing.*;
import java.util.ArrayList;

class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String puesto;

    public Empleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado :");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado :"));
        this.puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void asignarProyecto(Proyecto proyecto) {
        JOptionPane.showMessageDialog(null, "Empleado " + nombre + " asignado al proyecto " + proyecto.getNombreProyecto());
    }
}

class Departamento {
    private String nombreDepartamento;
    private String ubicacion;
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del departamento:");
        this.ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del departamento:");
        this.empleados = new ArrayList<>();
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " agregado al departamento " + nombreDepartamento);
    }

    public void mostrarEmpleados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados en el departamento " + nombreDepartamento + ":\n");
        for (Empleado empleado : empleados) {
            listaEmpleados.append(empleado.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
}

class Proyecto {
    private String nombreProyecto;
    private double presupuesto;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Empleado> empleadosAsignados;

    public Proyecto() {
        this.nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
        this.presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto:"));
        this.fechaInicio = JOptionPane.showInputDialog("Ingrese la fecha de inicio del proyecto:");
        this.fechaFin = JOptionPane.showInputDialog("Ingrese la fecha de fin del proyecto:");
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " asignado al proyecto " + nombreProyecto);
    }

    public void mostrarEmpleadosAsignados() {
        StringBuilder listaEmpleados = new StringBuilder("Empleados asignados al proyecto " + nombreProyecto + ":\n");
        for (Empleado empleado : empleadosAsignados) {
            listaEmpleados.append(empleado.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaEmpleados.toString());
    }
}

public class EjerciciosSinHerencia {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        // Crear departamento y asignar empleados
        Departamento departamento = new Departamento();
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);
        departamento.mostrarEmpleados();

        // Crear proyecto y asignar empleados
        Proyecto proyecto = new Proyecto();
        proyecto.asignarEmpleado(empleado1);
        proyecto.asignarEmpleado(empleado2);
        proyecto.mostrarEmpleadosAsignados();
    }
}
