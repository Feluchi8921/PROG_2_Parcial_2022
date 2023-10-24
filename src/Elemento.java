import java.util.ArrayList;

public abstract class Elemento {

    //Metodo que devuelve el arrayList de Palabras claves
    public abstract ArrayList<String> getPalabrasClaves();

    //Metodo que devuelve la categoria
    public abstract String getCategoria();

    //Filtros
    public abstract ArrayList<Noticia> buscar(CondicionBusqueda condicionBusqueda);
}
