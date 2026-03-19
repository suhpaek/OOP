package Problem2.pieces;

public class King extends Piece{
    public King(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        int dx = Math.abs(pos1.getX() - pos2.getX());
        int dy = Math.abs(pos1.getY() - pos2.getY());

        return dx <= 1 && dy <= 1 && !(dx == 0 && dy == 0);
    }

    @Override
    public char getSymbol() {
        return color.equals("white") ? 'K' : 'k';
    }
}
