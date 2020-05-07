import org.apache.spark.{SparkConf, SparkContext}

object BasicActionsOnRdd extends App {
val conf=new SparkConf()
  .setMaster("local[2]")
  .setAppName("basic actions")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List(1,2,3,4,1,2))
  val result=rdd.collect()
  result.foreach(x=>print(x))
  println("\n")
  val count=rdd.count()
  println(count)
  val take=rdd.take(2)
  take.foreach(x=>println(x))
  val countByValues=rdd.countByValue()
  countByValues.foreach(x=>println("key "+x._1+"  "+"value "+x._2))
  val topelements=rdd.top(2)
  topelements.foreach(x=>println(x))


}
