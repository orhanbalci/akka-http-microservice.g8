package $package$.db

import $package$.models.GreetingEntity

trait GreetingModule {
	self : Profile => 
	import profile.api._

	class GreetingTable(tag : Tag) extends Table[GreetingEntity](tag, "GREETINGS"){
	  def id = column[Long]("id",O.PrimaryKey)
	  def greeting = column[String]("greeting")
	  def * = (greeting, id) <> (GreetingEntity.tupled, GreetingEntity.unapply)
	}

	val greetings = TableQuery[GreetingTable]

	def createGreetingSchema = exec(greetings.schema.create)
	def insertGreeting(greeting : GreetingEntity)  = exec(greetings += greeting)
	def insertGreetings(greeting : Seq[GreetingEntity]) = exec(this.greetings ++= greeting)
	def selectGreeting(id : Long) = exec(greetings.filter(_.id === id).take(1).result.headOption)
	def selectGreeting() = exec(greetings.result)

}