package J3003;

public class App {
    public static void main(String [] args) {
        Livro pequeno_principe = new Livro(186, "Pequeno Príncipe", "Antoine De Saint-Exupéry", "Fábula, Infantil, Romance", 1, 51);
        pequeno_principe.informacoes();
        Sistema sistema = new Sistema();
        sistema.add_estante(0);
        sistema.registrar(pequeno_principe, 0, 48, 1);
        for (Estante estante : sistema.estantes) {
            System.out.println(estante);
        }

    }
}
