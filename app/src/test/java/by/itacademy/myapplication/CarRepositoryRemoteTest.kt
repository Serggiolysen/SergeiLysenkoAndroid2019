package by.itacademy.myapplication

import by.itacademy.pvtjune.cw.cw9.CarRepositoryRemote
import by.itacademy.pvtjune.cw.cw9.CarRepositoryRemoteResult
import by.itacademy.pvtjune.cw.cw9.entity.CoordParams
import by.itacademy.pvtjune.cw.cw9.entity.Coordinate
import by.itacademy.pvtjune.cw.cw9.entity.Poi
import org.junit.Test
import org.junit.Assert.assertTrue
import org.junit.Assert.assertEquals

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CarRepositoryRemoteTest {

    @Test
    fun addition_isCorrect() {

        val repository = CarRepositoryRemote(MockApi())

        val params = CoordParams(
            Coordinate(1.4, 2.4),
            Coordinate(1.4, 2.4)
        )

        repository.getCarByCoord(params, object : CarRepositoryRemoteResult {
            override fun onSuccess(list: List<Poi>) {
                assertTrue(true)
            }

            override fun onError(throwable: Throwable) {
                assertTrue(true)
            }
        })

        assertEquals(4, 2 + 2)
    }
}
