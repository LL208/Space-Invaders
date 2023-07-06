public class Charater extends Coordinate{
    int CharaterX;
    int CharaterY;
     public Charater() {
        this.CharaterX=19;
        this.CharaterY=5;
    }
    public Charater(int x, int y) {
        this.CharaterX=x;
        this.CharaterY=y;
    }
    public void moveSX(){
        if(this.CharaterY>0){
            this.CharaterY--;
        }
        
    }
    public void moveDX(){
        if(this.CharaterY<10){
            this.CharaterY++;
        }
    }





}     
    





