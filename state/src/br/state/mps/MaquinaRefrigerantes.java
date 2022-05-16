package br.state.mps;

import br.state.mps.states.*;

public class MaquinaRefrigerantes {

    private final MaquinaRefrigeranteState estadoSemMoeda;
    private final MaquinaRefrigeranteState estadoComMoeda;
    private final MaquinaRefrigeranteState estadoVenda;
    private final MaquinaRefrigeranteState estadoSemRefrigerante;
    private final MaquinaRefrigeranteState estadoManutencao;

    private int quantidadeRefrigerantes;
    private MaquinaRefrigeranteState estado;

    MaquinaRefrigerantes(int quantidadeRefrigerantes) {
        this.quantidadeRefrigerantes = quantidadeRefrigerantes;
        estadoSemMoeda = new SemMoedaState( this );
        estadoComMoeda = new ComMoedaState( this );
        estadoVenda = new VendaState( this );
        estadoSemRefrigerante = new SemRefrigerantesState( this );
        estadoManutencao = new ManutencaoState( this );

        //estado inicial: Máquina sem moedas
        setEstado(estadoSemMoeda);
    }

    public MaquinaRefrigeranteState getEstado() {
        return estado;
    }

    public void setEstado(MaquinaRefrigeranteState estado) {
        this.estado = estado;
    }

    public void inseriuMoeda(){

        estado.inseriuMoeda();
    }

    public void solicitouMoeda(){

        estado.solicitouMoeda();
    }

    public void despejarRefrigerante(){

        estado.despejarRefrigerante();
    }

    public void inserirRefrigerantes( int quantidadeRefrigerantes ){

        estado.inserirRefrigerantes( quantidadeRefrigerantes );
    }

    public void acionarManutencao(){

        estado.acionarManutencao();
    }

    public void desacionarManutencao(){

        estado.desacionarManutencao();
    }

    public int getQuantidadeRefrigerantes(){
        return quantidadeRefrigerantes;
    }

    public void setQuantidadeRefrigerantes( int quantidadeRefrigerantes ){

        this.quantidadeRefrigerantes = Math.max(quantidadeRefrigerantes, 0);
    }

    public MaquinaRefrigeranteState getEstadoSemMoeda() {

        return estadoSemMoeda;
    }

    public MaquinaRefrigeranteState getEstadoComMoeda() {

        return estadoComMoeda;
    }

    public MaquinaRefrigeranteState getEstadoVenda() {

        return estadoVenda;
    }

    public MaquinaRefrigeranteState getEstadoSemRefrigerante() {

        return estadoSemRefrigerante;
    }

    public MaquinaRefrigeranteState getEstadoManutencao() {

        return estadoManutencao;
    }


}
