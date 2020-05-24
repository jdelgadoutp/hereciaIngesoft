package videojuego.ingesoft.utp;

public class Jefe extends Enemigo {

	public Integer cambioDefase(Integer etapa) {
		this.experiencia += etapa;
		return etapa;
	}

}
