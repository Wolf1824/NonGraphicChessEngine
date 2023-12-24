import java.util.ArrayList;

public class Queen extends Peice{
    public Queen(boolean team, boolean state) {
        this.team=team;
        this.state=state;
    }


    @Override
    ArrayList<Squares> possiblemovements(Squares sq, Board b) {
        ArrayList <Squares> possible = new ArrayList<>();
        super.line(sq,b,possible,1,0);
        super.line(sq,b,possible,-1,0);
        super.line(sq,b,possible,0,1);
        super.line(sq,b,possible,0,-1);
        super.line(sq,b,possible,1,1);
        super.line(sq,b,possible,-1,-1);
        super.line(sq,b,possible,-1,1);
        super.line(sq,b,possible,1,-1);
        return possible;
    }
}
