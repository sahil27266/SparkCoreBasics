import org.apache.spark.sql._

object SQL extends App {

  val array:Array[String]=new Array[String](3)
  array(0)="sahil"
  array(1)="garg"
  array(2)="aggarwal"
//  for(i<-0 to 2)
//    println(array(i))
//  array(0)="hello"
//  for (i<- 0 to 2)
//    println(array(i))
//  array.update(0,"lol")
//  for (i<-0 to 2)
//    println(array(i))
  array.update(0,"my")
  array.update(1,"name")
  array.update(2,"is sahil")
//  for (i<-0 to 2)
//    println(array.apply(i))


//
 val list=List(1,2,3,4,5)
//  list.foreach(println)


//  val onetwo=List(1,2)
//  val threeFour=List(3,4)
//  val onetwothreefour=onetwo reverse_::: threeFour
// onetwothreefour.foreach(println)
// val onetowthreefourfive= 5::onetwothreefour
//  //onetowthreefourfive.foreach(println)
//
//  val fivesixseven=5::6::7::Nil
//  println(fivesixseven)




  //tuples----------------------


  val pair=("sahil",25)
  //println(pair)

 // println("the age of "+pair._1+" is "+pair._2)





  //sets and maps

  var set=Set("sahil","deepa","reena")
  set.foreach(println)
  set+="garg"
  //println(set.contains("garg"))

  import scala.collection.mutable.Set
  val set2=Set("abc","def","ghi")
  set2+="xyz"
  //set2.foreach(x=>println(x))


  //map
  val map:Map[String,String]=Map("sahil"->"garg","deepa"->"garg","reena"->"goyal")
 //map.foreach(x=>println(x._1))



  //recognising functional style


  //normal way of doing things
  def printArgs(args:Array[String]):Unit={
  var i=0;
    while(i<args.length)
      {
        println(args(i))
        i=i+1;
      }

  }
  //printArgs(array)

  //add a bit of functional style

  def printArgs2(args:Array[String]):Unit={
    //args.foreach(x=>println(x));
//    for (ar<-args)
//      println(ar)
  }
  printArgs2(array)




  def formatArgs(args:Array[String]):Unit={
    println(args.mkString)
  }
  formatArgs(array)


  val x="hello";println(x)


//string interpolation



}
