package com.example.shaaghar.tictactoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        turn=1;

    }
    public void onb1(View view){
        if(b1.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b1.setText("X");
            }else if(turn==2){
                turn =1;
                b1.setText("O");
            }
        }

    }
    public void onb2(View view){
        if(b2.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b2.setText("X");
            }else if(turn==2){
                turn =1;
                b2.setText("O");
            }
        }
    }
    public void onb3(View view){
        if(b3.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b3.setText("X");
            }else if(turn==2){
                turn =1;
                b3.setText("O");
            }
        }

    }
    public void onb4(View view){
        if(b4.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b4.setText("X");
            }else if(turn==2){
                turn =1;
                b4.setText("O");
            }
        }

    }
    public void onb5(View view){
        if(b5.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b5.setText("X");
            }else if(turn==2){
                turn =1;
                b5.setText("O");
            }
        }

    }
    public void onb6(View view){
        if(b6.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b6.setText("X");
            }else if(turn==2){
                turn =1;
                b6.setText("O");
            }
        }

    }
    public void onb7(View view){
        if(b7.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b7.setText("X");
            }else if(turn==2){
                turn =1;
                b7.setText("O");
            }
        }

    }
    public void onb8(View view){
        if(b8.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b8.setText("X");
            }else if(turn==2){
                turn =1;
                b8.setText("O");
            }
        }

    }
    public void onb9(View view){
        if(b9.getText().toString().equals("")){
            if(turn==1){
                turn=2;
                b9.setText("X");
            }else if(turn==2){
                turn =1;
                b9.setText("O");
            }
        }

    }

}
