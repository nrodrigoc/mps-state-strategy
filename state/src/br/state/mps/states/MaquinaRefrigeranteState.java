package br.state.mps.states;

import br.state.mps.MaquinaRefrigerantes;

public abstract class MaquinaRefrigeranteState {

    protected MaquinaRefrigerantes maquinaRefrigerantes;

    protected MaquinaRefrigeranteState(MaquinaRefrigerantes maquinaRefrigerantes) {
        this.maquinaRefrigerantes = maquinaRefrigerantes;
    }

    public void inseriuMoeda(){

        System.out.println( "FALHOU: Máquina em manutenção." );
    }

    public void solicitouMoeda(){

        System.out.println( "FALHOU: Máquina em manutenção." );
    }

    public void despejarRefrigerante(){

        System.out.println( "FALHOU: Máquina em manutenção." );
    }

    protected void despejar(){}

    public void inserirRefrigerantes( int quantidadeRefrigerantes ){

        int totalRefrigerantes = maquinaRefrigerantes.getQuantidadeRefrigerantes();
        totalRefrigerantes += quantidadeRefrigerantes;
        maquinaRefrigerantes.setQuantidadeRefrigerantes( totalRefrigerantes );
    }

    public void acionarManutencao(){

        System.out.println( "FALHOU: Ainda em processamento, aguarde os estados ociosos para entrar em mnutenção." );
    }

    public void desacionarManutencao(){

        System.out.println( "FALHOU: Máquina não está em mnutenção." );
    }
}
