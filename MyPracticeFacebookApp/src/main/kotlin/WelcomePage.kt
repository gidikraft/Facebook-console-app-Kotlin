fun main(args: Array<String>){

    welcome()
    createPost()
    addNewFriend()
}

fun welcome(){
    println("Welcome to Facebook")
    println(" ")
    println("Press 1 to login to your account or Press 2 to create an account")
    var accountCheck = readLine()!!
    var accountCreate = OpenAccount()
    var userLogin = Login()

    if (accountCheck == "1"){
        userLogin.signIn()
    } else if (accountCheck == "2") {
        accountCreate.createAdult()
    } else {
        println("You have entered a wrong value. Please enter 1 0r 2")
    }


}

var newPosts = mutableListOf<String>()
fun createPost(){

    var updatePost = readLine()!!
}

fun addNewFriend(){

}