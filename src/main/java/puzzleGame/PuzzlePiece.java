package puzzleGame;

public class PuzzlePiece {

    private int id;
    private int left;
    private int right;
    private int top;
    private int bottom;

    public PuzzlePiece(int id, int left, int right, int top, int bottom){
        this.id = id;
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public int getLeft(){
        return left;
    }

    public int getRight(){
        return right;
    }

    public int getTop(){
        return top;
    }

    public int getBottom(){
        return bottom;
    }

    public void printPiece(){
        System.out.print("[" +left + ", " + right + ", " + top + ", " + bottom + "] ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
