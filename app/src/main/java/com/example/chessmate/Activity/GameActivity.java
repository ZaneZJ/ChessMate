package com.example.chessmate.Activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chessmate.Game.Game;
import com.example.chessmate.Game.Grid;
import com.example.chessmate.MainActivity;
import com.example.chessmate.R;

public class GameActivity extends AppCompatActivity {

    private String movePieceFrom = "";
    private String movePieceTo = "";
    ImageButton highlightFrom = null;
    String returnToPiece = "";
    int rowFrom = 10;
    int rowTo = 10;
    int colFrom = 10;
    int colTo = 10;
    TextView playerName = (TextView) findViewById(R.id.playerText);
    TextView notificationText = (TextView) findViewById(R.id.notificationText);
    Button notificationBtn = (Button) findViewById(R.id.notificationBtn);
    ImageView notificationBgImage0 = (ImageView) findViewById(R.id.notificationBgImage0);
    ImageView notificationBgImage1 = (ImageView) findViewById(R.id.notificationBgImage1);
    ImageView notificationBgImage2 = (ImageView) findViewById(R.id.notificationBgImage2);

    ImageButton image00 = null;
    ImageButton image01 = null;
    ImageButton image02 = null;
    ImageButton image03 = null;
    ImageButton image04 = null;
    ImageButton image05 = null;
    ImageButton image06 = null;
    ImageButton image07 = null;

    ImageButton image10 = null;
    ImageButton image11 = null;
    ImageButton image12 = null;
    ImageButton image13 = null;
    ImageButton image14 = null;
    ImageButton image15 = null;
    ImageButton image16 = null;
    ImageButton image17 = null;

    ImageButton image20 = null;
    ImageButton image21 = null;
    ImageButton image22 = null;
    ImageButton image23 = null;
    ImageButton image24 = null;
    ImageButton image25 = null;
    ImageButton image26 = null;
    ImageButton image27 = null;

    ImageButton image30 = null;
    ImageButton image31 = null;
    ImageButton image32 = null;
    ImageButton image33 = null;
    ImageButton image34 = null;
    ImageButton image35 = null;
    ImageButton image36 = null;
    ImageButton image37 = null;

    ImageButton image40 = null;
    ImageButton image41 = null;
    ImageButton image42 = null;
    ImageButton image43 = null;
    ImageButton image44 = null;
    ImageButton image45 = null;
    ImageButton image46 = null;
    ImageButton image47 = null;

    ImageButton image50 = null;
    ImageButton image51 = null;
    ImageButton image52 = null;
    ImageButton image53 = null;
    ImageButton image54 = null;
    ImageButton image55 = null;
    ImageButton image56 = null;
    ImageButton image57 = null;

    ImageButton image60 = null;
    ImageButton image61 = null;
    ImageButton image62 = null;
    ImageButton image63 = null;
    ImageButton image64 = null;
    ImageButton image65 = null;
    ImageButton image66 = null;
    ImageButton image67 = null;

    ImageButton image70 = null;
    ImageButton image71 = null;
    ImageButton image72 = null;
    ImageButton image73 = null;
    ImageButton image74 = null;
    ImageButton image75 = null;
    ImageButton image76 = null;
    ImageButton image77 = null;

    StartActivity stAct = new StartActivity();
    Grid grid = new Grid();
    Game game = new Game();

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

        image00 = (ImageButton) findViewById(R.id.image00);
        image00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image00;
                }
                checkMove("00");
