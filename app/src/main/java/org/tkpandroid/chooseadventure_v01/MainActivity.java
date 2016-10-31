package org.tkpandroid.chooseadventure_v01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//  First screen - give user 2 options(2 buttons): explore or wake up
//  If they click on wakeUp: they get a Toast that says: "You wake up and have boring day. The end"
//  If they click on explore: they get a Toast that says: "You approach a glowing, green bucket of ooze.
//      Worried that you will get in trouble, you pick up the bucket."

public class MainActivity extends Activity implements View.OnClickListener
{

    Button buttonWakeUp;
    Button buttonExplore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWakeUp = (Button)findViewById(R.id.button_wakeUp);
        buttonExplore = (Button)findViewById(R.id.button_Explore);

        buttonWakeUp.setOnClickListener(this);
        buttonExplore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button_wakeUp:
                Toast.makeText(getApplicationContext(),"You wake up and have boring day. The end",Toast.LENGTH_LONG).show();
                break;

            case R.id.button_Explore:
                Toast.makeText(getApplicationContext(),"You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
