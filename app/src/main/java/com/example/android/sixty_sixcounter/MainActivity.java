package com.example.android.sixty_sixcounter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void treePoints(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerA = scorePlayerA + 3;
            displayForPlayerA(scorePlayerA);
        }
    }

    public void twoPoints(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerA = scorePlayerA + 2;
            displayForPlayerA(scorePlayerA);
        }
    }

    public void onePoint(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerA = scorePlayerA + 1;
            displayForPlayerA(scorePlayerA);
        }
    }

    public void treePointsB(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerB = scorePlayerB + 3;
            displayForPlayerB(scorePlayerB);
        }
    }

    public void twoPointsB(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerB = scorePlayerB + 2;
            displayForPlayerB(scorePlayerB);
        }
    }

    public void onePointB(View view) {
        if (scorePlayerA + scorePlayerB == 11 && scorePlayerA > scorePlayerB) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player A is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        } else if (scorePlayerB + scorePlayerA == 11 && scorePlayerB > scorePlayerA) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.congratulations);
            alertDialog.setMessage("Player B is the winner!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else if (scorePlayerB + scorePlayerA > 11) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle(R.string.i_am_sorry_eleven_points);
            alertDialog.setMessage("You cannot have more than 11 points!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEW GAME",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            scorePlayerA = 0;
                            scorePlayerB = 0;
                            displayForPlayerA(0);
                            displayForPlayerB(0);
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
            scorePlayerB = scorePlayerB + 1;
            displayForPlayerB(scorePlayerB);

        }
    }

    public void reset(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(R.string.are_u_sure);
        alertDialog.setMessage("Do you really want to reset the score?");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "YES",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        scorePlayerA = 0;
                        scorePlayerB = 0;
                        displayForPlayerA(0);
                        displayForPlayerB(0);
                        dialog.dismiss();
                    }
                });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();


    }


}


