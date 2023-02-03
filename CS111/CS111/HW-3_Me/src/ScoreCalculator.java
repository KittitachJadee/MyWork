import java.util.ArrayList;

//Pangon La-or-on
//6409700074

public class ScoreCalculator {
	private int[] scoreCounter;
	private ArrayList<StudentScore> scores = new ArrayList<StudentScore>();
	
	public ScoreCalculator(int maxScore) {
		scoreCounter = new int[maxScore + 1];
	}
	
	public void addScore(StudentScore sc) {
		scores.add(sc);
		scoreCounter[sc.getScore()]++;
	}
	
	public void printList() {
		System.out.println("-------- List of Student Scores ----------");
		for(StudentScore student: scores) {
			System.out.println(student.getId() +" : " +student.getScore());
		}
	}
	
	public void printStat() {
		System.out.println("\n" +"Score Report for " +scores.size() +" students");
		int indexOfMin = 0, indexOfMax = 0, i, j;
		if(scores.size() != 0) {
			for(i = 1; i<scores.size(); i++) {
				if(scores.get(i).getScore() < scores.get(indexOfMin).getScore()) {
					indexOfMin = i;
				}
			}
			for(j = 1; j<scores.size(); j++) {
				if(scores.get(j).getScore() > scores.get(indexOfMax).getScore()) {
					indexOfMax = j;
				}
			}
			System.out.println("Min score is " +scores.get(indexOfMin).getId() +" : " 
					+scores.get(indexOfMin).getScore() +" points");
					System.out.println("Max score is " +scores.get(indexOfMax).getId() +" : " 
							+scores.get(indexOfMax).getScore() +" points");
					double average, sum = 0.0;
					if(scores.isEmpty()) {
						average = 0.0;
					}
					else {
						for(StudentScore score: scores) {
							sum += score.getScore();
						}
						average = sum/scores.size();
					}
					System.out.printf("Average score is %.2f points\n", average);
					System.out.print("Score Distribution");
					for(i = 0; i < scoreCounter.length; i++) {
						if(scoreCounter[i] == 0) {
							continue;
						}
						else {
							System.out.print("\n" +i +": ");
							for(j = 0; j < scoreCounter[i]; System.out.print("*"), j++);
						}
					}
		}
	}
}