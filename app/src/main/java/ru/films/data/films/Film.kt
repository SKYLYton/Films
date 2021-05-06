package ru.films.data.films

data class Film(val name: String, val description: String){
    fun getFullName(): String {
        return String.format("%s:\n%s", name, description)
    }
}