class People (val name :String, val age:Int) {
    override fun toString(): String {
        return "Меня зовут $name, мой возраст $age"
    }
    fun speak (speach :String){
        println("Я говорю $speach")
    }

}