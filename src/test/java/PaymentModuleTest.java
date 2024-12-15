import org.example.error.PaymentError;
import org.example.service.paymentModule.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentModuleTest {
    @Test
    public void pixPaymentTest()  {
        PaymentMethod pixPayment = new PixPayment();
        try {
            Assertions.assertTrue(pixPayment.pay(100));
        }catch (Exception e){
        }

    }
    @Test
    public void cashPaymentTest() {
        PaymentMethod cashPayment = new CashPayment();
        try {
            Assertions.assertTrue(cashPayment.pay(100));
        }catch (Exception e){
        }
    }
    @Test
    public void creditPaymentTest() {
        PaymentMethod creditPayment = new CreditPayment();
        try {
            Assertions.assertTrue(creditPayment.pay(100));
        }catch (Exception e){
        }
    }
    @Test
    public void debitPaymentTest() {
        PaymentMethod debitPayment = new DebitPayment();
        try {
            Assertions.assertTrue(debitPayment.pay(100));
        }catch (Exception e){
        }
    }
}
