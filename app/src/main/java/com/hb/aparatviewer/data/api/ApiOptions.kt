package com.hb.aparatviewer.data.api

class ApiOptions<T:ApiOption>(private val params: Map<T, String>) {
    override fun toString(): String {
        val str = StringBuffer()
        params.forEach {
            str.append("/")
            str.append(it.key.key)
            str.append("/")
            str.append(it.value)
        }
        return str.toString()
    }
}

abstract class ApiOption(){
    abstract val key: String
    abstract val value:String
    override fun toString(): String = "/$key/$value"
}

sealed class CategoryOption : ApiOption(){
    class CATEGORY(override val value: String) : CategoryOption(){
        override val key: String = "cat"
    }
    class PageCount(pageCount : Int) : CategoryOption(){
        override val key: String = "perpage"
        override val value: String = "$pageCount"
    }
}