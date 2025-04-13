import java.util.Scanner
import javax.annotation.processing.Messager

fun main(){
    val scanner = Scanner(System.`in`)
val totalBalance = money(5000.0)
   while (true){
    showText()
when(scanner.nextInt()){
    1-> totalBalance.addMoney(scanner.nextDouble())
    2-> totalBalance.reducTheBalance(scanner.nextDouble())
}


}}


