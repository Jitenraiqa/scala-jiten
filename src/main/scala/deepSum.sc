def sum(list: List[Int]): Int = list match {
  case Nil => 0
  case head :: tail =>

    head + sum(tail)
}

println(sum(List(1,2,3,4)))


def deepsum(list: List[List[Int]]): Int = list match {
  case Nil => 0
  case head :: tail =>

    sum(head) + deepsum(tail)

}

println(deepsum(List(List(1,2), List(), List(), List(3), List(4,5))))




// without helper methods

def deepSum(xs: List[List[Int]]): Int = xs match {
  case List() => 0
  case (y :: yss) => y.head + deepSum(yss.tail)
  case ((y :: yss) :: xss) =>  (y :: yss).head + deepSum(xss.tail)
  case ((y :: yss) :: (x :: xss)) =>  (y :: yss).head + deepSum(x :: xss.tail)
  case _ => "out of scope"






}





println(deepsum(List(List(1,2), List(3,2), List(), List(3), List(4,5))))