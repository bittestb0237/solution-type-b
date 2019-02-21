package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	private int amount;
	
	public Money(int amount) {
		
		this.amount = amount;
		
	}

	public Money add(Money money) {
		
		Money temp = new Money(this.amount);
		
		temp.amount = this.amount + getAmount(money);
		
		return temp;
	}

	public Money minus(Money money) {
		
		Money temp = new Money(this.amount);
		
		temp.amount = this.amount - getAmount(money);
		
		return temp;
	}

	public Money multiply(Money money) {
		
		Money temp = new Money(this.amount);
		
		temp.amount = this.amount * getAmount(money);
		
		return temp;
	}

	public Money devide(Money money) {
		
		Money temp = new Money(this.amount);
		
		temp.amount = this.amount / getAmount(money);
		
		return temp;
	}
	
	public int getAmount(Money money) {
		
		return money.amount;
		
	}
	
	
	
	
	@Override
	public boolean equals(Object object) {
		
		if (object==null) {
			return false;
		}
		
		if (this == object) {
			return true;
		}
		
		if (object instanceof Money) {
			Money temp = (Money) object;
			if(this.amount==temp.amount) {
				return true;
			}
		}
		return false;
	}
}