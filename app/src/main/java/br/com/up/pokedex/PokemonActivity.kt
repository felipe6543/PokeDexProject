package br.com.up.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)
    }
    val imagepokemons: ImageView = findViewById(R.id.image_pokemons)
    val name: TextView = findViewById(R.id.text_view_name)
    val image: TextView = findViewById(R.id.text_view_image)
    val types: TextView = findViewById(R.id.text_view_types)
    val stats: TextView = findViewById(R.id.text_view_stats)
    val abilities: TextView = findViewById(R.id.text_view_abilities)
    val movements: TextView = findViewById(R.id.text_view_movements)
}