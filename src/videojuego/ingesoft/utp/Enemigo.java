package videojuego.ingesoft.utp;

public class Enemigo extends Personaje {

	public Integer experiencia;
	public String elemento_debilidad;
	public String elemento_fortaleza;

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public String getElemento_debilidad() {
		return elemento_debilidad;
	}

	public void setElemento_debilidad(String elemento_debilidad) {
		this.elemento_debilidad = elemento_debilidad;
	}

	public String getElemento_fortaleza() {
		return elemento_fortaleza;
	}

	public void setElemento_fortaleza(String elemento_fortaleza) {
		this.elemento_fortaleza = elemento_fortaleza;
	}

}
