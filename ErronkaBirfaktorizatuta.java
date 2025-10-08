import java.util.Scanner;

/**
 * Zinema bateko filmen aukeraketa menua kudeatzen duen klase nagusia.
 * Egun bat aukeratzeko, filmak ikusteko, zinemak ikusteko, kokapena eta ordutegiak egiaztatzeko eta sarrerak erosteko aukera ematen dizu.
 */
public class ErronkaBirfaktorizatuta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pelikula = {
            "Lilo y Stitch", "Una pelicula de Minecraft", "Mufasa: El rey leon",
            "Como entrenar a tu dragon", "Capitan America: Brave New World",
            "Conclave", "Sonic 3: La pelicula", "Mision: Imposible. Sentencia Final",
            "Blancanieves", "Thunderbolt", "Padre no hay más que uno 5",
            "Wolfgang (Extraordinario)", "El casoplon", "Un funeral de locos", "Sirat"
        };

        String[] gela = {
            "Umeen gela", "Superheroien gela", "Thriller gela",
            "Zientzia fikzioko gela", "Zientzia fikzioko gela"
        };

        boolean seguitu = true;

        while (seguitu) {
            int aukera = erakutsiMenua(sc);

            switch (aukera) {
                case 1:
                    aukeratuEguna(sc, pelikula);
                    break;
                case 2:
                    informazioOrokorra(sc, pelikula, gela);
                    break;
                case 3:
                    seguitu = erakutsiKokapena(sc);
                    break;
                case 4:
                    erakutsiOrdutegia();
                    break;
                case 5:
                    System.out.println("Irteera aukeratu duzu");
                    seguitu = false;
                    break;
                default:
                    System.out.println("Aukera baliogabea. Saiatu berriro.");
                    break;
            }
        }

        sc.close();
    }

    // ===== FUNZIOAK =====

    public static int erakutsiMenua(Scanner sc) {
        System.out.println("\nHasierako menua:");
        System.out.println("1- Aste Eguna aukeratu.");
        System.out.println("2- Pelikulen informazio orokorra.");
        System.out.println("3- Kokapena ikusi.");
        System.out.println("4- Irekiera ordutegia ikusi.");
        System.out.println("5- Irtetzeko aukera.");
        System.out.println("\nAukeratu bat: ");
        return sc.nextInt();
    }

    public static void aukeratuEguna(Scanner sc, String[] pelikula) {
        sc.nextLine();
        System.out.println("Aukeratu egun bat (larunbata edo igandea): ");
        String eguna = sc.nextLine();

        if (eguna.equalsIgnoreCase("larunbata") || eguna.equalsIgnoreCase("igandea")) {
            for (String p : pelikula) {
                System.out.println(p);
            }
        } else {
            System.out.println("Errorea. Bakarrik larunbata edo igandea idatzi behar duzu.");
        }
    }

    public static void informazioOrokorra(Scanner sc, String[] pelikula, String[] gela) {
        System.out.println("Aukeratu opzio bat:");
        System.out.println("1- Pelikula kopurua eta hauen izenak.");
        System.out.println("2- Gela kopurua eta hauen izenak.");
        int opzioa = sc.nextInt();
        sc.nextLine();

        if (opzioa == 1) {
            erakutsiPelikulakEtaErosi(sc, pelikula);
        } else if (opzioa == 2) {
            erakutsiGelak(gela);
        } else {
            System.out.println("Aukera baliogabea.");
        }
    }

    public static void erakutsiPelikulakEtaErosi(Scanner sc, String[] pelikula) {
        System.out.println("Pelikularen kopurua: " + pelikula.length);
        for (String p : pelikula) {
            System.out.println("- " + p);
        }

        System.out.println("Aukeratu erosi nahi duzun pelikula: ");
        String erosi = sc.nextLine();
        boolean aurkituta = false;

        for (String p : pelikula) {
            if (p.equalsIgnoreCase(erosi)) {
                aurkituta = true;
                System.out.println("Zenbat sarrera erosi nahi dituzu? ");
                int sarrerak = sc.nextInt();

                if (sarrerak > 4) {
                    System.out.println("Ezin dira 4 sarrera baino gehiago erosi.");
                } else {
                    System.out.println(sarrerak + " sarrera erosi dituzu " + erosi + " pelikularako. Ondo pasa!!!");
                }
                break;
            }
        }

        if (!aurkituta) {
            System.out.println("Ez da aurkitu pelikula hori.");
        }
    }

    public static void erakutsiGelak(String[] gela) {
        System.out.println("Gelaren kopurua: " + gela.length);
        for (String g : gela) {
            System.out.println("- " + g);
        }
    }

    public static boolean erakutsiKokapena(Scanner sc) {
        sc.nextLine();
        System.out.println("Gure kokapena hau da:");
        System.out.println("Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa");
        System.out.println("Zer egin nahi duzu? Atera edo beste aukera bat aukeratu? (atera/segui): ");
        String selekzioa = sc.nextLine();

        if (selekzioa.equalsIgnoreCase("atera")) {
            return false;
        }
        return true;
    }

    public static void erakutsiOrdutegia() {
        System.out.println("Gure ordutegia:");
        System.out.println("Larunbata: 10:00 - 22:00");
        System.out.println("Igandea: 10:00 - 00:00");
    }
}
