package videojuego.ingesoft.utp;

public class Esbirro2 extends Esbirro {

	public Integer ataqueAMele(Personaje jugador,Integer daño) {
		
		jugador.atacar(daño, jugador);
		return experiencia;
		
	}
}
