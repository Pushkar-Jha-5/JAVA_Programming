package guesserGame;

import java.util.Scanner;

class Guesser{
	int GuesserNum;
	public int GuessNum() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Guesser Guess the number : ");
		GuesserNum= scan.nextInt();
		return GuesserNum;
	}
}

class Player{
	int PlayerNum;
	public int GuessNum() {
		Scanner scan = new Scanner(System.in) ;
		PlayerNum= scan.nextInt();
		return PlayerNum;
	}
}

class Umpire{
	int GuesserNum1;
	int PlayerNum1;
	int PlayerNum2;
	int PlayerNum3;
	
	public void collectNumFromGuesser() {
		Guesser G=new Guesser();
		GuesserNum1=G.GuessNum();
	}
	
	public void collectNumFromPlayers() {
		Player P1 =new Player();
		System.out.println("Player1 guess the number : ");
		PlayerNum1=	P1.GuessNum();
		
		System.out.println("Player2 guess the number : ");
		Player P2 =new Player();
		PlayerNum2=	P2.GuessNum();
		
		System.out.println("Player3 guess the number : ");
		Player P3 =new Player();
		PlayerNum3=	P3.GuessNum();
		
	}
	
	void compare() {
		if(GuesserNum1==PlayerNum1) {
			if(GuesserNum1==PlayerNum2 && GuesserNum1==PlayerNum3 ) {
				System.out.println("All Players won the game");
			}
			
			else if(GuesserNum1==PlayerNum2 ) {
				System.out.println("Player1 and Player2 won the game");
			}
			
			else if(GuesserNum1==PlayerNum3 ) {
				System.out.println("Player1 and Player3 won the game");
			}
			
			else {
				System.out.println("Player 1 won the game");
			}
		}
		
		else if(GuesserNum1==PlayerNum2) {
			if(GuesserNum1==PlayerNum3) {
				System.out.println("Player2 and Player3 won the game");
			}
			
			else {
				System.out.println("Player 2 Won the game");
			}
		}
		
		else if(GuesserNum1==PlayerNum3) {
			System.out.println("Only Player 3 won the game");
		}
		
		else 
		{
			System.out.println("All Player Lost the game");
		}
		
	}
}

public class MyGuesserGame {

	public static void main(String[] args) {
		System.out.println("----Start The Game----");
		
		Umpire U = new Umpire();
		U.collectNumFromGuesser();
		U.collectNumFromPlayers();
		U.compare();
		
		System.out.println("-----GAME OVER-----");
	}

}
