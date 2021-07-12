package Move;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MoveLoader {

    private static String FILE_LOCATION = "C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\Move\\Move";


    public static List<Move> load() {
        List<Move> moves = new ArrayList<Move>();
        try {
            FileReader reader = new FileReader(FILE_LOCATION);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSegment = line.split("\\|");
                Move move = new Move();
                move.setId(Integer.parseInt(lineSegment[0]));
                move.setW(lineSegment[1]);
                move.setS(lineSegment[2]);
                move.setA(lineSegment[3]);
                move.setD(lineSegment[4]);
                moves.add(move);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return moves;
    }

}
