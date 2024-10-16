package quiz;

import java.util.*;
public class QuizApplication {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String firstName,lastName;
		int choice;
		
		System.out.println("Welcome to the Quiz Application!!!!");
		
		System.out.println("Please Enter Your First Name:");
		firstName = sc.nextLine();
		
		System.out.println("Please Enter Your Last Name:");
		lastName = sc.nextLine();
		
		System.out.println("Please select the Subject you want to Quiz yourself in :) ");
		
		System.out.println("1.Bollywood Madness");
		System.out.println("2.Western Pop And Culture");
		System.out.println("3.Mysteries");
		System.out.println("4.Science and Technology");
		System.out.println("5.Sports");
		
		choice = sc.nextInt();

		switch(choice) {
		case 1 :System.out.println("Bollywood Madness");
		        System.out.println("Here are the 10 questions for you");
				System.out.println("All the best");
				Bollywood_Madness obj = new Bollywood_Madness();
				obj.QUESTION();
				obj.display();
				break;

		case 2 :System.out.println("Western Pop And Culture");
        		System.out.println("Here are the 10 questions for you");
        		System.out.println("All the best");
        		Western_Pop_And_Culture obj1 = new Western_Pop_And_Culture();
        		obj1.questions();
				obj1.display();
        		break;
		case 3 :System.out.println("Mysteries");
				System.out.println("Here are the 10 questions for you");
				System.out.println("All the best");
				Mysteries obj2 = new Mysteries();
				obj2.qUeStIon();
				obj2.display();
				break;	
				
		case 4 :System.out.println("Science and Technology");
				System.out.println("Here are the 10 questions for you");
				System.out.println("All the best");
				Science_and_Technology obj3 = new Science_and_Technology();
				obj3.QuesTion();
				obj3.display();
				break;	
		
		case 5 :System.out.println("Sports");
				System.out.println("Here are the 10 questions for you");
				System.out.println("All the best");
				Sports obj4 = new Sports();
				obj4.quesTION();
				obj4.display();
				break;
				
		default :System.out.println("Invalid Choice :(");		

		}

	}

}

class Western_Pop_And_Culture{
	
	Scanner sc =new Scanner(System.in);
	
	int count=0;
	int ans;
	void questions() 
	{
		askQuestion(
			 " Which pop star is known for hits like 'Love Story' and 'Mr Perfectly Fine'?",
			 new String[]{"Sabrina Carpenter", "Taylor Swift", "Lana Del Rey", "Gracie Abrams"},
			 2 
		 );
		
		askQuestion(
			"Which fashion event is known for raising the money for the Costume Institute of the Metropolitan Museum of Art?",
			 new String[]{"Milan Fashion Week", "London Fashion Week", "Met Gala", "São Paulo Fashion Week"},
			 3
		 );
		
		askQuestion(
			"What was the name of the Royal couple of England which got married in 2018 ?",
			 new String[]{"Prince Harry and Meghan Markle", "Prince Andrew and Sarah Ferguson", "Prince Edward and Sophie", "James Arness and Amanda Blake"},
			 1
		 );
		
		askQuestion(
			"Which show is known for having a Down Syndrome Doctor as it's main lead",
			 new String[]{"Greys Anatomy", "Hospital Central", "The Good Doctor", "Scrubs"},
			 3
		 );
		
		askQuestion(
			" What is the name of the annual music festival held in California, known for its lineup of popular music artists?",
			 new String[]{"Coachella", "Lollapalooza", "Glastonbury", "Bonnaroo"},
			 1
		 );	
		
		askQuestion(
			"Which artist won the most Grammys in 2023?",
			 new String[]{"Taylor Swift", "Lady Gaga", "Olivia Rodrigo", "Beyoncé"},
			 4
		 );	
		
		askQuestion(
			"Which is the most famous South Korean Band?",
			 new String[]{"Blackpink", "BTS", "EXO", "Twice"},
			 2
		 );
		
		askQuestion(
			"What is the name of the movie which Disney is going to release in November which is the sequel of one of it's own production",
			 new String[]{"Mufasa", "Frozen 3", "Maona 2", "Toy Story 5"},
			 3
		 );
		
		askQuestion(
			"The book it 'Ends With Us' which was recently got it's movie relaese was written by?",
			 new String[]{"Slyvia Plath", "Colleen Hover", "J. K. Rowling", "Jane Austen"},
			 2
		 );
		
		askQuestion(
			"Which 2020 Netflix show became famous for its chess-related storyline?",
			 new String[]{"The Queen's Gambit", "Bridgerton", "Stranger Things", "You"},
			 1
		 );
		
		
		
	}
	 void askQuestion(String question, String[] options, int correctAnswerIndex) {

		System.out.println(question);
		for(int i =0;i<options.length;i++) {
			 System.out.println((i + 1) + ". " + options[i]);
		}
		
		System.out.println("Enter Your Answer");
		ans = sc.nextInt();
		
		if(ans == correctAnswerIndex) {
			System.out.println("That's Correct :) ");
			count = count +1;
		}
		else {
			System.out.println(" Wrong Answer :( ");
		}	
		System.out.println("Your score is:"+count);
		
	}
	 void display() {
	 System.out.println("Hurray!!! Quiz Completed!!!");
	 }
}


