package reproductor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class Pruebas {

	@Test
	public void queSePuedaCrearCancion() {
		final String TITULO_ESPERADO = "Canción 1";
		final Integer DURACION_ESPERADA = 195;
		
		Cancion cancion = new Cancion(TITULO_ESPERADO, DURACION_ESPERADA);
		
		assertEquals(TITULO_ESPERADO, cancion.getTitulo());
		assertEquals(DURACION_ESPERADA, cancion.getDuracion());
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
		Cancion cancion1 = new Cancion("Té para tres",184);
		Cancion cancion2 = new Cancion("Médium",333);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
	    lista.add(cancion1);
	    lista.add(cancion2);
	    final Integer TAMAÑO_LISTA = lista.size();

	    assertEquals(TAMAÑO_ESPERADO, TAMAÑO_LISTA);
	}
	
	@Test
	public void queSePuedaVisualizarInformacionDeLaLista() {
		
		Cancion cancion1 = new Cancion("Té para tres",184);
		Cancion cancion2 = new Cancion("Médium",333);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(cancion1);
	    lista.add(cancion2);
	    
	    final String LISTADO_ESPERADO = "Té para tres,Médium,";
	    final Integer CANTIDAD_CANCIONES_ESPERADA = 2;
	    final Integer DURACION_LISTA_ESPERADA = 517;
	    final String VISUALIZACION_ESPERADA = "8:37";
	    
	    String stringLista = "";
	    
	    for (int i = 0; i < lista.size(); i++) {
			stringLista += (lista.get(i).getTitulo());
			stringLista += ",";
		}
	    
	    Integer duracionLista = 0;
	    
	    for (int i = 0; i < lista.size(); i++) {
			duracionLista += (lista.get(i).getDuracion());
		}
	    
	    final String LISTADO_CANCIONES = stringLista;
	    final Integer CANTIDAD_CANCIONES = lista.size();
	    final Integer DURACION_LISTA = duracionLista;
	    final String VISUALIZACION_DURACION = duracionLista/60 + ":" + duracionLista%60;
	    
	    assertEquals(LISTADO_ESPERADO, LISTADO_CANCIONES);
	    assertEquals(CANTIDAD_CANCIONES_ESPERADA, CANTIDAD_CANCIONES);
	    assertEquals(DURACION_LISTA_ESPERADA, DURACION_LISTA);
	    assertEquals(VISUALIZACION_ESPERADA, VISUALIZACION_DURACION);
	}

}
