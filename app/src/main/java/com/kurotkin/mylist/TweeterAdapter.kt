package com.kurotkin.mylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kurotkin.mylist.models.Tweet
import com.kurotkin.mylist.models.TweetImage
import com.kurotkin.mylist.models.TweetQuote
import com.kurotkin.mylist.models.TweetSimple
import kotlinx.android.synthetic.main.cell_tweet_text.view.*

class TweeterAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mDataList: MutableList<Tweet> = ArrayList()

    fun setData(data: List<Tweet>){
        mDataList.clear()
        mDataList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            1 -> QuoteHolder(inflater.inflate(R.layout.cell_tweet_quote, parent, false))
            2 -> ImageHolder(inflater.inflate(R.layout.cell_tweet_text_image, parent, false))
            else -> TextViewHolder(inflater.inflate(R.layout.cell_tweet_text, parent, false))
        }
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(mDataList[position]) {
            is TweetSimple -> 0
            is TweetQuote -> 1
            else -> 2
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is TextViewHolder -> holder.bind(mDataList[position] as TweetSimple)
            is QuoteHolder -> holder.bind(mDataList[position] as TweetQuote)
            is ImageHolder -> holder.bind(mDataList[position] as TweetImage)
        }
    }

    class TextViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(model: TweetSimple){
            itemView.textUserName.text = model.username
            itemView.textTweet.text = model.text
        }
    }

    class QuoteHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(model: TweetQuote){
            itemView.textUserName.text = model.username
            itemView.textTweet.text = model.text
        }
    }

    class ImageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(model: TweetImage){
            itemView.textUserName.text = model.username
            itemView.textTweet.text = model.text
        }
    }
}