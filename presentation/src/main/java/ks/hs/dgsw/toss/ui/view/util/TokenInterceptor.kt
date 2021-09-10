package ks.hs.dgsw.toss.ui.view.util

import ks.hs.dgsw.toss.ui.view.util.PreferenceHelper.token
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = Request.Builder().addHeader("token", token).build()
        return chain.proceed(request)
    }
}