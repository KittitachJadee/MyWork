import java.util.Scanner;

//Pangon La-or-on
//6409700074

public class GameClock {
	MiniClock clock1=new MiniClock();
	MiniClock clock2=new MiniClock();
	Scanner scan=new Scanner(System.in);
	public int choice;
	
	public void newGame() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Game of clock\nYour answer on clock/period always formatted as H:M");
		System.out.println("1. Given two clocks, find their difference");
		System.out.println("2. Given one clock and a period, find the time");
		System.out.println("3. Exit");
		System.out.print("Choose your choice: ");
		choice=scan.nextInt();
		while(choice!=1&&choice!=2&&choice!=3) {
			System.out.println("I don't understand your choice; select just 1-3");
			System.out.println("1. Given two clocks, find their difference");
			System.out.println("2. Given one clock and a period, find the time");
			System.out.println("3. Exit");
			System.out.print("Choose your choice: ");
			choice=scan.nextInt();
		}
	}
	
	public boolean playGame() {
		String answer;
		int i;
		if(choice==1) {
			if((clock1.getHour()*60)+clock1.getMinute()>(clock2.getHour()*60)+clock2.getMinute()) {
				System.out.printf("From Time %02d:%02d to %02d:%02d of next day:\n", 
				clock1.getHour(), clock1.getMinute() , clock2.getHour(), clock2.getMinute());
			}
			else {
				System.out.printf("From Time %02d:%02d to %02d:%02d:\n", 
				clock1.getHour(), clock1.getMinute() , clock2.getHour(), clock2.getMinute());
			}
			System.out.println("How many hour(s) and minute(s) passed by?");
			for(i=1; i<=3; i++) {
				System.out.print("Round " +i +"/3: ");
				answer=scan.nextLine();
				if(Checker.checkDifference(clock1, clock2, answer)==true)
					break;
			}
			return i>3? false: true;
		}

		else if(choice==2){
			System.out.printf("Time is %02d:%02d. In next %02d  hours, %02d minutes:\n",
			clock1.getHour(), clock1.getMinute(), clock2.getHour(), clock2.getMinute());
			System.out.println("What time will it be?");
			for(i=1; i<=3; i++) {
				System.out.print("Round " +i +"/3: ");
				answer=scan.nextLine();
				if(Checker.checkNextTime(clock1, clock2, answer)==true)
					break;
			}
			return i>3? false: true;
		}
		else
			return false;
	}
	
	public void gameController() {
		clock1.randomTime();
		clock2.randomTime();
		newGame();
		if(playGame()==true) {
			if(choice==1) {
				System.out.println("From " +clock1.toString() +" To " +String.format("%02d", clock2.getHour())
				+":" +String.format("%02d", clock2.getMinute()) +", difference = "
				+Checker.getDifference(clock1, clock2));
			}
			else {
				System.out.println("From " +clock1.toString() +" To " +Checker.getNextTime(clock1, clock2)
				+", difference = " +String.format("%02d", clock2.getHour()) +" hour(s) "
				+String.format("%02d", clock2.getMinute()) +" minute(s)");
			}
			System.out.println("Good Job!");
		}
		else {
			if(choice==1)
				System.out.println("The correct answer is "+Checker.getDifference(clock1, clock2));
			else if(choice==2)
				System.out.println("The correct answer is Clock: " +Checker.getNextTime(clock1, clock2));
			else
				System.out.print("Bye!");
		}
	}
}