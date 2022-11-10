package br.com.up.pokedex.models

data class Pokemon(
    var name: String,
    var url: String,
    var abilities:List<PokeAbility>?,
    var movements: List<Movement>,
    var types: List<Type>,
    var stats: List<Stat>,
    var image: String

)
