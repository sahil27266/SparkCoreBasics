import org.apache.spark.sql.SparkSession

object SparkSql extends App{
  val spark=SparkSession.builder().appName("spark sql").master("local[2]").getOrCreate()
  val df=spark.read.json("/Users/widassahil/Downloads/people.json")
  df.printSchema()
 df.createOrReplaceTempView("people")
  val sqlDf=spark.sql("select * from people where age>20")
  sqlDf.show()






}
