import java.util.ArrayList;

public class Seccion extends Elemento {

    //Atributos
    private ArrayList<Elemento> elementos;
    //Voy a tener una posicion ya sea seccion, subseccion, ect
    private int i;
    private String defecto;

    //Constructor
    public Seccion(int i) {
        this.i = i;
        this.elementos = new ArrayList<>();
    }

    //Metodos

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void deleteElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    public Elemento obtenerHijo(int posicion) {
        for (int i = 0; i < elementos.size(); i++) {
            return elementos.get(posicion);
        }
        return null;
    }

    @Override
    public String getCategoria() {
        if (i < elementos.size()) {
            return elementos.get(i).getCategoria();
        } else {
            return defecto;
        }
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        //Guardo en una copia
        ArrayList<String> listarPC = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ArrayList<String> aux = elementos.get(i).getPalabrasClaves();
            for (int j = 0; j < aux.size(); j++) {
                if (!listarPC.contains(aux.get(j))) {
                    listarPC.add(aux.get(i));
                }
            }
        }
        return listarPC;
    }

    @Override
    public ArrayList<Noticia> buscar(CondicionBusqueda condicionBusqueda) {
        //Guardo en una copia
        ArrayList<Noticia> listarNoticias = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            listarNoticias.addAll(elementos.get(i).buscar(condicionBusqueda));
        }
        return listarNoticias;
    }
}