class Bollywood_Madness  {
Scanner sc =new Scanner(System.in);
	
	int count=0;
	int ans;
	void QUESTION() 
	{
		AskQUESTION(
			 "Which was the first ever movie in which Salman Khan starred in?",
			 new String[]{"Meine Pyaar Kiya", "Biwi Ho Toh Aisi", "Sajan", "Sanam Bewafa"},
			 2 
		 );
		
		AskQUESTION(
			"Which Bollywood Celebrity has never hosted the show Big Boss?",
			 new String[]{"Salman Khan", "Arshad Warsi", "Amir Khan", "Shilpa Shetty"},
			 3
		 );
		
		AskQUESTION(
			"Among the movies given below 'Hum Aapke Hai Koun' is a remake of?",
			 new String[]{"Naidya Ke Paar", "Massom", "Ram Teri Ganga Maili", "Ghar Ghar Ki Kahani "},
			 1
		 );
		
		AskQUESTION(
			"In which movie Ranveer Singh and Deepika Padukone did not appaer together as the main leads?",
			 new String[]{"Bajirao Mastani", "Padmavat", "Tamasha", "Ram-Leela"},
			 3
		 );
		
		AskQUESTION(
			"Which Bollywood Actress had been cast in the show named 'Quantico' as her Hollywood Debut?",
			 new String[]{"Priyanka Chopra", "Deepika Padukone", "Aishwarya Rai Bachchan", "Alia Bhatt"},
			 1
		 );	
		
		AskQUESTION(
			"In the movie 'Jab We Met' what is the name of the station where they missed the train?",
			 new String[]{"Kalka-Shimla Railway Station", "Patiala Railway Sation", "Chandigarh Railway Sation", "Ratlam Railway Station"},
			 4
		 );	
		
		AskQUESTION(
			"What was the name of the Engineering College in the movie 'Chhichhore' ?",
			 new String[]{"The Indian Institute of Technology, Khadakpur", "The Indian Institute of Technology, Bombay", "The Indian Institute of Technology, Madras", "The Indian Institute of Technology, Delhi"},
			 2
		 );
		
		AskQUESTION(
			"Among the Actors with whom Kiara Advani has not yet worked with?",
			 new String[]{"Akshay Kumar", "Sidhhart Malhotra", "Shah Rukh Khan", "Vicky Kaushal"},
			 3
		 );
		
		AskQUESTION(
			"Which movie which has been sent for Oscars 2024?",
			 new String[]{"Srikanth", "Lapata Ladies", "Maidaan", "Shaitaan"},
			 2
		 );
		
		AskQUESTION(
			"Which Bollywood film features the iconic song 'Chaiyya Chaiyya'?",
			 new String[]{"Dil Se", "Bazigar", "Darr", "Yess Boss"},
			 1
		 );
		
		
		
	}
	 void AskQUESTION(String Question, String[] Options, int correctAnswerIndex) {
		// TODO Auto-generated method stub
		System.out.println(Question);
		for(int i =0;i<Options.length;i++) {
			 System.out.println((i + 1) + ". " + Options[i]);
		}
		
		System.out.println("Enter Your Answer");
		ans = sc.nextInt();
		
		if(ans == correctAnswerIndex) {
			System.out.println("That's Correct :) ");
			count = count +1;
		}
		else {
			System.out.println(" Wrong Answer :( ");
		}	
		System.out.println("Your score is:"+count);

	}
	 void display() {
		 System.out.println("Hurray!!! Quiz Completed!!!");
		 }
}

class Mysteries{
Scanner sc =new Scanner(System.in);
	
