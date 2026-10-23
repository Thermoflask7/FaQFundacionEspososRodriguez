package zaragoza.mateo.faqfundacionespososrodriguez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import zaragoza.mateo.faqfundacionespososrodriguez.ui.theme.FaQFundacionEspososRodriguezTheme
import zaragoza.mateo.faqfundacionespososrodriguez.vistas.Faq

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FaQFundacionEspososRodriguezTheme {
                Faq()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FaQFundacionEspososRodriguezTheme {
        Greeting("Android")
    }
}