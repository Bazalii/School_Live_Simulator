package android.clicker.school_live_simulator.Classes.Enum_classes

import android.clicker.school_live_simulator.Classes.GameDate.Timer
import android.clicker.school_live_simulator.Game
import android.clicker.school_live_simulator.R
import android.util.Log

enum class Studies(val school_performance: Int, val money_diff: Int) {
    GO_TO_SCHOOL(Game.context_bundle.getNumber("go_to_school_school_performance"),Game.context_bundle.getNumber("go_to_school_money") ),
    LEARN_YOURSELF(Game.context_bundle.getNumber("learn_yourself_school_performance"),Game.context_bundle.getNumber("learn_yourself_money")),
    BUY_CHEATBOOK(Game.context_bundle.getNumber("buy_cheatbook_school_performance"),Game.context_bundle.getNumber("buy_cheatbook_money")),
    LEARN_FROM_A_STUDENT(Game.context_bundle.getNumber("learn_from_student_performance"),Game.context_bundle.getNumber("learn_from_student_money")),
    SIGN_UP_IN_AN_ONLINE_SCHOOL(Game.context_bundle.getNumber("sign_up_in_an_online_school_school_performance"),Game.context_bundle.getNumber("sign_up_in_an_online_school_money")),
    HIRE_A_GOOD_TUTOR(Game.context_bundle.getNumber("hire_a_good_tutor_school_performance"),Game.context_bundle.getNumber("hire_a_good_tutor_money")),
    STUDY_WITH_UNI_TEACHER(Game.context_bundle.getNumber("study_with_uni_teacher_school_performance"),Game.context_bundle.getNumber("study_with_uni_teacher_money"));

    fun goToSchool() {
        Game.player.study(Studies.GO_TO_SCHOOL)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Studies.GO_TO_SCHOOL::goToSchool)
    }
    fun signUpInOnlineSchool() {
        Game.player.study(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL)
        Timer(Game.game_date.subscription_length).setEndSignalHandler(Studies.SIGN_UP_IN_AN_ONLINE_SCHOOL::signUpInOnlineSchool)
    }

}
