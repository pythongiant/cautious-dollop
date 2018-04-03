/*
		//SI S2 N A B C D
		//x1 = ord(S1), x2 = ord(S2)

    	//xi = ( A * xi-1 + B * xi-2 + C ) modulo D.
    	//Si = char(97 + ( xi modulo 26 )),
    	//1
		//5
		//axpaj apxaj dnrbt pjxdn abd
		//a a 50 1 1 1 30
		

Output
 

1
5
axpaj apxaj dnrbt pjxdn abd
a a 50 1 1 1 30

		*/
fun main(args:Array<String>){
	var test_cases:Int = readLine()!!.toInt()
	
	for (i in 1..test_cases){
    	var num_words:Int = readLine()!!.toInt()	
    	var dict = mutableListOf<String>()
		var dictionary = readLine()!!.split(" ")
		var assets = readLine()!!.split(" ")
		dict.add(assets[0])
		dict.add(assets[1])
		println(dict)

	}
}