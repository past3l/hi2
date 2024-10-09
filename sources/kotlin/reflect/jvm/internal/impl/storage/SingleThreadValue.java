package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleThreadValue(T t) {
        this.value = t;
    }

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
