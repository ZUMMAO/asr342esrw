package xc2;

import bd2.C3193c;
import java.util.List;
import wd2.C6667f;
import wd2.C6672k;
import wd2.C6673l;
import xd2.C6766m;
import y93.C18829c;

/* renamed from: xc2.p */
public abstract class C6753p<E> extends C6667f implements C6737a<E> {

    /* renamed from: b1 */
    public static final int f16935b1 = 3;

    /* renamed from: V0 */
    public boolean f16936V0 = false;

    /* renamed from: W0 */
    public ThreadLocal<Boolean> f16937W0 = new ThreadLocal<>();

    /* renamed from: X0 */
    public String f16938X0;

    /* renamed from: Y0 */
    public C6672k<E> f16939Y0 = new C6672k<>();

    /* renamed from: Z0 */
    public int f16940Z0 = 0;

    /* renamed from: a1 */
    public int f16941a1 = 0;

    /* renamed from: G */
    public void mo32235G() {
        this.f16939Y0.mo32235G();
    }

    /* renamed from: L0 */
    public void mo32521L0(E e) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.f16937W0.get())) {
            try {
                this.f16937W0.set(bool);
                if (!this.f16936V0) {
                    int i = this.f16940Z0;
                    this.f16940Z0 = i + 1;
                    if (i < 3) {
                        mo26841O0(new C6766m("Attempted to append to non started appender [" + this.f16938X0 + "].", this));
                    }
                } else if (mo32237R(e) != C6673l.DENY) {
                    mo26470x1(e);
                    this.f16937W0.set(Boolean.FALSE);
                    return;
                }
                this.f16937W0.set(Boolean.FALSE);
            } catch (Exception e2) {
                int i2 = this.f16941a1;
                this.f16941a1 = i2 + 1;
                if (i2 < 3) {
                    mo26840O("Appender [" + this.f16938X0 + "] failed to append.", e2);
                }
            } catch (Throwable th) {
                this.f16937W0.set(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* renamed from: M */
    public List<C3193c<E>> mo32236M() {
        return this.f16939Y0.mo32236M();
    }

    /* renamed from: R */
    public C6673l mo32237R(E e) {
        return this.f16939Y0.mo32237R(e);
    }

    /* renamed from: e */
    public void mo32238e(C3193c<E> cVar) {
        this.f16939Y0.mo32238e(cVar);
    }

    public String getName() {
        return this.f16938X0;
    }

    public boolean isStarted() {
        return this.f16936V0;
    }

    public void setName(String str) {
        this.f16938X0 = str;
    }

    public void start() {
        this.f16936V0 = true;
    }

    public void stop() {
        this.f16936V0 = false;
    }

    public String toString() {
        return getClass().getName() + C18829c.f46742h + this.f16938X0 + C18829c.f46741g;
    }

    /* renamed from: x1 */
    public abstract void mo26470x1(E e);
}
