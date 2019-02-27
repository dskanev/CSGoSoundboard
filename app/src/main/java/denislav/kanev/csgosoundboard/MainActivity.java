package denislav.kanev.csgosoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnAk47;
    private ImageButton btnAwp;
    private ImageButton btnDeagle;
    private ImageButton btnFamas;
    private ImageButton btnSg;
    private ImageButton btnM4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAk47 = findViewById(R.id.btnAk47);
        btnAwp = findViewById(R.id.btnAwp);
        btnDeagle = findViewById(R.id.btnDeagle);
        btnFamas = findViewById(R.id.btnFamas);
        btnM4 = findViewById(R.id.btnM4);
        btnSg = findViewById(R.id.btnSg);

        btnAk47.setOnClickListener(MainActivity.this);
        btnAwp.setOnClickListener(MainActivity.this);
        btnM4.setOnClickListener(MainActivity.this);
        btnSg.setOnClickListener(MainActivity.this);
        btnFamas.setOnClickListener(MainActivity.this);
        btnDeagle.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View imageButtonView) {
        switch (imageButtonView.getId()) {
            case R.id.btnAk47:
                playGunFiringSound(btnAk47.getTag().toString());
                break;
            case R.id.btnAwp:
                playGunFiringSound(btnAwp.getTag().toString());
                break;
            case R.id.btnDeagle:
                playGunFiringSound(btnDeagle.getTag().toString());
                break;
            case R.id.btnFamas:
                playGunFiringSound(btnFamas.getTag().toString());
                break;
            case R.id.btnM4:
                playGunFiringSound(btnM4.getTag().toString());
                break;
            case R.id.btnSg:
                playGunFiringSound(btnSg.getTag().toString());
                break;
        }
    }

    private void playGunFiringSound (String gunName) {
        MediaPlayer gunSoundPlayer = MediaPlayer.create(MainActivity.this,
                getResources().getIdentifier(gunName,
                        "raw", getPackageName()));
        gunSoundPlayer.start();
    }
}
