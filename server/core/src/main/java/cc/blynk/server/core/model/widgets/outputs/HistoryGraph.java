package cc.blynk.server.core.model.widgets.outputs;

import cc.blynk.server.core.model.enums.PinMode;
import cc.blynk.server.core.model.enums.PinType;
import cc.blynk.server.core.model.widgets.MultiPinWidget;
import cc.blynk.server.core.model.widgets.Widget;
import cc.blynk.server.core.model.widgets.outputs.graph.GraphPeriod;
import io.netty.channel.Channel;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 12.08.15.
 */
public class HistoryGraph extends MultiPinWidget {

    public GraphPeriod period;

    public int max;

    public int min;

    public boolean autoYCoords;

    public boolean showLegends;

    @Override
    public boolean isSame(int deviceId, byte pinIn, PinType pinType) {
        return false;
    }

    @Override
    public boolean isSplitMode() {
        return false;
    }

    @Override
    public boolean updateIfSame(int deviceId, byte pin, PinType type, String value) {
        return false;
    }

    @Override
    public void updateIfSame(Widget widget) {
        //do nothing
    }

    @Override
    public void sendAppSync(Channel appChannel, int dashId, int targetId) {
    }

    @Override
    //do not performs any direct pin operations
    public PinMode getModeType() {
        return null;
    }

    @Override
    public String makeHardwareBody(byte pinIn, PinType pinType) {
        return null;
    }

    @Override
    public int getPrice() {
        return 900;
    }
}
