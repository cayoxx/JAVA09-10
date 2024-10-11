package composicao;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("J.K. Rowling");


        Livro livro = new Livro("Harry Potter", autor);

        System.out.println("Título do Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
    }
}
