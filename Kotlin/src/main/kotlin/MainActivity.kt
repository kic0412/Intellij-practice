import java.lang.ArithmeticException

//class MainActivity{
//    var myNumbers = "1, 2, 3, 4, 5, 6"
//    var thisWeekNumbers = "5, 6, 7, 8, 9, 10"
//    if (myNumbers == thisWeekNumbers) {
//        Log.d("Lotto", "당첨되었습니다.")
//    }
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//
//class MainActivity: AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        var myName = "홍길동"
//        var myAge: Int
//        myAge = 27
//        myAge = myAge + 1
//        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")
//    }
//}

//fun main() {//    var var1: Int = 10
//    var var2: Float = 10.1f
//    var var3: Double = 10.2
//    var var4: Char = '안'
//    var var5: String = "안드로이드"
//    println(var1)
//    println(var2)
//    println(var3)
//    println(var4)
//    println(var5)
//}

//fun main() {
//    var count: Int = 85
//    if (count >= 90) {
//        println("if문: 합격 (장학생)")
//    } else if (count >= 60) {
//        println("if문: 합격")
//    } else {
//        println("if문: 불합격")
//    }
//
//    var jumsu: Int = (count / 10) * 10
//    when (jumsu) {
//        100 -> println("when문: 합격(장학생)")
//        90 -> println("when문: 합격(장학생)")
//        80, 70, 60 -> println("when문: 합격")
//        else -> println("when문: 불합격")
//    }
//}

//fun main() {
//    var one: IntArray = intArrayOf(10, 20, 30)
//    for (i in one.indices) {
//        println(one[i])
//    }
//    for (value in one) {
//        println(value)
//    }
//
//    var two: Array<String> = arrayOf("하나", "둘", "셋")
//    for (i in 0..2 step 1) {
//        println(two[i])
//    }
//
//    var k: Int = 0
//    while (k < two.size) {
//        println(two[k])
//        k++
//    }
//}

//var myVar: Int = 100
//fun main() {
//    var myVar: Int = 0
//    println(myVar)
//
//    var sum: Int = addFunction(10, 20)
//    println(sum)
//}
//fun addFunction(num1: Int, num2: Int): Int {
//    var hap: Int
//    hap = num1 + num2 + myVar
//    return hap
//}

//fun main() {
//    var num1: Int = 100
//    var num2: Int = 0
//    try {
//        println(num1 / num2)
//    } catch (e: ArithmeticException) {
//        println("계산에 문제가 있습니다")
//    }
//}