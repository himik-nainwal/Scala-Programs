class mini_cal() {
	var sum:Int=0
	var dif:Int=0
	var mul:Int=0
	var div:Float=0
	

	def calculation(x:Int,y:Int)  {
		println(" x -: "+ x +"\n y -: "+ y +"\n")
		sum=x+y  
		dif=x-y      
		mul=x*y   
		div=x/y    
	}
	def answer() {
		println("Sum = "+sum + "\nDifference = "+dif + "\nMultiplication = "+mul +"\nDivision 2= "+div)
		
	}
}
object calculator {
	def main( args: Array[String]) {
		var obj =new mini_cal()  

		obj.calculation(30,6)     
		obj.answer()

	}
}