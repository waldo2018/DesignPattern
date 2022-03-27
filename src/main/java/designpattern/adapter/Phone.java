package designpattern.adapter;

import designpattern.adapter.classapdapter.IVoltage5v;

public class Phone {
    public void charging(IVoltage5v iVoltage5v) {
        if(iVoltage5v.output5V() == 5) {
            System.out.println("iv was 5v ,charging success");
        } else {
            System.out.println("iv is not 5v, charging failure");
        }
    }
}
