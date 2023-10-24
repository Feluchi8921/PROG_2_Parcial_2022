public class CondicionNot extends CondicionBusqueda{

    //Atributo
    private CondicionBusqueda c;

    //Constructor
    public CondicionNot(CondicionBusqueda c){
        this.c=c;
    }

    @Override
    public boolean cumple(Noticia noticia){
        return !c.cumple(noticia);
    }
}
