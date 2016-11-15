package android.xwpeng.testsvg;

import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   /* static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }*/
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.main_textview);
        VectorDrawableCompat drawable = VectorDrawableCompat.create(getResources(), R.drawable.vd_aa, null);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        mTextView.setCompoundDrawables(null, drawable, null, null);
        mTextView.setCompoundDrawablePadding(24);
    }
}
