package ch06;

class Chess {
    enum ChessPlayer {
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}

class WorldChess extends Chess {
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
