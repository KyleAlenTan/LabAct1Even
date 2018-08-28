package iics.tan.kylealen.labact1even;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Even = (TextView) findViewById(R.id.Even);
        int n = 0;
        String num = "0";
            for(int i =0; i<9;i++) {
                n = n + 2;
                num = num + ", " + String.valueOf(n);
        }
            Even.setText(num);
    }
}
