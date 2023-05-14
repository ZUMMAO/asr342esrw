package bd2;

import wd2.C6667f;
import wd2.C6673l;
import wd2.C6674m;

/* renamed from: bd2.c */
public abstract class C3193c<E> extends C6667f implements C6674m {

    /* renamed from: V0 */
    public String f6815V0;

    /* renamed from: W0 */
    public boolean f6816W0 = false;

    public String getName() {
        return this.f6815V0;
    }

    public boolean isStarted() {
        return this.f6816W0;
    }

    public void setName(String str) {
        this.f6815V0 = str;
    }

    public void start() {
        this.f6816W0 = true;
    }

    public void stop() {
        this.f6816W0 = false;
    }

    /* renamed from: x1 */
    public abstract C6673l mo20670x1(E e);
}
