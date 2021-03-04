/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * @author viach
 *
 */
class test {

	Geometria geom;
	
	@BeforeEach
	public void before() {
		geom = new Geometria();
	}
	
	//Test constructor Geometria sin parametros
	@Test
    public void constructorGeometriasinParam() {
        Geometria geom1 = new Geometria();
        assertEquals(9, geom1.getId());
        assertEquals("Default", geom1.getNom());
    }
	
	//Test constructor Geometria con parametros
		@Test
	    public void constructorGeometriaconParam() {
	        int paramPrueba = 6;
			Geometria geom1 = new Geometria(paramPrueba);
	        assertEquals(paramPrueba, geom1.getId());
	    }
	
	//Test areacuadrado
	@Test
	public void testareacuadrado() {
		int areaResultado = geom.areacuadrado(3);
		int resultadoEsperado = 9;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaCirculo
	@Test
	public void testareaCirculo() {
		double areaResultado = geom.areaCirculo(3);
		double resultadoEsperado = 3.1416 * Math.pow(3,2);
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaTriangulo
	@Test
	public void testareatriangulo() {
		int areaResultado = geom.areatriangulo(3,4);
		int resultadoEsperado = 6;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaRectangulo
	@Test
	public void testarearectangulo() {
		int areaResultado = geom.arearectangulo(3,4);
		int resultadoEsperado = 12;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaPentagono
	@Test
	public void testareapentagono() {
		int areaResultado = geom.areapentagono(3,4);
		int resultadoEsperado = 6;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaRombo
	@Test
	public void testarearombo() {
		int areaResultado = geom.arearombo(3,4);
		int resultadoEsperado = 6;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaRomboide
	@Test
	public void testarearomboide() {
		int areaResultado = geom.arearomboide(3,4);
		int resultadoEsperado = 12;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test areaTrapecio
	@Test
	public void testareatrapecio() {
		int areaResultado = geom.areatrapecio(4,4,3);
		int resultadoEsperado = 12;
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test figura
	@Test
	public void testfigura() {
		String areaResultado = geom.figura(1);
		String resultadoEsperado = "cuadrado";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(2);
		resultadoEsperado = "Circulo";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(3);
		resultadoEsperado = "Triangulo";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(4);
		resultadoEsperado = "Rectangulo";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(5);
		resultadoEsperado = "Pentagono";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(6);
		resultadoEsperado = "Rombo";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(7);
		resultadoEsperado = "Romboide";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(8);
		resultadoEsperado = "Trapecio";
		assertEquals(resultadoEsperado, areaResultado);
		areaResultado = geom.figura(9);
		resultadoEsperado = "Default";
		assertEquals(resultadoEsperado, areaResultado);
	}
	
	//Test getters y setters
	@Test
	public void testsetId() {
		int idPrueba = 5;
		geom.setId(idPrueba);
		assertEquals(idPrueba, geom.getId());
	}
	
	@Test
	public void testsetNom() {
		String nomPrueba = "Default";
		geom.setNom(nomPrueba);
		assertEquals(nomPrueba, geom.getNom());
	}
	
	@Test
	public void testsetArea() {
		double areaPrueba = 10.5;
		geom.setArea(areaPrueba);
		assertEquals(areaPrueba, geom.getArea());
	}
	
	//Test toString
	@Test
	public void testtoString() {
		String cadenaEsperada = "Geometria [id=9, nom=Default, area=0.0]";
		geom.setArea(0);
		assertEquals(cadenaEsperada, geom.toString());
	}
}
