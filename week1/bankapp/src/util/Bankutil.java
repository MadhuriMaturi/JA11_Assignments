package util;
import com.hdfc.service.BankImpTwo;
import com.hdfc.service.Ban;

public class Bankutil {
	public static Ban getBankObj()
	{
		return new BankImpTwo();
	}

}
