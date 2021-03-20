package com.類別與物件.進階控制.網路資源存取

import org.json.JSONObject
import java.net.URL
import kotlin.math.asin
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

val jsonPath =
    """https://data.tycg.gov.tw/api/v1/rest/datastore/0daad6e6-0632-44f5-bd25-5e1de1e9146f?format=json&limit=101"""

fun main() {
    val url = URL(jsonPath)
    val jsonText = url.readText()
//    println(jsonText)

    // 將 json 字串轉為 json 物件, 以供分析
    val root = JSONObject(jsonText)
    val result = root.getJSONObject("result")
    val records = result.getJSONArray("records")

//    for (jo in records) {
//        jo as JSONObject
//        if (jo.getString("surplusSpace").toInt() >= 200) {
//            println("${jo.getString("parkName")} :  ${jo.getString("surplusSpace")} / ${jo.getInt("totalSpace")}")
//        }
//    }

    // 巨匠桃認 24.990056759076385, 121.3120108551101
    // 請求出最近 1 公里內的停車場停車資訊
    for (jo in records) {
        jo as JSONObject
        val distance = getDistance(121.3120108551101, 24.990056759076385, jo.getDouble("wgsX"), jo.getDouble("wgsY"))
        if (distance <= 1000 && jo.getString("surplusSpace").toInt() > 0) {
            println("${jo.getString("parkName")} :  ${jo.getString("surplusSpace")} / ${jo.getInt("totalSpace")}")
        }
    }

}

fun getDistance(long1: Double, lat1: Double, long2: Double, lat2: Double): Double {
    var lat1 = lat1
    var lat2 = lat2

    val R = 6378137.0 // 地球半径
    lat1 = lat1 * Math.PI / 180.0
    lat2 = lat2 * Math.PI / 180.0
    val a = lat1 - lat2
    val b = (long1 - long2) * Math.PI / 180.0
    val d: Double

    val sa2 = sin(a / 2.0)
    val sb2 = sin(b / 2.0)
    d = (2 * R * asin(sqrt(sa2 * sa2 + (cos(lat1) * cos(lat2) * sb2 * sb2))))
    return d
}