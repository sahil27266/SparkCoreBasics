import org.apache.spark.{SparkConf, SparkContext}

object RddSetOperations extends App {
val conf=new SparkConf()
  .setMaster("local[2]")
  .setAppName("rdd set operations")
  val sc=new SparkContext(conf)
  val rdd1=sc.parallelize(List("sahil","garg","abc","garg","xyz","garg"))
  val rdd2=sc.parallelize(List("abc","sahil","def","ghi"))
  val distinct=rdd1.distinct()
  distinct.collect().foreach(x=>println(x))
  println()
  val union=rdd1.union(rdd2)//union of two rdd will consist of the duplicate data if the data is duplicate in rdd itself its not like the matha
    //matical union operation ti remove deuplicate we should use distinct() instead  of union
  union.collect().foreach(x=>println(x))
  val intersection=rdd1.intersection(rdd2)
  println()
  intersection.collect().foreach(x=>println(x))
  val subtraction=rdd1.subtract(rdd2)
  println()
  subtraction.collect().foreach(x=>println(x))
}
