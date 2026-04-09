import java.util.*


fun main(){

    var scanner = Scanner(System.`in`);

    var N:Int = scanner.nextInt();


    for(i in 0 until N){
        for(j in 0 until  i){
            print(" ");
        }
        for(j in 0 until 2 * N-(2*i)-1){

            print("*");

        }
        println("");
    }



}



