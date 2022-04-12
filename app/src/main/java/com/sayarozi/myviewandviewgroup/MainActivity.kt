package com.rspb.pertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.sayarozi.myviewandviewgroup.R
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpindah: Button = findViewById(R.id.btn_pindah)
        btnpindah.setOnClickListener(this)

        val btnpindahdata: Button = findViewById(R.id.btn_pindah_data)
        btnpindahdata.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_pindah -> {
                val intentpindah = Intent1(this@MainActivity,MoveWithDataActivity::class.java)
                startActivity(intentpindah)
            }
            R.id.btn_pindah_data -> {
                val moveWithDataIntent = Intent1(this@MainActivity,MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Native Programming")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,20)
                startActivity(moveWithDataIntent)
            }
        }
    }
}
