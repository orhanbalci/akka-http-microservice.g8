import slick.jdbc.H2Profile.api._
import scala.concurrent.ExecutionContext.Implicits.global

object DbService {

  def db() = Database.forConfig("h2mem1")
  
} 
