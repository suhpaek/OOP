package Problem2.pieces;

public class Bishop extends Piece{
    public Bishop(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        return Math.abs(pos1.getX() - pos2.getX()) == Math.abs(pos1.getY() - pos2.getY());
    }
    @Override
    public char getSymbol() {
        return color.equals("white") ? 'B' : 'b';
    }
}
