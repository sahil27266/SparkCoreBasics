import org.apache.spark.{SparkConf, SparkContext}

object SplitUsingMap extends App {
  val  conf=new SparkConf().setMaster("local[2]").setAppName("Square Rdd")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List("hi this is the spark demo","sahil","my name is sahil","garg"))
  val splitedRdd=rdd.map(x=>x.split(" "))
  splitedRdd.collect().foreach(x=>x.foreach(y=>println(y+" ")))
}
