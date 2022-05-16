package org.example;

public class ConsumoHatch implements ConsumoStrategy{

    private static final double QUILOMETROS_POR_LITRO = 13;
    @Override
    public double getGastoCombustivelPelaDistancia(double distancia) {
        return CalculadoraGastoCombustivel.PRECO_GASOLINA * distancia / QUILOMETROS_POR_LITRO;
    }
}
