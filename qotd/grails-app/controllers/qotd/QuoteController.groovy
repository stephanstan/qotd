package qotd

class QuoteController {

	static scaffold = true

	def quoteService
		
//	static defaultAction = "index"
	
//    def index() {
//		redirect (action: list)
//	}
	
	def home(){
		render"<h1>Real Programmer do not eat Quiche</h1>"
	}
	
//	def random() {
//		def staticAuthor = "Anonymous"
//		def staticContent = "Real Programmers don't eat much quiche"
//		[ author: staticAuthor, content: staticContent]
		
//		def staticQuote = new Quote(author: "Anonymous",
//			content: "Real Programmers don't eat much Quiche")
//		[ quote : staticQuote]
//	}
	
//	def random(){
//		def allQuotes = Quote.list()
//		def randomQuote
//		if (allQuotes.size() > 0)
//		{
//			def randomIdx = new Random().nextInt(allQuotes.size())
//			randomQuote = allQuotes[randomIdx]
//		}
//		else
//		{
//			randomQuote = new Quote(author: "Anonymous",
//			content: "Real Programmers don't eat much Quiche")
//		}
//		[ quote : randomQuote]
//	}
//	
//	def current = {
//		
//		def allQuotes =  Quote.list()
//		[allQuotes : allQuotes]
		
	def random() {
        def randomQuote = quoteService.getRandomQuote()
        [quote: randomQuote]
    }
		
}
