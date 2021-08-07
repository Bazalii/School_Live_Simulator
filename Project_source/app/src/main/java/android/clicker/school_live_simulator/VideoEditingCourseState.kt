package android.clicker.school_live_simulator

open class VideoEditingCourseState : WebDesignCourseState() {
    override val price: Int = 0

    override fun buyNexCourse(courses: Player.Courses) {
        courses.computer_course = GameDevelopmentCourseState()
    }

    override fun timerTickHandler(){

    }
    override fun timerEndHandler(){
        available_web_task.add(WebTask.VIDEO_EDITING)
    }
}
