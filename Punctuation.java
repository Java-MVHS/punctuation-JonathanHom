/*
 * Name: Jonathan Hom
 * Date: 12/11/24
 * Period: 6
 * Project: This project gets text and checks for punctuation and gets
 * rid of words without punctuation
 */
/*
 * Pseudocode:
 * class header
 * no FV
 * default constructor
 * main
 * 	calls search it
 * search it
 * 	gets text, calls get punct
 * get punct
 * 	logic to isolate word and send to checkpunct
 * 	adds word to end string(printed) if has punct
 * 
 * check punct
 * 	checks for punct, sends back to getpunct
 * 
 * printwords
 * 	prints out the final text with only punct words
 * 
 */
public class Punctuation//class header
{
	public Punctuation() //default constructor
	{
		
	}
	public static void main(String [] args)
	{ //main header
		Punctuation p = new Punctuation(); //crate instance of class
		p.searchIt(); //use that to call search it
	}
	public void searchIt() //searchit to call methods
	{
		String text = new String("Blood, Sweat, and Tears by Winston Churchill " +"May 13, 1940" +"Mr. Speaker:" +"On Friday evening last I received His Majesty’s commission to form a new " +"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +
"I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +
"Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At theend of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the new Government." +
"Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
"We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory inspite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " +
"But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\" ");
		String newText = getPunctuationWords(text); //speech, and call get PUnctuationwords
		printWords(newText); //print without stuff wihtout pucntuation
	}
	
	public String getPunctuationWords(String text) //purpose is to isolate words and add ones with punct
	{//to string
		int count, count1=0;
		boolean punctuation = false;
		String printed = "";
		
			for (count = 1; count<text.length(); count++) //logic to find word, send to check punct, and add to string
			{
				if (text.charAt(count) == ' ')
				{
					punctuation = checkForPunctuation(text.substring(count1, count));
					if (punctuation == true)
					{
						printed += text.substring(count1, count);
						punctuation = false;
					}	
					count1 = count;
				}
			}
		

			//String temp = word;
			//text =text+text.substring(word.length(), text.length()+1);
		
			//addWordIn += word;
		
		return printed;
	} //return statement and end of method
	
	public boolean checkForPunctuation(String word) //used to check if word has punct
	{
		boolean lol = false;
		for (int i=0; i<word.length(); i++)
		{ //logic to check each character in the word given for punct.
			if (word.charAt(i) == ','|| word.charAt(i) == ';'|| word.charAt(i) == ':'|| word.charAt(i) == '!'|| word.charAt(i) == '?'|| word.charAt(i) == '\''|| word.charAt(i) == '\"'|| word.charAt(i) == '\'' ||word.charAt(i) == '('||word.charAt(i) == ')'||  word.charAt(i) == '-' || word.charAt(i) == '.')
			{
				lol = true;
			}
		}
		return lol;
		
	}
	public void printWords(String text)
	{ //prints the word
		System.out.println("\n\n\n");
		System.out.println(text);
		System.out.println("\n\n\n");
	}
	
}
