package aplikasi.mobile.sistempakar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ChckDemam,
            ChckNyeriTenggorokan,
            ChckTenggorokanTampakMerah,
            ChckKelenjarGetahBening,
            ChckSakitKepala,
            ChckHidungMeler,
            ChckBatuk,
            ChckNyeriOtot,
            ChckNyeriSendi,
            ChckKemerahanKulit,
            ChckMunculBintikMerah,
            ChckTubuhMenggigil;

    Button btnProsesDeteksi;
    TextView tvOutputNamaPenyakit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChckDemam = (CheckBox) findViewById(R.id.checkBox);
        ChckNyeriTenggorokan = (CheckBox) findViewById(R.id.checkBox2);
        ChckTenggorokanTampakMerah = (CheckBox) findViewById(R.id.checkBox3);
        ChckKelenjarGetahBening = (CheckBox) findViewById(R.id.checkBox4);
        ChckSakitKepala = (CheckBox) findViewById(R.id.checkBox5);
        ChckHidungMeler = (CheckBox) findViewById(R.id.checkBox6);
        ChckBatuk = (CheckBox) findViewById(R.id.checkBox7);
        ChckNyeriOtot = (CheckBox) findViewById(R.id.checkBox8);
        ChckNyeriSendi = (CheckBox) findViewById(R.id.checkBox9);
        ChckKemerahanKulit = (CheckBox) findViewById(R.id.checkBox10);
        ChckMunculBintikMerah = (CheckBox) findViewById(R.id.checkBox11);
        ChckTubuhMenggigil = (CheckBox) findViewById(R.id.checkBox12);

        btnProsesDeteksi = (Button) findViewById(R.id.button);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.textView);

        tvOutputNamaPenyakit.setText(""); // Kosongkan textView / Nama Penyakit Saat membuka program Sisitem Pakar

        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Anda Menderita penyakit : ";


                // Jenis Gejala Untuk Output Penyakit : CAMPAK
                if (ChckDemam.isChecked() && ChckNyeriTenggorokan.isChecked() && ChckHidungMeler.isChecked() && ChckBatuk.isChecked() && ChckNyeriOtot.isChecked() ) {

                    NamaPenyakit += "\nCAMPAK";
                }
                // Jenis Gejala Untuk Output Penyakit : CAMPAK JERMAN
                if (ChckDemam.isChecked() && ChckTenggorokanTampakMerah.isChecked() && ChckKelenjarGetahBening.isChecked() &&
                        ChckNyeriSendi.isChecked() && ChckKemerahanKulit.isChecked()) {
                    NamaPenyakit += "\nCAMPAK JERMAN";
                }

                // Jenis Gejala Untuk Output Penyakit : CACAR AIR
                if (ChckDemam.isChecked() && ChckSakitKepala.isChecked() && ChckMunculBintikMerah.isChecked() &&
                        ChckTubuhMenggigil.isChecked()) {
                    NamaPenyakit += "\nCACAR AIR";
                }

                // Tampilkan Hasil Nama Penyakit di textView
                tvOutputNamaPenyakit.setText(""+NamaPenyakit);
            }
        });
    }


    // Baris dibawah ini dihapus juga tidak masalah : inti codingnya hanya berada di tombol proses
    public void onCheckboxClicked123 (View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.checkBox:
                str = checked ? "Gejala Demam Diseleksi " : "Gejala Demam Tidak Diseleksi";
                break;
            case R.id.checkBox2:
                str = checked ? "Gejala Nyeri Tenggorokan Diseleksi " : "Gejala Nyeri Tenggorokan Tidak Diseleksi";
                break;
            case R.id.checkBox3:
                str = checked ? "Gejala Tenggorokan Tampak Merah Diseleksi " : "Gejala Tenggorokan Tampak Merah Tidak Diseleksi";
                break;
            case R.id.checkBox4:
                str = checked ? "Gejala Pembengkalan Kelenjar Getah Bening Diseleksi " : "Gejala Pembengkalan Kelenjar Getah Bening Tidak Diseleksi";
                break;
            case R.id.checkBox5:
                str = checked ? "Gejala Sakit Kepala Diseleksi " : "Gejala Sakit Kepala Tidak Diseleksi";
                break;
            case R.id.checkBox6:
                str = checked ? "Gejala Hidung Meler Diseleksi " : "Gejala Hidung Meler Tidak Diseleksi";
                break;
            case R.id.checkBox7:
                str = checked ? "Gejala Batuk Diseleksi " : "Gejala Batuk Tidak Diseleksi";
                break;
            case R.id.checkBox8:
                str = checked ? "Gejala Nyeri Otot Diseleksi " : "Gejala Nyeri Otot Tidak Diseleksi";
                break;
            case R.id.checkBox9:
                str = checked ? "Gejala Nyeri Sandi Diseleksi " : "Gejala Nyeri Sandi Tidak Diseleksi";
                break;
            case R.id.checkBox10:
                str = checked ? "Gejala Kemerahan Kulit Diseleksi " : "Gejala Kemerahan Kulit Tidak Diseleksi";
                break;
            case R.id.checkBox11:
                str = checked ? "Gejala Muncul Bintik-bintik Merah Diseleksi " : "Gejala Muncul Bintik-bintik Merah Tidak Diseleksi";
                break;
            case R.id.checkBox12:
                str = checked ? "Gejala Tubuh Mengigil Diseleksi " : "Gejala Tubuh mengigil Tidak Diseleksi";
                break;
        }

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


//    void showMessage(String message){
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
}
