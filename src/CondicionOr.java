public class CondicionOr extends CondicionBusqueda{

        //Atributos
        private CondicionBusqueda c1;
        private CondicionBusqueda c2;

        //Constructor
        public CondicionOr(CondicionBusqueda c1, CondicionBusqueda c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public boolean cumple(Noticia noticia){
            return (c1.cumple(noticia) || c2.cumple(noticia));
        }

}
