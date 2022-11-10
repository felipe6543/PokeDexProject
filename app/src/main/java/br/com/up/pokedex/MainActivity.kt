package br.com.up.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.adapters.PokeAdapter
import br.com.up.pokedex.network.PokeApi
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerPokemon : RecyclerView =
            findViewById(R.id.recycler_pokemon)

        recyclerPokemon.layoutManager =
            GridLayoutManager(this, 3)

        val textInputEditText: TextInputEditText = findViewById(R.id.text_input_edit_text_pokemon)
         textInputEditText.addTextChangedListener(object: TextWatcher{
             override fun afterTextChanged(s: Editable?) {

             }

             override fun beforeTextChanged(s: CharSequence?, start : Int, count: Int, after: Int) {

             }

             override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

             }
         })
        PokeApi().pokemons { pokemons ->

            if(pokemons != null){
                recyclerPokemon.adapter =
                    PokeAdapter(pokemons){ pokemon ->



                    }
            }
            else{
                // TODO implements error
            }
        }
    }
}