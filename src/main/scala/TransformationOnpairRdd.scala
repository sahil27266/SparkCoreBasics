import org.apache.spark.{SparkConf, SparkContext}

object TransformationOnpairRdd extends App{
  val conf=new SparkConf()
    .setMaster("local[2]")
    .setAppName("rdd_set_operations")
  val sc=new SparkContext(conf)
  val rdd=sc.parallelize(List((1,2),(3,4),(3,6)))
  val pairRdd=rdd.reduceByKey{case (x,y)=>x+y}
  pairRdd.collect().foreach(x=>println(x._1+"->"+x._2))
  val groupbykey=rdd.groupByKey()
  val changedValues=rdd.mapValues(x=>x+1)
  changedValues.foreach(x=>println(x._1+"   "+x._2))
  val flatenedvalues=rdd.flatMapValues(x=>(x to 5))
  flatenedvalues.foreach(x=>println(x._1+" "+x._2))
  rdd.keys.collect().foreach(x=>println(x))
  rdd.values.collect().foreach(x=>println(x))
  rdd.sortByKey(false).collect().foreach(x=>println(x._1+" "+x._2))
}
