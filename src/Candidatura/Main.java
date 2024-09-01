package Candidatura;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ProcessoSeletivo processo = new ProcessoSeletivo();

        String[] candidatos = {"Felipe", "Julia", "Marcia","Mônica","Fabricio", "Mirela", "Daniela", "Jorge", "Yasmin", "Lorena"};
        int candidatosSelecionados=0;
        String[] selecionados = new String[5];
        for (String s : candidatos) {
            Candidato candidato = new Candidato(s);
            double salarioPretendido = Candidato.valorPretendido();
            boolean atendeu = processo.entrandoContato();
            candidato.setMensagem(processo.analisaCandidato(salarioPretendido));
            if (candidatosSelecionados >= 5) {
                break;
            }
            if (candidato.isStatus()) {
                selecionados[candidatosSelecionados] = candidato.getNome();
                candidatosSelecionados++;
            }
        }

        System.out.println("\nCandidatos selecionados: ");
        for (int i = 0; i < candidatosSelecionados; i++) {
            System.out.println(selecionados[i]);
        }

    }


}