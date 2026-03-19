package Problem2.pieces;

public abstract class Piece {
    protected Position pos1;
    protected Color color;

    public Piece(Position pos1, Color color){
        this.pos1 = pos1;
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public Position getPosition(){
        return pos1;
    }

    public void setPosition(Position pos){
        this.pos1 = pos1;
    }

    public abstract boolean isLegalMove(Position position, Board board);

    public abstract char getSymbol();
}
