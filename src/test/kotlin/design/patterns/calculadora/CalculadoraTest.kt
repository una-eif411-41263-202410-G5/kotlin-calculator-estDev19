package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.CalculadoraFunc
//import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CalculadoraTest {
    private lateinit var calculadora: CalculadoraFunc

    @BeforeEach  //que hacer antes de cada Test (inicializa), after podría servir para limpiar algo si se necesita
    fun setUp(){
        calculadora = CalculadoraFunc()
    }

    @Test  //ejecutar un Test como tal
    fun sumaTest(){
        assertEquals(11, calculadora.suma(7,4))
    }

    @Test
    fun restaTest(){
        assertEquals(8, calculadora.resta(17,9))
    }

    @Test
    fun multiplicacionTest(){
        assertEquals(35, calculadora.multiplicacion(7,5))
    }

    @Test
    fun divisionEntreCeroTest(){
        val exception = assertThrows<IllegalArgumentException> { calculadora.division(8, 0) }
        assertEquals("No se puede dividir entre 0", exception.message)
    }

    @Test
    fun divisionPermitidaTest(){
        assertEquals(3, calculadora.division(29, 9))
    }
}