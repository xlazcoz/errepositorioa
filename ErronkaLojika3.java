import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErronkaLojika3 {

    private static final List<String> PELIKULAK = Arrays.asList(
        "Lilo y Stitch","Una pelicula de Minecraft","Mufasa: El rey leon",
        "Como entrenar a tu dragon","Capitan America: Brave New World",
        "Conclave","Sonic 3: La pelicula","Mision: Imposible. Sentencia Final",
        "Blancanieves","Thunderbolt","Padre no hay más que uno 5",
        "Wolfgang (Extraordinario)","El casoplon","Un funeral de locos","Sirat"
    );

    private static final List<String> GELAK = Arrays.asList(
        "Umeen gela","Superheroien gela","Thriller gela","Zientzia fikzioko gela","Zientzia fikzioko gela"
    );

    public static List<String> getPeliculasPorDia(String eguna) {
        if (eguna == null || (!eguna.equalsIgnoreCase("larunbata") && !eguna.equalsIgnoreCase("igandea"))) {
            throw new IllegalArgumentException("Eguna okerra da. Idatzi 'larunbata' edo 'igandea'");
        }
        return new ArrayList<>(PELIKULAK);
    }

    public static int getNumPeliculas() {
        return PELIKULAK.size();
    }

    public static int getNumGelas() {
        return GELAK.size();
    }

    public static List<String> getGelas() {
        return new ArrayList<>(GELAK);
    }

    public static boolean existePelicula(String izena) {
        for (String p : PELIKULAK) {
            if (p.equalsIgnoreCase(izena)) return true;
        }
        return false;
    }

    public static String comprarEntradas(String pelicula, int cantidad) {
        if (!existePelicula(pelicula)) {
            return "Ez da aurkitu pelikula hori";
        }
        if (cantidad > 4) {
            return "Ezin dira 4 sarrera baino gehiago erosi";
        }
        if (cantidad <= 0) {
            return "Kopurua ez da baliagarria";
        }
        return cantidad + " sarrera erosi dituzu " + pelicula + " pelikularako";
    }

    public static String getKokapena() {
        return "Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa";
    }

    public static String getOrdutegia() {
        return "Larunbata: 10:00 - 22:00\nIgandea: 10:00 - 00:00";
    }
}
