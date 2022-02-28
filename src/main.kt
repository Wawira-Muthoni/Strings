fun main(){
     school()
    statement()
    fruit()
}
fun school(){
    val name = "akirachix"
    val x = name[1].toString()+name[3]+name[4]
    println(x)
}
fun statement(){
    val y = "My name is Xtine"
    val z = "and i am 20 years old"
    println(y+" "+z)
}
fun fruit(){
    var q = "orange"
    println(q.length)
    comment()
}
fun comment(){
    val word = "xonia"
    if(word == "xonia")
        println("that's me!")
    else("I don't know who that is!")

}