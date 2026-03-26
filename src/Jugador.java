public class Jugador {

    private int id;       // Variable privada que guarda el identificador del jugador
    private int puntos;   // Variable privada que guarda los puntos del jugador

    // Constructor de la clase Jugador
    public Jugador(int id) {
        this.id = id;        // Asigna el id recibido al atributo
        this.puntos = 0;     // Inicializa los puntos en 0
    }

    public int getId() {
        return id; // Retorna el id del jugador
    }

    public void setId(int id) {
        this.id = id; // Modifica el id del jugador
    }

    public int getPuntos() {
        return puntos; // Retorna los puntos actuales
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos; // Modifica los puntos del jugador
    }
}