import chapter3.List
import chapter4.*
import chapter4.Exercise_4_1.*
import chapter4.Exercise_4_1.None
import chapter4.Exercise_4_6.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestChapter4 extends AnyFlatSpec with Matchers:

  behavior of "Chapter 4"

  val list1: List[Int] = List(1, 2, 3)
  val list2: List[Int] = List(4, 5, 6)
  val list3: List[Int] = List(1, 2, 3, 4, 5, 6)

  it should "compute mean value of list correctly" in {
    Exercise_4_2.mean(Nil) shouldBe None
    Exercise_4_2.mean(Seq(1, 2, 3)) shouldBe Some(2)
  }

  it should "compute variance of list correctly" in {
    Exercise_4_2.variance(Nil) shouldBe None
    Exercise_4_2.mean(Seq(4, 5, 6)) shouldBe Some(5.0)
  }

  it should "map2 should work correctly" in {
    Exercise_4_3.map2(None, None)((a: Nothing, _: Nothing) => a) shouldBe None
    Exercise_4_3.map2(Some(list1), Some(list2))((a, b) => List.append(a, b)) shouldBe Some(List(1, 2, 3, 4, 5, 6))
  }

  it should "sequence elements correcly" in {
    Exercise_4_4.sequence(List(Some(1), Some(2), Some(3))) shouldBe Some(list1)
    Exercise_4_4.sequence(List(Some(1), Some(2), None)) shouldBe None
    Exercise_4_4.sequence(List()) shouldBe Some(List())
  }

  it should "traverse list correcly (Option)" in {
    Exercise_4_5.traverse(list1)(Some(_)) shouldBe Some(list1)
  }

  it should "traverse list correcly (Either)" in {
    Exercise_4_7.traverse[String, Int, String](list1)(a => if (a % 2 == 1) Right("odd") else Left("pair")) shouldBe Left(
      "pair"
    )
  }
