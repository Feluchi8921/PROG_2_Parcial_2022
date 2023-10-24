import java.lang.reflect.Array;
import java.util.ArrayList;

public class Noticia extends Elemento{
    //Atributos
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClaves;

    //Constructor
    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.palabrasClaves=new ArrayList<>();
    }

    //Getters and setters

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Importante: agrego solo las palabras claves q no estan
    public void addPalabrasClaves(String pc){
        if(!palabrasClaves.contains(pc)){
            palabrasClaves.add(pc);
        }
    }

    @Override
    public ArrayList<String> getPalabrasClaves(){
        //Devuelvo una copia
        ArrayList<String> listarPC = new ArrayList<>();
        for (String p: palabrasClaves) {
            listarPC.add(p);
        }
        return listarPC;
    }

    @Override
    public ArrayList<Noticia> buscar(CondicionBusqueda condicionBusqueda){
        //Guardo en una copia
        ArrayList<Noticia> listarNoticia = new ArrayList<>();
        if(condicionBusqueda.cumple(this)){
            listarNoticia.add(this);
        }
        return listarNoticia;
    }
}
