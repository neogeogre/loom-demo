fun main() {
  println("start ...")

  loom(110)
  loom(100)
  loom(300)

  println("wait for threads execution ...")
  Thread.sleep(200)
  println("over")
}

private fun loom(sleep: Long) {
  Thread.startVirtualThread {
    Thread.sleep(sleep)
    println("thread over after $sleep ms")
  }
}
