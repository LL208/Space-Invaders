
public class Monster extends Coordinate{
    int MonsterX=19;
    int MonsterY=10;
    String[][] position_monster = new String[MonsterX][MonsterY];

    public  Monster(){
        add_monster();
    }
    
    // public Monster(int x, int y) {
    //     super(x, y);
    // }
        // x/i -> righe
        // y/j -> colon
    public void add_monster(){
        for(int i=0; i<MonsterX ;i++){
            for(int j=0; j<MonsterY ;j++){
                if(i<3){
                    if(j%2==0){
                        position_monster[i][j]="👾 ";
                    }else{
                        position_monster[i][j]="x";
                    }
                }else{
                    position_monster[i][j]="x";
                }
            }
        }
    }
    public void remove_monster(int x,int y){
        this.position_monster[x][y]="x";
    }
    public void move_monster(int score){
        double casuale = (int)(Math.random()*10);
        if(casuale>3){
        for(int i=0; i<19; i++){
            for(int j=0; j<10; j++){
                if(i%2==1){
                    //destra
                    if(j<9){
                        position_monster[i][j+1] = position_monster[i][j];
                        remove_monster(i, j);
                    }else{
                        if(i==18){
                            if(position_monster[i][j]=="👾 "){
                                System.out.println("GAME OVER\nSCORE:"+score);
                                System.exit(0);
                            
                            }
                            remove_monster(i, j);
                        }else{
                            position_monster[i+1][j] = position_monster[i][j];
                        remove_monster(i, j);
                        }
                    }
                    //sinistra
                }else{
                    if(j>0){
                        position_monster[i][j-1] = position_monster[i][j];
                        remove_monster(i, j);
                    }
                    else{
                        if(i==18){
                            if(position_monster[i][j]=="👾 "){
                                System.out.println("GAME OVER\nSCORE:"+score);
                                System.exit(0);
                            
                            }
                            remove_monster(i, j);

                        }else{
                            position_monster[i+1][j] = position_monster[i][j];
                        remove_monster(i, j);
                        }
                    }
                
            }
            
            }
        }
    }
    }












    public String toString(){
        String result = "";
        for(int i=0;i<MonsterX;i++){
            result+="|";
            for(int j=0;j<MonsterY;j++){
                result+=position_monster[i][j];
            }
            result+="|\n";
        }
        return result;
    }

    }
    

  

    

   
