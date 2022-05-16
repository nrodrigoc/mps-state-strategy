package br.state.mps;

public class Main {
    public static void main(String[] args) {

        // Cria máquina com 1 refrigerante
        MaquinaRefrigerantes maquinaRefrigerantes = new MaquinaRefrigerantes(1);

        // Sequência de passos de alteração de estados na máquina de refrigerantes

        // 1: Estado Sem Moeda
        maquinaRefrigerantes.inseriuMoeda();

        // 2: Estado Com Moeda
        maquinaRefrigerantes.inseriuMoeda();

        // 3: Estado com Moeda
        maquinaRefrigerantes.solicitouMoeda();

        // 4: Estado sem Moeda
        maquinaRefrigerantes.solicitouMoeda();

        // 5: Estado com Moeda
        maquinaRefrigerantes.inseriuMoeda();

        // 6: Estado com Moeda
        maquinaRefrigerantes.despejarRefrigerante();

        // 7: Estado Venda
        maquinaRefrigerantes.solicitouMoeda();

        // 8: Estado sem Moeda
        maquinaRefrigerantes.inseriuMoeda();

        // 9: Estado sem Refrigerantes
        maquinaRefrigerantes.despejarRefrigerante();

        // 10: Estado sem Refrigerantes
        maquinaRefrigerantes.acionarManutencao();

        // 11: Estado em Manutenção
        maquinaRefrigerantes.setQuantidadeRefrigerantes(1);

        // 12: Estado em Manutenção
        maquinaRefrigerantes.desacionarManutencao();


    }
}