import java.util.Scanner;

/**
* Zinema bateko filmen aukeraketa menua kudeatzen duen klase nagusia.
* Egun bat aukeratzeko, filmak ikusteko, zinemak ikusteko, kokapena eta ordutegiak egiaztatzeko eta sarrerak erosteko aukera ematen dizu.
*/
public class Erronka {
    //aplikazioaren metodo printzipala
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //array bat pelikulak ipintzeko
        String[] pelikula={"Lilo y Stitch","Una pelicula de Minecraft","Mufasa: El rey leon",
                            "Como entrenar a tu dragon","Capitan America: Brave New World",
                            "Conclave","Sonic 3: La pelicula","Mision: Imposible. Sentencia Final",
                            "Blancanieves","Thunderbolt","Padre no hay más que uno 5",
                            "Wolfgang (Extraordinario)","El casoplon","Un funeral de locos","Sirat"};

        //array bat gelak ipintzeko
        String[] gela ={"Umeen gela","Superheroien gela","Thriller gela","Zientzia fikzioko gela","Zientzia fikzioko gela"};

        //boolean bat programa martxan jarraitzeko egia ezartzen den bitartean
        boolean seguitu=true;

        while(seguitu){
            //lehen menua
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
            //jartzen duen zenbakiaren arabera, gauza bat edo bestea egingo du
            switch (aukera) {
            //lehen casuan
            case 1:
                System.out.println("Aukeratu egun bat larunbata edo igandea:");
                String eguna = sc.nextLine();
                //eguna larunbata baldin bada, pelikulak jarri
                if(eguna.equalsIgnoreCase("larunbata")){
                    for(String p:pelikula){
                        System.out.println(p);
                    }
                }else if(eguna.equalsIgnoreCase("igandea")){ //eguna igandea baldin bada, pelikulak jarri
                    for(String p:pelikula){
                        System.out.println(p);
                    }
                }else{
                    System.out.println("Errorea. Bakarrik larunbata edo igandea idatzi behar duzu.");
                }
                break;

            case 2:
                //bigarren menua
                System.out.println("Aukeratu opzio bat:");
                System.out.println("1- Pelikula kopurua eta hauen izenak.");
                System.out.println("2- Gela kopurua eta hauen izenak.");
                int opzioa=sc.nextInt();
                sc.nextLine();

                if(opzioa==1){  //opzioa 1 baldin bada, pelikularen kopurua jarri
                    System.out.println("Pelikularen kopurua: "+pelikula.length);
                    for(String p : pelikula){
                        System.out.println("- "+p); //ere pelikularen izenak jartzen dira
                    }

                    System.out.println("Aukeratu erosi nahi duzun pelikula:");
                    String erosi=sc.nextLine();

                    //boolean bat pelikula aurkitzeko
                    boolean aurkituta=false;

                    for(String p:pelikula){
                        if(p.equalsIgnoreCase(erosi)){  //pelikula array-an baldin badago...
                            aurkituta=true; //... eta pelikula aurkitzen badu...

                            System.out.println("Zenbat sarrera erosi nahi dituzu?"); //... eroten dira sarrerak
                            int sarrerak=sc.nextInt();

                            if(sarrerak>4){
                                System.out.println("Ezin dira 4 sarrera baino gehiago erosi"); //sarrerak 4 baino gehiago badira, dena berriz egin behar da
                                break;
                            }else{
                                System.out.println(sarrerak+" erosi dituzu "+erosi+" sarrera. Ondo pasa!!!"); //erresumen bat jartzen da
                            }
                        }
                    }

                    if(!aurkituta){ //pelikula aurkitzen ez badu
                        System.out.println("Ez da aurkitu pelikula hori"); //mezua bat jarri
                        break;
                    }
                }else{
                    System.out.println("Gelaren kopurua: "+gela.length); //gelaren kopurua jartzen da
                    for(String g : gela){ //gelaren array-a zeharkatzen da
                        System.out.println("- "+g); //gelaren izenak ateratzen dira
                    }
                }

                break;

            case 3: //zinemaren kokapena erakusten da
                System.out.println("Gure kokapena hau da");
                System.out.println("Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa");
                System.out.println("Zer egin nahi duzu? Atera edo beste aukera bat aukeratu? (atera/segui):");
                String selekzioa=sc.nextLine();

                if(selekzioa.equalsIgnoreCase("atera")){ //selekzioan ateratzen baldin badu...
                    seguitu=false; //... programa bukatzen da
                    break;
                }
                if(selekzioa.equalsIgnoreCase("segui")){ //selekzioan "segui" jarri baldin badu...
                    break; //lehen menua agertzen da
                }
                break;

            case 4: //gura ordutegia agertzen da
                System.out.println("Gure ordutegia:");
                System.out.println("Larunbata: 10:00 - 22:00");
                System.out.println("Igandea: 10:00 - 00:00");
                break;
        
            case 5: //programa bukatzen da
                System.out.println("Irteera aukeratu duzu");
                seguitu=false;
                break;

            default: //beste zenbaki bat ipintzen badu, programa bukatzen da
                break;
        }
        }
        sc.close();
    }
}