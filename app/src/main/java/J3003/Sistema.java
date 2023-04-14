package J3003;

import java.util.ArrayList;

public class Sistema {
    int qtd_livros;

    ArrayList<Estante> estantes = new ArrayList<>();

    public void add_estante(int num) {
        Estante estante = new Estante(num);
        this.estantes.add(estante);
    }

    public void registrar(Livro livro, int qual_estante, int quantidade, int andar) {
        estantes.get(qual_estante).adicionar(livro, quantidade, andar);

    }

    public void emprestar(Livro livro, Leitor quem, int qual_estante) {
        if (estantes.get(qual_estante).andar_1.contains(livro)) {
            quem.livros_pegos.add(livro.get_info().get(0));
            estantes.get(qual_estante).remover(livro, 1);
            System.out.println(estantes.get(qual_estante).andar_1.size());
            System.out.print("\nLivro emprestado com sucesso!\nO usuário tem os seguintes livros consigo: " + quem.livros_pegos);
            int restantes = estantes.get(qual_estante).ocupados;
            String nome_do_livro = livro.get_info().get(0);
            String msg = String.format(" Restam %d do livro %s", restantes, nome_do_livro);
            System.out.println(msg);
        }
    }
}
