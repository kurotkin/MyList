package com.kurotkin.mylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kurotkin.mylist.models.TweetMapper
import com.kurotkin.mylist.models.Tweeter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mAdapter = TweeterAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerMain.adapter = mAdapter
        popDate()
    }

    fun popDate(){
        val tweets = Tweeter.gen()
        mAdapter.setData(tweets.map { TweetMapper().mapApiToUI(it) })
    }
}
