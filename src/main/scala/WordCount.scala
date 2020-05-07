import org.apache.spark.{SparkConf, SparkContext}

object WordCount extends App {
val conf=new SparkConf()
  .setMaster("local[2]")
  .setAppName("app")


  val sc=new SparkContext(conf)
  val file=sc.textFile("AFINN-111.txt")

  val words=file.flatMap(line=>line.split(""))
  val count=words.map(word=>(word,1)).reduceByKey{case(x,y)=>x+y }
  count.saveAsTextFile("outputfile123")

}
