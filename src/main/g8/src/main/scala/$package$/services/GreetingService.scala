package $package$.services

import $package$.db.DatabaseModule
import $package$.models.GreetingEntity

class GreetingService(db : DatabaseModule){
	def get(id : Long) = db.selectGreeting(id)
	def put(greeting : GreetingEntity) = db.insertGreeting(greeting)
	def get() = db.selectGreeting()
}