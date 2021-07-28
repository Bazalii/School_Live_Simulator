package android.clicker.school_live_simulator
/**
 * @author      Andrey Novikov andrewnovicov@gmail.com
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
abstract class BicycleState {
    protected abstract val price: Int

    /**
     * A list of available types of delivery.
     * These types are described in enumeration class Delivery.
     */
    protected abstract val available_delivery : ArrayList<Delivery>

    /**
     * Upgrades bicycle.
     *
     * <p> Changes state which set bicycle type.
     */
    abstract fun changeState()

    /**
     * Allows delivery.
     * @param  delivery Element of enum Delivery which describes certain type of delivery.
     * @return true if a player can do chosen type of delivery.
     */
    abstract fun canDoDelivery(delivery: Delivery): Boolean
}
