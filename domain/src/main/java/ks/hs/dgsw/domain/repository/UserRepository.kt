package ks.hs.dgsw.domain.repository

import ks.hs.dgsw.domain.entity.dto.User
import ks.hs.dgsw.domain.entity.request.Login
import ks.hs.dgsw.domain.entity.request.Register

interface UserRepository {
    suspend fun postRegister(register: Register): String
    suspend fun postLogin(login: Login): String
    suspend fun getMyInfo(): User
}