	int count=0;
	int ans;
	void qUeStIon() 
	{
		ASKquestions(
			 "Who was respnsible for the 'Burari Death' incident",
			 new String[]{"The daughther", "The youngest son", "The eldest son", "The younest son's wife"},
			 2 
		 );
		
		ASKquestions(
			"Which flight disappeared in the 2014 with all of the passengers?",
			 new String[]{"Qatar Airways", "British Airways", "Malaysia Airlines", "Akasa Air"},
			 3
		 );
		
		ASKquestions(
			"Which Indian city is known for the mysterious phenomenon of 'The Malabar Caves' where several people have reported seeing ghosts?",
			 new String[]{"Kolkata", "Mumbai", "Delhi", "Rajasthan"},
			 1
		 );
		
		ASKquestions(
			"The 'Bhopal Gas Tragedy' in 1984, which led to thousands of deaths, was caused by a leak from which chemical plant?",
			 new String[]{"BASF", "Dow Chemical", "Union Carbide", "DuPont"},
			 3
		 );
		
		ASKquestions(
			"Which Indian monument is believed to be haunted, with many visitors and guides reporting strange occurrences and ghost sightings?",
			 new String[]{"Taj Mahal", "Qutub Minar", "Hawa Mahal", "Red Fort"},
			 1
		 );	
		
		ASKquestions(
			"What type of crime was the Hollywood movie 'Zodiac' based on?",
			 new String[]{"Bulgary", "Cybercrime", "Rape", "Murder"},
			 4
		 );	
		
		ASKquestions(
			"Where was the terrorist attack that took place on 26/11 in India? ",
			 new String[]{"Khadakpur", "Mumbai", "Madras", "Delhi"},
			 2
		 );
		
		ASKquestions(
			"Which Indian Freedom Fighter went missing mysterioulys in 1931?",
			 new String[]{"Sardar Vallabhbhai Patel", "Bhagat Singh", "Subhash Chandra Bose", "Mahatma Gandhi"},
			 3
		 );
		
		ASKquestions(
			"What calamity led to thousands of deaths in Kedarnath in 2013?",
			 new String[]{"Tsunami", "Flood", "Volcanic Eruption", "Earthquake"},
			 2
		 );
		
		ASKquestions(
			"The Bermuda Triangle of India is often referred to in connection with which mysterious area where several ships and planes have reportedly vanished?",
			 new String[]{"The Nicobar Islands", "The Devil's Triangle", "The Bay of Bengal", "The Sunderbans"},
			 1
		 );
		
		
		
	}
	
	void ASKquestions(String qUeStIon, String[] Options, int correctAnswerIndex) {
		
		System.out.println(qUeStIon);
		for(int i =0;i<Options.length;i++) {
			 System.out.println((i + 1) + ". " + Options[i]);
		}
		
		System.out.println("Enter Your Answer");
		ans = sc.nextInt();
		
		if(ans == correctAnswerIndex) {
			System.out.println("That's Correct :) ");
			count = count +1;
		}
		else {
			System.out.println(" Wrong Answer :( ");
		}	
		System.out.println("Your score is:"+count);

	}
	 void display() {
		 System.out.println("Hurray!!! Quiz Completed!!!");
		 }
}	

class Science_and_Technology{
Scanner sc =new Scanner(System.in);
	
	int count=0;
	int ans;
	void QuesTion() 
	{
		AskQUESTION(
			 "What is the name of the first artificial satellite launched into space by the Soviet Union in 1957?",
			 new String[]{"Voyager", "Sputnik", "Apollo", "Hubble"},
			 2 
		 );
		
		AskQUESTION(
			"Who is known as the father of modern physics for his theories on relativity?",
			 new String[]{" Niels Bohr", " Albert Einstein", "Isaac Newton", "Galileo Galilei"},
			 3
		 );
		
		AskQUESTION(
			"What is the chemical symbol for gold?",
			 new String[]{"Au", "Ag", "Pb", "Fe"},
			 1
		 );
		
		AskQUESTION(
			"What type of energy is produced by splitting atoms in a nuclear reactor?",
			 new String[]{"Solar Energy", "Chemical Energy", "Nuclear Energy", " Thermal Energy"},
			 3
		 );
		
		AskQUESTION(
			"Which smartphone company was the first to introduce facial recognition technology?",
			 new String[]{"Apple", "Samsung", "Huawei", "Google"},
			 1
		 );	
		
		AskQUESTION(
			"What does the acronym AI stand for in the field of technology?",
			 new String[]{"Automated Intelligence", "Advanced Integration", "Analytical Information", "Artificial Intelligence"},
			 4
		 );	
		
		AskQUESTION(
			"Which medical technology uses high-frequency sound waves to create images of the inside of the body?",
			 new String[]{"MRI", "Ultrasound", "CT Scan", "X-ray"},
			 2
		 );
		
		AskQUESTION(
			"Which space agency launched the Hubble Space Telescope?",
			 new String[]{"ISRO", "ESA", "NASA", "CNSA"},
			 3
		 );
		
		AskQUESTION(
			"What is the most widely used programming language as of 2024?",
			 new String[]{"Java", "Phyton", "C++", "JavaScript"},
			 2
		 );
		
		AskQUESTION(
			" In genetics, what does DNA stand for?",
			 new String[]{"Deoxyribonucleic Acid", "Deoxyribonitric Acid", "Dioxyribonucleic Acid", "Dideoxyribonucleic Acid"},
			 1
		 );
		
		
		
	}
	 void AskQUESTION(String Question, String[] Options, int correctAnswerIndex) {
	
		System.out.println(Question);
		for(int i =0;i<Options.length;i++) {
			 System.out.println((i + 1) + ". " + Options[i]);
		}
		
		System.out.println("Enter Your Answer");
		ans = sc.nextInt();
		
		if(ans == correctAnswerIndex) {
			System.out.println("That's Correct :) ");
			count = count +1;
		}
		else {
			System.out.println(" Wrong Answer :( ");
		}	
		System.out.println("Your score is:"+count);

	}
	 void display() {
		 System.out.println("Hurray!!! Quiz Completed!!!");
		 }
}

