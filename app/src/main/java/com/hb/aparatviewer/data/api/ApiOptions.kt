package com.hb.aparatviewer.data.api



abstract class ApiOption() {
    abstract val key: String
    abstract val value: String
    override fun toString(): String = "/$key/$value"
}

class CategoryOptions(private val params: List<ApiOption>) {
    override fun toString(): String {
        val str = StringBuffer()
        params.forEach { str.append(it) }
        return str.toString()
    }
}

class CATEGORY(override val value: String) : ApiOption() {
    override val key: String = "cat"
}

class PageCount(pageCount: Int) : ApiOption() {
    override val key: String = "perpage"
    override val value: String = "$pageCount"
}
