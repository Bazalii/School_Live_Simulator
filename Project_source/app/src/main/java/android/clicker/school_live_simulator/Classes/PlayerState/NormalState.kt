package android.clicker.school_live_simulator

class NormalState : PlayerState() {
    /**
     * values will be balanced in the future, now they are default(=0)
     */
    override val reduce_school_performance_value: Int = -100
    override val reduce_happiness_value: Int = -100
    override val reduce_satiety_value: Int = -100
}
