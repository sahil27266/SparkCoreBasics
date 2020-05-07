import org.apache.spark.{SparkConf, SparkContext}

object Reduce extends App{
val conf=new SparkConf().setMaster("local[2]").setAppName("use of reduce")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List(1,2,3,4,5,6,7,8))
  val result=rdd.reduce((x,y)=>x+y)
  val result2=rdd.fold(1)((x,y)=>x+y)
  println(result)
  print(result2)
}
