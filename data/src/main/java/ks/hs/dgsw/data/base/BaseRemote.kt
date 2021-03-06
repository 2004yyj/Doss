package ks.hs.dgsw.data.base

import android.util.Log
import com.google.gson.Gson
import ks.hs.dgsw.domain.entity.response.Response

abstract class BaseRemote<SV> {
    protected abstract val service: SV

    fun <T> getResponse(response: retrofit2.Response<Response<T>>): T {
        checkError(response)
        return response.body()!!.data
    }

    fun <T> getMessage(response: retrofit2.Response<Response<T>>): String {
        checkError(response)
        return response.body()!!.message
    }

    private fun <T> checkError(response: retrofit2.Response<Response<T>>) {
        Log.d("TAG", "checkError: ${response.raw().request}")
        if (!response.isSuccessful) {
            val gson = Gson()
            val errorBody = gson.fromJson(response.errorBody()!!.charStream(), Response::class.java)
            throw Throwable(errorBody.message)
        }
    }
}