import slick.jdbc.H2Profile.api._
import scala.concurrent.executioncontext.Implicits.global

object DbService {

  def db() = Database.forConfig("h2mem1")
  
} 
