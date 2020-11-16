package adapter.classapdapter;

import adapter.Phone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Adapter adapter = new Adapter();
        phone.charging(adapter);
    }
}
