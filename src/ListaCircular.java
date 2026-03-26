public class ListaCircular {

    private NodoCircular actual; // Nodo actual (turno)

    // Constructor
    public ListaCircular() {
        this.actual = null; // Lista vacía
    }

    // Insertar jugador
    public void insertarJugador(Jugador j){
        NodoCircular nuevo = new NodoCircular(j); // Crear nodo

        // Si está vacía
        if (actual == null) {
            actual = nuevo; // El actual es el nuevo
            nuevo.setSiguiente(nuevo); // Se apunta a sí mismo
        } else {
            NodoCircular temp = actual; // Nodo auxiliar

            // Buscar último nodo
            while (temp.getSiguiente() != actual) {
                temp = temp.getSiguiente(); // Avanzar
            }

            temp.setSiguiente(nuevo); // Último apunta al nuevo
            nuevo.setSiguiente(actual); // Nuevo apunta al actual
        }
    }

    // Avanzar turno
    public void avanzarTurno(){
        if (actual != null) {
            actual = actual.getSiguiente(); // Siguiente jugador
        }
    }

    // Eliminar jugador actual
    public void eliminarJugadorActual(){
        if (actual == null) return; // Si vacía

        // Caso: un solo jugador
        if (actual.getSiguiente() == actual ) {
            System.out.println("Jugador " + actual.getJugador().getId() + " eliminado (último)");
            actual = null; // Lista vacía
            return;
        }

        NodoCircular anterior = actual; // Nodo anterior

        // Buscar nodo anterior
        while (anterior.getSiguiente() != actual) {
            anterior = anterior.getSiguiente(); // Avanzar
        }

        System.out.println("Jugador " + actual.getJugador().getId() + " eliminado");

        anterior.setSiguiente(actual.getSiguiente()); // Saltar nodo

        actual = actual.getSiguiente(); // Nuevo turno
    }

    // Mostrar jugadores
    public void mostrar(){
        if (actual == null) return;

        NodoCircular temp = actual;

        do {
            System.out.println("Jugador " + temp.getJugador().getId() +
                               " - Puntos: " + temp.getJugador().getPuntos());

            temp = temp.getSiguiente(); // Avanzar
        } while (temp != actual);
    }

    // Contar jugadores
    public int contarJugadores(){
        if (actual == null) return 0;

        int contador = 0;
        NodoCircular temp = actual;

        do {
            contador++;
            temp = temp.getSiguiente();
        } while (temp != actual);

        return contador;
    }

    // Getter del actual
    public NodoCircular getActual() {
        return actual;
    }
}