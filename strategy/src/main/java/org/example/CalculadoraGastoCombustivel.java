package org.example;

public class CalculadoraGastoCombustivel {

    public static final double PRECO_GASOLINA = 7.17;

    private ConsumoStrategy strategy;

    public double calculaConsumoPelaDistancia(double distancia){
        return strategy.getGastoCombustivelPelaDistancia(distancia);
    }

    public void setStrategy(ConsumoStrategy strategy) {
        this.strategy = strategy;
    }
}
