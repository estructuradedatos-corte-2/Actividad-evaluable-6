public class NodoCircular {

    private Jugador jugador;
    private NodoCircular siguiente;

    public NodoCircular(Jugador jugador){
        this.jugador=jugador;
        this.siguiente=null;
    }

    public Jugador getJugador(){
        return jugador;
    }

    public NodoCircular getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente){
        this.siguiente = siguiente;
    }
} 