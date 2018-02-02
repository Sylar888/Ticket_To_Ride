package Lobby;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.krommend.ticket_to_ride.R;

import java.util.ArrayList;

public class LobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Lobby");
        setContentView(R.layout.activity_lobby);

        final LobbyPresenter lobbyP = new LobbyPresenter();

        TextView p1 = (TextView) findViewById(R.id.p1);
        TextView p2 = (TextView) findViewById(R.id.p2);
        TextView p3 = (TextView) findViewById(R.id.p3);
        TextView p4 = (TextView) findViewById(R.id.p4);
        TextView p5 = (TextView) findViewById(R.id.p5);

        final TextView players[] = {p1, p2, p3, p4, p5};


        Button join = (Button) findViewById(R.id.join);
        Button start = (Button) findViewById(R.id.start);
        Button create = (Button) findViewById(R.id.create);


        join.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                boolean vacant = false;

                for (int i = 0; i < players.length; i++) {
                    if (players[i].getText().equals("")) {
                        vacant = true;


                    }
                    else continue;
                }

                lobbyP.joinGame(getBaseContext(), vacant);


            }
        });

        start.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                int counter = 0;
                boolean enoughPlayers = true;

                while (counter < 3) {

                    if (players[counter].equals("")) {
                     enoughPlayers = false;
                        break;
                    }
                    else counter++;

                }

                Game myGame = lobbyP.startGame(getBaseContext(), enoughPlayers);
            }
        });


        start.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "game created", Toast.LENGTH_SHORT).show();
            }


        });





    }
}
