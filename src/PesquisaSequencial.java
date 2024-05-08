public class PesquisaSequencial {
    public int pesquisa(int chave, int vetor[]) {
        int quantidadeOperacoes = 0;

        for (int i = 0; i < vetor.length; i++) {
            quantidadeOperacoes++;
            if (vetor[i] == chave) {
                return quantidadeOperacoes;
            }
        }
        // Se a chave não for encontrada, retorna o número total de elementos no vetor como operações realizadas
        return quantidadeOperacoes;
    }
}
