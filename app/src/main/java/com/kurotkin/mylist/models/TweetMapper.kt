package com.kurotkin.mylist.models

class TweetMapper {

    fun mapApiToUI(api: TweetApi): Tweet {
        when {
            api.quote != null -> return TweetQuote(id = api.id, username = api.username, avatar = api.avatar, text = api.text, quote = api.quote)
            api.image != null -> return TweetImage(id = api.id, username = api.username, avatar = api.avatar, text = api.text, image = api.image)
            else -> return TweetSimple(id = api.id, username = api.username, avatar = api.avatar, text = api.text)
        }
    }
}