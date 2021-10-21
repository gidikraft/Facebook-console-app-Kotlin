class Admin: User(){

    fun banAccount(){

    }

    override fun readPost() {
        val oldAdminPost = mutableListOf<String>("Please update your app to the latest version to enjoy new features", "Update your app to enjoy parental guidance feature")
        println("Your old posts - $oldAdminPost")
    }
}
