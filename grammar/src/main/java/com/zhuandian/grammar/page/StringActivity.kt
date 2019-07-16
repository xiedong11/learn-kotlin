package com.zhuandian.grammar.page

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhuandian.grammar.R
import kotlinx.android.synthetic.main.activity_string.*

class StringActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        val origin: String = tv_origin.text.toString();
        var origin_trim: String = origin

        //判断字符串中是否含有整数部分
        if (origin_trim.contains(".")) {
            origin_trim = origin_trim.substring(0, origin_trim.indexOf('.'))
        }

        var int: Int
        btn_int.setOnClickListener { int = origin_trim.toInt();tv_convert.text = int.toString() }

        var long: Long
        btn_long.setOnClickListener { long = origin_trim.toLong();tv_convert.text = long.toString() }

        var float: Float
        btn_float.setOnClickListener { float = origin_trim.toFloat();tv_convert.text = float.toString() }

        var double: Double
        btn_double.setOnClickListener { double = origin_trim.toDouble();tv_convert.text = double.toString() }


        //字符串转字符数组
        var char_array: CharArray
        btn_chararray.setOnClickListener {
            char_array = origin.toCharArray();
            var str: String = ""
            for (item in char_array) {
                str = str + item.toString() + ","
            }
            tv_convert.text = str.toString()
        }


        btn_replace.setOnClickListener {
            //把字符串中的小数点替换为加号
            tv_convert.text = origin.replace(".", "+")
        }

        btn_split.setOnClickListener {
            //从小数点处，把原始字符串切割为字符数组
            var strList: List<String> = origin.split(".")
            var resultStr: String = ""
            for (item in strList) {
                resultStr += item + ","
            }
            tv_convert.text = resultStr
        }

       btn_cut.setOnClickListener {
           var index:Int = et_number.text.toString().toInt();
           //Kotlin的字符串允许通过下标直接访问该位置上的元素
           tv_convert.text = origin[index].toString()
           //字符串也可调用get方法获取指定位置上的字符
           //tv_convert.text = origin.get(index).toString()
       }

        btn_format.setOnClickListener { tv_convert.text = "字符串值为 $origin" }
        //符号$后面跟变量名，系统会自动匹配最长的变量名。
        //比如下面这个例子，打印出来的是origin_trim，不是origin
        //btn_format.setOnClickListener { tv_convert.text = "字符串值为 $origin_trim" }
        //如果在取值之前还要先运算，则需用大括号把运算表达式给括起来
        btn_length.setOnClickListener { tv_convert.text = "字符串长度为 ${origin.length}" }
        //在Kotlin中，美元符号$属于特殊字符，不能直接打印，必须经过转义才行
        btn_dollar.setOnClickListener { tv_convert.text = "美元金额为 ${'$'}$origin" }
        //如果只是对单个特殊字符做转义，也可直接用反斜杆。
        //btn_dollar.setOnClickListener { tv_convert.text = "美元金额为 \$$origin" }
        //${'***'}的好处是能够保留一个字符串中的所有特殊字符

    }
}
