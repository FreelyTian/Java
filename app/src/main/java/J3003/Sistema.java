package J3003;

import java.util.ArrayList;

public class Sistema {
    int qtd_livros;

    ArrayList<Estante> estantes = new ArrayList<>();

    public void add_estante(int num){
        Estante estante = new Estante(num);
        this.estantes.add(estante);
    }

    public void registrar(Livro livro, int qual, int quantidade, int andar) {
        estantes.get(qual).adicionar(livro, quantidade, andar);

    }
}
