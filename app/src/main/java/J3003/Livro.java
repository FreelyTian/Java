package J3003;

public class Livro {
    int num_paginas;
    String titulo;
    String autor;
    String tema;
    int tipo;
    int quantidade;
    boolean is_emprestado;

    public Livro(int num_paginas, String titulo, String autor, String tema, int tipo, int quantidade){
        this.num_paginas = num_paginas;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void informacoes() {
        System.out.println("Número de páginas: " + this.num_paginas + " Título: " + this.titulo + " Autor: " + this.autor + " Tema(s): " + this.tema + " Tipo: " + this.tipo);
    }
}
