package cc.blynk.server.core.model.widgets;

import cc.blynk.server.core.model.enums.PinMode;
import cc.blynk.server.core.model.enums.PinType;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 21.04.16.
 */
public abstract class NoPinWidget extends Widget {

    @Override
    public boolean updateIfSame(int deviceId, byte pin, PinType type, String values) {
        return false;
    }

    @Override
    public void updateIfSame(Widget widget) {
        //do nothing
    }

    @Override
    public boolean isSame(int deviceId, byte pin, PinType type) {
        return false;
    }

    @Override
    public PinMode getModeType() {
        return null;
    }
}
