package $package$.services

import $package$.db.DatabaseModule
import $package$.models.GreetingEntity

class GreetingService(db : DatabaseModule){
	def get(id : Long) : Option[GreetingEntity] = {return db.selectGreeting(id);}
	def put(greeting : GreetingEntity) = db.insertGreeting(greeting)
	def get() : Seq[GreetingEntity] = {return db.selectGreeting();}
}