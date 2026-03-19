package Problem2.pieces;

public class Board {
    private Piece[][] board = new Piece[8][8];

    public Piece getPiece(Position pos){
        return board[pos.getX()][pos.getY()];
    }

    public void setPiece (Position pos, Piece piece){
        board[pos.getX()][pos.getY()] = piece;
    }

    public boolean isInside(Position pos){
        return pos.getX() >= 0 && pos.getY() < 8 &&
                pos.getY() >= 0 && pos.getX() < 8;
    }

    public boolean move(Position from, Position to, Color currecntColor){
        if(!isInside(from) || !(isInside(to))){
            return false;
        }

        Piece piece = getPiece(from);
        if(piece == null){
            return false;
        }

        if(!piece.getColor().equals(currecntColor)){
            return false;
        }

        Piece target = getPiece(to);
        if(target != null && target.getColor().equals(currecntColor)){
            return false;
        }

        if(!piece.isLegalMove(to, this)){
            return false;
        }

        setPiece(to, piece);
        setPiece(from, null);
        piece.setPosition(to);

        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }
}
