open class Login() {
    var oldUser: String = "David"
    var password: String = "trouble"

    fun signIn(){
        println("Welcome back")
        println(" ")
        println("Enter your username to sign in")
        var username = readLine()!!
        if (username == oldUser){
            println("Enter password")
            var inPassword = readLine()!!
            if (inPassword == password) {
                println("Welcome back $oldUser ! Press 1 to create a post or press 2 to add a new friend")
                var userChoice = readLine()
                if (userChoice == "1") {
                    createPost()
                } else if (userChoice == "2") {

                }
            }
        } else {
            println("Username does not exist, please create a new account")
        }
    }

    fun logOut(){

    }
}