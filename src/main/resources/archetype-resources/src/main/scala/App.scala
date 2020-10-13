package ${groupId}

import org.apache.spark.sql.SparkSession



object App{
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").getOrCreate()
    spark.sql("select 1 as id").show()
  }
}