/* encoding: utf-8
 */
package NapakalakiGame;

import java.util.*;

public class CardDealer {
    
    private static CardDealer instance = null;
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;    
         
    public static CardDealer getInstance(){
        if(instance==null)
            instance = new CardDealer();
        return instance;
    }
    
    private CardDealer(){
        unusedMonsters = new ArrayList();
        usedMonsters = new ArrayList();
        unusedTreasures = new ArrayList();
        usedTreasures = new ArrayList();
    }
  
    private void initTreasureCardDeck(){
        Treasure T1 = new Treasure("¡Sí mi amo!", 4, TreasureKind.HELMET);
        unusedTreasures.add(T1);
        Treasure T2 = new Treasure("Botas de investigación", 3, TreasureKind.SHOE);
        unusedTreasures.add(T2);
        Treasure T3 = new Treasure("Capucha de Cthulhu", 3, TreasureKind.HELMET);
        unusedTreasures.add(T3);
        Treasure T4 = new Treasure("A prueba de babas", 2, TreasureKind.ARMOR);
        unusedTreasures.add(T4);
        Treasure T5 = new Treasure("Botas de lluvia ácida", 1, TreasureKind.SHOE);
        unusedTreasures.add(T5);
        Treasure T6 = new Treasure("Casco minero", 2, TreasureKind.HELMET);
        unusedTreasures.add(T6);
        Treasure T7 = new Treasure("Ametralladora Thompson", 4, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T7);
        Treasure T8 = new Treasure("Camiseta de la UGR", 1, TreasureKind.ARMOR);
        unusedTreasures.add(T8);
        Treasure T9 = new Treasure("Clavo de rail ferroviario", 3, TreasureKind.ONEHAND);
        unusedTreasures.add(T9);
        Treasure T10 = new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T10);
        Treasure T11 = new Treasure("Fez alópodo", 3, TreasureKind.HELMET);
        unusedTreasures.add(T11);
        Treasure T12 = new Treasure("Hacha prehistórica", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T12);
        Treasure T13 = new Treasure("El aparato del Pr. Tesla", 4, TreasureKind.ARMOR);
        unusedTreasures.add(T13);
        Treasure T14 = new Treasure("Gaita", 4, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T14);
        Treasure T15 = new Treasure("Insecticida", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T15);
        Treasure T16 = new Treasure("Escopeta de 3 cañones", 4, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T16);
        Treasure T17 = new Treasure("Garabato místico", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T17);
        Treasure T18 = new Treasure("La rebeca metálica", 2, TreasureKind.ARMOR);
        unusedTreasures.add(T18);
        Treasure T19 = new Treasure("Lanzallamas", 4, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T19);
        Treasure T20 = new Treasure("Necrocomicón", 1, TreasureKind.ONEHAND);
        unusedTreasures.add(T20);
        Treasure T21 = new Treasure("Necronomicón", 5, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T21);
        Treasure T22 = new Treasure("Linterna a 2 manos", 3, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T22);
        Treasure T23 = new Treasure("Necrognomicón", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T23);
        Treasure T24 = new Treasure("Necrotelecom", 2, TreasureKind.HELMET);
        unusedTreasures.add(T24);
        Treasure T25 = new Treasure("Mazo de los antiguos", 3, TreasureKind.ONEHAND);
        unusedTreasures.add(T25);
        Treasure T26 = new Treasure("Necroplayboycón", 3, TreasureKind.ONEHAND);
        unusedTreasures.add(T26);
        Treasure T27 = new Treasure("Porra preternatural", 2, TreasureKind.ONEHAND);
        unusedTreasures.add(T27);
        Treasure T28 = new Treasure("Shogulador", 1, TreasureKind.BOTHHANDS);
        unusedTreasures.add(T28);
        Treasure T29 = new Treasure("Varita de atizamiento", 3, TreasureKind.ONEHAND);
        unusedTreasures.add(T29);
        Treasure T30 = new Treasure("Tentáculo de pega", 2, TreasureKind.HELMET);
        unusedTreasures.add(T30);
        Treasure T31 = new Treasure("Zapato deja-amigos", 1, TreasureKind.SHOE);
        unusedTreasures.add(T31);       
    }
    
    private void initMonsterCardDeck(){
    
        BadConsequence BC1 = new BadConsequence("Pierdes tu armadura visible y otra oculta", 0,
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        Prize P1 = new Prize(2,1);
        unusedMonsters.add(new Monster("3 Byakhees de bonanza", 8, BC1, P1));
        
        BadConsequence BC2 = new BadConsequence("Embobados con el lindo primigenio te descartas "
                                 + "de tu casco visible", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                             new ArrayList()); 
        Prize P2 = new Prize(1,1);
        unusedMonsters.add(new Monster("Chibithulhu", 2, BC2, P2));        
      
        BadConsequence BC3 = new BadConsequence("El primordial bostezo contagioso. Pierdes el"
                                 + " calzado visible", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.SHOE)),
                             new ArrayList());
        Prize P3 = new Prize(1,1);
        unusedMonsters.add(new Monster("El sopor de Dunwich", 2, BC3, P3));
        
        BadConsequence BC4 = new BadConsequence("Te atrapan para llevarte de fiesta y te"
                             + " dejan caer en mitad del vuelo. Descarta 1 mano visible y"
                             + " 1 mano oculta", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                             new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        Prize P4 = new Prize(4,1);
        unusedMonsters.add(new Monster("Ángeles de la noche ibicenca", 14, BC4, P4));
        
        BadConsequence BC5 = new BadConsequence("Pierdes todos tus tesoros visibles", 0, BadConsequence.MAXTREASURES, 0);
        Prize P5 = new Prize(3,1);
        unusedMonsters.add(new Monster("El gorrón en el umbral", 10, BC5, P5));
                        
        BadConsequence BC6 = new BadConsequence("Pierdes la armadura visible", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                             new ArrayList());
        Prize P6 = new Prize(1,1);
        unusedMonsters.add(new Monster("H.P. Munchcraft", 6, BC6, P6));

        BadConsequence BC7 = new BadConsequence("Sientes bichos bajo la ropa. Descarta la"
                             + "armadura visible", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                             new ArrayList());
        Prize P7 = new Prize(1,1);
        unusedMonsters.add(new Monster("Bichgooth", 2, BC7, P7));
        
        BadConsequence BC8 = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        Prize P8 = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa", 13, BC8, P8));
        
        BadConsequence BC9 = new BadConsequence("Toses los pulmones y pierdes 2 niveles", 2, 0, 0);
        Prize P9 = new Prize(1,1);
        unusedMonsters.add(new Monster("La que redacta en las tinieblas", 2, BC9, P9));
        
        BadConsequence BC10 = new BadConsequence("Estos monstruos resultan bastante superfic"
                             + "iales y te aburren mortalmente. Estas muerto", true);
        Prize P10 = new Prize(2,1);
        unusedMonsters.add(new Monster("Los hondos", 8, BC10, P10));
        
        BadConsequence BC11 = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 2, 0, 2);
        Prize P11 = new Prize(2,1);
        unusedMonsters.add(new Monster("Semillas Cthulhu", 4, BC11, P11));
        
        BadConsequence BC12 = new BadConsequence("Te intentas escaquear. Pierdes una mano visible.", 0, 
                             new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList());
        Prize P12 = new Prize(2,1);
        unusedMonsters.add(new Monster("Dameargo", 1, BC12, P12));  
        
        BadConsequence BC13 = new BadConsequence("Da mucho asquito. Pierdes 3 niveles.", 3, 0, 0);
        Prize P13 = new Prize(1,1);
        unusedMonsters.add(new Monster("Pollipólipo volante", 3, BC13, P13));
        
        BadConsequence BC14 = new BadConsequence("No le hace gracia que pronuncien mal su nombre"
                               + ". Estás muerto.", true);
        Prize P14 = new Prize(3,1);
        unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 12, BC14, P14));
         
        BadConsequence BC15 = new BadConsequence("La familia te atrapa. Estás muerto.", true);
        Prize P15 = new Prize(4,1);
        unusedMonsters.add(new Monster("Familia Feliz.", 1, BC15, P15));
        
        BadConsequence BC16 = new BadConsequence("La quinta directiva primaria te obliga a perder 2 "
                              + "niveles y un tesoro 2 manos visible.", 2, 
                              new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                              new ArrayList());
        Prize P16 = new Prize(2,1);
        unusedMonsters.add(new Monster("Roboggoth", 8, BC16, P16));
        
        BadConsequence BC17 = new BadConsequence("Te asusta en la noche. Pierdes un casco visible. ",0,
                              new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                              new ArrayList());
        Prize P17 = new Prize(1,1);
        unusedMonsters.add(new Monster("El espía ", 5, BC17, P17));
        
        BadConsequence BC18 = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 "
                              +" tesoros visibles. ", 2, 5, 0);
        Prize P18 = new Prize(1,1);
        unusedMonsters.add(new Monster("El Lenguas", 20, BC18, P18));
        
        BadConsequence BC19 = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 "
                              +"niveles y tus tesoros visibles de las manos. ", 3,
                              new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
                              new ArrayList());
        Prize P19 = new Prize(1,1);
        unusedMonsters.add(new Monster("Bicéfalo", 20, BC19, P19));
                
    }
    
    private void shuffleTreasures(){
        Collections.shuffle(unusedTreasures);
    }
    
    private void shuffleMonsters(){
         Collections.shuffle(unusedMonsters);
    }
  
    public Treasure nextTreasure(){
        
        if(unusedTreasures.isEmpty()){
            ArrayList<Treasure> aux = unusedTreasures;
            unusedTreasures=usedTreasures;        
            usedTreasures=aux;
            shuffleTreasures();
        }
        
        Treasure aux = unusedTreasures.get(0);
        unusedTreasures.remove(0);
        return aux;
    }
    
    public Monster nextMonster(){
        
        if(unusedMonsters.isEmpty()){
            ArrayList<Monster> aux=unusedMonsters;
            unusedMonsters=usedMonsters;
            usedMonsters=aux;
            shuffleMonsters();
         }
             
        Monster aux = unusedMonsters.get(0);
        unusedMonsters.remove(aux);
        return aux;
    }
    
    public void giveTreasureBack(Treasure t){
        usedTreasures.add(t);
    }
    
    public void giveMonsterBack(Monster m){
        usedMonsters.add(m);
    }
    
    public void initCards(){
        initTreasureCardDeck();
        initMonsterCardDeck();
        shuffleMonsters();
        shuffleTreasures();
    }    
}
