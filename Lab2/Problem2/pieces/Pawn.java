package Problem2.pieces;

public class Pawn extends Piece{
    public Pawn(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        int dir = color.equals("white") ? -1 : 1;
        return (pos2.getY() - pos1.getY() == 1)
                || (pos2.getY() - pos1.getY() == 2);
    }

    @Override
    public char getSymbol() {
        return color.equals("white") ? 'P' : 'p';
    }
}
