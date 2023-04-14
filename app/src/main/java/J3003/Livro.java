package J3003;

import java.util.ArrayList;

public class Livro {
    private int num_paginas;
    private final String titulo;
    private final String autor;
    private final String tema;
    private final int tipo;
    private final boolean is_emprestado = false;

    public Livro(int num_paginas, String titulo, String autor, String tema, int tipo){
        this.num_paginas = num_paginas;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.tipo = tipo;
    }

    public ArrayList<String> get_info() {
        ArrayList<String> info = new ArrayList<>();
        info.add(this.titulo);
        String num_paginas_str = String.format("%d", this.num_paginas);
        info.add(num_paginas_str);
        info.add(this.autor);
        info.add(this.tema);
        return info;
    }

}
