import org.apache.spark.{SparkConf, SparkContext}

object SplitUsingFlatMap extends App {
  val  conf=new SparkConf().setMaster("local[2]").setAppName("Split using flatmap")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List("hi this is the spark demo","sahil","my name is sahil","garg"))
  val splitedRdd=rdd.flatMap(x=>x.split(" "))
  println(splitedRdd.collect().foreach(x=>println(x)))
}
