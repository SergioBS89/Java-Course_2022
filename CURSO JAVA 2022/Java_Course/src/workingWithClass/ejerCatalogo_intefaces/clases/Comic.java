package workingWithClass.ejerCatalogo_intefaces.clases;



import java.util.Date;


public class Comic extends Libro{

    private String personaje;

    public Comic(int precio, Date date, String autor, String titulo, String editorial, String personaje) {
        super(precio, date, autor, titulo, editorial);
        this.personaje = personaje;
        
    }
    
    

    
    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String datosProducto(){
        return super.datosProducto().concat(
            "Personaje: " + getPersonaje()
        );
    }

}