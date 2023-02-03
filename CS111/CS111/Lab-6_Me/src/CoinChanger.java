import java.util.Arrays;

//Pangon La-or-on
//6409700074

public class CoinChanger {
	private Coin coin_1;
	private Coin coin_2;
	private Coin coin_3;
	private int value;

	public void setType(String aType) {
		coin_1=new Coin(aType);
	}
	public void setType(String bType, String cType) {
		coin_2=new Coin(bType);
		coin_3=new Coin(cType);
	}
	public void setValue(int value) {
		this.value=value;
	}
	public boolean isValidType() {
		if(coin_1.getType()!=Coin.COIN1&&coin_2.getType()!=Coin.COIN1&&coin_3.getType()!=Coin.COIN1)
			return false;
		if((coin_1.getType()!=Coin.COIN1&&
		    coin_1.getType()!=Coin.COIN5&&
		    coin_1.getType()!=Coin.COIN10&&
		    coin_1.getType()!=Coin.COIN25&&
		    coin_1.getType()!=Coin.COIN100)||
		   (coin_2.getType()!=Coin.COIN1&&
			coin_2.getType()!=Coin.COIN5&&
			coin_2.getType()!=Coin.COIN10&&
			coin_2.getType()!=Coin.COIN25&&
			coin_2.getType()!=Coin.COIN100)||
		   (coin_3.getType()!=Coin.COIN1&&
			coin_3.getType()!=Coin.COIN5&&
			coin_3.getType()!=Coin.COIN10&&
			coin_3.getType()!=Coin.COIN25&&
			coin_3.getType()!=Coin.COIN100))
			return false;
		if(coin_1.getType()==coin_2.getType())
			return false;
		else if(coin_1.getType()==coin_3.getType())
			return false;
		else if(coin_2.getType()==coin_3.getType())
			return false;
		
		return true;
	}
	public void changer(){
		if(value<=0)
			System.out.println("Wrong input!!!");
		else{
			System.out.println("Value : "+value);
			
			//sort coin
			int coin[] = new int[3];
			coin[0] = coin_1.getValue();
			coin[1] = coin_2.getValue();
			coin[2] = coin_3.getValue();	
			Arrays.sort(coin);
			
			//find number of coin
			int num_coin;			
			System.out.printf("Coin [%d, %d, %d]: ",coin[0], coin[1], coin[2]);
			for(int i=2;i>=0;i--){
				num_coin = value/coin[i];
				System.out.print(+num_coin+", ");
				value = value%coin[i];
			}
			System.out.println();
		}
	}
}
