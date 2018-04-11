import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object ThingSpec : Spek({
    describe("a thing") {
        val thing = Thing()

        given("two numbers") {
            val a = 1
            val b = 2

            on("adding them") {
                val result = thing.add(a, b)

                it("returns the sum of those numbers") {
                    assertThat(result, equalTo(3))
                }
            }
        }
    }
})
