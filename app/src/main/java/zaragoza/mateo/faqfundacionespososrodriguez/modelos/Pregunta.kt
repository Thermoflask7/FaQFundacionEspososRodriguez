package zaragoza.mateo.faqfundacionespososrodriguez.modelos

data class Pregunta (
    val id: Int,
    val text: String,
    val category: String = "Todas"
)