//                if (movePieceFrom == "" && movePieceTo == "") {
//                    setPieceOnBoard();
//                }
            }
        });
        image01 = (ImageButton) findViewById(R.id.image01);
        image01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image01;
                }
                checkMove("01");
            }
        });
        image02 = (ImageButton) findViewById(R.id.image02);
        image02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image02;
                }
                checkMove("02");
            }
        });
        image03 = (ImageButton) findViewById(R.id.image03);
        image03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image03;
                }
                checkMove("03");
            }
        });
        image04 = (ImageButton) findViewById(R.id.image04);
        image04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image04;
                }
                checkMove("04");
            }
        });
        image05 = (ImageButton) findViewById(R.id.image05);
        image05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image05;
                }
                checkMove("05");
            }
        });
        image06 = (ImageButton) findViewById(R.id.image06);
        image06.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image06;
                }
                checkMove("06");
            }
        });
        image07 = (ImageButton) findViewById(R.id.image07);
        image07.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image07;
                }
                checkMove("07");
            }
        });

        image10 = (ImageButton) findViewById(R.id.image10);
        image10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image10;
                }
                checkMove("10");
            }
        });
        image11 = (ImageButton) findViewById(R.id.image11);
        image11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image11;
                }
                checkMove("11");
            }
        });
        image12 = (ImageButton) findViewById(R.id.image12);
        image12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image12;
                }
                checkMove("12");
            }
        });
        image13 = (ImageButton) findViewById(R.id.image13);
        image13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image13;
                }
                checkMove("13");
            }
        });
        image14 = (ImageButton) findViewById(R.id.image14);
        image14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image14;
                }
                checkMove("14");
            }
        });
        image15 = (ImageButton) findViewById(R.id.image15);
        image15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image15;
                }
                checkMove("15");
            }
        });
        image16 = (ImageButton) findViewById(R.id.image16);
        image16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image16;
                }
                checkMove("16");
            }
        });
        image17 = (ImageButton) findViewById(R.id.image17);
        image17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image17;
                }
                checkMove("17");
            }
        });

        image20 = (ImageButton) findViewById(R.id.image20);
        image20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image20;
                }
                checkMove("20");
            }
        });
        image21 = (ImageButton) findViewById(R.id.image21);
        image21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image21;
                }
                checkMove("21");
            }
        });
        image22 = (ImageButton) findViewById(R.id.image22);
        image22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image22;
                }
                checkMove("22");
            }
        });
        image23 = (ImageButton) findViewById(R.id.image23);
        image23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image23;
                }
                checkMove("23");
            }
        });
        image24 = (ImageButton) findViewById(R.id.image24);
        image24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image24;
                }
                checkMove("24");
            }
        });
        image25 = (ImageButton) findViewById(R.id.image25);
        image25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image25;
                }
                checkMove("25");
            }
        });
        image26 = (ImageButton) findViewById(R.id.image26);
        image26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image26;
                }
                checkMove("26");
            }
        });
        image27 = (ImageButton) findViewById(R.id.image27);
        image27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image27;
                }
                checkMove("27");
            }
        });

        image30 = (ImageButton) findViewById(R.id.image30);
        image30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image30;
                }
                checkMove("30");
            }
        });
        image31 = (ImageButton) findViewById(R.id.image31);
        image31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image31;
                }
                checkMove("31");
            }
        });
        image32 = (ImageButton) findViewById(R.id.image32);
        image32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image32;
                }
                checkMove("32");
            }
        });
        image33 = (ImageButton) findViewById(R.id.image33);
        image33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image33;
                }
                checkMove("33");
            }
        });
        image34 = (ImageButton) findViewById(R.id.image34);
        image34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image34;
                }
                checkMove("34");
            }
        });
        image35 = (ImageButton) findViewById(R.id.image35);
        image35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image35;
                }
                checkMove("35");
            }
        });
        image36 = (ImageButton) findViewById(R.id.image36);
        image36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image36;
                }
                checkMove("36");
            }
        });
        image37 = (ImageButton) findViewById(R.id.image37);
        image37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image37;
                }
                checkMove("37");
            }
        });

        image40 = (ImageButton) findViewById(R.id.image40);
        image40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image40;
                }
                checkMove("40");
            }
        });
        image41 = (ImageButton) findViewById(R.id.image41);
        image41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image41;
                }
                checkMove("41");
            }
        });
        image42 = (ImageButton) findViewById(R.id.image42);
        image42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image42;
                }
                checkMove("42");
            }
        });
        image43 = (ImageButton) findViewById(R.id.image43);
        image43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image43;
                }
                checkMove("43");
            }
        });
        image44 = (ImageButton) findViewById(R.id.image44);
        image44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image44;
                }
                checkMove("44");
            }
        });
        image45 = (ImageButton) findViewById(R.id.image45);
        image45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image45;
                }
                checkMove("45");
            }
        });
        image46 = (ImageButton) findViewById(R.id.image46);
        image46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image46;
                }
                checkMove("46");
            }
        });
        image47 = (ImageButton) findViewById(R.id.image47);
        image47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image47;
                }
                checkMove("47");
            }
        });

        image50 = (ImageButton) findViewById(R.id.image50);
        image50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image50;
                }
                checkMove("50");
            }
        });
        image51 = (ImageButton) findViewById(R.id.image51);
        image51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image51;
                }
                checkMove("51");
            }
        });
        image52 = (ImageButton) findViewById(R.id.image52);
        image52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image52;
                }
                checkMove("52");
            }
        });
        image53 = (ImageButton) findViewById(R.id.image53);
        image53.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image53;
                }
                checkMove("53");
            }
        });
        image54 = (ImageButton) findViewById(R.id.image54);
        image54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image54;
                }
                checkMove("54");
            }
        });
        image55 = (ImageButton) findViewById(R.id.image55);
        image55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image55;
                }
                checkMove("55");
            }
        });
        image56 = (ImageButton) findViewById(R.id.image56);
        image56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image56;
                }
                checkMove("56");
            }
        });
        image57 = (ImageButton) findViewById(R.id.image57);
        image57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image57;
                }
                checkMove("57");
            }
        });

        image60 = (ImageButton) findViewById(R.id.image60);
        image60.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image60;
                }
                checkMove("60");
            }
        });
        image61 = (ImageButton) findViewById(R.id.image61);
        image61.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image61;
                }
                checkMove("61");
            }
        });
        image62 = (ImageButton) findViewById(R.id.image62);
        image62.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image62;
                }
                checkMove("62");
            }
        });
        image63 = (ImageButton) findViewById(R.id.image63);
        image63.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image63;
                }
                checkMove("63");
            }
        });
        image64 = (ImageButton) findViewById(R.id.image64);
        image64.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image64;
                }
                checkMove("64");
            }
        });
        image65 = (ImageButton) findViewById(R.id.image65);
        image65.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image65;
                }
                checkMove("65");
            }
        });
        image66 = (ImageButton) findViewById(R.id.image66);
        image66.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image66;
                }
                checkMove("66");
            }
        });
        image67 = (ImageButton) findViewById(R.id.image67);
        image67.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image67;
                }
                checkMove("67");
            }
        });

        image70 = (ImageButton) findViewById(R.id.image70);
        image70.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image70;
                }
                checkMove("70");
            }
        });
        image71 = (ImageButton) findViewById(R.id.image71);
        image71.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image71;
                }
                checkMove("71");
            }
        });
        image72 = (ImageButton) findViewById(R.id.image72);
        image72.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image72;
                }
                checkMove("72");
            }
        });
        image73 = (ImageButton) findViewById(R.id.image73);
        image73.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image73;
                }
                checkMove("73");
            }
        });
        image74 = (ImageButton) findViewById(R.id.image74);
        image74.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image74;
                }
                checkMove("74");
            }
        });
        image75 = (ImageButton) findViewById(R.id.image75);
        image75.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image75;
                }
                checkMove("75");
            }
        });
        image76 = (ImageButton) findViewById(R.id.image76);
        image76.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image76;
                }
                checkMove("76");
            }
        });
        image77 = (ImageButton) findViewById(R.id.image77);
        image77.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (highlightFrom == null) {
                    highlightFrom = image77;
                }
                checkMove("77");
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
            rowFrom = Character.getNumericValue(id.charAt(0));
            colFrom = Character.getNumericValue(id.charAt(1));
            char color = getFirstCharacter(rowFrom, colFrom);
            // FIRST CLICK 1st -> clickOnPiece
            if (color == game.playerTurn) {
//                // CHECK IF MINE 2nd -> check if mine
//                // HIGHLIGHT 2.1 -> if mine set movePiece = "id of location" -> highlight
                highlightPiece(highlightFrom);
                movePieceFrom = id;
            } else {
                rowFrom = 10;
                colFrom = 10;
            }
            // 2.2 -> if empty or nothing then ignore click
        } else {
            // SECOND CLICK 3rd -> click on where to
            if (movePieceFrom == id) {
                // 3.0 -> if click on the same as on 2nd
                // UNHIGHLIGT 3.0.1. -> unhighlight (reset the whole board) + clear first pick + and return to 2nd step
                unhighlightPiece(highlightFrom);
                movePieceFrom = "";
            } else {
                // 3.1 -> valid move
                    // 3.1.1 -> set moveTo = "id of the picked place"
                rowTo = Character.getNumericValue(id.charAt(0));
                colTo = Character.getNumericValue(id.charAt(1));
                // move(int inputColFrom, int inputRowFrom, int inputColTo, int inputRowTo)
                movePieceTo = id;
                game.move(colFrom, rowFrom, colTo, rowTo);
                        // 3.1.1.1 -> game over -> display info window + return to start activity + clear player names
                        // 3.1.1.2 -> game continiue -> switch players + display info window + return to 1st step
                // 3.2 -> invalid move
                    // 3.2.1 -> display invalid move error + return to 2nd step
            }
        }

    }

    private char getFirstCharacter(int i, int j) {
        String element = grid.chessGrid[i][j];
        return element.charAt(0);
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

        returnToPiece = id.getBackground().toString();

        if (id.getBackground().toString() == "@drawable/king_white" || id.getBackground().toString() == "@drawable/king") {
            id.setBackground(Drawable.createFromPath("@drawable/king_hl.png"));
        }

        if (id.getBackground().toString() == "@drawable/queen_white" || id.getBackground().toString() == "@drawable/queen") {
            id.setBackground(Drawable.createFromPath("@drawable/queen_hl.png"));
        }

        if (id.getBackground().toString() == "@drawable/rook_white" || id.getBackground().toString() == "@drawable/rook") {
            id.setBackground(Drawable.createFromPath("@drawable/rook_hl.png"));
        }

        if (id.getBackground().toString() == "@drawable/bishop_white" || id.getBackground().toString() == "@drawable/bishop") {
            id.setBackground(Drawable.createFromPath("@drawable/bishop_hl.png"));
        }

        if (id.getBackground().toString() == "@drawable/kinght_white" || id.getBackground().toString() == "@drawable/knight") {
            id.setBackground(Drawable.createFromPath("@drawable/knight_hl.png"));
        }

        if (id.getBackground().toString() == "@drawable/pawn_white" || id.getBackground().toString() == "@drawable/pawn") {
            id.setBackground(Drawable.createFromPath("@drawable/pawn_hl.png"));
        }

    }

    private void unhighlightPiece(ImageButton id) {
        id.setBackground(Drawable.createFromPath(returnToPiece));
        highlightFrom = null;
        returnToPiece = "";
    }

    public void setPiecesOnBoard() {

        image00.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][0])));
        image01.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][1])));
        image02.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][2])));
        image03.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][3])));
        image04.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][4])));
        image05.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][5])));
        image06.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][6])));
        image07.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[0][7])));

        image10.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][0])));
        image11.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][1])));
        image12.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][2])));
        image13.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][3])));
        image14.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][4])));
        image15.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][5])));
        image16.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][6])));
        image17.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[1][7])));

        image20.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][0])));
        image21.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][1])));
        image22.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][2])));
        image23.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][3])));
        image24.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][4])));
        image25.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][5])));
        image26.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][6])));
        image27.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[2][7])));

        image30.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][0])));
        image31.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][1])));
        image32.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][2])));
        image33.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][3])));
        image34.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][4])));
        image35.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][5])));
        image36.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][6])));
        image37.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[3][7])));

        image40.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][0])));
        image41.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][1])));
        image42.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][2])));
        image43.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][3])));
        image44.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][4])));
        image45.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][5])));
        image46.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][6])));
        image47.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[4][7])));

        image50.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][0])));
        image51.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][1])));
        image52.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][2])));
        image53.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][3])));
        image54.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][4])));
        image55.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][5])));
        image56.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][6])));
        image57.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[5][7])));

        image60.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][0])));
        image61.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][1])));
        image62.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][2])));
        image63.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][3])));
        image64.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][4])));
        image65.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][5])));
        image66.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][6])));
        image67.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[6][7])));

        image70.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][0])));
        image71.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][1])));
        image72.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][2])));
        image73.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][3])));
        image74.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][4])));
        image75.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][5])));
        image76.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][6])));
        image77.setBackground(Drawable.createFromPath(findImage(grid.chessGrid[7][7])));

        movePieceFrom = "";
        movePieceTo = "";
        highlightFrom = null;
        returnToPiece = "";
        rowFrom = 10;
        rowTo = 10;
        colFrom = 10;
        colTo = 10;

    }

    private String findImage(String piece) {

        if (piece == "wR") {
            return "@drawable/rook_white";
        } else if (piece == "wN") {
            return "@drawable/kinght_white";
        } else if (piece == "wB") {
            return "@drawable/bishop_white";
        } else if (piece == "wQ") {
            return "@drawable/queen_white";
        } else if (piece == "wK") {
            return "@drawable/king_white";
        } else if (piece == "wP") {
            return "@drawable/pawn_white";
        } else if (piece == "bR") {
            return "@drawable/rook";
        } else if (piece == "bN") {
            return "@drawable/knight";
        } else if (piece == "bB") {
            return "@drawable/bishop";
        } else if (piece == "bQ") {
            return "@drawable/queen";
        } else if (piece == "bK") {
            return "@drawable/king";
        } else if (piece == "bP") {
            return "@drawable/pawn";
        } else {
            return "@drawable/blank.png";
        }
    }

}
