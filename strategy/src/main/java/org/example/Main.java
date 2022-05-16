package org.example;

public class Main {
    public static void main(String[] args) {

        CalculadoraGastoCombustivel calculadoraGasto = new CalculadoraGastoCombustivel();

        // Calcula o gasto de combustível para 100 km para uma moto
        calculadoraGasto.setStrategy(new ConsumoMotocicleta());
        System.out.println("Consumo Moto: " + calculadoraGasto.calculaConsumoPelaDistancia(26));

        // Calcula o gasto de combustível para 100 km para um carro Hatch
        calculadoraGasto.setStrategy(new ConsumoHatch());
        System.out.println("Consumo Hatch: " + calculadoraGasto.calculaConsumoPelaDistancia(26));

        // Calcula o gasto de combustível para 100 km para um carro SUV
        calculadoraGasto.setStrategy(new ConsumoSUV());
        System.out.println("Consumo SUV: " + calculadoraGasto.calculaConsumoPelaDistancia(26));

    }
}