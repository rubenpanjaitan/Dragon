package aplikasi.test.rubenfcpanjaitan.dragon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText jumlah=(EditText) findViewById(R.id.inputan);
        Button draw=(Button) findViewById(R.id.button);
        final TextView circle=(TextView) findViewById(R.id.circle);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String name = jumlah.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(MainActivity.this, "jumlah tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    int n=Integer.parseInt(jumlah.getText().toString());
                    String dot="";
                    for(int i=1;i<=n;i++){
                        dot+=".";
                    }
                    circle.setText(dot);

                }
            }
        });
    }

}
