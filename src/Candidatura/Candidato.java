package Candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Candidato {

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean status;
    private String mensagem;
    private String nome;

    public Candidato(String nome){
        this.nome = nome;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;

        if(mensagem.equalsIgnoreCase("Ligar para o candidato") || mensagem.equalsIgnoreCase("Ligar com contra proposta")){
            status=true;
        }
    }

    public String getNome() {
        return nome;
    }

}
