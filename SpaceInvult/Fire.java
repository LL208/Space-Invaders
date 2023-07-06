public class Fire extends Coordinate{
    int x;
    int y;
    
    public Fire(int x, int y) {
        super(x, y);
        this.x=x;
        this.y=y;
    }
    public Fire(){
        
    }
    public void remove_fire(){
        this.x=0;
        this.y=0;
    }

}

