fun main(args : Array<String>){
	for (i in 1..10){
		for (j in i..i*10 step i){
			print("%4d".format(j))
		}
		println("")
	}
}