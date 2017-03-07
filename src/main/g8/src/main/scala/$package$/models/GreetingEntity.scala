package $package$.models
case class GreetingEntity(id: Int, greeting: String)

class Greetings(tag : Tag) extends Table[(Int, String)](tag, "GREETINGS"){
  def id = Column[Int]("id",O.PrimaryKey)
  def greeting = Column[String]("greeting")
  def * = id ~ greeting <> (GreetingEntity, GreetingEntity.unapply _)
}
