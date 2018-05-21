package puzzleGame;

import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private String fileName;

    public FileParser(String fileName){
        this.fileName = fileName;
    }

    public List<PuzzlePiece> parse(){
        return new ArrayList<PuzzlePiece>();
    }
}
