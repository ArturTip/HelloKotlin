class money(var balance : Double) {


    fun addMoney( summaAdd: Double, ) {
        balance+=summaAdd
        println(balance)
    }

    fun reducTheBalance (summaReduc:Double){
        balance-=summaReduc
        println(balance)


    }


}