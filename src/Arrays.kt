import java.util.*

fun main() {
    name("Sarah", "kenya", "good", "dancing")
    city()
    average()
    println(Arrays.toString(nation(arrayOf("kenya","Uganda","Tanzania"))))
}

fun name(word1:String,word2:String,word3:String,word4:String){
    var array=("$word1,$word2,$word3 $word4")
    var name=array.split(" ")
    println(name)

}
fun city() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city ->
        println(city.capitalize())
    }
}
    fun average() {
        var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        println(numbers.get(1) + numbers.get(4))
        println(numbers.lastIndex - 1)
        for (numbers in numbers.sorted()){
            println(numbers)}

    }




fun nation(countries:Array<String>): Array<String>{
    var countries=arrayOf("Kenya","uganda","Tanzania")
    return countries



}






