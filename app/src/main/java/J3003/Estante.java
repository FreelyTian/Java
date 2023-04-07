package J3003;

import java.util.ArrayList;

public class Estante {
    int num;
    int capacidade = 400;
    ArrayList<Livro> andar_1 = new ArrayList<>();
    ArrayList<Livro> andar_2 = new ArrayList<>();
    ArrayList<Livro> andar_3 = new ArrayList<>();
    ArrayList<Livro> andar_4 = new ArrayList<>();
    int ocupados;
    int livres;

    public Estante(int num) {
        this.num = num;
    }

    public void adicionar(Livro livro, int quantidade, int andar) {
        for (int i = 0; i <= quantidade; i++) {
            if (andar == 1 && andar_1.size() < 101) {
                this.andar_1.add(livro);
            } else if (andar == 1 && andar_1.size() == 100) {
                System.out.println("O andar informado se encontra cheio, tente novamente em outro andar.");
            }
            if (andar == 2 && andar_2.size() < 101) {
                this.andar_2.add(livro);
            } else if (andar == 2 && andar_2.size() == 100) {
                System.out.println("O andar informado se encontra cheio, tente novamente em outro andar.");
            }
            if (andar == 3 && andar_3.size() < 101) {
                this.andar_3.add(livro);
            } else if (andar == 3 && andar_3.size() == 100) {
                System.out.println("O andar informado se encontra cheio, tente novamente em outro andar.");
            }
            if (andar == 4 && andar_4.size() < 101) {
                this.andar_4.add(livro);
            } else if (andar == 4 && andar_4.size() == 100) {
                System.out.println("O andar informado se encontra cheio, tente novamente em outro andar.");
            }
        }
        this.ocupados += quantidade;
        this.livres = this.capacidade - this.ocupados;
        System.out.println(andar_1);
        System.out.println(this.ocupados);
        System.out.println(this.livres);
    }
}
