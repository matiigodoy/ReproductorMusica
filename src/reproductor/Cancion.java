package reproductor;

public class Cancion {
	
	private String titulo;
	private Integer duracion;

	public Cancion(String titulo, Integer duracion) {
		this.setTitulo(titulo);
		this.setDuracion(duracion);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

}
