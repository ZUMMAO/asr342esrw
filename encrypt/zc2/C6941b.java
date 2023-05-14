package zc2;

import wd2.C6667f;

/* renamed from: zc2.b */
public abstract class C6941b<E> extends C6667f implements C6940a<E> {

    /* renamed from: V0 */
    public String f17321V0;

    /* renamed from: W0 */
    public boolean f17322W0;

    public String getName() {
        return this.f17321V0;
    }

    public boolean isStarted() {
        return this.f17322W0;
    }

    public void setName(String str) {
        if (this.f17321V0 == null) {
            this.f17321V0 = str;
            return;
        }
        throw new IllegalStateException("name has been already set");
    }

    public void start() {
        this.f17322W0 = true;
    }

    public void stop() {
        this.f17322W0 = false;
    }
}
