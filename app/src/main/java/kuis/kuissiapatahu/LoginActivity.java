package kuis.kuissiapatahu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button mbuttonmainkan, mbuttonpanduan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mbuttonmainkan = (Button) findViewById(R.id.btn_mainkan);
        mbuttonpanduan = (Button) findViewById(R.id.btn_panduan);

        mbuttonmainkan.setOnClickListener(this);
        mbuttonpanduan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_mainkan){
            Intent i = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(i);
        }else{
            Intent i = new Intent(getApplicationContext(), PanduanActivity.class);
            startActivity(i);
        }
    }
}
