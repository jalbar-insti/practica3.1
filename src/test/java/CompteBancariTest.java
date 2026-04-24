
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompteBancariTest {

    private CompteBancari compte;

    @BeforeEach
    void setUp() {
        compte = new CompteBancari("Joaquim Albar", "ES123456789", 500.0);
    }

    @Test
    void constructorCorrecte() {
        assertEquals("Joaquim Albar", compte.getTitular());
        assertEquals("ES123456789", compte.getIban());
        assertEquals(500.0, compte.getSaldo(), 0.001);
    }

    @Test
    void constructorTitularBuit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CompteBancari("", "ES123", 100);
        });
    }

    @Test
    void ingressarCorrecte() {
        compte.ingressar(200);
        assertEquals(700.0, compte.getSaldo(), 0.001);
    }

    @Test
    void retirarCorrecte() {
        compte.retirar(100);
        assertEquals(400.0, compte.getSaldo(), 0.001);
    }

    @Test
    void retirarMesDelSaldo() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.retirar(1000);
        });
    }
}
