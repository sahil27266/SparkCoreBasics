import org.apache.spark.{SparkConf, SparkContext}

object PairRdd extends App {
  val conf=new SparkConf().setMaster("local[2]").setAppName("rdd set operations")
  val sc=new SparkContext(conf)
  val simpleRdd=sc.textFile("abc.txt")
  val pairRdd=simpleRdd.map(lines=>(lines.split(" ")(0),lines))
  pairRdd.collect().foreach(x=>println(x._1+"----> "+x._2))


}
