import org.apache.spark.{SparkConf, SparkContext}

object SquareRdd extends App {
  val  conf=new SparkConf()
    .setMaster("local[2]")
    .setAppName("Square Rdd")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List(1,2,3,4,5,6))
  val squareRdd=rdd.map(x=>x*x)
  val finalRdd=squareRdd.filter(x=>x!=1)
  println(finalRdd.collect().mkString(","))
}
