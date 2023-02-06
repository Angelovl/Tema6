package Mensajeria;
public class Paquete {
    
 String direccionOrigen;
 String direccionDestino;
 double peso;
 double costo;
 boolean estadoEntrega;
 String identificador;
 
 public Paquete (String direccionOrigen, String direccionDestino, double peso, double costo, boolean estadoEntrega, String identificador){
     
    this.direccionOrigen= direccionOrigen;
    this.direccionDestino= direccionDestino;
    this.peso= peso;
    this.costo=costo;
    this.estadoEntrega=estadoEntrega;
    this.identificador=identificador;
    
    if(estadoEntrega){
  System.out.println("No entregado");
  }else{
      estadoEntrega=true;
      System.out.println("Esta Entregado");
}
    
 }
    
    

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setEstadoEntrega(boolean estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public double getPeso() {
        return peso;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isEstadoEntrega() {
        return estadoEntrega;
    }

    public String getIdentificador() {
        return identificador;
    }

      
      
    public String toString() {
        return "Paquete{" + "direccionOrigen=" + direccionOrigen + ", direccionDestino=" + direccionDestino + ", peso=" + peso + ", costo=" + costo + ", estadoEntrega=" + estadoEntrega + ", identificador=" + identificador + '}';
    }
    
    
 }

 
 
    

