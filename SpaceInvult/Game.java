
import java.util.Scanner;

public class Game extends Coordinate { 
    private String [][] board = new String[getX()][getY()];
    Charater c= new Charater();
    Fire f = new Fire();
    Monster m = new Monster();
    boolean fExist=false;
    int score=0;


    /**
     * @param x
     * @param y
     */
    Game(int x , int y){
       super(x,y);
      
    }

    public String[][] getBoard() {
        return board;
    }
    
    public Coordinate move(){
        // x/i -> righe
        // y/j -> colonne
        Scanner ns= new Scanner(System.in);
        String result=ns.nextLine();
        switch(result){
            case "a":
                if((c.CharaterY-1)<0){
                    System.out.println("You can't move in this position");
                }else{
                    c.moveSX();
                    m.move_monster(score);
                    f= new Fire(f.getX()-1,f.getY());
                    
                }
            break;
            case "d":
                if((c.CharaterY+1)>(getY()-1)){
                    System.out.println("You can't move in this position");
                    System.out.println(c.CharaterY);
                }else{
                    // System.out.println(c.getY());
                    // c.newY(c.getY()+1); // NON SALVA LE MODIFICHE 
                    c.moveDX();
                    m.move_monster(score);
                    f= new Fire(f.getX()-1,f.getY());
                }
            break;
            case "l":
                this.fExist=true;
                f = new Fire(c.CharaterX-1,c.CharaterY);
               
            break;
            default:
                System.out.println("You can't move in this position");
            break;
        }
        return null;
    }
    //PULIRE IL TERMINALE
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }   
    public void fillBoard(){
        for(int i=0;i<20;i++){
            for(int j=0;j<10;j++){
                if( i<(m.MonsterX)){
                    if(fExist){ 
                        if(i==(f.getX()) && j==f.getY() && m.position_monster[i][j]=="👾 "){
                            m.remove_monster(i, j);
                            board[i][j] = "💥 ";
                            score+=100;
                            this.fExist=false;
                        }else if(i==(f.getX()) && j==f.getY() && m.position_monster[i][j]=="x"){
                            board[i][j] = "⚜️  ";
    
                        }
                        else if(m.position_monster[i][j]=="👾 "){ 
                            board[i][j]="👾 ";
    
                        }else if(m.position_monster[i][j]=="x"){ 
                            board[i][j]="   ";
    
                        }
                    }else if(m.position_monster[i][j]=="👾 "){ 
                        board[i][j]="👾 ";

                    }else if(m.position_monster[i][j]=="x"){ 
                        board[i][j]="   ";

                    }
                       
                }else if(i==(c.CharaterX) && j==(c.CharaterY)){
                    board[i][j] = "🛸 ";
                }else if(i==(f.getX()) && j==f.getY()){
                    board[i][j] = "⚜️  ";
                }else{
                    board[i][j] = "   ";
                }
            }
        } 
        
    }
    public String toString(){
        String result = "SCORE:"+score+"\n";
        for(int i=0;i<20;i++){
            result+="|";
            for(int j=0;j<10;j++){
                result+=board[i][j];
            }
            result+="|\n";
        } 
        return result;
        
    }
    
}
