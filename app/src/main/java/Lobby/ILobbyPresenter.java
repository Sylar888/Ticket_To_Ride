package Lobby;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by krommend on 2/1/18.
 */

public interface ILobbyPresenter {

    public ArrayList<String> Players = new ArrayList<String>();
    boolean GameStarted = false;
    //ArrayList<Game> Games = new ArrayList<Game>();

    boolean joinGame(Context context, boolean vacant);
    Game startGame(Context context, boolean enoughPlayers);
    Game CreateGame();
    void updateView();

}
