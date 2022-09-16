case class Point(var x: Int, var y: Int) {

    def +(a:Point) ={

        var obj= Point(this.x +a.x, this.y +a.y)
        obj
    }
    //move cordinates 
    def move(dx:Int, dy:Int):Unit = {
        this.x = this.x + dx
        this.y = this.y + dy     
    }
    //get distance between points
    def distance(a:Point):Double = {
        var distToX:Int = this.x -a.x
        var distToY:Int = this.y -a.y
        var dist: Int = distToX*distToX + distToY*distToY
        scala.math.sqrt(dist)
    }
    //cordinates swaping
    def invert():Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }
}

object point extends App {

    //create object point 
    var a = Point(1,2)
    var b = Point(4,6)

    println("Point a is: "+a)
    println("Point b is: "+b)
    
    var d=a+b
    println("Adding point a and point b: "+d)

    var r=2
    var s=2
    a.move(s,r)
    println("Moving point a from ("+r+","+s+") : "+a)
    
    var c =a.distance(b)
    println("Distance of a from b: "+c)

    a.invert()
    println("Invert of point a: "+a)
}