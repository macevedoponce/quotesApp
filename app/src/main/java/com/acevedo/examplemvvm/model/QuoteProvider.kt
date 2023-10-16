package com.acevedo.examplemvvm.model

class QuoteProvider {


    companion object{ // -> esto es para que se puedan acceder a estos datos

        fun random():QuoteModel{
            val position = (0..19).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                "La noche de Halloween, donde los monstruos son bienvenidos y las brujas son las reinas de la fiesta.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "El miedo es el camino hacia el Lado Oscuro. El miedo lleva a la ira, la ira lleva al odio, el odio lleva al sufrimiento.",
                "Yoda"
            ),
            QuoteModel(
                "Las almas de los muertos regresan una vez al año para reunirse con sus seres queridos en Halloween.",
                "Día de los Muertos"
            ),
            QuoteModel(
                "Noche de brujas, travesuras o golosinas, que la magia de Halloween te envuelva en su encanto.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "En Halloween, todos los gatos son negros, incluso los blancos.",
                "Proverbio Chino"
            ),
            QuoteModel(
                "La verdadera pesadilla no es el miedo, sino el despertar.",
                "Freddy Krueger"
            ),
            QuoteModel(
                "La noche de Halloween nos recuerda que hay belleza en las sombras y magia en lo desconocido.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "La luna llena en Halloween es el faro de los espíritus errantes.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "En Halloween, los monstruos ríen y los demonios bailan bajo la luna llena.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Las pesadillas son sueños oscuros que brillan con su propio esplendor.",
                "Paulo Coelho"
            ),
            QuoteModel(
                "La oscuridad de Halloween es solo un recordatorio de la luz que vive dentro de nosotros.",
                "Dexter Kozen"
            ),
            QuoteModel(
                "Las hojas caen, el viento aúlla, las noches se alargan; ¡es Halloween!",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Noche de miedo y diversión, cuando los espíritus vagan bajo la luna.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Halloween: la única noche en la que puedes ser quien quieras y nadie se sorprenderá.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Las historias de miedo se cuentan mejor junto a una fogata en una noche de Halloween.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Los fantasmas pueden ser dulces si los conviertes en algodón de azúcar.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "La noche de Halloween es como un libro de hechizos; te atrapa en su magia.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Los monstruos son reales, los fantasmas son reales; viven dentro de nosotros y a veces ganan.",
                "Stephen King"
            ),
            QuoteModel(
                "Halloween no es solo una fecha, es un estado de ánimo.",
                "Autor Desconocido"
            ),
            QuoteModel(
                "Las pesadillas son como libros, la única forma de superarlas es leerlas hasta el final.",
                "Autor Desconocido"
            )
        )
    }


}