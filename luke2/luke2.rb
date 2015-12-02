
ticker = []
IO.foreach("luke2.txt") {
	|line| ticker << line.to_f
}

bestProfit = 0.0
ticker.each_with_index { |price, index| 
	rest = ticker.slice(index, ticker.length)
	if bestProfit < (rest.max - price) then
		bestProfit = rest.max - price
	end
}
puts bestProfit


	

