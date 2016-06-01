package eu.bquepab.myappportfolio

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import butterknife.BindString
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    @BindString(R.string.toast_message)
    lateinit var toastMessage: String;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.popular_movies, R.id.stock_hawk, R.id.build_it_bigger, R.id.make_your_app_material, R.id.go_ubiquitous, R.id.capstone)
    fun showToast(button: Button) {
            Toast.makeText(button.context, String.format(toastMessage, button.text), Toast.LENGTH_SHORT).show()
    }
}
