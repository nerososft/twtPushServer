import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * Created by nero on 16-7-4.
 */
public class TwtPushServer {
    public static void main(String[] args) {
        TwtMqtt mqtt = new TwtMqtt();
        mqtt.setBroker("tcp://121.42.157.180:61613");
        mqtt.setTopic("twtandroid1");
        mqtt.setUserName("admin");
        mqtt.setPassword("password");
        mqtt.setQos(1);
        mqtt.setClientId("twtandroid1");
        mqtt.setContent("hello");
        mqtt.init();
        mqtt.send();
    }
}
