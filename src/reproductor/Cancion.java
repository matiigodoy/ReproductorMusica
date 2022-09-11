package reproductor;

public class Cancion {
	
	private String titulo;
	private Integer duracionMinutos;
	private Integer duracionSegundos;

	public Cancion(String titulo, Integer duracionMinutos, Integer duracionSegundos) {
		this.setTitulo(titulo);
		this.setDuracionMinutos(duracionMinutos);
		this.setDuracionSegundos(duracionSegundos);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(Integer duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public Integer getDuracionSegundos() {
		return duracionSegundos;
	}

	public void setDuracionSegundos(Integer duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}

}
