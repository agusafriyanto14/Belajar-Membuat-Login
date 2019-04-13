package agusafriyanto.aa.gmail.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Custemlist extends AppCompatActivity {
//TODO 1: inisialiasi kelas layout dengan java
    ListView list;

// TODO 2: Pembuatan Array untuk judul
    String[] maintitle = {
            "Youtebe", "Facebook","Email",
            "Github","Agus","Aprizal",
            "Dikdik","Sandy",
    };

//TODO 3: Pembuatan Sub judul dengan Array
    String[] subtitle = {
            "wwww.youtube.com/c/KesBer", "web.facebook.com/agusafriyanto.agus","agusafriyanto.aa@gmail.com",
            "https://github.com/agusafriyanto14","085753712624","087805429349",
            "082216733936","082251795197",
    };

 //TODO 4: Pembuatan  Array untuk Gambar
    Integer[] imgid = {
            R.drawable.images,R.drawable.aa,R.drawable.images1,
            R.drawable.images2,R.drawable.ic_call_black_24dp,R.drawable.ic_call_black_24dp,
            R.drawable.ic_call_black_24dp,R.drawable.ic_call_black_24dp,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//TODO 5: Menampilkan layout Custem
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custem);

//TODO 6: menggabungkan Arrray  judul, sub judul dan gambar dengan activity  MyListAdapter
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

// TODO 7: membuat autog enerated method
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                if(position == 0) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
/** TODO 8 : Menampilkan Toast(pesan/peringatan) "Place Your Third Option Code" saat menekan list yang berada pada index 0
* pesan yang ditampilkan hanyak sperskian detik. bisa juga memasukan perintah lain
 */
                }
                else if(position == 1) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();

                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
