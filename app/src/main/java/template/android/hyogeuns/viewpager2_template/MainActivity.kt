package template.android.hyogeuns.viewpager2_template


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val views = arrayOf("심효근", "안드안드", "뷰페2")
        view_pager.adapter = ViewPager2Adapter(views)
        view_pager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}