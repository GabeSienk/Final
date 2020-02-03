import java.util.ArrayList;
import java.util.Scanner;

public class PlayerStats
	{
		 

		public static void RoundOne()

			{
				ArrayList<Player> players = new ArrayList<Player>();

				players.add(new Player("1) Pete Alonso", ""));
				players.add(new Player("2) Bo Bichette", ""));
				players.add(new Player("3) Fernando tatis Jr.", ""));
				players.add(new Player("4) Vladimir Guerrero Jr.", ""));

				for (Player p : players)
					{
						System.out.println(p.getName());
					}

			}

		public static void Round2()
			{

				ArrayList<Player> players = new ArrayList<Player>();
				players.add(new Player("1) Derek Jeter", ""));
				players.add(new Player("2) Ty Cobb", ""));
				players.add(new Player("3) Jackie Robinson", ""));
				players.add(new Player("4) Babe Ruth.", ""));

				for (Player x : players)
					{
						System.out.println(x.getName());
					}

			}

		public static void Round3()
			{

				ArrayList<Player> playersOne = new ArrayList<Player>();

				playersOne.add(new Player("1) German Marquez", "4) Rookie of The Year Award"));
				playersOne.add(new Player("2) Jacob DeGrom", "3) Golden Glove Award"));
				playersOne.add(new Player("3) Kris Bryant", "2) Silver Slugger Award"));
				playersOne.add(new Player("4) Zach Greinke", "1) Cy Young Award"));

				for (Player x : playersOne)
					{
						System.out.println(x.getName());

					}
			}

		public static void Round3rd()
			{
				ArrayList<Player> playersTwo = new ArrayList<Player>();
				
				playersTwo.add(new Player("1) German Marquez", "4) Rookie of The Year Award"));
				playersTwo.add(new Player("2) Jacob DeGrom", "3) Golden Glove Award"));
				playersTwo.add(new Player("3) Kris Bryant", "2) Silver Slugger Award"));
				playersTwo.add(new Player("4) Zach Greinke", "1) Cy Young Award"));

				for(int i = playersTwo.size()-1; i>=0; i--)
					{ 
						System.out.println(playersTwo.get(i).getAward());
					}

				
			}
	}
