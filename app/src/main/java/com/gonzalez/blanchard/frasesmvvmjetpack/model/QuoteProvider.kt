package com.gonzalez.blanchard.frasesmvvmjetpack.model

class QuoteProvider {

    companion object {

        fun random(): QuoteModel {
            val position = (frases.indices).random()
            return frases[position]
        }

        private val frases = listOf<QuoteModel>(

            QuoteModel(
                "Un Iphone no te puede quitar lo barrio, pero el barrio si te puede quitar el Iphone",
                "Elgin Mendez"
            ),

            QuoteModel(
                "Si pequeña es la patria, uno grande la sueña.",
                "Ruben Darío",
            ),

            QuoteModel("El cafe con leche es como el cafe pero con leche.",
                "Paulo Coelho"),

            QuoteModel("Locura es hacer lo mismo una y otra vez y esperar resultados diferentes.",
                "Albert Einstein"),

            QuoteModel("No importa lo lento que vayas mientras no te detengas.",
                "Confucio"),

            QuoteModel("La sencillez es la máxima sofisticación.",
                "Leonardo da Vinci"),

            QuoteModel("Su carencia de fe resulta molesta.",
                "Darth Vader"),

            QuoteModel("Cuando me haya ido, el último de los Jedi serás tú",
                "Yoda"),

            QuoteModel(
                "I don’t care if it works on your machine! We are not shipping your machine!",
                "Vidiu Platon"
            ),
            QuoteModel(
                "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                "Bill Gates"
            ),

            QuoteModel("El dinero no da la felicidad, pero procura una sensación tan parecida que se necesita un especialista muy avanzado para verificar la diferencia.", "Woody Allen"),
            QuoteModel("El matrimonio es como las libretas de ahorro: de tanto meter y sacar, se pierde el interés.", "Eugenio Derbez"),
            QuoteModel("La inteligencia me persigue, pero yo soy más rápido.", "Groucho Marx"),
            QuoteModel("No hay nada más peligroso que un idiota motivado.", "Scott Adams"),
            QuoteModel("El amor eterno dura aproximadamente 3 meses.", "Woody Allen"),
            QuoteModel("La confusión está clarísima.", "José Saramago"),
            QuoteModel("El tiempo es un gran maestro, pero desafortunadamente mata a todos sus alumnos.", "Hector Berlioz"),
            QuoteModel("La vida es una enfermedad mortal transmitida sexualmente.", "Woody Allen"),
            QuoteModel("La mejor manera de empezar algo es dejar de hablar y empezar a hacerlo.", "Walt Disney"),
            QuoteModel("No te tomes la vida en serio, al fin y al cabo no saldrás vivo de ella.", "Elbert Hubbard")

            )

    }

}