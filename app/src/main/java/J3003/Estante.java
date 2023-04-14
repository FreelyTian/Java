package J3003;

import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;

public class Estante{
    int num;
    int capacidade = 400;
    ArrayList<Livro> andar_1 = new ArrayList<>(100);
    ArrayList<Livro> andar_2 = new ArrayList<>(100);
    ArrayList<Livro> andar_3 = new ArrayList<>(100);
    ArrayList<Livro> andar_4 = new ArrayList<>(100);
    int ocupados;
    int livres;

    public Estante(int num) {
        this.num = num;
    }

    public void adicionar(Livro livro, int quantidade, int andar) {
        for (int i = 0; i <= quantidade; i++) {
            if (andar == 1 && andar_1.size() - quantidade < 101) {
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
        this.ocupados = this.andar_1.size() + this.andar_2.size() + this.andar_3.size() + this.andar_4.size();
        this.livres = this.capacidade - this.ocupados;
        System.out.println(this.ocupados);
        System.out.println(this.livres);
    }
    public void remover(Livro qual_livro, int qual_andar){
        switch (qual_andar){
            case 1:
                this.andar_1.remove(qual_livro);
            case 2:
                this.andar_2.remove(qual_livro);
            case 3:
                this.andar_3.remove(qual_livro);
            case 4:
                this.andar_4.remove(qual_livro);
            default:
                this.ocupados = this.andar_1.size() + this.andar_2.size() + this.andar_3.size() + this.andar_4.size();
                this.livres = this.capacidade - this.ocupados;
        this.ocupados = this.andar_1.size() + this.andar_2.size() + this.andar_3.size() + this.andar_4.size();
        this.livres = this.capacidade - this.ocupados;
        }
    }
}
