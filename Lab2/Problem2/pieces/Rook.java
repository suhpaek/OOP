package Problem2.pieces;

public class Rook extends Piece{
    public Rook(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        return pos1.getX() == pos2.getX() || pos1.getY() == pos2.getY();
    }

    @Override
    public char getSymbol() {
        return color.equals("white") ? 'R' : 'r';
    }
}
