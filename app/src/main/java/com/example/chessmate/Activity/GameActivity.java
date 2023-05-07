package com.example.chessmate.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chessmate.MainActivity;
import com.example.chessmate.R;

public class GameActivity extends AppCompatActivity {

    private String movePieceFrom = "";
    private String movePieceTo = "";
    TextView playerName = (TextView) findViewById(R.id.playerText);
    TextView notificationText = (TextView) findViewById(R.id.notificationText);
    Button notificationBtn = (Button) findViewById(R.id.notificationBtn);
    ImageView notificationBgImage0 = (ImageView) findViewById(R.id.notificationBgImage0);
    ImageView notificationBgImage1 = (ImageView) findViewById(R.id.notificationBgImage1);
    ImageView notificationBgImage2 = (ImageView) findViewById(R.id.notificationBgImage2);

    StartActivity stAct = new StartActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the title bar and show the activity in full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_game);

        // 1st -> clickOnPiece
        // 2nd -> check if mine
            // 2.1 -> if mine set movePiece = "id of location" -> highlight
            // 2.2 -> if empty or nothing then ignore click
        // 3rd -> click on where to
            // 3.0 -> if click on the same as on 2nd
                // 3.0.1. -> unhighlight + clear first pick + and return to 2nd step
            // 3.1 -> valid move
                // 3.1.1 -> set moveTo = "id of the picked place"
                    // 3.1.1.1 -> game over -> display info window + return to start activity
                    // 3.1.1.2 -> game continiue -> switch players + display info window + return to 1st step
            // 3.2 -> invalid move
                // 3.2.1 -> display invalid move error + return to 2nd step

        ImageButton image00 = (ImageButton) findViewById(R.id.image00);
        image00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image01 = (ImageButton) findViewById(R.id.image01);
        image01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image02 = (ImageButton) findViewById(R.id.image02);
        image02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image03 = (ImageButton) findViewById(R.id.image03);
        image03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image04 = (ImageButton) findViewById(R.id.image04);
        image04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image05 = (ImageButton) findViewById(R.id.image05);
        image05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image06 = (ImageButton) findViewById(R.id.image06);
        image06.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image07 = (ImageButton) findViewById(R.id.image07);
        image07.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image10 = (ImageButton) findViewById(R.id.image10);
        image10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image11 = (ImageButton) findViewById(R.id.image11);
        image11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image12 = (ImageButton) findViewById(R.id.image12);
        image12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image13 = (ImageButton) findViewById(R.id.image13);
        image13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image14 = (ImageButton) findViewById(R.id.image14);
        image14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image15 = (ImageButton) findViewById(R.id.image15);
        image15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image16 = (ImageButton) findViewById(R.id.image16);
        image16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image17 = (ImageButton) findViewById(R.id.image17);
        image17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image20 = (ImageButton) findViewById(R.id.image20);
        image20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image21 = (ImageButton) findViewById(R.id.image21);
        image21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image22 = (ImageButton) findViewById(R.id.image22);
        image22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image23 = (ImageButton) findViewById(R.id.image23);
        image23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image24 = (ImageButton) findViewById(R.id.image24);
        image24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image25 = (ImageButton) findViewById(R.id.image25);
        image25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image26 = (ImageButton) findViewById(R.id.image26);
        image26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image27 = (ImageButton) findViewById(R.id.image27);
        image27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image30 = (ImageButton) findViewById(R.id.image30);
        image30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image31 = (ImageButton) findViewById(R.id.image31);
        image31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image32 = (ImageButton) findViewById(R.id.image32);
        image32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image33 = (ImageButton) findViewById(R.id.image33);
        image33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image34 = (ImageButton) findViewById(R.id.image34);
        image34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image35 = (ImageButton) findViewById(R.id.image35);
        image35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image36 = (ImageButton) findViewById(R.id.image36);
        image36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image37 = (ImageButton) findViewById(R.id.image37);
        image37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image40 = (ImageButton) findViewById(R.id.image40);
        image40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image41 = (ImageButton) findViewById(R.id.image41);
        image41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image42 = (ImageButton) findViewById(R.id.image42);
        image42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image43 = (ImageButton) findViewById(R.id.image43);
        image43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image44 = (ImageButton) findViewById(R.id.image44);
        image44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image45 = (ImageButton) findViewById(R.id.image45);
        image45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image46 = (ImageButton) findViewById(R.id.image46);
        image46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image47 = (ImageButton) findViewById(R.id.image47);
        image47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image50 = (ImageButton) findViewById(R.id.image50);
        image50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image51 = (ImageButton) findViewById(R.id.image51);
        image51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image52 = (ImageButton) findViewById(R.id.image52);
        image52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image53 = (ImageButton) findViewById(R.id.image53);
        image53.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image54 = (ImageButton) findViewById(R.id.image54);
        image54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image55 = (ImageButton) findViewById(R.id.image55);
        image55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image56 = (ImageButton) findViewById(R.id.image56);
        image56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image57 = (ImageButton) findViewById(R.id.image57);
        image57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image60 = (ImageButton) findViewById(R.id.image60);
        image60.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image61 = (ImageButton) findViewById(R.id.image61);
        image61.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image62 = (ImageButton) findViewById(R.id.image62);
        image62.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image63 = (ImageButton) findViewById(R.id.image63);
        image63.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image64 = (ImageButton) findViewById(R.id.image64);
        image64.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image65 = (ImageButton) findViewById(R.id.image65);
        image65.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image66 = (ImageButton) findViewById(R.id.image66);
        image66.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image67 = (ImageButton) findViewById(R.id.image67);
        image67.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        ImageButton image70 = (ImageButton) findViewById(R.id.image70);
        image70.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image71 = (ImageButton) findViewById(R.id.image71);
        image71.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image72 = (ImageButton) findViewById(R.id.image72);
        image72.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image73 = (ImageButton) findViewById(R.id.image73);
        image73.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image74 = (ImageButton) findViewById(R.id.image74);
        image74.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image75 = (ImageButton) findViewById(R.id.image75);
        image75.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image76 = (ImageButton) findViewById(R.id.image76);
        image76.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        ImageButton image77 = (ImageButton) findViewById(R.id.image77);
        image77.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

