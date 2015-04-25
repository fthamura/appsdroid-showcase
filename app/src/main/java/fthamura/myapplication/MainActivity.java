package fthamura.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
    private static final String TAG = "FT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }


    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    protected void onStop() {
        super.onPause();
        Log.d(TAG, "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}
