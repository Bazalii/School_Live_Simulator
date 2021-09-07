package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class MacbookState : ComputerState() {

    @kotlinx.serialization.Transient
    override val price: Int = 200000

    @kotlinx.serialization.Transient
    override val available_courses = arrayListOf(
        FriendsCourseState(),
        OnlineWorkCourseState(),
        WebDesignCourseState(),
        VideoEditingCourseState(),
        GameDevelopmentCourseState()
    )

    override fun changeState(bag: Player.Bag) {
//        Unit = throw UnsupportedOperationException("Operation not supported")
    }

}
