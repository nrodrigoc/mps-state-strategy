package br.state.mps.states;

import br.state.mps.MaquinaRefrigerantes;

public class SemMoedaState extends MaquinaRefrigeranteState{
    public SemMoedaState(MaquinaRefrigerantes maquinaRefrigerantes) {
        super(maquinaRefrigerantes);
    }

    @Override
    public void inseriuMoeda(){
        System.out.println( "OK: Moeda inserida com sucesso." );
        maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoComMoeda() );
    }

    @Override
    public void solicitouMoeda(){

        System.out.println( "FALHOU: Não há mais moedas disponíveis para retorno." );
    }

    @Override
    public void despejarRefrigerante(){

        System.out.println( "FALHOU: Você ainda não colocou uma moeda." );
    }

    @Override
    public void acionarManutencao(){

        System.out.println( "OK: máquina agora em manutenção." );
        maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoManutencao() );
    }
}
