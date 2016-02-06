package optools

import scala.io.BufferedSource
import scala.util.Try

/** utils object to supply helper/service methods */
object utils {

  /** Method to check if file can be read
 *
   * @param filename name of the file to be read
   * @return returns the file object if successful
   */
  def tryFile(filename: String): Try[BufferedSource] = {
    Try(io.Source.fromFile(filename))
  }
}
