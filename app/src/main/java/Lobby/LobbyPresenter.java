package Lobby;

import java.util.ArrayList;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by krommend on 2/1/18.
 */

public class LobbyPresenter implements ILobbyPresenter {


    ArrayList<String> players = new ArrayList<String>();
    boolean gameStarted;
    //ArrayList<Game> games = new ArrayList<Game>();


    @Override
    public boolean joinGame(Context context, boolean vacant) {

        if (vacant) {
            Toast.makeText(context, "game joined", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(context, "game not joined", Toast.LENGTH_SHORT).show();

        return false;
    }


    @Override
    public Game startGame(Context context, boolean enoughPlayers) {

        Game myGame = new Game();

        if (enoughPlayers) Toast.makeText(context, "game started", Toast.LENGTH_SHORT).show();
        else Toast.makeText(context, "game not started", Toast.LENGTH_SHORT).show();


        return myGame;
    }

    @Override
    public Game CreateGame() {

        Game myGame = new Game();

        return myGame;
    }

    @Override
    public void updateView() {

    }


}
