public class CondicionCategoria extends CondicionBusqueda{
    //Atributo
    private String categoria;

    //Constructor
    public CondicionCategoria(String categoria){
        this.categoria=categoria;
    }

    //Getters and Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia noticia){
        return noticia.getCategoria().equals(categoria);
    }

    //Redefino equals
}
