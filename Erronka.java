import java.util.Scanner;
import java.util.ArrayList;

public class Erronka {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> pelikulak = new ArrayList<String>();
        String[] pelikula={"Lilo y Stitch","Una película de Minecraft","Mufasa: El rey león",
                            "Cómo entrenar a tu dragón","Capitán América: Brave New World",
                            "Conclave","Sonic 3: La película","Misión: Imposible. Sentencia Final",
                            "Blancanieves","Thunderbolt","Padre no hay más que uno 5",
                            "Wolfgang (Extraordinario)","El casoplón","Un funeral de locos","Sirat"};

        ArrayList<String> gelak = new ArrayList<String>();
        String[] gela ={"Umeen gela","Superheroien gela","Thriller gela","Zientzia fikzioko gela","Zientzia fikzioko gela"};

        boolean seguitu=true;

        while(seguitu){

            System.out.println(" ");
            System.out.println("Hasierako menua:");
            System.out.println("1- Aste Eguna aukeratu.");
            System.out.println("2- Pelikulen informazio orokorra.");
            System.out.println("3- Kokapena ikusi.");
            System.out.println("4- Irekiera ordutegia ikusi.");
            System.out.println("5- Irtetzeko aukera.");
            System.out.println(" ");
            System.out.println("Aukeratu bat:");
            int aukera=sc.nextInt();
            sc.nextLine();

            switch (aukera) {
            case 1:
                System.out.println("Aukeratu egun bat larunbata edo igandea:");
                String eguna = sc.nextLine();
                
                if(eguna.equalsIgnoreCase("larunbata")){
                    for(String p:pelikula){
                        System.out.println(p);
                    }
                }else if(eguna.equalsIgnoreCase("igandea")){
                    for(String p:pelikula){
                        System.out.println(p);
                    }
                }else{
                    System.out.println("Errorea. Bakarrik larunbata edo igandea idatzi behar duzu.");
                }
                break;

            case 2:
                System.out.println("Aukeratu opzio bat:");
                System.out.println("1- Pelikula kopurua eta hauen izenak.");
                System.out.println("2- Gela kopurua eta hauen izenak.");
                int opzioa=sc.nextInt();
                if(opzioa==1){
                    System.out.println("Pelikularen kopurua: "+pelikula.length);
                    for(String p : pelikula){
                        System.out.println("Haien izenak: "+p);
                    }
                }else{
                    System.out.println("Pelikularen kopurua: "+gela.length);
                    for(String g : gela){
                        System.out.println("Haien izenak: "+g);
                    }
                }

                System.out.println("Aukeratu erosi nahi duzun pelikula:");
                String erosi=sc.nextLine();

                break;

            case 3:
                System.out.println("Gure kokapena hau da");
                System.out.println("Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa");
                System.out.println("Zer egin nahi duzu? Atera edo beste aukera bat aukeratu? (atera/segui):");
                String selekzioa=sc.nextLine();
                if(selekzioa.equalsIgnoreCase("atera")){
                    seguitu=false;
                    break;
                }
                if(selekzioa.equalsIgnoreCase("segui")){
                    break;
                }
                break;

            case 4:
                System.out.println("Gure ordutegia:");
                System.out.println("Larunbata: 10:00 - 22:00");
                System.out.println("Igandea: 10:00 - 00:00");
                break;
        
            case 5:
                System.out.println("Irteera aukeratu duzu");
                seguitu=false;
                break;

            default:
                break;
        }
        }
        sc.close();
    }
}
