import java.util.Scanner
import javax.annotation.processing.Messager

fun main(){

    val messager = "new settings"
    showMessage(messager)
    sum (10,15)
    val user = People("Artur",32)
    user.speak("Привет")
    println(user)

}



fun showMessage(messager: String){
    println(messager)

}