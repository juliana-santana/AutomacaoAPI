package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvioSantos;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa", "3424324234", "432422");
        silvioSantos = new Cliente("Silvio", "445465464564", "435435");

        contaXuxa = new Conta("3434", "4324324", 1312.00, xuxa);
        contaSilvioSantos = new Conta("343", "43243", 312.00, silvioSantos);
    }

    @Test
    public void realizarTransacao() {

        contaXuxa.realizarTransferencia(12.00, contaSilvioSantos);

        assertEquals(1300.00, contaXuxa.getSaldo());
        assertEquals(324.00, contaSilvioSantos.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida() {

        boolean resultado = contaXuxa.realizarTransferencia(3000.00, contaSilvioSantos);

        assertFalse(resultado);
    }

    @Test
    public void validarProprietatio() {

        assertEquals(xuxa, contaXuxa.getProprietário());
    }

    @Test
    public void validarConta() {
        assertEquals("4324324", contaXuxa.getNumeroConta());
    }

    @Test
    public void validarAgencia() {
        assertEquals("3434", contaXuxa.getAgencia());
    }
}