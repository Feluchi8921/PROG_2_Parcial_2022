public class CondicionContenido extends CondicionBusqueda{

    //Atributo
    private String contenido;

    //Constructor
    public CondicionContenido(String contenido){
        this.contenido=contenido;
    }

    //Getters and Setters
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean cumple(Noticia noticia){
        return noticia.getContenido().contains(contenido);
    }
}
