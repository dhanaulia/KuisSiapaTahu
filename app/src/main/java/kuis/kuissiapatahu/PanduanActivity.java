package kuis.kuissiapatahu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PanduanActivity extends AppCompatActivity {

    TextView panduantext;

    public String panduanstring ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan);

        panduantext = (TextView) findViewById(R.id.panduan);

        panduanstring = "\t 1. Klik Mainkan pada halaman awal aplikasi ini \n" +
                "\t 2. Akan muncul soal dengan 4 jawaban yang berbeda \n" +
                "\t 3. Baca soal dan jawab dengan pilihan jawaban tersebut \n" +
                "\t 4. Jika jawaban benar, maka skor akan bertambah 1 \n" +
                "\t 5. jika jawaban benar, maka akan lanjut ke pertanyaan selanjutnya\n" +
                "\t 6. Jika jawaban salah, makan akan muncul notifikasi yang berisi Game Over\n" +
                "\t 7. Pada notifikasi akan muncul 2 pilihan yaitu New Game atau Exit\n" +
                "\t 8. Pilih new game untuk memulai game baru\n" +
                "\t 9. Pilih exit untuk keluar\n" +
                "\t Goodluck lol ";


        panduantext.setText(panduanstring);
    }
}
