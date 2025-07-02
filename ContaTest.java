

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste ContaTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class ContaTest
{
    /**
     * Construtor default para a classe de teste ContaTest
     */
    public ContaTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testaDepositoConta()
    {
        Conta conta2 = new Conta(1000, 123);
        conta2.depositar(5000);
        assertEquals(6000, conta2.getSaldo(), 0.1);
    }

    @Test
    public void testaSaque()
    {
        Conta conta1 = new Conta(1000, 123);
        conta1.sacar(800);
        assertEquals(200, conta1.getSaldo(), 0.1);
    }

    @Test
    public void testaTransferencia()
    {
        Conta conta1 = new Conta(1000, 123);
        Conta conta2 = new Conta(500, 456);
        conta1.transferir(conta2, 200);
        assertEquals(800, conta1.getSaldo(), 0.1);
        assertEquals(700, conta2.getSaldo(), 0.1);
    }
}


