package Problem2.pieces;

public class Queen extends Piece{
    public Queen(Position pos1, Color color){
        super(pos1, color);
    }

    @Override
    public boolean isLegalMove(Position pos2, Board board){
        Bishop b = new Bishop(pos2, this.color);
        Rook r = new Rook(pos2, this.color);
        return b.isLegalMove(pos2, board) || r.isLegalMove(pos2, board);

//        return pos1.getX() == pos2.getX()
//                || pos1.getY() == pos2.getY()
//                || Math.abs(pos1.getX() - pos2.getX()) == Math.abs(pos1.getY() - pos2.getY());
    }

    @Override
    public char getSymbol() {
        return color.equals("white") ? 'Q' : 'q';
    }
}
