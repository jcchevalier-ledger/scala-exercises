import chapter2.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.*

class TestChapter2 extends AnyFlatSpec with Matchers:

  behavior of "Chapter2"

  it should "be equal to 8" in {
    Exercise_2_1.fibonnaci(5) shouldBe 8
  }

  it should "be sorted" in {
    Exercise_2_2.isSorted(Array(1, 2, 3, 5, 7), (n1: Int, n2: Int) => n1 < n2) shouldBe true
  }

  it should "not be sorted" in {
    Exercise_2_2.isSorted(Array(1, 2, 1, 7, 5), (n1: Int, n2: Int) => n1 < n2) shouldBe false
  }

  it should "return 28 as a string" in {
    val composed = Exercise_2_5.compose((a: Int) => a.toString, (b: Int) => b + 10)
    composed(18) shouldBe "28"
  }
