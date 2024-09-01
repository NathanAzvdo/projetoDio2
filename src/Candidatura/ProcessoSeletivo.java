package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static boolean entrandoContato(){
        int tentativas =0;
        boolean atendeu;

        do{
            atendeu=atender();
            if(atendeu){
                return true;
            }
            else{
                tentativas++;
            }
        }while(tentativas<3);
        return false;
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static String analisaCandidato(double salario) {
        double salarioBase = 2000;

        if (salarioBase > salario) {
            return "Ligar para o candidato";
        } else if (salarioBase == salario) {
            return "Ligar com contra proposta";
        } else {
            return "Aguardando candidatos";
        }
    }

}

