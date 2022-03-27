package designpattern.adapter.classapdapter;

import designpattern.adapter.Phone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Adapter adapter = new Adapter();
        phone.charging(adapter);
    }
}
