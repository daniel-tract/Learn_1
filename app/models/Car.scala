package models


//import play.api.slick.Config.driver.simple._

/**
 * Created by Daniel on 9/18/2014.
 */
case class Car (license: String, color: String)



//class CarsTable(tag: Tag) extends Table[Car](tag, "CAR") {

  //def license = column[String]("license", O.PrimaryKey)
  //def color = column[String]("color", O.NotNull)

  //def * = (license, color) <> (Car.tupled, Car.unapply _)
//}

