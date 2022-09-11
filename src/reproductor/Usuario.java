package reproductor;

public class Usuario {
	
	private Integer id;
	private String nombre;
	private String  apellido;
	
	public Usuario(Integer id, String nombre, String apellido) {
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
