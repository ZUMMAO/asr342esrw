package xc2;

import id2.C5059c;
import java.util.Arrays;
import xd2.C6766m;
import y93.C18829c;

@Deprecated
/* renamed from: xc2.e */
public class C6742e<E> extends C6751n<E> {

    /* renamed from: f1 */
    public C5059c f16852f1 = C5059c.SystemOut;

    /* renamed from: I1 */
    public String mo32544I1() {
        return this.f16852f1.getName();
    }

    /* renamed from: J1 */
    public void mo32545J1(String str) {
        C5059c findByName = C5059c.findByName(str.trim());
        if (findByName == null) {
            mo32546K1(str);
        } else {
            this.f16852f1 = findByName;
        }
    }

    /* renamed from: K1 */
    public final void mo32546K1(String str) {
        C6766m mVar = new C6766m(C18829c.f46742h + str + "] should be one of " + Arrays.toString(C5059c.values()), this);
        mVar.mo32591a(new C6766m("Using previously set target, System.out by default.", this));
        mo26841O0(mVar);
    }

    public void start() {
        mo32581F1(this.f16852f1.getStream());
        super.start();
    }
}
