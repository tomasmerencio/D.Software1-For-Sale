package domain;

public abstract class EstadoOperacion {

    protected Cliente cliente;

    public EstadoOperacion(){

    }

    public void reservar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){

    }

    public void concretar(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
    }
}