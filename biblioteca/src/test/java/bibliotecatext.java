import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import br.ueg.cs.biblioteca.Biblioteca;

class BibliotecaText{

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp(){
        biblioteca = new Biblioteca();
    }

    @Test
    void testAdicionarLivro(){
        biblioteca.adicionarLivro("Dom Casmurro");
        List<String> livros = biblioteca.listarLivros();

        assertEquals(1, livros.size());
        assertTrue(livros.contains("Dom Casmurro"));
    }

    @Test
    void testRemoverLivro(){
        biblioteca.adicionarLivro("Memórias Póstumas de Brás Cubas");

        boolean removido = biblioteca.removerLivro("Memórias Póstumas de Brás Cubas");

        assertTrue(removido);

        assertFalse(biblioteca.listarLivros().contains("Memórias Póstumas de Brás Cubas"))
    
    }

    @Test
    void testRemoverLivroInexistente(){
        boolean removido = biblioteca.removerLivro("Livro Inexistente");
        assertFalse(removido);
    }

    @Test
    void testListarLivros(){
        biblioteca.adicionarLivro("Sítio do Picapau Amarelo");
        List<String> livros = biblioteca.listarLivros();

    assertThrows(UnsupportedOperationException.class,()) {
                livros.add("Quincas Borba")
    }
    }

}


