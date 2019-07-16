package com.zhuandian.grammar.page

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhuandian.grammar.R
import kotlinx.android.synthetic.main.activity_array.*

class ArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        //声明数组，可利用intArrayOf，longArrayOf等，完成数组声明，也可以利用arrayOf加泛型声明
        //例如 声明int数组的两种形式
        var int_array: Array<Int> = arrayOf(1, 2, 3)
        var int_array2: IntArray = intArrayOf(1, 2, 4)
        btn_int.setOnClickListener { formatArrayStr<Int>(int_array) }

        var long_array: Array<Long> = arrayOf(12, 3, 45, 43534)
        btn_long.setOnClickListener { formatArrayStr<Long>(long_array) }

        var float_array: Array<Float> = arrayOf(1.2f, 34234.3f, 333.3f)
        btn_float.setOnClickListener { formatArrayStr(float_array) }

        var double_array: Array<Double> = arrayOf(12.321, 321.1, 321321.1)
        btn_double.setOnClickListener { formatArrayStr<Double>(double_array) }

        var boolean_array: Array<Boolean> = arrayOf(true, false, true)
        btn_boolean.setOnClickListener { formatArrayStr<Boolean>(boolean_array) }

        var char_array: CharArray = charArrayOf('a', 'b', 'c', 'e')
        btn_char.setOnClickListener {
            var str: String = ""
            for (item in char_array) {
                str += item.toString() + ","
            }
            tv_item_list.text = str
        }

        //声明字符串数组
        var string_array: Array<String> = arrayOf("bad", "good", "dsafasdfdas", "fdasfdswefa", "aaa")
        btn_string.setOnClickListener {
            var str: String = ""
            var i: Int = 0;
            while (i < string_array.size) {
                str = str + string_array[i] + ","

                //数组元素可以通过下标访问，也可通过get方法访问
//                str = str + string_array.get(i) + ","
                i++
            }

            tv_item_list.text = str
        }

    }

    /**
     * 格式化数组里面内容
     */
    private fun <T> formatArrayStr(array: Array<T>) {
        var str: String = ""
        for (item in array) {
            str = str + item.toString() + ","
        }
        tv_item_list.text = str
    }
}
