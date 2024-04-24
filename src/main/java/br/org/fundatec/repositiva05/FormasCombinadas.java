package br.org.fundatec.repositiva05;

import java.util.ArrayList;
import java.util.List;

public class FormasCombinadas {
    private List<FormaGeometrica> formas = new ArrayList<>();

    public void adicionarForma(FormaGeometrica forma) {
        formas.add(forma);
    }

    public double calcularAreaCombinada() {
        double areaTotal = 0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
