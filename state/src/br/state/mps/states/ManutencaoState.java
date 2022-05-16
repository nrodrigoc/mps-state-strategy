package br.state.mps.states;

import br.state.mps.MaquinaRefrigerantes;

public class ManutencaoState extends MaquinaRefrigeranteState{

    public ManutencaoState( MaquinaRefrigerantes maquinaRefrigerantes ){

        super( maquinaRefrigerantes );
    }

    public void acionarManutencao(){

        System.out.println( "FALHOU: Já está em manutenção." );
    }

    public void desacionarManutencao(){

        System.out.println( "OK: Máquina ativa novamente." );

        if( maquinaRefrigerantes.getQuantidadeRefrigerantes() > 0 ){

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemMoeda() );
        }
        else{

            maquinaRefrigerantes.setEstado( maquinaRefrigerantes.getEstadoSemRefrigerante() );
        }
    }
}
