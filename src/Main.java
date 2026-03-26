import java.util.Random; // Importa la clase para números aleatorios

public class Main {

    public static void main(String[] args) {

        ListaCircular lista = new ListaCircular(); // Crea la lista circular
        Random random = new Random(); // Generador de números aleatorios

        lista.insertarJugador(new Jugador(1)); // Inserta jugador 1
        lista.insertarJugador(new Jugador(2)); // Inserta jugador 2
        lista.insertarJugador(new Jugador(3)); // Inserta jugador 3
        lista.insertarJugador(new Jugador(4)); // Inserta jugador 4

        while (lista.contarJugadores() > 1) { // Mientras haya más de un jugador

            NodoCircular actual = lista.getActual(); // Obtiene el jugador actual

            System.out.println("\nTurno del jugador: " + actual.getJugador().getId()); // Muestra turno

            int puntos = random.nextInt(10) + 1; // Genera puntos aleatorios entre 1 y 10

            actual.getJugador().setPuntos(
                actual.getJugador().getPuntos() + puntos // Suma puntos al jugador
            );

            System.out.println("Ganó " + puntos + " puntos"); // Muestra puntos ganados

            if (actual.getJugador().getPuntos() > 20) { // Si supera 20 puntos
                lista.eliminarJugadorActual(); // Elimina jugador
            } else {
                lista.avanzarTurno(); // Pasa turno
            }

            lista.mostrar(); // Muestra el estado del juego
        }

        if (lista.getActual() != null) { // Si queda un jugador
            System.out.println("\nGANADOR: Jugador " + lista.getActual().getJugador().getId()); // Muestra ganador
        }
    }
}