class Sports{
Scanner sc =new Scanner(System.in);
	
	int count=0;
	int ans;
	void quesTION() 
	{
		AskQUESTION(
			 "Which Indian Player was not included in the team of ICC T20 World Cup 2024?",
			 new String[]{"Kuldeep Yadav", "Aavesh Khan", "Axar Patel", "Shivam Dube"},
			 2 
		 );
		
		AskQUESTION(
			"Which country won the 2022 FIFA World Cup in Qatar?",
			 new String[]{"France", "Brazil", "Argentina", "Germany"},
			 3
		 );
		
		AskQUESTION(
			"Which cricketer became the fastest to reach 10,000 runs in T20 cricket in 2023?",
			 new String[]{"Virat Kohli", "Rohit Sharma", "Suryakumar Yadav", "Ravindra Jadeja"},
			 1
		 );
		
		AskQUESTION(
			"What is the name of the person who won the Silver medal in mixed 10m Air Pistol event at the 2024 Paris Olympics",
			 new String[]{"Manu Bhaker", "Sarabjot Singh", "Yusuf Dikec", "Vincent Hancock"},
			 3
		 );
		
		AskQUESTION(
			"Who won the 2024 chess world championship?",
			 new String[]{"Gukesh Dommaraju ", "Abhijeet Gupta", "Rameshbabu Praggnanandhaa", "Viswanathan Anand "},
			 1
		 );	
		
		AskQUESTION(
			"Which football player said the word word 'SUUIII' for the first time and is now popular in toady's kids?",
			 new String[]{"Roger Federer", "LeBron James", "Lionel Messi", "Cristiano Ronaldo"},
			 4
		 );	
		
		AskQUESTION(
			"In which year did Sania Nehwal won the Bronze medal in London Olmypics",
			 new String[]{"2007", "2012", "2015", "2010"},
			 2
		 );
		
		AskQUESTION(
			"What is the highest individual score ever achieved in a Test cricket match?",
			 new String[]{"365", "375", "400", "380"},
			 3
		 );
		
		AskQUESTION(
			"Which Indian Bowler scored 35 runs in a single over during the test match against England?",
			 new String[]{"Mohd Siraj", "Jasprit Bumrah", "Axar Patel", "Ashwin"},
			 2
		 );
		
		AskQUESTION(
			"What is the name of the wrestler whose biography inspired the film 'Dangal'?",
			 new String[]{"Geeta Phogat", " Sushil Kumar", "Yogeshwar Dutt", "Vinesh Phogat"},
			 1
		 );
		
		
		
	}
	 void AskQUESTION(String Question, String[] Options, int correctAnswerIndex) {
		// TODO Auto-generated method stub
		System.out.println(Question);
		for(int i =0;i<Options.length;i++) {
			 System.out.println((i + 1) + ". " + Options[i]);
		}
		
		System.out.println("Enter Your Answer");
		ans = sc.nextInt();
		
		if(ans == correctAnswerIndex) {
			System.out.println("That's Correct :) ");
			count = count +1;
		}
		else {
			System.out.println(" Wrong Answer :(*5"
					+ ""
					+ ""
					+ ""
					+ " ");
		}	
		System.out.println("Your score is:"+count);

	}
	 void display() {
		 System.out.println("Hurray!!! Quiz Completed!!!");
		 }
}





