package $package.db

import slick.jdbc.JdbcProfile
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.duration._

trait Profile {
	val profile : JdbcProfile

	import profile.backend.Database
	import profile.api._

	lazy val db = Database.forConfig("test01")
	def exec[T](action : DBIO[T]) = {
		Await.result(db.run(action), 2.seconds)
	}
}