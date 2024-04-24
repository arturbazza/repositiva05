package br.org.fundatec.repositiva05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FormaGeometricaTest {

    @Test
    public void testQuadrado() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(25, quadrado.calcularArea());
        assertEquals(20, quadrado.calcularPerimetro());
    }

    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo(4, 6);
        assertEquals(24, retangulo.calcularArea());
        assertEquals(20, retangulo.calcularPerimetro());
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals(6, triangulo.calcularArea());
        assertEquals(12, triangulo.calcularPerimetro());
    }

    @Test
    public void testFormasCombinadas() {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        FormasCombinadas formasCombinadas = new FormasCombinadas();
        formasCombinadas.adicionarForma(quadrado);
        formasCombinadas.adicionarForma(retangulo);
        formasCombinadas.adicionarForma(triangulo);

        assertEquals(55, formasCombinadas.calcularAreaCombinada());
    }
}
