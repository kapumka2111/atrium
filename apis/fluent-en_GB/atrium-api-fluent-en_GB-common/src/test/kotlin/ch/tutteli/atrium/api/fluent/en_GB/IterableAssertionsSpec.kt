package ch.tutteli.atrium.api.fluent.en_GB

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.specs.fun0
import ch.tutteli.atrium.specs.notImplemented

object IterableAssertionsSpec : ch.tutteli.atrium.specs.integration.IterableAssertionsSpec(
    fun0(Expect<Iterable<Int>>::hasNext),
    fun0(Expect<Iterable<Int>>::hasNotNext)
) {

    @Suppress("unused", "UNUSED_VALUE")
    private fun ambiguityTest() {
        var a1: Expect<Iterable<Double>> = notImplemented()
        var a1b: Expect<Iterable<Double?>> = notImplemented()

        var star: Expect<Iterable<*>> = notImplemented()

        a1 = a1.hasNext()
        a1 = a1.hasNotNext()

        a1b = a1b.hasNext()
        a1b = a1b.hasNotNext()

        star = star.hasNext()
        star = star.hasNotNext()
    }
}
