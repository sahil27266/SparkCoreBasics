import org.apache.spark.{SparkConf, SparkContext}

//this example shows how you ca read and write data from hdfs
object SparksHadoop extends App {
  val conf=new SparkConf()
    .setMaster("local[2]")
    .setAppName("spark hdfs")
  val sc=new SparkContext(conf)
  val rdd=sc.textFile("path to hdfs file")
  val words=rdd.flatMap(lines=>(lines.split(" ")))
  val count=words.map(x=>(x,1)).reduceByKey{case(x,y)=>x+y}
  count.saveAsTextFile("destination file location in hdfs")

}
