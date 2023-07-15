package com.gonzalez.blanchard.frasesmvvmjetpack.model

class QuoteProvider {

    companion object {

        fun random(): QuoteModel {
            val position = (frases.indices).random()
            return frases[position]
        }

        private val frases = listOf<QuoteModel>(

            QuoteModel("El éxito es la suma de pequeños esfuerzos repetidos día tras día.", "Robert Collier"),
                    QuoteModel("El único límite para nuestros logros de mañana está en nuestras dudas de hoy.", "Franklin D. Roosevelt"),
        QuoteModel("El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.", "Albert Schweitzer"),
        QuoteModel("No importa lo lento que vayas, siempre y cuando no te detengas.", "Confucio"),
        QuoteModel("El optimismo es la fe que conduce al logro. Nada se puede hacer sin esperanza y confianza.", "Helen Keller"),
        QuoteModel("El único lugar donde el éxito viene antes que el trabajo es en el diccionario.", "Vidal Sassoon"),
        QuoteModel("El fracaso es solo la oportunidad de comenzar de nuevo de forma más inteligente.", "Henry Ford"),
        QuoteModel("El éxito es aprender a ir de fracaso en fracaso sin perder el entusiasmo.", "Winston Churchill"),
        QuoteModel("El éxito no es el final, el fracaso no es fatal: es el coraje para continuar lo que cuenta.", "Winston Churchill"),
        QuoteModel("El éxito es la capacidad de pasar de un fracaso a otro sin perder entusiasmo.", "Winston Churchill"),
        QuoteModel("La mejor manera de predecir el futuro es crearlo.", "Peter Drucker"),
        QuoteModel("No te preocupes por los fracasos, preocúpate por las posibilidades que pierdes cuando ni siquiera lo intentas.", "Jack Canfield"),
        QuoteModel("El único lugar donde el éxito viene antes que el trabajo es en el diccionario.", "Vidal Sassoon"),
        QuoteModel("El éxito no está en caer, sino en levantarse cada vez que caes.", "Anónimo"),
        QuoteModel("No sueñes tu vida, vive tu sueño.", "Anónimo"),
        QuoteModel("No se trata de cuántas veces te derriban, se trata de cuántas veces te levantas.", "Vince Lombardi"),
        QuoteModel("Si tienes un sueño, protégelo. No dejes que nadie te diga que no puedes hacerlo.", "Will Smith"),
        QuoteModel("Si quieres lograr algo que nunca has tenido, debes estar dispuesto a hacer algo que nunca has hecho.", "Thomas Jefferson"),
        QuoteModel("El éxito no es el final, el fracaso no es fatal: es el coraje para continuar lo que cuenta.", "Winston Churchill"),
        QuoteModel("No se trata de ser el mejor. Se trata de ser mejor de lo que eras ayer.", "Anónimo"),
        QuoteModel("La disciplina es el puente entre las metas y el éxito.", "Jim Rohn"),
        QuoteModel("No importa cuántas veces te caigas, lo importante es cuántas veces te levantes.", "Vince Lombardi"),
        QuoteModel("El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.", "Albert Schweitzer"),
        QuoteModel("Nunca es demasiado tarde para ser lo que podrías haber sido.", "George Eliot"),
        QuoteModel("El fracaso es solo la oportunidad de comenzar de nuevo de forma más inteligente.", "Henry Ford"),
        QuoteModel("El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.", "Albert Schweitzer"),
        QuoteModel("El éxito no está en caer, sino en levantarse cada vez que caes.", "Anónimo"),
        QuoteModel("No sueñes tu vida, vive tu sueño.", "Anónimo"),
        QuoteModel("No te preocupes por los fracasos, preocúpate por las posibilidades que pierdes cuando ni siquiera lo intentas.", "Jack Canfield"),
        QuoteModel("No se trata de cuántas veces te derriban, se trata de cuántas veces te levantas.", "Vince Lombardi"),
        QuoteModel("Si tienes un sueño, protégelo. No dejes que nadie te diga que no puedes hacerlo.", "Will Smith"),
        QuoteModel("Si quieres lograr algo que nunca has tenido, debes estar dispuesto a hacer algo que nunca has hecho.", "Thomas Jefferson"),
        QuoteModel("El éxito no está en caer, sino en levantarse cada vez que caes.", "Anónimo"),
        QuoteModel("No sueñes tu vida, vive tu sueño.", "Anónimo"),
        QuoteModel("No se trata de cuántas veces te derriban, se trata de cuántas veces te levantas.", "Vince Lombardi"),
        QuoteModel("Si tienes un sueño, protégelo. No dejes que nadie te diga que no puedes hacerlo.", "Will Smith"),
        QuoteModel("Si quieres lograr algo que nunca has tenido, debes estar dispuesto a hacer algo que nunca has hecho.", "Thomas Jefferson"),
        QuoteModel("No te preocupes por los fracasos, preocúpate por las posibilidades que pierdes cuando ni siquiera lo intentas.", "Jack Canfield"),
        QuoteModel("No importa cuántas veces te caigas, lo importante es cuántas veces te levantes.", "Vince Lombardi"),
        QuoteModel("Si tienes un sueño, protégelo. No dejes que nadie te diga que no puedes hacerlo.", "Will Smith"),
        )

    }

}