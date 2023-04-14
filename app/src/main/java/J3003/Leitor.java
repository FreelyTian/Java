package J3003;

import java.util.ArrayList;
import java.util.Random;

public class Leitor {
    String nome;
    private Random rnd = new Random();
    int idade;
    int matricula;
    ArrayList<String> livros_pegos = new ArrayList<String>();

    public Leitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = rnd.nextInt(0, 999999999);
    }

    public ArrayList<String> getLivros_pegos() {
        return livros_pegos;
    }
}
