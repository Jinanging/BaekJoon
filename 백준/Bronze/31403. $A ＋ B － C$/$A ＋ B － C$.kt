import java.util.*


    fun main(){
        var scanner = Scanner(System.`in`);

        var a:Int = scanner.nextInt();
        var b:Int = scanner.nextInt();
        var c:Int = scanner.nextInt();

        println(a+ b - c);

        var temp:Int = (a.toString() + b.toString()).toInt();
        println(temp -c);



    }