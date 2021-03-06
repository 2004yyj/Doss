package ks.hs.dgsw.domain.entity.dto

data class User(
    val id: String,
    val nick: String,
    val phone: String,
    val birth: String,
    val name: String,
    val profileImage: String,
    val account: List<Account>?
)
