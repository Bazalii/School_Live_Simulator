package android.clicker.school_live_simulator

import android.clicker.school_live_simulator.Classes.EnumClasses.ShopCourses
import kotlinx.serialization.Serializable

@Serializable
open class MusicalSchoolCourseState : GuitarCourseState() {

    @kotlinx.serialization.Transient
    override val happiness: Int = ShopCourses.GUITAR_COURSE_V4.happiness

    @kotlinx.serialization.Transient
    override val satiety: Int = ShopCourses.GUITAR_COURSE_V4.satiety

    @kotlinx.serialization.Transient
    override val course_length: Int = ShopCourses.GUITAR_COURSE_V4.length

    @kotlinx.serialization.Transient
    override val price: Int = ShopCourses.GUITAR_COURSE_V4.money_diff

    override var best_song: Song? = null

    override fun buyNextCourse(courses: Player.Courses) {
        courses.guitar_course = MusicalObservatoryCourseState()
    }

    override fun timerTickHandler() {

    }

    override fun timerEndHandler() {
        this.best_song = Song.JAZZ
    }
}