//        ON CLICK NOTIFICATION BTN:

        Button notificationBtn = (Button) findViewById(R.id.notificationBtn);
        notificationBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hideNotification(true);
            }
        });
    }

    private void checkMove(String id) {

        if (movePieceFrom == "") {
            // FIRST CLICK 1st -> clickOnPiece
//            if () {
//                // CHECK IF MINE 2nd -> check if mine
//                // HIGHLIGHT 2.1 -> if mine set movePiece = "id of location" -> highlight
//                movePieceFrom = id;
//            }
            // 2.2 -> if empty or nothing then ignore click
        } else {
            // SECOND CLICK 3rd -> click on where to
            if (movePieceFrom == id) {
                // 3.0 -> if click on the same as on 2nd
                // UNHIGHLIGT 3.0.1. -> unhighlight + clear first pick + and return to 2nd step
                movePieceFrom = "";
            } else {
                // 3.1 -> valid move
                    // 3.1.1 -> set moveTo = "id of the picked place"
                        // 3.1.1.1 -> game over -> display info window + return to start activity + clear player names
                        // 3.1.1.2 -> game continiue -> switch players + display info window + return to 1st step
                // 3.2 -> invalid move
                    // 3.2.1 -> display invalid move error + return to 2nd step
            }
        }

    }

    private void setTurn(boolean isWhite) {
        if (isWhite) {
            if (stAct.firstPlayer == "") {
                playerName.setText("White player's turn");
            } else {
                playerName.setText(stAct.firstPlayer + "'s turn");
            }
        } else {
            if (stAct.secondPlayer == "") {
                playerName.setText("Black player's turn");
            } else {
                playerName.setText(stAct.secondPlayer + "'s turn");
            }
        }
    }

    private void infoMessage() {

    }

//    TextView notificationText = (TextView) findViewById(R.id.notificationText);
//    Button notificationBtn = (Button) findViewById(R.id.notificationBtn);
//    ImageView notificationBgImage0 = (ImageView) findViewById(R.id.notificationBgImage0);
//    ImageView notificationBgImage1 = (ImageView) findViewById(R.id.notificationBgImage1);
//    ImageView notificationBgImage2 = (ImageView) findViewById(R.id.notificationBgImage2);
//    TextView playerName = (TextView) findViewById(R.id.playerText);

    private void hideNotification(boolean hide) {
        if (hide) {
            notificationText.setVisibility(View.GONE);
            notificationBtn.setVisibility(View.GONE);
            notificationBgImage0.setVisibility(View.GONE);
            notificationBgImage1.setVisibility(View.GONE);
            notificationBgImage2.setVisibility(View.GONE);
            playerName.setVisibility(View.VISIBLE);
        } else {
            notificationText.setVisibility(View.VISIBLE);
            notificationBtn.setVisibility(View.VISIBLE);
            notificationBgImage0.setVisibility(View.VISIBLE);
            notificationBgImage1.setVisibility(View.VISIBLE);
            notificationBgImage2.setVisibility(View.VISIBLE);
            playerName.setVisibility(View.GONE);
        }
    }

    private void highlightPiece(ImageButton id) {

        // android:background="@drawable/rook"

        if (id.getBackground().toString() == "@drawable/king_white" || id.getBackground().toString() == "@drawable/king") {
            id.setBackground("@drawable/king_hl");
        }

    }

}
