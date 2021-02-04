package app.nunome.sary.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.UserDictionary.Words.addWord
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val fruit : Array<CustomWord?>
        fruit = arrayOfNulls<CustomWord>(4)
        fruit[0] = CustomWord(R.drawable.ringo, "りんご", "apple")
        fruit[1] = CustomWord(R.drawable.ichigo, "いちご", "strawberry")
        fruit[2] = CustomWord(R.drawable.orange, "オレンジ", "orange")
        fruit[3] = CustomWord(R.drawable.pineapple, "パイン", "pineapple")
        /*
        val apple = CustomWord(R.drawable.ringo, "りんご", "apple")
        val strawberry = CustomWord(R.drawable.ichigo, "いちご", "strawberry")
        val orange = CustomWord(R.drawable.orange, "オレンジ", "orange")
        val pine = CustomWord(R.drawable.pineapple, "パイン", "pineapple")

        var fruit = arrayOf(apple, strawberry, orange, pine)
        */

        for (i in 0..3) {
            fruit[i]?.let { addWord(it) }
        }
        /*
        addWord(apple)
        addWord(strawberry)
        addWord(orange)
        addWord(pine)
        */

    }

    private fun addWord(word: CustomWord) {
        val nameTextView = TextView(this)
        nameTextView.text  = word.name

        val englishTextView = TextView(this)
        englishTextView.text = word.ename

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(englishTextView)

        container.addView(layout)
    }

    /*
        val nameTextView = TextView(this)
        nameTextView.text  = apple.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(apple.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)

        val nameTextView2 = TextView(this)
        nameTextView2.text  = strawberry.name

        val layout2 = LinearLayout(this)
        layout2.orientation = LinearLayout.HORIZONTAL

        val imageView2 = ImageView(this)
        imageView2.setImageResource(strawberry.resId)

        layout2.addView(imageView2)
        layout2.addView(nameTextView2)

        container.addView(layout2)

        val nameTextView3 = TextView(this)
        nameTextView3.text  = orange.name

        val layout3 = LinearLayout(this)
        layout3.orientation = LinearLayout.HORIZONTAL

        val imageView3 = ImageView(this)
        imageView3.setImageResource(orange.resId)

        layout3.addView(imageView3)
        layout3.addView(nameTextView3)

        container.addView(layout3)

        val nameTextView4 = TextView(this)
        nameTextView4.text  = pine.name

        val layout4 = LinearLayout(this)
        layout4.orientation = LinearLayout.HORIZONTAL

        val imageView4 = ImageView(this)
        imageView4.setImageResource(pine.resId)

        layout4.addView(imageView4)
        layout4.addView(nameTextView4)

        container.addView(layout4)


        container.addView(nameTextView)
    */
}