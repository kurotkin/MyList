package com.kurotkin.mylist.models

data class TweetApi (val id: Int, val username: String, val avatar: String, val text: String, val quote: Quote?, val image: String?)

data class Quote(val text: String)

sealed class Tweet
data class TweetSimple(val id: Int, val username: String, val avatar: String, val text: String): Tweet()
data class TweetImage(val id: Int, val username: String, val avatar: String, val text: String, val image: String): Tweet()
data class TweetQuote(val id: Int, val username: String, val avatar: String, val text: String, val quote: Quote): Tweet()