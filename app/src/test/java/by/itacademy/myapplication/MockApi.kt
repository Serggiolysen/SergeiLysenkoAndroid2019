package by.itacademy.myapplication

import by.itacademy.pvtjune.cw.cw9.Api
import by.itacademy.pvtjune.cw.cw9.entity.CarResponse
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MockApi : Api {
    override fun getCarsByCoord(p1Lat: Double, p1Lon: Double, p2Lat: Double, p2Lon: Double): Call<CarResponse> {

        return MyCall()
    }
}

class MyCall : Call<CarResponse> {
    override fun enqueue(callback: Callback<CarResponse>) {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun isExecuted(): Boolean {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun clone(): Call<CarResponse> {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun isCanceled(): Boolean {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun execute(): Response<CarResponse> {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun request(): Request {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }
}