public class SeccionEspecial extends Seccion{

    //Atributo
    private String categoriaFija;
    private int cantidad;

    //Constructor
    public SeccionEspecial(int i, String categoriaFija, int cantidad) {
        super(i);
        this.categoriaFija = categoriaFija;
        this.cantidad = cantidad;
    }

    //Getetrs and setters
    public String getCategoriaFija() {
        return categoriaFija;
    }

    public void setCategoriaFija(String categoriaFija) {
        this.categoriaFija = categoriaFija;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Metodos

}
