import chapter3.*
import chapter3.List.*
import chapter3.Tree.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestChapter3 extends AnyFlatSpec with Matchers:

  behavior of "Chapter 3"

  val list1: List[Int]          = List(1, 2, 3)
  val list1Double: List[Double] = List(1.0, 2.0, 3.0)
  val list2: List[Int]          = List(4, 5, 6)
  val list2Double: List[Double] = List(4.0, 5.0, 6.0)
  val list3: List[Int]          = List(1, 2, 3, 4, 5, 6)

  val tree1: Tree[Int] = Branch(Branch(Leaf(1), Leaf(2)), Branch(Leaf(3), Leaf(4)))

  it should "be equal to 3" in {
    Exercise_3_1.x shouldBe 3
  }

  it should "return List(2, 3)" in {
    Exercise_3_2.tail(list1) shouldBe List(2, 3)
  }

  it should "should set head to 4" in {
    Exercise_3_3.setHead(list1, 4) shouldBe List(4, 2, 3)
  }

  it should "drop the 2 first elements" in {
    Exercise_3_4.drop(list1, 2) shouldBe List(3)
  }

  it should "return empty list" in {
    Exercise_3_5.dropWhile(list1, (elem: Int) => elem.isValidInt) shouldBe List()
  }

  it should "return List(1, 2)" in {
    Exercise_3_6.init(list1) shouldBe List(1, 2)
  }

  it should "return 3 as length" in {
    Exercise_3_9.length(list1) shouldBe 3
  }

  it should "sum all elements of list1 and return 6" in {
    Exercise_3_10.foldLeft(list1, 0)((b: Int, a: Int) => a + b) shouldBe 6
  }

  it should "test exercise 3.11" in {
    Exercise_3_11.length(list1) shouldBe 3
    Exercise_3_11.sum(list1) shouldBe 6
    Exercise_3_11.product(list2Double) shouldBe 120.0
  }

  it should "reverse list" in {
    Exercise_3_12.reverse(list1) shouldBe List(3, 2, 1)
  }

  it should "melt my brain" in {
    Exercise_3_13.foldLeft(list1, 1)((b: Int, a: Int) => a + b) shouldBe 7
    Exercise_3_13.foldRight(list1, 4)((b: Int, a: Int) => a + b) shouldBe 10
  }

  it should "append 2 lists" in {
    Exercise_3_14.append(list1, list2) shouldBe list3
  }

  it should "concat lists" in {
    Exercise_3_15.concat(List(list1, list2)) shouldBe list3
  }

  it should "add 1 to each element" in {
    Exercise_3_16.add1(list1) shouldBe List(2, 3, 4)
  }

  it should "return list1 as list of strings" in {
    Exercise_3_17.doubleToString(list1Double) shouldBe List("1.0", "2.0", "3.0")
  }

  it should "add 2 to each memeber" in {
    Exercise_3_18.map(list1)(a => a + 2) shouldBe List(3, 4, 5)
  }

  it should "filter odd numbers" in {
    Exercise_3_19.filter(list1)(a => a % 2 == 1) shouldBe List(1, 3)
  }

  it should "flatmap that shit" in {
    Exercise_3_20.flatMap(list1)(a => List(a, a, a)) shouldBe List(1, 1, 1, 2, 2, 2, 3, 3, 3)
  }

  it should "filter pair numbers" in {
    Exercise_3_21.filter(list1)(a => a % 2 == 0) shouldBe List(2)
  }

  it should "add list1 to list2" in {
    Exercise_3_22.add(list1, list2) shouldBe List(5, 7, 9)
  }

  it should "multiply list1(i) by list2(i)" in {
    Exercise_3_23.zipWith(list1, list2)((a, b) => a * b) shouldBe List(4, 10, 18)
  }

  it should "work lol" in {
    Exercise_3_24.hasSubsequence(list1, list2) shouldBe false
    Exercise_3_24.hasSubsequence(List.Nil, List.Nil) shouldBe true
    Exercise_3_24.hasSubsequence(list1, List(1)) shouldBe true
    Exercise_3_24.hasSubsequence(list1, List(2, 3)) shouldBe true
  }

  it should "return 7 as size" in {
    Exercise_3_25.size(tree1) shouldBe 7
  }

  it should "return 4" in {
    Exercise_3_26.maximum(tree1) shouldBe 4
  }

  it should "return 2 as depth" in {
    Exercise_3_27.depth(tree1) shouldBe 2
  }

  it should "return the same tree" in {
    Exercise_3_28.map(tree1)(identity) shouldBe tree1
  }
