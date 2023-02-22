package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void CP1() {
		assertFalse(Fecha.validarFecha(0, 0, 0));
	}
	
	@Test
	void CP2() {
		assertFalse(Fecha.validarFecha(0, 0, 2));
	}
	
	@Test
	void CP3() {
		assertFalse(Fecha.validarFecha(0, 2, 2));
	}
	
	@Test
	void CP4() {
		assertFalse(Fecha.validarFecha(2, 14, 2));
	}

}
