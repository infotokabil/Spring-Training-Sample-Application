package designpattern;

public class BridgePattern {

	public static void main(String[] args) 
	{
		CitiBank citiBank=new CitiBank();
		ICICIBank iciciBank=new ICICIBank();
		
		NetBanking netBanking1=new NetBanking(iciciBank);
		NetBanking netBanking2=new NetBanking(citiBank);
		CardPayment cardPayment1=new CardPayment(iciciBank);
		CardPayment cardPayment2=new CardPayment(citiBank);
		
		netBanking1.MakePayment();
		netBanking2.MakePayment();
		cardPayment1.MakePayment();
		cardPayment2.MakePayment();
		

	}

}
abstract class Payment
{
	PaymentMethod paymentMethod;
	public Payment(PaymentMethod paymentMethod) 
	{
		this.paymentMethod=paymentMethod;
	}
	abstract void MakePayment();
}
class NetBanking extends Payment
{
	public NetBanking(PaymentMethod paymentMethod) 
	{
		super(paymentMethod);
	}

	@Override
	void MakePayment() 
	{
		paymentMethod.PaymentGateway("user","user@123");
	}
}
class CardPayment extends Payment
{
	public CardPayment(PaymentMethod paymentMethod) 
	{
		super(paymentMethod);
	}

	@Override
	void MakePayment() 
	{
		paymentMethod.PaymentGateway("1234567887654321",1234);
	}
}



interface PaymentMethod
{
	void PaymentGateway(String cardNo,int pin);
	void PaymentGateway(String username, String pass);
}
class CitiBank implements PaymentMethod
{
	@Override
	public void PaymentGateway(String username, String pass)
	{
		System.out.println("CitiBank gateway in NetBanking");
	}
	@Override
	public void PaymentGateway(String cardNo,int pin)
	{
		System.out.println("CitiBank gateway in CardPayment");		
	}
}
class ICICIBank implements PaymentMethod
{
	@Override
	public void PaymentGateway(String username, String pass)
	{
		System.out.println("CitiBank gateway in NetBanking");
	}
	@Override
	public void PaymentGateway(String cardNo,int pin)
	{
		System.out.println("CitiBank gateway in CardPayment");		
	}
}

