package Videoclub;
public class Alquiler_pelicula {
    
    //@angelovl
    //no entiendo la representación, por eso he realizado mi propia versión de como gestionar el videoclub.
    //repasar que es atributo y funciones 
  
    public class RealizarUnAlquiler { 
        
        String nombrecliente;
        String nombredelapelicula;
        int precioalquiler;
        String diaparadevolver;
        
     public RealizarUnAlquiler (String nombrecliente, String nombredelapelicula, int precioalquiler, String diaparadevolver){
         
         this.nombrecliente=nombrecliente;
         this.nombredelapelicula=nombredelapelicula;
         this.precioalquiler=precioalquiler;
         this.diaparadevolver=diaparadevolver;
     } 

        public String getNombrecliente() {
            return nombrecliente;
        }

        public String getNombredelapelicula() {
            return nombredelapelicula;
        }

        public int getPrecioalquiler() {
            return precioalquiler;
        }

        public String getDiaparadevolver() {
            return diaparadevolver;
        }

        public void setNombrecliente(String nombrecliente) {
            this.nombrecliente = nombrecliente;
        }

        public void setNombredelapelicula(String nombredelapelicula) {
            this.nombredelapelicula = nombredelapelicula;
        }

        public void setPrecioalquiler(int precioalquiler) {
            this.precioalquiler = precioalquiler;
        }

        public void setDiaparadevolver(String diaparadevolver) {
            this.diaparadevolver = diaparadevolver;
        }
     
     
     
     
        
        
        
    
    
        
    }
    
    
}
