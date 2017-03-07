package $package$.models
import slick.jdbc.H2Profile.api._ 

case class GreetingEntity(id: Int, greeting: String)

class Greetings(tag : Tag) extends Table[(Int, String)](tag, "GREETINGS"){
  def id = column[Int]("id",O.PrimaryKey)
  def greeting = column[String]("greeting")
  def * = (id, greeting) <> (GreetingEntity.tupled, GreetingEntity.unapply)
}
