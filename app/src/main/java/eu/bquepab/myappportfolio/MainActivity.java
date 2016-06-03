package eu.bquepab.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindString(R.string.toast_message)
    String toastMessage;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.popular_movies, R.id.stock_hawk, R.id.build_it_bigger, R.id.make_your_app_material, R.id.go_ubiquitous, R.id.capstone})
    protected void showToast(final Button button) {
        Toast.makeText(button.getContext(), String.format(toastMessage, button.getText()), Toast.LENGTH_SHORT)
             .show();
    }
}
