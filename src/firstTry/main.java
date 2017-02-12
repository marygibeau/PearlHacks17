package firstTry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public main() {
		Scanner s = new Scanner(System.in);
		String name;
		boolean boo = true;

		System.out.println("What's your name?");
		String next = s.nextLine();
		if (next.equals(null)) {
			throw new RuntimeException("Thats not a name???");
		} else {
			name = next;
		}

		while (boo == true) {
			System.out.println("Do you want a pick me up?");
			System.out.println("yes or no");

			String thing = s.nextLine();
			if (thing.equals("yes")) {

				System.out.println("Do you want a joke,  a compliment or a pick up line?");
				String buns = s.nextLine();
				if (buns.equalsIgnoreCase("joke") || buns.equalsIgnoreCase("a joke")) {
					System.out.println();
					System.out.println("Here's a joke for you:");
					System.out.println();
					int jnum = (int) (20.0 * Math.random()) + 1;
					Map<Integer, String> setup = new HashMap<Integer, String>();
					Map<Integer, String> punchline = new HashMap<Integer, String>();

					setup.put(1, "Hey " + name + ", how do trains hear?");
					punchline.put(1, "Through their engine ears!");
					setup.put(2, "Hey " + name + ", what goes oh, oh, oh?");
					punchline.put(2, "Santa walking backwards");
					setup.put(3, "Hey " + name + ", why did the dog chase its tail?");
					punchline.put(3, "To make ends meet");
					setup.put(4, "Hey " + name + ", what do you get if you cross the Atlantic on the Titanic?");
					punchline.put(4, "Wet.");
					setup.put(5, "Hey " + name + " what do you get if you cross a dog with a phone?");
					punchline.put(5, "A golden receiver");
					setup.put(6, "Hey " + name + ", what's a polygone?");
					punchline.put(6, "A dead parrot.");
					setup.put(7, "Hey " + name + ", what kind of coffee do cows drink after giving birth?");
					punchline.put(7, "de-calf-enated");
					setup.put(8, "Hey " + name + ", what kind of spider is most likely to kill their husband?");
					punchline.put(8, "a black widow");
					setup.put(9, "Hey " + name + ", what does a skunk do when it's angry?");
					punchline.put(9, "It raises a stink");
					setup.put(10, "Hey " + name + ", what do you call a duck that robs a bank?");
					punchline.put(10, "A safe quacker");
					setup.put(11, "Hey " + name + ", what did the cashier say to the register?");
					punchline.put(11, "I'm counting on you");
					setup.put(12, "Hey " + name + ", what does the sea say to the sand?");
					punchline.put(12, "Not much, it usually just waves");
					setup.put(13, "Hey " + name + ", what did the appendix say to the kidney?");
					punchline.put(13, "The doctor is taking me out tonight");
					setup.put(14, "Hey " + name + ", what do you get if you cross a germ with a comedian?");
					punchline.put(14, "A sick joke");
					setup.put(15, "Hey " + name + ", what do you get if you crossed an elephant with a computer?");
					punchline.put(15, "A big know-it-all");
					setup.put(16, "Hey " + name + ", why did the archaeologist go bankrupt?");
					punchline.put(16, "Because his career was in ruins");
					setup.put(17, "Hey " + name + ", why did the burglar take a shower?");
					punchline.put(17, "To make a clean get away");
					setup.put(18, "Hey " + name + ", why did the baker stop making doughnut?");
					punchline.put(18, "he got sick of the hole business");
					setup.put(19, "Hey " + name + ", why are false teeth like stars?");
					punchline.put(19, "They come out at night");
					setup.put(20, "Hey " + name + ", when is the vet busiest?");
					punchline.put(20, "When it's raining cats and dogs");

					System.out.println(setup.get(jnum));
					System.out.println(punchline.get(jnum));
					System.out.println();
				} else if (buns.equalsIgnoreCase("compliment") || buns.equalsIgnoreCase("a compliment")) {
					System.out.println();
					System.out.println("Here's a compliment for you:");
					System.out.println();
					int cnum = (int) (20.0 * Math.random()) + 1;

					Map<Integer, String> comp = new HashMap<Integer, String>();
					comp.put(1, name + ", you are the sharpest tool in the shed!");
					comp.put(2, "You rock " + name + " go get 'em champ!");
					comp.put(3, "You can conquer the world " + name);
					comp.put(4, name + "'s smile is so bright, it could light up the whole world");
					comp.put(5, "You're so kind " + name);
					comp.put(6, "I believe in you " + name);
					comp.put(7, name + ", you rock my socks!");
					comp.put(8, name + " you're the bee's knees!");
					comp.put(9, "You're one smart cookie " + name);
					comp.put(10, "I like your style " + name);
					comp.put(11, "You're the most perfect " + name + " there is!");
					comp.put(12, name + ", you is smart, you is kind, you is loyal");
					comp.put(13, name + " is all that and a super sized bag of chips");
					comp.put(14, "On a scale of one to ten, " + name + " is an eleven");
					comp.put(15, "That color is perfect on you, " + name);
					comp.put(16, "Hanging out with " + name + " is always a blast");
					comp.put(17, "*sniff sniff*" + name + " smells really good");
					comp.put(18, "You is wonderful " + name);
					comp.put(19, "You should be thanked more often! So thank you " + name);
					comp.put(20, name + " is a gift to those around them");

					System.out.println(comp.get(cnum));
					System.out.println();
				} else if (buns.equalsIgnoreCase("a pick up line") || buns.equalsIgnoreCase("a pick-up-line")
						|| buns.equalsIgnoreCase("pick up line") || buns.equalsIgnoreCase("pick-up-line")) {
					System.out.println();
					System.out.println("Here's a pick up line for you:");

					int pnum = (int) (20.0 * Math.random()) + 1;

					Map<Integer, String> pick = new HashMap<Integer, String>();
					pick.put(1, "Damn " + name
							+ ", can I have a picture you so I can tell Santa what I want for Christmas?");
					pick.put(2, "Daamn " + name + ", are you google because I think I've found what I'm searching for");
					pick.put(3,
							"Dayum " + name + ", can I tie your shoe because I can't have you fall for anyone else");
					pick.put(4, "So... do you have a name or can I just call you mine?");
					pick.put(5, "Hey " + name
							+ ", I'm learning about important dates in history, do you want to be one of them?");
					pick.put(6, "Hey " + name + ", your hand looks heavy, can I hold it?");
					pick.put(7, name + ", even if there wasn't any gravity on Earth, I would still fall for you");
					pick.put(8, name + ", I want our love to be like pi. Irrational and never ending.");
					pick.put(9,
							"Hey " + name + " I need some answers for my math homework. Quick, give me your number!");
					pick.put(10, "Hey " + name + ", you know what's on the menu? Me-n-you");
					pick.put(11, "Hey " + name + " did you know theres a big sale in my room? Clothes are 50% off");
					pick.put(12, "Hey " + name + " do you work with me? I've heard kissing burns 5 calories a minute");
					pick.put(13, "Hey " + name + ", can I barrow a kiss? I promise I'll give it back");
					pick.put(14, name + " if kisses were snowflakes, I'd send you a blizzard");
					pick.put(15,
							"Kissing is considered a language of love. " + name + ", want to start up a conversation?");
					pick.put(16, "Hey " + name
							+ " I'm writing a paper on the finer things in life and I was wondering if I could interview you");
					pick.put(17, name + ", I hope you know CPR because you take my breath away!");
					pick.put(18, "Hey " + name + ", do you have a map? I keep getting lost in your eyes");
					pick.put(19, name + ", are you a parking ticket because you've got FINE written all over you");
					pick.put(20, name + ", if I could rearrange the alphabet I'd put U and I together.");

					System.out.println();
					System.out.println(pick.get(pnum));
					System.out.println();

				} else if (buns.equalsIgnoreCase(null)) {
					System.out.println("You have to type something!");
				} else {
					System.out.println("That's not one of the options");
				}
			} else if (thing.equals("no")) {
				boo = false;
				System.out.println("Well, I hope you feel better!");
				System.out.println("Bye, have a nice day!");

			} else if (thing.equals(null)) {
				System.out.println("it's a simple question");
				System.out.println();
			} else {
				System.out.println("it's a yes or no question");
				System.out.println();
			}
		}
	}
}
