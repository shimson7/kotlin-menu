package menu

class menuRecommend {
    val OV = outputView()
    val IV = inputView()
    val MN = Menu()
    var coachCollect= listOf<String>()
    var categoryCollect = listOf<String>()


    constructor(){
        OV.startService()
        OV.inputCoach()
        duringInput()
    }

    fun duringInput(){
        coachCollect=IV.inputCoachName()
        println(coachCollect)
        for (i in 0 until coachCollect.size){
            OV.inputNotEat(coachCollect[i])
            IV.inputNotEating()
            println()
        }
    }



    fun categorySelect(){
        categoryCollect=MN.categorySelect()
        println(categoryCollect)
        OV.category(categoryCollect)
    }

}