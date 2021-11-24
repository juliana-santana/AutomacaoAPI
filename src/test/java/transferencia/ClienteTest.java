package transferencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest extends ContaTest {

    @Test
    public void validarNome() {
        assertEquals("Xuxa", xuxa.getNome());
        assertEquals("Silvio", silvioSantos.getNome());
    }

    @Test
    public void validarCpf() {
        assertEquals("3424324234", xuxa.getCpf());
        assertEquals("445465464564", silvioSantos.getCpf());
    }

    @Test
    public void validarRg() {
        assertEquals("432422", xuxa.getRg());
        assertEquals("435435", silvioSantos.getRg());
    }
}