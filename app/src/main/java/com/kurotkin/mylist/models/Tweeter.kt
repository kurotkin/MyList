package com.kurotkin.mylist.models

class Tweeter {
    companion object{
        fun gen(): List<TweetApi>{
            val tweets = ArrayList<TweetApi>()
            tweets.add(TweetApi(1, "User 1","", "Text Text Text",null, null))
            tweets.add(TweetApi(2, "User 2","", "Text Text Text",null, null))
            tweets.add(TweetApi(3, "User 3","", "Text Text Text",null, null))
            tweets.add(TweetApi(4, "User 4","", "Text Text Text",null, null))
            tweets.add(TweetApi(5, "User 5","", "Text Text Text",null, null))
            tweets.add(TweetApi(6, "User 6","", "Text Text Text",null, null))
            tweets.add(TweetApi(7, "User 7","", "Text Text Text",null, null))
            tweets.add(TweetApi(8, "User 8","", "Text Text Text",null, null))
            return tweets
        }
    }
}