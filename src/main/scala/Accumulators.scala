import org.apache.spark.{SparkConf, SparkContext}

object Accumulators extends App {
val conf=new SparkConf().setAppName("accumulator").setMaster("local[2]")
  val sc=new SparkContext(conf)
  val rdd=sc.textFile("AFINN-111.txt")
  val blanklines=sc.accumulator(0)
  val words=rdd.flatMap{x=>
    if(x=="")
      blanklines+=1
    x.split(" ")
  }
  words.collect().map(x=>println(x))// note:- if we will comment the collect statement we wont et the count in the accumulator as it is being computed lazily using map
  println(blanklines)


}
