package android.clicker.school_live_simulator

import kotlinx.serialization.Serializable

@Serializable
open class YardSongCourseState : GuitarCourseState() {

    @kotlinx.serialization.Transient
    override val price: Int = 300

    override var best_song: Song? = null

    @kotlinx.serialization.Transient
    override val course_length: Int = 30

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalSchoolCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.SMELLS_LIKE
    }
}
