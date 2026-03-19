package Problem2.pieces;

public class Knight extends Piece{
    public Knight(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        return (Math.abs(pos1.getX() - pos2.getX()) == 1
                && Math.abs(pos1.getY() - pos2.getY()) == 2)
                || (Math.abs(pos1.getX() - pos2.getX()) == 2
                && Math.abs(pos1.getY() - pos2.getY()) == 1);
    }

    @Override
    public char getSymbol() {
        return color.equals("white") ? 'N' : 'n';
    }
}
