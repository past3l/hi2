package expo.modules.interfaces.sensors;

/* loaded from: classes3.dex */
public interface SensorServiceSubscriptionInterface {
    Long getUpdateInterval();

    boolean isEnabled();

    void release();

    void setUpdateInterval(long j);

    void start();

    void stop();
}
