//Kanyanat Det-in
//6409618011
import java.util.Random;
public class Toaster {
	Slot slot1;
	Slot slot2;
	public Toaster() {
		slot1=new Slot();
		slot2=new Slot();
	}
	public void toast(Bread bread) {
		Random random=new Random();
		int i, j;
		for(i=1; i<5; i++) {
			System.out.println("Round " +i);
			for(j=0; j<10; j++) {
				if(random.nextInt()%2==1) {
					slot1.toast(bread);
					System.out.println("Slot 1 ,Status : " +bread.getState());
				}
				else {
					slot2.toast(bread);
					System.out.println("Slot 2 ,Status : " +bread.getState());
				}
			}
			System.out.println("Slot 1 age : " +slot1.getAge());
			System.out.println("Slot 2 age : " +slot2.getAge());
			if(slot1.getAge()<1 || slot2.getAge()<1) {
				if(slot1.getAge()<1)
					slot1=new Slot();
				if(slot2.getAge()<1)
					slot2=new Slot();
			}
		}
	}
}