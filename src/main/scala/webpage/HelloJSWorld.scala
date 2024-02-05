// scala-cli experimental:
//> using jvm 17
//> using scala 2
//> using dep org.scala-js:::scalajs-dom:2.8.0

// use sbt fastOptJS or sbt fullOptJS to create javascript

package webpage
import org.scalajs.dom
import org.scalajs.dom.{document, html}
import scala.scalajs.js.annotation.JSExportTopLevel

object HelloJSWorld {
  def main(args: Array[String]): Unit = {

    document.getElementById("title").innerHTML = "Scala.js"
    document.getElementById("content").innerHTML = "This is a tutorial on using Scala.js."
    appendParagraph(document.getElementById("content"), "This is a new paragraph.")
    drawToCanvas(document.getElementById("canvas").asInstanceOf[html.Canvas])
  }

  def appendParagraph(target: dom.Node, text: String): Unit = {
    val p = document.createElement("p")
    val textNode = document.createTextNode(text)
    p.appendChild(textNode)
    target.appendChild(p)
  }

  @JSExportTopLevel("doClickStuff")
  def doClickStuff(): Unit = {
    println("Button clicked.")
  }

  def drawToCanvas(canvas: html.Canvas): Unit = {
    // w/ an explicit type cast to CanvasRenderingContext2D
    val context = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    context.fillRect(100, 100, 200, 150)
  }
}
