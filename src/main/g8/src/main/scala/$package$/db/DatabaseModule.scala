package $package$.db

import slick.jdbc.JdbcProfile


class DatabaseModule(val profile : JdbcProfile) extends Profile with GreetingModule {
	
}