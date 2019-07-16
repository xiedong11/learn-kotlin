package com.zhuandian.learnkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hello_kotlin.*
import org.jetbrains.anko.toast

class HelloKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_kotlin)

        tv_text.text = "Kotlin ····"

        btn_click.setOnClickListener { btn_click.text = "按钮被点击" }
        btn_long_press.setOnLongClickListener { btn_long_press.text = "按钮被长按";true }

        btn_click_show_toast.setOnClickListener { toast("按钮被点击了") }
        btn_long_press_show_toast.setOnLongClickListener({ toast("按钮被长按");true })
    }
}
