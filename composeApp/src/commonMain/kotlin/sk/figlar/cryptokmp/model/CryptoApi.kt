package sk.figlar.cryptokmp.model

import kotlinx.serialization.Serializable

@Serializable
data class CryptoApi(
    val symbol: String,
    val weightedAvgPrice: Double,
    val lastPrice: Double,
)