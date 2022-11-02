package workingWithClass.ejerCatalogo_intefaces.clases;


import java.util.*;


import workingWithClass.ejerCatalogo_intefaces.interfaces.ILibro;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;


    

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta(){

        int iva = 21;
        double conIva = (this.getPrecio() * iva ) / 100;
        return conIva + getPrecio();
    }

   

    @Override
    public Date getFechaPublicacion() {
        
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        
        return autor;
    }

    @Override
    public String getTitulo() {
        
        return titulo;
    }

    @Override
    public String getEditorial() {
        
        return editorial;
    }

    @Override
    public String datosProducto() {
       return  "Titulo: " + getTitulo() + "\n" +
               "Autor: " + getAutor() + "\n" +
               "Editorial: " + getEditorial() + "\n" +
               "Fecha de publicación: " + getFechaPublicacion() + "\n" +
               "Precio: " + getPrecio() + "\n" + 
               "Precio con IVA: " + getPrecioVenta() + "\n" ;
    }
    
}