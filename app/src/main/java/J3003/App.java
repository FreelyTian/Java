package J3003;

public class App {
    public static void main(String [] args) {
        Livro pequeno_principe = new Livro(186, "Pequeno Príncipe", "Antoine De Saint-Exupéry", "Fábula, Infantil, Romance", 1);
        Leitor Rubens = new Leitor("Rubens Barbosa", 39);
        Sistema sistema = new Sistema();
        sistema.add_estante(0);
        sistema.registrar(pequeno_principe, 0, 48, 1);
        sistema.emprestar(pequeno_principe, Rubens, 0);
    }
}
