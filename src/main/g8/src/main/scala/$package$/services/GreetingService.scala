import $package$.db.DatabaseModule

class GreetingService(db : DatabaseModule){
	def get(id : Long) = db.selectGreeting(id)
	def put(greeting : Greeting) = db.insertGreeting(greeting)
	def get() = db.get()
}