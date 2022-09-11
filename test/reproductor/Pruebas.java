package reproductor;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Pruebas {

	@Test
	public void queSePuedaCrearCancion() {
		final String TITULO = "Canción 1";
		final Integer DURACION_MINUTOS = 2;
		final Integer DURACION_SEGUNDOS = 35;
		
		Cancion cancion = new Cancion(TITULO, DURACION_MINUTOS, DURACION_SEGUNDOS);
		
		assertEquals(TITULO, cancion.getTitulo());
		assertEquals(DURACION_MINUTOS, cancion.getDuracionMinutos());
		assertEquals(DURACION_SEGUNDOS, cancion.getDuracionSegundos());
	}
	
	@Test
	public void queSePuedaGuardarDatosPersonales() {
		final Integer USER_ID = 1;
		final String NOMBRE = "Matías";
		final String APELLIDO = "Godoy";
		
		Usuario user = new Usuario(USER_ID, NOMBRE, APELLIDO);
		
		assertEquals(USER_ID, user.getId());
		assertEquals(NOMBRE, user.getNombre());
		assertEquals(APELLIDO, user.getApellido());
	}
	
	@Test
	public void queSePuedaCrearListaReproduccionCon1Cancion() {
		ArrayList<Cancion> lista = new ArrayList<Cancion>();

	    assertNotNull(lista);
	}
	
	@Test
	public void queSePuedaAgregarCancionesALaLista() {
		final Integer TAMAÑO_ESPERADO = 2;
		Cancion cancion1 = new Cancion("Té para tres",2,24);
		Cancion cancion2 = new Cancion("Médium",5,33);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
	    lista.add(cancion1);
	    lista.add(cancion2);
	    final Integer TAMAÑO_LISTA = lista.size();

	    assertEquals(TAMAÑO_ESPERADO, TAMAÑO_LISTA);
	}

}
