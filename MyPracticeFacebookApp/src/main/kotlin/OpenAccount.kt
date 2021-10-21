class OpenAccount: Login() {

    fun createAdult(){
        var signUpCheck = Login()

        println("Choose a unique username")
        var myUsername = readLine()!!
        if (myUsername == signUpCheck.oldUser){
            println("This username is already taken. Enter a new username")
            var uniqueUsername = readLine()
        } else {
            println("Enter your password")
            var password = readLine()
        }
        println("Welcome to your new facebook account. Press 1 to add new friends or 2 to create a post")
    }

    fun openChildAccount(){

    }
}