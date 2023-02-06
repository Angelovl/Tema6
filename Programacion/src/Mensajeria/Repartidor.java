package Mensajeria;
public class Repartidor {
    
    String nombre;
    String identificador;
    String vehiculoAsignado;
    Boolean estadoDisponibilidad;
    
    public Repartidor (String nombre, String identificador, String vehiculoAsignado, Boolean estadoDisponibilidad){    
    
    this.nombre=nombre;
    this.identificador=identificador;
    this.vehiculoAsignado=vehiculoAsignado;
    this.estadoDisponibilidad=estadoDisponibilidad;
    
    if(estadoDisponibilidad){
  System.out.println("Disponible");
  }else{
      estadoDisponibilidad=true;
        System.out.println("No Disponible");
}
}

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public Boolean getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setVehiculoAsignado(String vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public void setEstadoDisponibilidad(Boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    
    public String toString() {
        return "Repartidor{" + "nombre=" + nombre + ", identificador=" + identificador + ", vehiculoAsignado=" + vehiculoAsignado + ", estadoDisponibilidad=" + estadoDisponibilidad + '}';
    }
    
    
}
