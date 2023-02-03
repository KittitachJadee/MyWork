//Kanyanat Det-in
//6409618011
import java.util.ArrayList;
public class ScoreCalculator {
	private ArrayList<StudentScore> scores=new ArrayList<StudentScore>();
	private int[] scoreCounter;
	public ScoreCalculator(int maxScore) {
		scoreCounter=new int[++maxScore];
	}
	public void addScore(StudentScore sc) {
		int indexOfScore=sc.getScore();
		scoreCounter[indexOfScore]++;
		scores.add(sc);
	}
	public void printList() {
		System.out.println("-------- List of Student Scores ----------");
		for(int i=0; i<scores.size(); i++) {
			StudentScore member=(StudentScore) scores.get(i);
			System.out.printf("%s : %d\n", member.getId(), member.getScore());
		}
	}
	public void printStat() {
		int i, j, min=0, max=0;
		double sum=0.0;
		System.out.println();
		System.out.printf("Score Report for %d stidents\n", scores.size());
		for(i=1; i<scores.size(); i++) {
			if(scores.get(min).getScore()>scores.get(i).getScore())
				min = i;
			if(scores.get(max).getScore()<scores.get(i).getScore())
				max=i;
		}
		for(i=0; i<scores.size(); i++) {
			StudentScore member=scores.get(i);
			sum+=member.getScore();
		}
		System.out.printf("Min score is %s : %d points\n", scores.get(min).getId(), scores.get(min).getScore());
		System.out.printf("Max score is %s : %d points\n", scores.get(max).getId(), scores.get(max).getScore());
		System.out.printf("Average score is %.2f points\n", sum/scores.size());
		System.out.println("Score Distribution");
		for(i=0; i<scoreCounter.length; i++) {
			if(scoreCounter[i]!=0) {
				System.out.print(i+": ");
				for(j=0; j<scoreCounter[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}