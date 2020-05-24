package videojuego.ingesoft.utp;

public class Esbirro1 extends Esbirro {

	public Integer ataqueADistancia(Jugador jugador,Integer daño) {

		jugador.atacar(daño, jugador);
		this.experiencia += daño;
		return experiencia;

	}
}
