package data

data class Student (
    val firstname: String,
    val surname: String,
    var presence: Boolean
)

val studentList =
    arrayListOf(
        Student("Sheldon", "Cooper",true),
        Student("Howard", "Wolowitz",true),
        Student("Danila", "Vorobyov",true)
        
    )
