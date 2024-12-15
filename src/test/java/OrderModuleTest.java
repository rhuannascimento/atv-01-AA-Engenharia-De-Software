import org.example.service.deliveryModule.IfoodDeliveryFactory;
import org.example.service.orderModule.DeliveryOrder;
import org.example.service.orderModule.StoreOrder;
import org.example.service.paymentModule.PaymentMethod;
import org.example.service.paymentModule.PixPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderModuleTest {
    private StoreOrder storeOrder;
    private DeliveryOrder deliveryOrder;
    private PaymentMethod paymentMethod = new PixPayment();
    private IfoodDeliveryFactory deliveryFactory = new IfoodDeliveryFactory();

    @BeforeEach
    public void setup(){
        storeOrder = new StoreOrder(paymentMethod);
        deliveryOrder = new DeliveryOrder(paymentMethod, deliveryFactory);
    }

    @Test
    public void storeOrderFinishTest(){
        try {
            Assertions.assertEquals("Sucesso", storeOrder.finish());
        }catch (Exception e){}
    }

    @Test
    public void deliveryOrderFinishTest(){
        try {
            Assertions.assertEquals("Sucesso", deliveryOrder.finish());
        }catch (Exception e){}
    }

    @Test
    public void deliveryOrderCallDeliveryManTest(){
        try {
            Assertions.assertEquals("FOI ENCONTRADO UM ENTREGADOR DO IFOOD", deliveryOrder.initOrder());
        }catch (Exception e){}
    }
}
