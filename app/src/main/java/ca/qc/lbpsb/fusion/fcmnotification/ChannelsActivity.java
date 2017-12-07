package ca.qc.lbpsb.fusion.fcmnotification;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ChannelsActivity extends AppCompatActivity {

    LinearLayout layout;

    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channels);

        toggleButton = findViewById(R.id.sw_fusion);

        layout = findViewById(R.id.linear_update);
        layout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      if(toggleButton.isChecked()){
                          toggleButton.setChecked(false);
                          view.setBackgroundColor(getResources().getColor(R.color.colorBack));
                      } else {
                          toggleButton.setChecked(true);

                          view.setBackgroundColor(Color.rgb(132,155,175));
                      }

                       // view.setBackgroundColor(Color.rgb(132,155,175));
                        Log.d("TAG_LAYOUT", "layaout : " + view.getTag());
                    }
                }
        );
    }
}
