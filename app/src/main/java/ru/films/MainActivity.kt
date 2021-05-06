package ru.films

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import ru.films.`object`.Repository
import ru.films.data.films.Film
import ru.films.data.films.Films
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewInf.text = Repository.copy()

        val film = Film("Властелин колец", "Описание к фильму")
        var isEven = false

        var message: String

        buttonClickMe.setOnClickListener {
            message = if(!isEven) getString(R.string.hello_world) else film.getFullName()
            Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
            isEven = !isEven
        }

        var sB = StringBuilder()

        Films.films.forEach{ sB.append(it.getFullName()).append("\n\n")}

        textViewFilms.text = sB.toString()
    }
}