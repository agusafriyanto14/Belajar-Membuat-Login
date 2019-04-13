package agusafriyanto.aa.gmail.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO 1: enisialisasi kelas
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//TODO 2:mengkoneksikan layout dengan Kelas java
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//TODO 3: Membuat kelas dengan tipe data string
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

//TODO 4: membuat username dan passwoard.jika password dan user name di inputkan sama makan akan menjalakan inten untuk custemlist
                if (usernameKey.equals("agus afriyanto") && passwordKey.equals("165410175")) {
                    Intent intent = new Intent(MainActivity.this, Custemlist.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    Toast.makeText(getApplicationContext(), "Anda Belum terdaftar",Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, Welcome.class);
                    MainActivity.this.startActivity(intent2);
                    finish();
//TODO 5: jika password dan username salah maka akan menjalankan inten2 yang menuju Activity  Welcome(registrasi)
                }
            }

        });

    }
}