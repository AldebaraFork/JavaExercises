import java.util.List;
import java.util.Random;



    public class JogoDaVelha {

        public static void main(String[] args) {
            // Exemplo de uso
            List<String> posicoesLivres = List.of("0;0", "0;1", "0;2", "1;0", "1;1", "1;2", "2;0", "2;1", "2;2");
            int[] jogadaComputador = obterJogadaComputador(posicoesLivres);
            System.out.println("Jogada do computador: Linha " + jogadaComputador[0] + ", Coluna " + jogadaComputador[1]);
        }

        public static int[] obterJogadaComputador(List<String> posicoesLivres) {
            Random random = new Random();
            int indiceSorteado = random.nextInt(posicoesLivres.size());
            String jogadaSorteada = posicoesLivres.get(indiceSorteado);
            return converterJogadaStringParaVetorInt(jogadaSorteada);
        }

        public static int[] converterJogadaStringParaVetorInt(String jogada) {
            String[] partes = jogada.split(";");
            int linha = Integer.parseInt(partes[0]);
            int coluna = Integer.parseInt(partes[1]);
            return new int[]{linha, coluna};
        }
    }


