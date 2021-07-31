package android.clicker.school_live_simulator
/**
 * @author      Andrey Novikov andrewnovicov@gmail.com
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 * Every tick player characteristics: school_performance, happiness and satiety reduces.
 * 3 subclasses of abstract class define different player state.
 * Each player state defines its constants.
 * These constants define player characteristics reduce.
 */
abstract class PlayerState {
    protected abstract val reduce_school_performance_percent: Int
    protected abstract val reduce_happines_percent: Int
    protected abstract val reduce_satiety_percent: Int
}
