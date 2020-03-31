import kotlinx.coroutines.runBlocking
import org.junit.Test

class MainTest {
    @Test
    fun testFoo() {
        runBlocking {
            coveredFoo()
            notCoveredFoo()
        }
    }
}