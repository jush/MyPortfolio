package org.jush.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Unfortunately the app compat Button with custom theme doesn't support setting onClick
        // in the layout directly so we do it manually here
        findViewById(R.id.ownBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ownApp(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyApp(View view) {
        Toast.makeText(this, R.string.launch_spotify, Toast.LENGTH_LONG).show();
    }

    public void scoresApp(View view) {
        Toast.makeText(this, R.string.launch_scores, Toast.LENGTH_LONG).show();
    }

    public void libraryApp(View view) {
        Toast.makeText(this, R.string.launch_library, Toast.LENGTH_LONG).show();
    }

    public void buildBiggerApp(View view) {
        Toast.makeText(this, R.string.launch_bigger, Toast.LENGTH_LONG).show();
    }

    public void baconReaderApp(View view) {
        Toast.makeText(this, R.string.launch_bacon, Toast.LENGTH_LONG).show();
    }

    public void ownApp(View view) {
        Toast.makeText(this, R.string.launch_own, Toast.LENGTH_LONG).show();
    }
}
