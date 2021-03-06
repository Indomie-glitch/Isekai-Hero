package Move;


import java.util.List;

public class MoveResource {

    private List<Move> moves;
    private static MoveResource repository = null;

    public static MoveResource getInstance() {
        if (null == repository) {
            repository = new MoveResource();
        }
        return repository;
    }

    private MoveResource() {
        moves = (List) MoveLoader.load();
    }

    public Move getmoveById(int Id) {
        for (Move move : moves) {
            if (move.getId() == Id)
                return move;
        }
        return null;
    }

    public List<Move> getAll() {
        return moves;
    }

    public Move[] getMoveByLocationId(int id) {
        for(Move move :moves){
            if (move.getId() == id)

                return new Move[0];
        }
        return new Move[0];
    }
}


