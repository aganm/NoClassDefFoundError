import java.awt.{EventQueue}

class Bar(val bar: Int) {
}

object Main {

  def main(args: Array[String]) {

    EventQueue.invokeLater(() => {
      val b = new Bar(20)
      println(b.bar)
    });

  }
}
