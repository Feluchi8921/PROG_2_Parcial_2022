public class CondicionTitulo extends CondicionBusqueda{

    //Atributo
    private String titulo;

    //Constructor
    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia){
        return noticia.getTitulo().contains(titulo);
    }

    //Redefinir equals?

}
