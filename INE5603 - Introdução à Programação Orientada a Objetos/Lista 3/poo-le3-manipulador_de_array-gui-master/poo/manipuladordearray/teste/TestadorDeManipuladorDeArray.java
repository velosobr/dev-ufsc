package poo.manipuladordearray.teste;

import poo.manipuladordearray.modelo.ManipuladorDeArray;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;

/**
 * A classe de teste TestadorDeManipuladorDeArray.
 *
 * @author  Leandro
 * @version 1.2 - 24/11/2017
 */
public class TestadorDeManipuladorDeArray
{
    private ManipuladorDeArray m;

    @Rule
    public Timeout timeout = new Timeout(100); // cada teste não deve demorar mais que 100 milisegundos

    /**
     * Construtor default para a classe de teste TestadorDeManipulador
     */
    public TestadorDeManipuladorDeArray()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {

        m = new ManipuladorDeArray();
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testRetorneSoma()
    {
        assertEquals("a soma de array vazio deveria ser zero", 0, m.calculeSoma(new int[] {}));
        assertEquals("a soma de array com um número deveria ser o próprio número", 56, m.calculeSoma(new int[] {56}));
        assertEquals("a soma do array {8,2,3} deveria ser 13", 13, m.calculeSoma(new int[] {8,2,3}));

    }

    @Test
    public void testRetorneDePosicoesImpares()
    {
        assertArrayEquals("para array vazio deveria retornar array vazio", new int[] {}, m.encontreEmPosicoesImpares(new int[] {}));
        assertArrayEquals("para array com um único número deveria retornar array vazio", new int[] {}, m.encontreEmPosicoesImpares(new int[] {6}));
        assertArrayEquals("para array {6,3} deveria retornar array {3}", new int[] {3}, m.encontreEmPosicoesImpares(new int[] {6,3}));
        assertArrayEquals("para array {8,2,5,6} deveria retornar array {2,6}",new int[] {2,6}, m.encontreEmPosicoesImpares(new int[] {8,2,5,6}));

    }

    @Test
    public void testRetornePrimeiroEUltimo()
    {
        assertArrayEquals("para array vazio deveria retornar array vazio", new int[] {}, m.obtenhaPrimeiroEUltimo(new int[] {}));
        assertArrayEquals("para array com um único número deveria retornar array vazio", new int[] {}, m.obtenhaPrimeiroEUltimo(new int[] {5}));
        assertArrayEquals("para array {5,6} deveria retornar array {5,6}", new int[] {5,6}, m.obtenhaPrimeiroEUltimo(new int[] {5, 6}));
        assertArrayEquals("para array {5,12,6} deveria retornar array {5,6}", new int[] {5,6}, m.obtenhaPrimeiroEUltimo(new int[] {5,12,6}));
        assertArrayEquals("para array {5,12,8,6} deveria retornar array {5,6}", new int[] {5,6}, m.obtenhaPrimeiroEUltimo(new int[] {5,12,8,6}));
        int[] a = new int[]{8,3};
        assertNotSame("para array de tamanho 2 deveria retornar NOVO array", a, m.obtenhaPrimeiroEUltimo(a));
    }

    @Test
    public void testConteQuantasOcorrencias()
    {
        assertEquals("para array vazio deveria retonar zero", 0, m.conteQuantasOcorrencias(new int[] {}, 6));
        assertEquals("para array {4} e n 6 deveria retornar zero", 0, m.conteQuantasOcorrencias(new int[] {4}, 6));
        assertEquals("para array {4} e n 4 deveria retornar 1", 1, m.conteQuantasOcorrencias(new int[] {4}, 4));
        assertEquals("para array {1,4,12,4,12,8,4,17} e n 4 deveria retornar 3",3, m.conteQuantasOcorrencias(new int[] {1,4,12,4,12,8,4,17}, 4));
        assertEquals("para array {1,4,12,4,12,8,4,17} e n 45 deveria retornar zero", 0, m.conteQuantasOcorrencias(new int[] {1,4,12,4,12,8,4,17}, 45));
    }

    @Test
    public void testObtenhaMaiorNumero()
    {
        assertEquals("para array com um único número deveria retornar o próprio número", 67, m.obtenhaMaiorNumero(new int[] {67}));
        assertEquals("para array onde o primeiro número é maior deveria retornar este número",67, m.obtenhaMaiorNumero(new int[] {67,2,3,5,2}));
        assertEquals("para array onde o último número é o maior deveria retornar este número", 123, m.obtenhaMaiorNumero(new int[] {67,2,3,5,2,123}));
        assertEquals("para array onde o maior não é o primeiro nem o último deveria retornar este número", 500, m.obtenhaMaiorNumero(new int[] {67,2,3,500,2,123}));
        assertEquals("para array formado por números negativos deveria retornar o menor número negativo", -5, m.obtenhaMaiorNumero(new int[] {-23,-5, -100}));
    }

    @Test
    public void testObtenhaPosicaoDoMaiorNumero()
    {
        assertEquals(-1, m.obtenhaPosicaoDoMaiorNumero(new int[] {}));
        assertEquals(0, m.obtenhaPosicaoDoMaiorNumero(new int[] {5}));
        assertEquals(0, m.obtenhaPosicaoDoMaiorNumero(new int[] {5,2,3,1,2,4}));
        assertEquals(3, m.obtenhaPosicaoDoMaiorNumero(new int[] {5,2,3,14}));
        assertEquals(2, m.obtenhaPosicaoDoMaiorNumero(new int[] {5,2,43,14}));
    }

    @Test
    public void testconteQuantidadeAcimaDeLimite()
    {
        assertEquals(0, m.conteQuantidadeAcimaDeLimite(new int[] {}, 12));
        assertEquals(0, m.conteQuantidadeAcimaDeLimite(new int[] {5}, 12));
        assertEquals(1, m.conteQuantidadeAcimaDeLimite(new int[] {15}, 12));
        assertEquals(0, m.conteQuantidadeAcimaDeLimite(new int[] {5,1,8,2,3,1,3,9}, 12));
        assertEquals(3, m.conteQuantidadeAcimaDeLimite(new int[] {5,14,8,21,3,13,3,9}, 12));
    }

    @Test
    public void testRetorneMedia()
    {
        assertEquals(18.0f, m.calculeMedia(new int[] {18}), 0.1);
        assertEquals(49.6f, m.calculeMedia(new int[] {18, 6, 125}), 0.1);
    }

    @Test
    public void testRetorneQuantosNoIntervalo()
    {
        assertEquals(0, m.retorneQuantosNoIntervalo(new int[] {}, 7, 89));
        assertEquals(0, m.retorneQuantosNoIntervalo(new int[] {1,5,200,99}, 7, 89));
        assertEquals(2, m.retorneQuantosNoIntervalo(new int[] {1,5,23,200,77,99}, 7, 89));
    }

    @Test
    public void testMultipliquePorFator()
    {
        int[] a = new int[] {3,5,2};
        m.multipliquePorFator(a, 3);
        assertArrayEquals("o array {3,5,2} multiplicado por 3 deveria mudar para {9,15,6}", new int[] {9,15,6}, a);
    }

    @Test
    public void testObtenhaMultiplicadoPorFator()
    {
        int[] a = new int [] {};
        int[] resposta = m.obtenhaMultiplicadoPorFator(a, 7);
        assertArrayEquals("para array vazio deveria retornar array vazio", new int[] {}, resposta);
        assertNotSame("para array vazio deveria retornar NOVO array vazio e não o array passado como parâmetro", resposta, a);
        //
        a = new int[] {8,2,4};
        resposta = m.obtenhaMultiplicadoPorFator(a, 2);
        assertArrayEquals("para array {8,2,4} e fator 2 deveria retornar array {16,4,8}", new int[] {16,4,8}, resposta);
        assertArrayEquals("não deveria ter alterado array passado como parâmetro",new int[]{8,2,4}, a);
    }

    @Test
    public void testCopieNPrimeiros()
    {
        int a[] = new int[] {};
        int[] resposta = m.copieNPrimeiros(a, 3);
        assertArrayEquals("para array vazio deveria retornar array {}", new int[] {}, a);
        assertNotSame("deveria retornar um NOVO array {}",a,resposta);
        //
        a = new int[] {8,2,4,1};
        resposta = m.copieNPrimeiros(a, 2);
        assertArrayEquals("deveria retornar array {8,2}", new int[] {8,2}, resposta);
        //
        a = new int[] {8,2,4,1};
        resposta = m.copieNPrimeiros(a, 22);
        assertArrayEquals("para array {8,2,4,1} e n 22 deveria retornar array {8,2,4,1}", new int[] {8,2,4,1}, resposta);
        assertNotSame("deveria retornar NOVO array {8,2,4,1} e não o array passado com parâmetro", a, resposta);
    }

    @Test
    public void testObtenhaCopia()
    {
        int[] a = new int[] {};
        int[] resposta = m.obtenhaCopia(a);
        assertArrayEquals("para array {} deveria retornar array {}",new int[]{}, resposta);
        assertNotSame("para array {} deveria retornar NOVO array {}",a,resposta);
        //
        a = new int[] {8,2,3};
        resposta = m.obtenhaCopia(a);
        assertArrayEquals("para array {8,2,3} deveria retornar array {8,2,3}",new int[]{8,2,3}, resposta);
        assertNotSame("para array {8,2,3} deveria retornar NOVO array {8,2,3} e não o array passado como parâmetro", a, resposta);
    }

    @Test
    public void testObtenhaNumerosNoIntervalo() {
        int[] a = new int[] {};
        int[] resposta = m.obtenhaNumerosNoIntervalo(a, 6, 10);
        assertArrayEquals("para array vazio deveria retornar array {}", a, resposta);
        assertNotSame("deveria retornar NOVO array {}", a, resposta);
        //
        a = new int[] {8};
        resposta = m.obtenhaNumerosNoIntervalo(a, 10, 20);
        assertArrayEquals("deveria retornar array {}", new int[] {}, resposta);
        //
        a = new int[] {18};
        resposta = m.obtenhaNumerosNoIntervalo(a, 10, 20);
        assertArrayEquals("deveria retornar array {18}", new int[] {18}, resposta);
        assertNotSame("deveria retornar NOVO array {18}", a, resposta);
        //
        a = new int[] {15,17,8,22,18};
        resposta = m.obtenhaNumerosNoIntervalo(a, 10, 20);
        assertArrayEquals("deveria retornar array {18}", new int[] {15,17,18}, resposta);
        //
        a = new int[] {15,17,8,22,18};
        resposta = m.obtenhaNumerosNoIntervalo(a, 8, 22);
        assertArrayEquals("deveria retornar array {15,17,8,22,18}", new int[] {15,17,8,22,18}, resposta);
        assertNotSame("deveria retornar NOVO array {15,17,8,22,18}", a, resposta);

    }

    @Test
    public void testUnaArrays() {
        int[] a1 = new int[] {};
        int[] a2 = new int[] {};
        int[] resposta = m.unaArrays(a1, a2);
        assertArrayEquals("para arrays {} e {} deveria retornar array {}", new int[]{}, resposta);
        assertNotSame("para arrays {} e {} deveria retornar NOVO array {} e não o primeiro array", a1, resposta);
        assertNotSame("para arrays {} e {} deveria retornar NOVO array {} e não o segundo array", a2, resposta);
        //
        a1 = new int[]{1,2,3};
        a2 = new int[]{};
        resposta = m.unaArrays(a1, a2);
        assertArrayEquals("para arrays {1,2,3} e {} deveria retornar array {1,2,3}",new int[] {1,2,3},resposta);
        assertNotSame("para arrays {1,2,3} e {} deveria retornar NOVO array {1,2,3}", a1, resposta);
        //
        a1 = new int[]{};
        a2 = new int[]{4,5,6};
        resposta = m.unaArrays(a1, a2);
        assertArrayEquals("para arrays {} e {4,5,6} deveria retornar array {4,5,6}",new int[] {4,5,6},resposta);
        assertNotSame("para arrays {} e {4,5,6} deveria retornar NOVO array {4,5,6}", a2, resposta);
        //
        a1 = new int[]{1,2,3};
        a2 = new int[]{4,5,6};
        resposta = m.unaArrays(a1, a2);
        assertArrayEquals("para arrays {1,2,3} e {4,5,6} deveria retornar array {1,2,3,4,5,6}",new int[] {1,2,3,4,5,6},resposta);        
    }

    @Test
    public void testObtenhaPares() {
        int[] a = new int[]{};
        int[] resposta = m.obtenhaPares(a);

        assertEquals("para array {} deveria retornar {}", 0, resposta.length);
        assertNotSame("para array {} deveria retornar NOVO array {}", a, resposta);
        //
        a = new int[]{8};
        resposta = m.obtenhaPares(a);
        assertArrayEquals("para array {8} deveria retornar array {8}", new int[] {8},resposta);
        assertNotSame("para array {8} deveria retornar NOVO array {8}", a, resposta);
        //
        a = new int[]{5};
        resposta = m.obtenhaPares(a);
        assertEquals("para array {5} deveria retornar array {}",0, resposta.length);
        //
        a = new int[]{8,12,6};
        resposta = m.obtenhaPares(a);
        assertArrayEquals("para array {8,12,6} deveria retornar array {8,12,6}", new int[] {8,12,6},resposta);
        assertNotSame("para array {8,12,6} deveria retornar NOVO array {8,12,6}", a, resposta);
        //
        a = new int[]{81,123,67};
        resposta = m.obtenhaPares(a);
        assertArrayEquals("para array {81,123,67} deveria retornar array {}", new int[] {},resposta);
        //
        a = new int[]{1,8,12,5};
        resposta = m.obtenhaPares(a);
        assertArrayEquals("para array {1,8,12,5} deveria retornar array {8,12}", new int[] {8,12},resposta);

    }

    @Test
    public void testDupliqueArray() {
        int[] a = new int[]{};
        int[] resposta = m.dupliqueArray(a);
        assertArrayEquals("para array {} deveria retornar array {}", new int[]{}, resposta);
        assertNotSame("para array {} deveria retornar NOVO array {}", a, resposta);
        //
        a = new int[]{9};
        resposta = m.dupliqueArray(a);
        assertArrayEquals("para array {9} deveria retornar array {9,9}",new int[]{9,9},resposta);
        //
        a = new int[]{2,9};
        resposta = m.dupliqueArray(a);
        assertArrayEquals("para array {2,9} deveria retornar array {2,2,9,9}",new int[]{2,2,9,9},resposta);
    }

    @Test
    public void testPossuiNumeroPar() {
        int[] a = new int[]{};
        assertFalse("array vazio não possui números pares", m.possuiNumeroPar(a));
        //
        a = new int[]{15};
        assertFalse("array {15} não possui números pares", m.possuiNumeroPar(a));
        //
        a = new int[]{18};
        assertTrue("array {18} possui números pares", m.possuiNumeroPar(a));
        //
        a = new int[]{181,3,1,33,35};
        assertFalse("array {181,3,1,33,35} não possui números pares",m.possuiNumeroPar(a));
        //
        a = new int[]{181,3,1,33,36};
        assertTrue("array {181,3,1,33,36} possui números pares",m.possuiNumeroPar(a));
        //
    }

    @Test
    public void testObtenhaPrimeiraPosicaoDeNumero() {
        assertEquals(-1, m.obtenhaPrimeiraPosicaoDeNumero(new int[]{}, 6));
        //
        int[] a = new int[]{66};
        assertEquals(-1, m.obtenhaPrimeiraPosicaoDeNumero(a, 55));
        //
        a = new int[]{99};
        assertEquals(0, m.obtenhaPrimeiraPosicaoDeNumero(a, 99));
        //
        a = new int[] {12,34,21,12,40,30,30};

        assertEquals(-1, m.obtenhaPrimeiraPosicaoDeNumero(a, 132));
        assertEquals(0, m.obtenhaPrimeiraPosicaoDeNumero(a, 12));
        assertEquals(1, m.obtenhaPrimeiraPosicaoDeNumero(a, 34));
        assertEquals(5, m.obtenhaPrimeiraPosicaoDeNumero(a, 30));

    }

    @Test
    public void testObtenhaPosicoesDenumero() {
        assertArrayEquals("para array {} deveria retornar array {}", new int[]{}, m.obtenhaPosicoesDeNumero(new int[]{}, 45));
        //
        assertArrayEquals("para array {17} e n 7 deveria retornar array {}",new int[]{}, m.obtenhaPosicoesDeNumero(new int[]{17}, 7));
        //
        assertArrayEquals("para array {7} e n 7 deveria retornar array {0}",new int[]{0}, m.obtenhaPosicoesDeNumero(new int[]{7}, 7));
        //
        int[] a = new int[] {28,33,51,15,33,82,84,91,91};
        assertArrayEquals("para array {28,33,51,15,33,82,84,91,91} e n 7 deveria retornar array {}",new int[]{}, m.obtenhaPosicoesDeNumero(a, 7));
        //
        assertArrayEquals("para array {28,33,51,15,33,82,84,91,91} e n 28 deveria retornar array {0}",new int[]{0}, m.obtenhaPosicoesDeNumero(a, 28));
        //
        assertArrayEquals("para array {28,33,51,15,33,82,84,91,91} e n 33 deveria retornar array {1,4}",new int[]{1,4}, m.obtenhaPosicoesDeNumero(a, 33));
        //
        assertArrayEquals("para array {28,33,51,15,33,82,84,91,91} e n 91 deveria retornar array {7,8}",new int[]{7,8}, m.obtenhaPosicoesDeNumero(a, 91));
        //
        assertArrayEquals("para array {28,33,51,15,33,82,84,91,91} e n 84deveria retornar array {6}",new int[]{6}, m.obtenhaPosicoesDeNumero(a, 84));
    }

    @Test
    public void testSemRepeticoes() {
        assertTrue("array vazio não possui repetições", m.semRepeticoes(new int[]{}));
        //
        assertTrue("array com um único número não possui repetições", m.semRepeticoes(new int[]{23}));
        //
        assertTrue("array {12,8} não possui repetições",m.semRepeticoes(new int[]{12,8}));
        //
        assertFalse("array {5,5} possui repetições",m.semRepeticoes(new int[]{5,5}));
        //
        assertFalse("array {5,3,4,1,5} possui repetições",m.semRepeticoes(new int[]{5,3,4,1,5}));
        //
        assertFalse("array {1,5,2,5,8} possui repetições", m.semRepeticoes(new int[]{1,5,2,5,8}));
    }

    @Test
    public void testObtenhaSemOcorrencias() {
        int[] a = new int[]{};
        int[] resposta;
        resposta = m.obtenhaSemOcorrencias(a, 23);
        assertArrayEquals("para array vazio deveria retornar array {}", new int[]{}, resposta);
        assertNotSame("para array vazio deveria retornar NOVO array {}", a, resposta);
        //
        a = new int[]{45};
        resposta = m.obtenhaSemOcorrencias(a, 45);
        assertArrayEquals("para array {45} e n 45 deveria retornar array {}", new int[]{}, resposta);
        //
        a = new int[]{42};
        resposta = m.obtenhaSemOcorrencias(a, 45);
        assertArrayEquals("para array {42} e n 45 deveria retornar array {42}", new int[]{42}, resposta);
        assertNotSame("para array {42} e n 45 deveria retornar NOVO array {42}", a, resposta);
        //
        a = new int[]{42,10};
        resposta = m.obtenhaSemOcorrencias(a, 42);
        assertArrayEquals("para array {42,10} e n 42 deveria retornar array {10}", new int[]{10}, resposta);
        //
        a = new int[]{42,10};
        resposta = m.obtenhaSemOcorrencias(a, 10);
        assertArrayEquals("para array {42,10} e n 10 deveria retornar array {42}", new int[]{42}, resposta);
        //
        a = new int[]{42,8,12,4,8,10};
        resposta = m.obtenhaSemOcorrencias(a, 42);
        assertArrayEquals("para array {42,8,12,4,8,10} e n 42 deveria retornar array {8,12,4,8,10}", new int[]{8,12,4,8,10}, resposta);
        //
        a = new int[]{42,8,12,4,8,10};
        resposta = m.obtenhaSemOcorrencias(a, 8);
        assertArrayEquals("para array {42,8,12,4,8,10} e n 8 deveria retornar array {42,12,4,10}", new int[]{42,12,4,10}, resposta);
        //
        a = new int[]{6,6,6,6,6};
        resposta = m.obtenhaSemOcorrencias(a, 6);
        assertArrayEquals("para array {6,6,6,6,6} e n 6 deveria retornar array {}", new int[]{}, resposta);
        //

    }

    @Test
    public void testSubstituaTodasOcorrencias() {
        int[] a;
        int[] resposta;

        a = new int[]{};
        try {
            m.substituaTodasOcorrencias(a, 4, 9);
        } catch (Exception e) {
            fail("Nao funcionou para array vazio");
        }

        a = new int[] {6};
        resposta = new int[] {9};
        m.substituaTodasOcorrencias(a, 6, 9);
        assertArrayEquals("para array {6}, substituir 6 por 9 deveria ficar {9}", resposta, a);

        a = new int[] {6};
        resposta = new int[] {6};
        m.substituaTodasOcorrencias(a, 5, 9);
        assertArrayEquals("para array {6}, substituir 5 por 9 deveria ficar {6}", resposta, a);

        a = new int[] {6,6};
        resposta = new int[] {9,9};
        m.substituaTodasOcorrencias(a, 6, 9);
        assertArrayEquals("para array {6,6}, substituir 6 por 9 deveria ficar {9,9}", resposta, a);

        a = new int[] {8,4,2,12,6};
        resposta = new int[] {8,4,2,12,9};
        m.substituaTodasOcorrencias(a, 6, 9);
        assertArrayEquals("para array {8,4,2,12,6}, substituir 6 por 9 deveria dar {8,4,2,12,9}",resposta, a);

        a = new int[] {8,6,2,12,6};
        resposta = new int[] {8,9,2,12,9};
        m.substituaTodasOcorrencias(a, 6, 9);
        assertArrayEquals("para array {8,6,2,12,6}, substituir 6 por 9 deveria dar {8,9,2,12,9}",resposta, a);    
    }

    @Test
    public void testSubstituaPrimeiraOcorrencia() {
        int[] a;
        int[] resposta;

        a = new int[]{};
        try {
            m.substituaPrimeiraOcorrencia(a, 4, 9);
        } catch (Exception e) {
            fail("Nao funcionou para array vazio");
        }

        a = new int[] {6};
        resposta = new int[] {9};
        m.substituaPrimeiraOcorrencia(a, 6, 9);
        assertArrayEquals("para array {6}, substituir 6 por 9 deveria ficar {9}", resposta, a);

        a = new int[] {6};
        resposta = new int[] {6};
        m.substituaPrimeiraOcorrencia(a, 5, 9);
        assertArrayEquals("para array {6}, substituir 5 por 9 deveria ficar {6}", resposta, a);

        a = new int[] {6,6};
        resposta = new int[] {9,6};
        m.substituaPrimeiraOcorrencia(a, 6, 9);
        assertArrayEquals("para array {6,6}, substituir 6 por 9 deveria ficar {9,6}", resposta, a);

        a = new int[] {8,4,2,12,6};
        resposta = new int[] {8,4,2,12,9};
        m.substituaPrimeiraOcorrencia(a, 6, 9);
        assertArrayEquals("para array {8,4,2,12,6}, substituir 6 por 9 deveria dar {8,4,2,12,9}",resposta, a);

        a = new int[] {8,6,2,12,6};
        resposta = new int[] {8,9,2,12,6};
        m.substituaPrimeiraOcorrencia(a, 6, 9);
        assertArrayEquals("para array {8,6,2,12,6}, substituir 6 por 9 deveria dar {8,9,2,12,6}",resposta, a);    

    }

    @Test
    public void testSubstituaUltimaOcorrencia() {
        int[] a;
        int[] resposta;

        a = new int[]{};
        try {
            m.substituaUltimaOcorrencia(a, 4, 9);
        } catch (Exception e) {
            fail("Nao funcionou para array vazio");
        }

        a = new int[] {6};
        resposta = new int[] {9};
        m.substituaUltimaOcorrencia(a, 6, 9);
        assertArrayEquals("para array {6}, substituir 6 por 9 deveria ficar {9}", resposta, a);

        a = new int[] {6};
        resposta = new int[] {6};
        m.substituaUltimaOcorrencia(a, 5, 9);
        assertArrayEquals("para array {6}, substituir 5 por 9 deveria ficar {6}", resposta, a);

        a = new int[] {6,6};
        resposta = new int[] {6,9};
        m.substituaUltimaOcorrencia(a, 6, 9);
        assertArrayEquals("para array {6,6}, substituir 6 por 9 deveria ficar {6,9}", resposta, a);

        a = new int[] {8,4,2,12,6};
        resposta = new int[] {8,4,2,12,9};
        m.substituaUltimaOcorrencia(a, 6, 9);
        assertArrayEquals("para array {8,4,2,12,6}, substituir 6 por 9 deveria dar {8,4,2,12,9}",resposta, a);

        a = new int[] {8,6,2,12,6};
        resposta = new int[] {8,6,2,12,9};
        m.substituaUltimaOcorrencia(a, 6, 9);
        assertArrayEquals("para array {8,6,2,12,6}, substituir 6 por 9 deveria dar {8,6,2,12,9}",resposta, a);    
    }

    @Test
    public void testInverta() {
        int[] a;
        int[] resultado;

        a = new int[]{};
        resultado = m.inverta(a);
        assertNotNull("inverter o array {} deve retornar um array no lugar de null", resultado);
        assertNotSame("o metodo deve retornar um novo array e nao o mesmo array", resultado, a);
        assertEquals("inverter o array {} deve retornar {}", 0, resultado.length);

        a = new int[] {7};
        resultado = m.inverta(a);
        assertNotNull("inverter array nao pode retornar null", resultado);
        assertArrayEquals("inverter array com um numero deve retornar array com um numero", resultado, a);

        a = new int[] {2,6};
        resultado = m.inverta(a);
        assertNotNull("inverter array nao pode retornar null", resultado);
        assertArrayEquals("falhou ao inverter array de tamanho 2", new int[]{6,2}, resultado);

        a = new int[] {1,2,3,4};
        resultado = m.inverta(a);
        assertNotNull("inverter array nao pode retornar null", resultado);
        assertArrayEquals("falhou ao inverter array de tamanho 4", new int[]{4,3,2,1}, resultado);
    }

    @Test
    public void testRetornaSomaDePosicoesParesEDePosicoesImpares() {
        int[] a;
        int[] resultado;

        a = new int[] {5,10};
        resultado = m.retorneSomaPosicoesParesPosicoesImpares(a);        
        assertNotNull("nao pode retornar null", resultado);
        assertEquals("array retornado tem que ter tamanho 2", 2, resultado.length);
        assertNotSame("deve retornar novo array", a, resultado);
        assertArrayEquals("nao retornou somas corretas para array de 2 numeros", a, resultado);

        a = new int[] {1,2,3,4,5,6};
        resultado = m.retorneSomaPosicoesParesPosicoesImpares(a);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou somas corretas", new int[]{9, 12}, resultado);
    }

    @Test
    public void testRetorneDasPosicoes() {
        int[] a;
        int[] posicoes;
        int[] resultado;

        a = new int[] {9,4,3,12,8};
        posicoes = new int[] {};
        resultado = m.obtenhaDasPosicoes(a, posicoes);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("quando ha zero posicoes deveria retornar {}", new int[]{}, resultado);

        posicoes = new int[] {3};
        resultado = m.obtenhaDasPosicoes(a, posicoes);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou valor correto quando ha uma unica posicao", new int[] {12}, resultado);

        posicoes = new int[] {0,3};
        resultado = m.obtenhaDasPosicoes(a, posicoes);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou valores corretos", new int[] {9,12}, resultado);        
    }

    @Test
    public void testRetorneParte() {
        int[] a;        
        int[] resultado;

        a = new int[]{};
        resultado = m.obtenhaParte(a,3,0);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou resposta correta quando array eh {}", new int[0], resultado);

        a = new int[]{56,23,88,10};
        resultado = m.obtenhaParte(a, 4, 0);
        assertNotNull("nao pode retornar null", resultado);
        assertNotSame("nao pode retornar o mesmo array", a, resultado);
        assertArrayEquals("para array {56,23,88,10} deveria retornar {56,23,88,10}",resultado, a);

        resultado = m.obtenhaParte(a, 3, 2);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou valores corretos quando quantidade solicitada eh maior que a existente",
            new int[] {88, 10}, resultado);

        resultado = m.obtenhaParte(a, 2, 1);
        assertNotNull("nao pode retornar null", resultado);
        assertArrayEquals("nao retornou valores corretos", new int[] {23,88}, resultado);

    }
}
