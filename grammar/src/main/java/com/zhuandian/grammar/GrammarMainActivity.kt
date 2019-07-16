package com.zhuandian.grammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhuandian.grammar.page.*
import kotlinx.android.synthetic.main.activity_grammar_main.*
import org.jetbrains.anko.startActivity

class GrammarMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_main)

        //数据类型
        btn_variable.setOnClickListener { startActivity<VariableActivity>() }
        btn_array.setOnClickListener { startActivity<ArrayActivity>() }
        btn_string.setOnClickListener { startActivity<StringActivity>() }
        btn_set_of.setOnClickListener { startActivity<SetOfActivity>() }
        btn_list_of.setOnClickListener { startActivity<ListOfActivity>() }
        btn_map_of.setOnClickListener { startActivity<MapOfActivity>() }

        //循环控制
        btn_condition.setOnClickListener { startActivity<ConditionActivity>() }
        btn_repeat.setOnClickListener { startActivity<RepetActivity>() }
        btn_null.setOnClickListener { startActivity<NullActivity>() }
        btn_equal.setOnClickListener { startActivity<EqualActivity>() }
    }
}
