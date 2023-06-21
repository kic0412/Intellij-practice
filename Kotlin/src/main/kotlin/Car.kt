//import java.awt.Color
//
//class Car {
//    var color: String = ""
//    var speed: Int = 0
//
//    companion object {
//        var carCount: Int = 0
//        const val MAXSPEED: Int = 200
//        const val MINSPEED: Int = 0
//        fun currentCarCount(): Int {
//            return carCount
//        }
//    }
//
//    constructor(color: String, speed: Int) {
//        this.color = color
//        this.speed = speed
//        carCount ++
//    }
//
//    constructor(speed: Int) {
//        this.speed = speed
//    }
//
//    constructor() {
//    }
//
//    fun upSpeed(value: Int) {
//        if (speed+value >= MAXSPEED)
//            speed = 200
//        else
//            speed = speed + value
//    }
//    fun downSpeed(value: Int) {
//        if (speed - value <= MINSPEED)
//            speed = 0
//        else
//            speed = speed - value
//    }
//}
//
//fun main() {
////    var myCar1: Car = Car()
////    myCar1.color = "빨강"
////    myCar1.speed = 0
////
////    var myCar2: Car = Car()
////    myCar2.color = "파랑"
////    myCar2.speed = 0
////
////    var myCar3: Car = Car()
////    myCar3.color = "초록"
////    myCar3.speed = 0
//
//    var myCar1: Car = Car("빨강",0)
//    var myCar2: Car = Car("파랑",0)
//    var myCar3: Car = Car("초록",0)
//
////    myCar1.upSpeed(50)
////    println("자동차1의 색상은 " + myCar1.color + "이며, 속도는" + myCar1.speed + "km 입니다")
////    myCar2.upSpeed(20)
////    println("자동차1의 색상은 " + myCar2.color + "이며, 속도는" + myCar2.speed + "km 입니다")
////    myCar3.upSpeed(250)
////    println("자동차1의 색상은 " + myCar3.color + "이며, 속도는" + myCar3.speed + "km 입니다")
//
//    println("생산된 차의 대수(정적 필드) ==> " + Car.carCount)
//    println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount())
//    println("차의 최고 제한속도 ==> " + Car.MAXSPEED)
//    println("P1의 값 ==> " + Math.PI)
//    println("3의 5제곱 ==> " + Math.pow(3.0, 5.0))
//}
