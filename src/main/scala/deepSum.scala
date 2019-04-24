def sum(list: List[Int]): Int = list match {
  case Nil => 0
  case head :: tail =>
    head + sum(tail)
}

assert(sum(List(1,2,3,4)) == 10)


def deepsum(list: List[List[Int]]): Int = list match {
  case Nil => 0
  case head :: tail =>
    sum(head) + deepsum(tail)
}

assert(deepsum(List(List(1,2), List(), List(), List(3), List(4,5))) == 10)
