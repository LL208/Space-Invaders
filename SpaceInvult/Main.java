public class Main{
    public static void main(String[] args) {

        Game g1= new Game(20,10);
     
        while(true){
            System.out.println("\n\nMOVE\t\t{ ◀︎ a || d  ►} \tFIRE { l }\n");
            g1.fillBoard();
            System.out.println(g1);
            // PROVA STAMPA MOSTRI
            //System.out.println(g1.m);
            g1.move();
          
        }  
    } 
} 