public class CondicionAutor extends CondicionBusqueda{

    //Atributo
    private String autor;

    //Constructor
    public CondicionAutor(String autor){
        this.autor=autor;
    }

    //Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia){
        return noticia.getAutor().equals(autor);
    }

    //Redefino equals
}
