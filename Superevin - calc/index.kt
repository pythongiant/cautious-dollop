
//to Check if all numbers are even
fun matchCriteria(num:Long):Boolean{
    
    val a:String = num.toString()
	val number = mutableListOf<Int>()
	for (i in a)
 		{	
			number.add(i.toInt())
 		}	
	val CheckTrue=mutableListOf<Boolean>()
 	for (i in number)
 		{
	 		if (i%2==0)
 			{
 				CheckTrue.add(true)
	 		}
 			else
 			{		
 				CheckTrue.add(false)
 			}
 		}		
 	if (false in CheckTrue){
 		return false
 		 	}
 	else{
 		return true
 	}
}   
fun increment( num:Long):Long{
	var step:Long=0;
	var temp = num
	while (matchCriteria(temp)==false){
		step+=1
		temp+=1
	}
	return step
} 
fun decrement (num:Long):Long{
	var step:Long=0;
	var temp = num
	while (matchCriteria(temp)==false){
		step+=1
		temp-=1
	}
	return step	
}

fun main(args: Array<String>) {
   var number:Int = readLine()!!.toInt()
   val numbers = mutableListOf<Long>()

   for(i in 1..number){
   		var num:Long = readLine()!!.toLong()
   		numbers.add(num)
   }
   var i=1
   for (digit in numbers){
   		
   		if (increment(digit) < decrement(digit)){
   			println("Case #"+i+": "+increment(digit).toString() )
   		}
   		else{
   			println("Case #"+i+": "+decrement(digit).toString() )	
   		}
   		i+=1
   }
}