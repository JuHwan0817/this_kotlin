package com.juhwan203.inheritanceandextension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  1. 부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayHello()
        //  1. 자식 클래스 호출해서 사용하기
        var child = child()
        child.myHello()

        testStringExtension()
    }
    //String 익스텐션 테스트 하기
    /*fun testStringExtension(){
        var original = "Hello"
        var added = " Guys~"
        //  plus 함수를 사용해서 문자열을 더할 수 있다.
        Log.d("Extension", "added를 더한값은 ${original.plus(added)}입니다")
    }*/
}
// 상속 연습
open class Parent {
    var hello:String = "안녕하세요"
    fun sayHello(){
        Log.d("inheritance","${hello}")
    }
}
open class Parent() {
    fun myHello(){
        hello = "hello"
        sayHello()
    }
}
open class BaseClass{
    open fun opend(){

    }
    fun notOpend(){

    }
}
class ChildClass: BaseClass{
    override fun opend() {

    }
    // override fun notOpend(){
//
// }
}
// 프로퍼티 오버라이드 연습
open class BaseClass2{
    open var opened: String = "I am"
}
class ChildClass2: BaseClass2(){
    override var opened: String = "You are"
}
fun String.plus(word:String):String{
    return this + word
}























