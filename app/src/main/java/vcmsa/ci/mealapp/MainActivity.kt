
/*
*Android Developers World,Android Beginner- How to clear Edittext Data on Button click? #learn_tutorial3,https://youtu.be/IzN5Rkq25yw?si=QKPzmx5ktuKATAld, [AccessedJune 13, 2020].
* */
package vcmsa.ci.mealapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declare lateinit variables for the UI components. These will be initialized later.
    private lateinit var Timeofday: EditText // EditText for the user to enter the time of day.
    private lateinit var buttonsuggestion: Button // Button to trigger meal suggestions.
    private lateinit var clearBtn: Button // Button to clear the EditText input.
    private lateinit var  MealOutput: TextView // TextView to display the meal suggestions.
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

// Link the UI components from the XML layout to the Kotlin code using their IDs.
        Timeofday = findViewById(R.id.Timeofday)
        buttonsuggestion = findViewById(R.id.buttonsuggestion)
        clearBtn = findViewById(R.id.clearBtn)
        MealOutput=findViewById(R.id.MealOutput)

// Set an OnClickListener for the clear button. This clears the text entered by the user.
        clearBtn.setOnClickListener {
            Timeofday.text.clear()
        // Clears the EditText input when the clear button is clicked.

        }// Set an OnClickListener for the suggestion button. This provides meal suggestions based on the user's input.\
        buttonsuggestion.setOnClickListener { val Timeofday=Timeofday.text.toString()// Get the text entered by the user and trim unnecessary spaces.


            val Mealsuggestion= when(Timeofday){
                    // Use a "when" expression to determine the meal suggestion based on the user's input.
                "Morning"->"Breakfast:Bread,eggs,avocado,smoothie"// Suggest breakfast for "Morning".
                "Mid MORNING"->"Mid morning:Apple,Sandwhich,Salad,Juice"// Suggest snacks for "Mid MORNING".
                "Afternoon"->"Afternoon:WhiteRice,Chicken,Smoothie,Snack,Water"// Suggest lunch for "Afternoon".
                "Mid Afternoon"->"Mid Afternoon:Pasta,Wine,Steak,Crackers"// Suggest meals for "Mid Afternoon".
                "Dinner"->"Dinner:Pizza,Orange juice,Tacos,Snacks"// Suggest dinner for "Dinner".
                else -> "Invalid input.Please enter Morning,Mid Morning,Afternoon,Mid Afternoon,Dinner"
            }// Display error message for invalid input.


        // Update the MealOutput TextView with the selected meal suggestion.
            MealOutput.text = Mealsuggestion
    }
}
    }
