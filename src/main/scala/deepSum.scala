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
