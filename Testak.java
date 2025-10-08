import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class Testak {

    @Test
    public void testPeliculasPorDiaValido() {
        List<String> pelis = ErronkaLojika.getPeliculasPorDia("larunbata");
        assertEquals(15, pelis.size());
        assertTrue(pelis.contains("Lilo y Stitch"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPeliculasPorDiaInvalido() {
        ErronkaLojika.getPeliculasPorDia("astelehena");
    }

    @Test
    public void testNumeroPeliculasYGelas() {
        assertEquals(15, ErronkaLojika.getNumPeliculas());
        assertEquals(5, ErronkaLojika.getNumGelas());
    }

    @Test
    public void testExistePelicula() {
        assertTrue(ErronkaLojika.existePelicula("Lilo y Stitch"));
        assertTrue(ErronkaLojika.existePelicula("lilo y stitch"));
        assertFalse(ErronkaLojika.existePelicula("Pelikula Faltsua"));
    }

    @Test
    public void testComprarEntradasCorrecto() {
        String result = ErronkaLojika.comprarEntradas("Lilo y Stitch", 3);
        assertEquals("3 sarrera erosi dituzu Lilo y Stitch pelikularako", result);
    }

    @Test
    public void testComprarEntradasExceso() {
        String result = ErronkaLojika.comprarEntradas("Lilo y Stitch", 5);
        assertEquals("Ezin dira 4 sarrera baino gehiago erosi", result);
    }

    @Test
    public void testComprarEntradasPeliculaInexistente() {
        String result = ErronkaLojika.comprarEntradas("Inventada", 2);
        assertEquals("Ez da aurkitu pelikula hori", result);
    }

    @Test
    public void testComprarEntradasCantidadNegativa() {
        String result = ErronkaLojika.comprarEntradas("Lilo y Stitch", -1);
        assertEquals("Kopurua ez da baliagarria", result);
    }

    @Test
    public void testKokapena() {
        assertTrue(ErronkaLojika.getKokapena().contains("Usurbil"));
    }

    @Test
    public void testOrdutegia() {
        String ordutegia = ErronkaLojika.getOrdutegia();
        assertTrue(ordutegia.contains("Larunbata"));
        assertTrue(ordutegia.contains("Igandea"));
    }
}
